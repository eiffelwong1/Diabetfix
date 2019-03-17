package com.example.diabetfix;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import java.util.Random;


public class Context {
    /*
        write a function that will use context (for now just time), user health state (this will
        be a score), and user pattern (some data structure that maps context to activities
        or the type of food that user eats), and user goal (whether it is being healthy by doing
        exercise, through diet or both.
        User's data will be retrieved from the data base and be stored in a data structure for
        computation.

        If user does not have diabetes but have a high risk score, warn user THAT THEY MIGHT
        HAVE DIABETES, recommend healthy diet and exercise
        If user has diabetes and also have high risk score, tell them to inject insulin and
        check back on his health state later

     */
    /*HELPER FUNCTIONS*/

    /*parse json string to hour*/
    static int parseJsonHour(String str)
    {
        Vector<String> v = new Vector<>();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            v.add(st.nextToken());
        }
        String hour = v.get(3).split(":")[0];
        return Integer.parseInt(hour);
    }
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
        return Integer.parseInt(hour);
    }

    static int mmakeRandomNumber()
    {
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        return randInt;
    }

    /*Convert json string to activity pattern*/
    static Vector<Map<String, Integer>> createUserActivityPattern(String str)
    {
        Vector<Map<String, Integer>> v = new Vector<Map<String, Integer>>(24);
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(str).getAsJsonArray();
        for (int i = 0; i < 24; ++i)
        {
            Map<String, Integer> m = new HashMap<>();
            v.add(m);
        }
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            String activityName = obj.get("kind").getAsString();
            String time = obj.get("time").getAsString();
            //int duration = obj.get("duration").getAsInt();
            int hour = parseJsonHour(time);
            if (!v.get(hour).containsKey(activityName))
                v.get(hour).put(activityName, 1);
            else
                v.get(hour).put(activityName, v.get(hour).get(activityName) + 1);
        }
        return v;
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

    /*convert meal pattern*/
    static Vector<Map<String, Integer>> createUserMealPattern(String str, String mealType)
    {
        Vector<Map<String, Integer>> v = new Vector<>(2);
        Map<String, Integer> mGood = new HashMap<>();
        Map<String, Integer> mBad = new HashMap<>();
        JsonParser jsonParser = new JsonParser();
        JsonArray arrayFromString = jsonParser.parse(str).getAsJsonArray();
        for (int i = 0; i < arrayFromString.size(); ++i)
        {
            JsonObject obj = arrayFromString.get(i).getAsJsonObject();
            String foodName = obj.get("name").getAsString();
            boolean hc = obj.get("high_carbs").getAsBoolean();
            String time = obj.get("time").toString();
            int hour = parseJsonHour(time);
            if (determineMealTime(hour).equals(mealType))
            {
                if (!hc)
                {
                    if (!mGood.containsKey(foodName))
                        mGood.put(foodName, 1);
                    else
                        mGood.put(foodName, mGood.get(foodName) + 1);
                }
                else
                {
                    if (!mBad.containsKey(foodName))
                        mBad.put(foodName, 1);
                    else
                        mBad.put(foodName, mBad.get(foodName) + 1);
                }
            }

        }
        v.add(0,mGood);
        v.add(1, mBad);
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
    static String createMotivationalQuote(int healthScore)
    {
        if (healthScore > 10 || healthScore < 0)
            return "Error createMotivationalQuote(): invalid input";
         int randomNum = mmakeRandomNumber();
         String[] goodState = new String[]{"You can fix your body, your heart, your diabetes. In Korea, China, and India, there are people who do yoga. They go to the mountains and do breath-in, breath-out meditation. They can live 500 years and not get sick. Keeping their bodies for a long time is possible; even flying in the sky is possible. Seung Sahn\n",
                 "Millions of Americans today are taking dietary supplements, practicing yoga and integrating other natural therapies into their lives. These are all preventive measures that will keep them out of the doctor's office and drive down the costs of treating serious problems like heart disease and diabetes. Andrew Weil\n",
                 "People with high blood pressure, diabetes - those are conditions brought about by life style. If you change the life style, those conditions will leave. Dick Gregory\n"
                 };
        String[] badState = new String[]{"We're all moving at such a high rate that we have to grab the frozen dinners and the McDonald's. We can't make it a way of life - we have to get back to real, simple, clean good foods. It will save our lives on so many levels; not just spina bifida, but obesity, diabetes, everything. Food is our medicine. Nicole Ari Parker\n",
                "Insulin is not a cure for diabetes; it is a treatment. It enables the diabetic to burn sufficient carbohydrates so that proteins and fats may be added to the diet in sufficient quantities to provide energy for the economic burdens of life. Frederick Banting\n",
                "You can live with diabetes. It's not the worst thing to have, but you have to manage yourself and have some self control. Tony Rock\n"
                };
        if (healthScore > 5)
            return goodState[randomNum];
        else
            return badState[randomNum];

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

    /*FUNCTION CALLS USED IN THE APP*/

    //load user activities
    static Vector<Map<String, Integer>> loadUserActivityPattern(String jsonStr)
    {
        return createUserActivityPattern(jsonStr);
    }

    //load breakfast
    static Vector<Map<String, Integer>> loadUserBreakfastPattern(String jsonStr)
    {
        return createUserMealPattern(jsonStr, "breakfast");
    }

    //load lunch
    static Vector<Map<String, Integer>> loadUserLunchPattern(String jsonStr)
    {
        return createUserMealPattern(jsonStr, "lunch");
    }

    //load dinner
    static Vector<Map<String, Integer>> loadUserDinnerPattern(String jsonStr)
    {
        return createUserMealPattern(jsonStr, "dinner");
    }

    //load snack
    static Vector<Map<String, Integer>> loadUserSnackPattern(String jsonStr)
    {
        return createUserMealPattern(jsonStr, "snack");
    }

    //recommend exercise activity
    static String makeActivityRecommendation(Vector<Map<String, Integer>> v)
    {
        Date currentTime = Calendar.getInstance().getTime();
        int hour = parseHour(currentTime);
        return suggestActivity(hour, v);
    }

    //recommend food
    static String makeFoodRecommendation(int healthScore, boolean haveDiabetes, Vector<Map<String, Integer>> breakfast,
                                         Vector<Map<String, Integer>> lunch, Vector<Map<String, Integer>> dinner,
                                         Vector<Map<String, Integer>> snack)
    {
        Date currentTime = Calendar.getInstance().getTime();
        int hour = parseHour(currentTime);
        if (determineMealTime(hour).equals("breakfast"))
            return "It is breakfast time. " + giveFoodRecommendation(haveDiabetes, healthScore, breakfast);
        else if (determineMealTime(hour).equals("lunch"))
            return "It is lunch time. " + giveFoodRecommendation(haveDiabetes, healthScore, lunch);
        else if (determineMealTime(hour).equals("dinner"))
            return "It is dinner time. " + giveFoodRecommendation(haveDiabetes, healthScore, dinner);
        else if (determineMealTime(hour).equals("snack"))
            return "It is snack time. " + giveFoodRecommendation(haveDiabetes, healthScore, snack);
        else return "Error makeFoodRecommendation(): invalid input.";
    }

    //give motivational quotes
    static String giveMotivationalQuote(int healthScore)
    {
        return giveMotivationalQuote(healthScore);
    }




}
