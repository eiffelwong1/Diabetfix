package com.example.diabetfix;
import android.util.Log;
import android.util.Pair;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;


public class Context {
    /*
        write a function that will use context (for now just time), user health state (this will
        be a score), and user pattern (some data structure that maps context to activities
        or the type of food that user eats), and user goal (whether it is being healthy by doing
        exercise, through diet or both.
        User's data will be retrieved from the data base and be stored in a data structure for
        computation.
        We will consider user's location to give recommendations, check for the
        if the user have poor exercise score, provide them with walking advice, else don't advice
        have a flag to determine if a person is diabetic, if user isn't diabetic but in an extreme
        state, suggest more exercise

        If user does not have diabetes but have a high risk score, warn user THAT THEY MIGHT
        HAVE DIABETES, recommend healthy diet and exercise
        If user has diabetes and also have high risk score, tell them to inject insulin and
        check back on his health state later

        Questions to ask the team: provide duration of exercise or just an activity
        What are the scores provided by machine learning either just a general score, or
        specifically health score and diet score. How the scores will be graded
        Classify food item into 2 types (diabetic friendly and diabetic non friendly) so that
        when the health risk is high, recommend food that is less sugar content.
            -Have the user input what type of food
     */
    /* Helper functions */

    // Convert time into hour, return integer
    static int parseHour(Date curTime)
    {
        String str = curTime.toString();
        Vector<String> v = new Vector<>();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            v.add(st.nextToken());
        }
        String hour = v.get(3).split(":")[0];
        Log.d("outputHour", hour);
        return Integer.parseInt(hour);
    }


    /* Activities function */

    //from current hour and user activity pattern, return a suggestion
    static String suggestActivity(int hour, Vector<Map<String, Integer>> v)
    {
        String mostFrequentActivity = "";
        int frequency = -1;
        for (Map.Entry<String, Integer> entry : v.get(hour-1).entrySet())
        {
            if (entry.getValue() > frequency)
            {
                frequency = entry.getValue();
                mostFrequentActivity = entry.getKey();
            }
        }
        if (frequency != -1)
            return mostFrequentActivity;
        else
            return "Go for a walk, or do some exercise";
    }

    /* Food part */
    /*Create four data structures Breakfast, Lunch, Dinner, Snack to hold the food that user
    might like to eat during the day. Each will be divided into 2 types diabetic friendly and
    non diabetic friendly, in that there is name of food and frequency*/

    //return 0 for breakfast, 1 for lunch, 2 for dinner, and 3 for snack
    //return -1 for error
    static int determineMealTime(int hour)
    {
        if (hour < 0 || hour >= 24)
            return -1;
        if (hour >= 6 && hour <= 10)
            return 0;
        else if (hour > 10 && hour <= 14)
            return 1;
        else if (hour >= 17 && hour <= 22)
            return 2;
        else return 3;
    }

    /* Recommend food, if bad health state return healthy food, if good health state, return
    one healthy option and one less healthy option
     */
    static String giveFoodRecommendation(boolean diabeticFlag, int healthState, Vector<Map<String, Integer>> v)
    {
        /*if (healthState < 0 || healthState > 10)
            return "giveFoodRecommendation(): Error, Invalid health state!";
        String res = "";
        if (!diabeticFlag)
        {

        }
        if (diabeticFlag)
        {
            if (healthState <= 2)
                res = res + "Your ";
        }
        return "";*/
        return "";
    }


    /* Recommendations part */
    /* Return the most and least frequently eaten food */
    static String chooseOnlyHealthyFood(Vector<Map<String, Integer>> v)
    {
        String mostFood = "";
        String leastFood = "";
        String res = "";
        int mostFreq = -1;
        int leastFreq = 9999;
        for (Map.Entry<String, Integer> entry : v.get(0).entrySet())
        {
            if (entry.getValue() > mostFreq)
            {
                mostFreq = entry.getValue();
                mostFood = entry.getKey();
            }
            if (entry.getValue() < leastFreq)
            {
                leastFreq = entry.getValue();
                leastFood = entry.getKey();
            }
        }
        if (mostFood.isEmpty() && leastFood.isEmpty())
            return "Grilled Chicken Breast Sandwich or Cesar Salad";
        if (mostFood.isEmpty())
            return leastFood;
        if (leastFood.isEmpty())
            return mostFood;
        res = res + mostFood + " or " + leastFood;
        return res;
    }
    static String chooseBothTypesOfFood(Vector<Map<String, Integer>> v)
    {
        int mostFreqGood = -1;
        int mostFreqBad = -1;
        String mostFoodGood = "";
        String mostFoodBad = "";
        for (Map.Entry<String, Integer> entry : v.get(0).entrySet())
        {
            if (entry.getValue() > mostFreqGood)
            {
                mostFreqGood = entry.getValue();
                mostFoodGood = entry.getKey();
            }
        }
        for (Map.Entry<String, Integer> entry : v.get(1).entrySet())
        {
            if (entry.getValue() > mostFreqBad)
            {
                mostFreqBad = entry.getValue();
                mostFoodBad = entry.getKey();
            }
        }
        if (mostFreqGood == -1 && mostFreqBad == 0)
            return "Japanese Ramen or Sushi";
        if (mostFreqGood == -1)
            return mostFoodBad;
        if (mostFreqBad == -1)
            return mostFoodGood;
        return mostFoodGood + " or " + mostFoodBad;
    }


    static int test_function(int a, int healthGoal)
    {

        Date currentTime = Calendar.getInstance().getTime();
        Log.d("output",((Date) currentTime).toString());
        Context.parseHour(currentTime);
        return a;
    }

}
