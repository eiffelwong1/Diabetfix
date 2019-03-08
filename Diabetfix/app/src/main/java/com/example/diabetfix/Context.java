package com.example.diabetfix;
import android.util.Log;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
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

        Questions to ask the team:
        Classify food item into 2 types (diabetic friendly and diabetic non friendly) so that
        when the health risk is high, recommend food that is less sugar content.
            -Have the user input what type of food
     */
    /* Helper functions and code to create data structure for DEBUGGING*/

    /* Convert time into hour, return integer */
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

    /*Create a data structure that represents the user's activity pattern, for debugging purpose*/
    static Vector<Map<String, Integer>> createActivityPattern()
    {
        Vector<Map<String, Integer>> v = new Vector<Map<String, Integer>>(24);
        for (int i = 0; i < 24; ++i)
        {
            Map<String, Integer> m = new HashMap<>();
            m.put("Running", 1);
            v.add(m);
        }
        for (int i = 0; i < 12; ++i)
            v.get(i).put("Hiking", 2);
        for (int i = 0; i < 6; ++i)
            v.get(i).put("Weightlifting", 3);
        return v;
    }

    /*Create a data structure to represent user's meal pattern*/
    static Vector<Map<String, Integer>> createMorningMeal()
    {
        Vector<Map<String, Integer>> v = new Vector<>(2);
        Map<String, Integer> mGood = new HashMap<>();
        Map<String, Integer> mBad = new HashMap<>();
        mGood.put("Oatmeal", 1);
        mBad.put("Breakfast Burrito", 1);
        mGood.put("Yogurt", 2);
        mBad.put("Ham and Cheese Croissant", 3);
        v.add(0,mGood);
        v.add(1, mBad);
        return v;
    }

    static Vector<Map<String, Integer>> createLunchMeal()
    {
        Vector<Map<String, Integer>> v = new Vector<>(2);
        Map<String, Integer> mGood = new HashMap<>();
        Map<String, Integer> mBad = new HashMap<>();
        mGood.put("Kimchi Tofu Beef Soup", 1);
        mBad.put("Cheeseburger and Fires", 1);
        mGood.put("Grilled Chicken Breast and Broccoli", 2);
        mBad.put("All You Can Eat KBBQ", 3);
        v.add(0,mGood);
        v.add(1, mBad);
        return v;
    }

    static Vector<Map<String, Integer>> createDinnerMeal()
    {
        Vector<Map<String, Integer>> v = new Vector<>(2);
        Map<String, Integer> mGood = new HashMap<>();
        Map<String, Integer> mBad = new HashMap<>();
        mGood.put("Pan Seared Salmon", 1);
        mBad.put("Domino's Pizza", 1);
        mGood.put("Sashimi", 2);
        mBad.put("All You Can Eat KBBQ", 3);
        v.add(0,mGood);
        v.add(1, mBad);
        return v;
    }
    static Vector<Map<String, Integer>> createSnackMeal()
    {
        Vector<Map<String, Integer>> v = new Vector<>(2);
        Map<String, Integer> mGood = new HashMap<>();
        Map<String, Integer> mBad = new HashMap<>();
        mGood.put("Watermelon", 1);
        mBad.put("Chocolate Bars", 1);
        mGood.put("Mixed Berries Smoothies", 2);
        mBad.put("Strawberry Cheesecake", 3);
        v.add(0,mGood);
        v.add(1, mBad);
        return v;
    }

    /* Activities function */

    /*Suggest an exercise activity given the current hour and user's activity pattern*/
    static String suggestActivity(int hour, Vector<Map<String, Integer>> v)
    {
        String mostFrequentActivity = "";
        int frequency = -1;
        for (HashMap.Entry<String, Integer> entry : v.get(hour-1).entrySet())
        {
            if (entry.getValue() > frequency)
            {
                frequency = entry.getValue();
                mostFrequentActivity = entry.getKey();
            }
        }
        if (frequency != -1)
            return "Hey! It is time for: " + mostFrequentActivity.toUpperCase();
        else
            return "Go for a walk, or do some exercise";
    }

    /* Food part */
    /*Create four data structures Breakfast, Lunch, Dinner, Snack to hold the food that user
    might like to eat during the day. Each will be divided into 2 types diabetic friendly and
    non diabetic friendly, in that there is name of food and frequency*/

    static String determineMealTime(int hour)
    {
        if (hour < 0 || hour >= 24)
            return "determineMealTime() Error: invalid hour";
        if (hour >= 6 && hour <= 10)
            return "breakfast";
        else if (hour > 10 && hour <= 14)
            return "lunch";
        else if (hour >= 17 && hour <= 22)
            return "dinner";
        else return "snack";
    }

    /* Recommend food, if bad health state return healthy food, if good health state, return
    one healthy option and one less healthy option
     */

    static String chooseFoodBasedOnContext(int hour, boolean diabeticFlag, int healthState)
    {
        Vector<Map<String, Integer>> breakfast = createMorningMeal();
        Vector<Map<String, Integer>> lunch = createLunchMeal();
        Vector<Map<String, Integer>> dinner = createDinnerMeal();
        Vector<Map<String, Integer>> snack = createSnackMeal();
        String mealTime = determineMealTime(hour);
        if (mealTime.equals("breakfast"))
            return "It's breakfast time.\n" + giveFoodRecommendation(diabeticFlag, healthState, breakfast);
        else if (mealTime.equals("lunch"))
            return "It's lunch time.\n" + giveFoodRecommendation(diabeticFlag, healthState, lunch);
        else if (mealTime.equals("dinner"))
            return "It's dinner time.\n" + giveFoodRecommendation(diabeticFlag, healthState, dinner);
        else if (mealTime.equals("snack"))
            return "It's snack time.\n" + giveFoodRecommendation(diabeticFlag, healthState, snack);
        else
            return "chooseFoodBasedOnContext() Error: invalid inputs";
    }
    /*given a health state score from 0 to 10, determine whether health level is good (7 - 10)
    medium (3 - 6) or severe (0 - 2)*/
    static String determineHealthStateLevel(int healthState)
    {
        if (healthState < 0 || healthState > 10)
            return "determineHealthStateLevel() Error: invalid health state!";
        else if (healthState <= 2)
            return "severe";
        else if (healthState <= 6)
            return "medium";
        else
            return "good";
    }
    static String giveFoodRecommendation(boolean diabeticFlag, int healthState, Vector<Map<String, Integer>> v)
    {
        if (healthState < 0 || healthState > 10)
            return "giveFoodRecommendation(): Error, Invalid health state!";
        String res = "We suggest that you eat ";
        //not having diabetes
        if (!diabeticFlag)
        {
            if (determineHealthStateLevel(healthState).equals("good"))
                return res + chooseBothTypesOfFood(v).toUpperCase();
            else if (determineHealthStateLevel(healthState).equals("medium"))
                return res + chooseOnlyHealthyFood(v).toUpperCase();
            else if (determineHealthStateLevel(healthState).equals("severe"))
                return "You have high chance of having diabetes. " + res + chooseOnlyHealthyFood(v).toUpperCase();
            else return "giveFoodRecommendation() Error: invalid health level";
        }
        else if (diabeticFlag)
        {
            if (determineHealthStateLevel(healthState).equals("good") || determineHealthStateLevel(healthState).equals("medium"))
                return res + chooseOnlyHealthyFood(v).toUpperCase();
            else if (determineHealthStateLevel(healthState).equals("severe"))
                return "Your health is in a danger state. Please test your glucose level right away. " + res + chooseOnlyHealthyFood(v).toUpperCase();
            else return "giveFoodRecommendation() Error: invalid health level";
        }
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
        Vector<Map<String, Integer>> l = createActivityPattern();
        Vector<Map<String, Integer>> breakfast = createMorningMeal();
        Vector<Map<String, Integer>> lunch = createLunchMeal();
        Vector<Map<String, Integer>> dinner = createDinnerMeal();
        Vector<Map<String, Integer>> snack = createSnackMeal();

        Log.d("testMyTag",((Date) currentTime).toString());
        Log.d("testMeal", determineMealTime(parseHour(currentTime)));
        Log.d("testHealth", determineHealthStateLevel(10));
        Log.d("testVectorOfMap", l.get(1).get("Weightlifting").toString());
        Log.d("testSuggestActivities", suggestActivity(parseHour(currentTime), l));
        Log.d("testCreateMorningMeal", breakfast.get(1).get("Breakfast Burrito").toString());
        Log.d("testCreateLunchMeal", lunch.get(1).get("All You Can Eat KBBQ").toString());
        Log.d("testCreateDinnerMeal", dinner.get(0).get("Pan Seared Salmon").toString());
        Log.d("testCreateSnackMeal", snack.get(1).get("Strawberry Cheesecake").toString());
        //Log.d("testGiveFoodRecom", giveFoodRecommendation(false, 0, breakfast));
        Log.d("testContextRecom", chooseFoodBasedOnContext(parseHour(currentTime),false,0));

        //Log.d("testSuggestActivity", suggestActivity(parseHour(currentTime), v));
        Context.parseHour(currentTime);
        return a;
    }

}
