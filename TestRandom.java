public  class  TestRandom {
	public static void main(String[]  args) {
		int n = Integer.parseInt(args[0]); 
		int countGreater = 0;
		int countLessOrEqual = 0;

		for (int i = 0; i < n; i++){
			double randomValue = Math.random();
			if (randomValue > 0.5){
			countGreater += 1;
			}
			else{
				countLessOrEqual += 1;
			}
		}   
		double randomRatio;
		System.out.println("> 0.5: " + countGreater + " times");          
		System.out.println("<= 0.5: " + countLessOrEqual + " times");
		if (countLessOrEqual != 0) {
			randomRatio = (double) countGreater / countLessOrEqual;
			System.out.println("Ratio: " + randomRatio);
		}
		

			 
	}
}
