public class Example13 {
    public static char findGrade(double avg){
		if(avg >= 75){
			return 'A';
		} else {
			return 'F';     //else part is there
		}
	}
	public static void main(String args[]){
		findGrade(67.5);
	}

}
