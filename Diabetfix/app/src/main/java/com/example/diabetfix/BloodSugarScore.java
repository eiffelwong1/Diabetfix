public class BloodSugarScore {
	public BloodSugarScore(){		
	}
	
	
	public static int get_score(int blood_sugar) {
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
	
	public static void main (String[] args) {
		System.out.println(get_score(136));
	}
}


