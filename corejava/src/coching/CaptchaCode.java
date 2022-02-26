package coching;

public class CaptchaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 129;
		int min = 30;
		int range = max - min ;


		// generate random numbers within 1 to 10
		for (int i = 0; i < 5; i++) {
		    int rand = (int)(Math.random() * range) ;
		    char ch=(char)rand;

		    // Output is different everytime this code is executed
		    System.out.print(ch);
		}


	}

}
