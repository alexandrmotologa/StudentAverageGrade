import java.util.Scanner;

public class StudentAverageGrade {

	public static void main(String[] args) {
		
		//DATA GRADES
		final int MIN_GRADE = 1;
		final int MAX_GRADE = 10;
		final String ERROR = "ERROR. Please type only number from 1 to 10";
		final String ACCEPTED = "Grade accepted.Please follow next step.";
		
		// STUDENT
		String fullName;
		int s1, s2, ex;

		//build scanner
		Scanner in = new Scanner(System.in);
		
		//INPUT DATA
		System.out.printf("Hi, please type your full name: ");
		
		//NAME
		fullName = in.nextLine();
		System.out.printf("Welcome, %s.\n\n", fullName);
		
		//FIRST SEMESTER GRADE
		System.out.printf("Please type your grade for first semester: ");
		s1 = in.nextInt();

		while(s1 < MIN_GRADE || s1 > MAX_GRADE) {
				System.out.println(ERROR);
				s1 = in.nextInt();
		}

		if(s1 >= MIN_GRADE && s1 <= MAX_GRADE) {
			System.out.println(ACCEPTED + "\n");
		}

		//SECOND SEMESTER GRADE
		System.out.printf("Please type your grade for second semester: ");
		s2 = in.nextInt();

		
		while(s2 < MIN_GRADE || s2 > MAX_GRADE) {
			System.out.println(ERROR);
			s2 = in.nextInt();
		}

		if(s2 >= MIN_GRADE && s2 <= MAX_GRADE) {
			System.out.println(ACCEPTED + "\n");
		}
		
		//EXAMEN GRADE
		System.out.printf("Please type your grade for examen: ");
		ex = in.nextInt();
		System.out.println();
		
		while(ex < MIN_GRADE || ex > MAX_GRADE) {
			System.out.println(ERROR);
			ex = in.nextInt();
		}

		if(ex >= MIN_GRADE && ex <= MAX_GRADE) {
			in.close();
			System.out.println(ACCEPTED + "\n");
		}
		
		
		//CALCULATION AVERAGE
		double gm = ((s1 + s2) * 0.2 + ex * 0.6);

		System.out.printf("Semestr 1: %d \n", s1);
		System.out.printf("Semestr 2: %d \n", s2);
		System.out.printf("Exam: %d \n\n", ex);
		
		System.out.printf("GENERAL MARK %.2f \n", gm);
		
		if( gm >= 1.0 && gm < 5.0) {
			System.out.printf("Very bad average grade! - %.2f, Leave the university!!!", gm);
		}else if( gm >= 5.0 && gm < 7.0) {
			System.out.printf("Bad average grade! - %.2f, You are lucky - You have another chance!", gm);
		}else if( gm >= 7.0 && gm < 9.0) {
			System.out.printf("Good average grade! - %.2f, You accepted for next semester!", gm);
		}else if( gm >= 9.0 && gm <= 10.0) {
			System.out.printf("Very good average grade! - %.2f, You accepted for next semester!", gm);
		}
	}
}
