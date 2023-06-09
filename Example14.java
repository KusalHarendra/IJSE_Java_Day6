public class Example14 {
    public static char findGrade(double avg){
		if(avg >= 75){
			return 'A';
		} else if(avg >= 65){
			return 'B';
		} else if(avg >= 50) {
			return 'C';
		} else if(avg >= 35) {
			return 'S';
		}else 
            return 'F';
	}
	public static void main(String args[]){
		findGrade(67.5);
	}

}
