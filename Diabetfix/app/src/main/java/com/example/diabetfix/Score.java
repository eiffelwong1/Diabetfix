package com.example.diabetfix;

public class Score {
	public Score(){
	}

	public static int getOverallScore(int num_of_pregnace, int height, int weight, int age,
									  int mins_of_exercise, int bloodsugar){
		return getBloodSugarScore(bloodsugar) +
				getExerciseScore(mins_of_exercise) -
				getDiabeticRiskScore(num_of_pregnace, height, weight, age) * 5;
	}

	public static int getDiabeticRiskScore(int num_of_pregnace, int height, int weight, int age) {
		double features[] = new double[3];
		features[0] = num_of_pregnace;
		features[1] = weight/(height * height);
		features[2] = age;
		int prediction = DiabeticClassifier.predict(features);
		return prediction;
	}

	public static int getExerciseScore(int mins){
		int score = mins/15;
		if(score > 10){
			return 10;
		}else{
			return score;
		}
	}
	
	public static int getBloodSugarScore(int blood_sugar) {
		//10 to 7 = good, 6 to 4 = med, 3 to 0 = bad
		if(blood_sugar > 75 & blood_sugar < 115){
			return 10;
		}else if(blood_sugar >= 115 & blood_sugar <315) {
			int differnce = (int) ((blood_sugar - 115)/20);
			return 10 - differnce - 1;
		}else if (blood_sugar <= 75 & blood_sugar >= 0) {
			return (int)(blood_sugar/7.5);
		}
		return 0;
	}

}


