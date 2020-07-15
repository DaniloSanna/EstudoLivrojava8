package grade;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array de notas de aluno
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		GradeBook myGradeBook = new GradeBook("JavaIniciantes", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
		myGradeBook.getCourseName());
		myGradeBook.processGrades();		
		
	}

}
