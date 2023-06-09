public class Example8 {
    public static void printAverage(int total, int count){
		double avg = (double) total / count;
		System.out.println("Average : " + avg);
	}
	public static void main(String args[]){
		int total = 895;
		int count = 10;

		printAverage(total, count);
		printAverage(count, total); // Logical Issue
	}

}
