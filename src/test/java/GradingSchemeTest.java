package gradebook.model;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class GradingSchemeTest {

	Course cs2340 = new Course("cs", 2340, "Objects and Design");
	Course cs1332 = new Course("cs", 1332, "Data Structures and Algorithms");
	Course cs1371 = new Course("cs", 1371, "MATLAB");
	Course cs1331 = new Course("cs", 1331, "Intro to Object Oriented Programming");
	Course cs9000 = new Course("cs", 9000, "PHD junk");
	
	Class cs2340Class = new Class(cs2340, 2013, "fall");
	
	Designate cs2340Sec1Designation = new Designate("Simpkins");
	Section cs2340Sec1 = new Section(cs2340Sec1Designation);
	Designate cs2340Sec2Designation = new Designate("Simpkins");
	Section cs2340Sec2 = new Section(cs2340Sec2Designation);
	
	Student cs2340student1 = new Student("bill", 5032);
	Student cs2340student2 = new Student("rex", 5293);
	Student cs2340student3 = new Student("patrick", 1923);
	Student cs2340student4 = new Student("carl", 5032);
	Student cs2340student5 = new Student("bro", 1293);
	
	GradebookCategory tests = new GradebookCategory("tests", 30);
	GradebookCategory quizzes = new GradebookCategory("quizzes", 35);
	GradebookCategory projects = new GradebookCategory("projects", 35);
	
	GradebookItem test1 = new GradebookItem("test1", tests);
	GradebookItem test2 = new GradebookItem("test2", tests);
	GradebookItem quiz1 = new GradebookItem("quiz1", quizzes);
	GradebookItem quiz2 = new GradebookItem("quiz2", quizzes);
	GradebookItem project = new GradebookItem("project", projects);
	
	StudentGradebookItem rexTest1 = new StudentGradebookItem(cs2340student2, 90, test1);
	StudentGradebookItem rexTest2 = new StudentGradebookItem(cs2340student2, 75, test2);
	StudentGradebookItem rexQuiz1 = new StudentGradebookItem(cs2340student2, 60, quiz1);
	StudentGradebookItem rexQuiz2 = new StudentGradebookItem(cs2340student2, 90, quiz2);
	StudentGradebookItem rexProject = new StudentGradebookItem(cs2340student2, 95, project);
	StudentGradebookItem billTest1 = new StudentGradebookItem(cs2340student1, 70, test1);
	StudentGradebookItem billTest2 = new StudentGradebookItem(cs2340student1, 80, test2);
	StudentGradebookItem billQuiz1 = new StudentGradebookItem(cs2340student1, 100, quiz1);
	StudentGradebookItem billQuiz2 = new StudentGradebookItem(cs2340student1, 60, quiz2);
	StudentGradebookItem billProject = new StudentGradebookItem(cs2340student1, 100, project);
	StudentGradebookItem patTest1 = new StudentGradebookItem(cs2340student3, 60, test1);
	StudentGradebookItem patTest2 = new StudentGradebookItem(cs2340student3, 55, test2);
	StudentGradebookItem patQuiz1 = new StudentGradebookItem(cs2340student3, 85, quiz1);
	StudentGradebookItem patQuiz2 = new StudentGradebookItem(cs2340student3, 60, quiz2);
	StudentGradebookItem patProject = new StudentGradebookItem(cs2340student3, 100, project);
	StudentGradebookItem carlTest1 = new StudentGradebookItem(cs2340student4, 90, test1);
	StudentGradebookItem carlTest2 = new StudentGradebookItem(cs2340student4, 80, test2);
	StudentGradebookItem carlQuiz1 = new StudentGradebookItem(cs2340student4, 50, quiz1);
	StudentGradebookItem carlQuiz2 = new StudentGradebookItem(cs2340student4, 30, quiz2);
	StudentGradebookItem carlProject = new StudentGradebookItem(cs2340student4, 70, project);
	StudentGradebookItem broTest1 = new StudentGradebookItem(cs2340student5, 100, test1);
	StudentGradebookItem broTest2 = new StudentGradebookItem(cs2340student5, 20, test2);
	StudentGradebookItem broQuiz1 = new StudentGradebookItem(cs2340student5, 90, quiz1);
	StudentGradebookItem broQuiz2 = new StudentGradebookItem(cs2340student5, 75, quiz2);
	StudentGradebookItem broProject = new StudentGradebookItem(cs2340student5, 40, project);
	
	@Before
	public void setUp() throws Exception {
		cs9000.addPrereq(cs2340);
		cs9000.addPrereq(cs1332);
		cs9000.addPrereq(cs1371);
		cs9000.addPrereq(cs1331);
		cs2340.addPrereq(cs1331);
		cs1332.addPrereq(cs1331);
		
		cs2340Class.addSection(cs2340Sec1);
		cs2340Class.addSection(cs2340Sec2);
		
		cs2340Sec1.addStudent(cs2340student1);
		cs2340Sec1.addStudent(cs2340student2);
		cs2340Sec1.addStudent(cs2340student3);
		cs2340Sec2.addStudent(cs2340student4);
		cs2340Sec2.addStudent(cs2340student5);
		
		cs2340Sec1.addAssignment(rexTest1);
		cs2340Sec1.addAssignment(rexTest2);
		cs2340Sec1.addAssignment(rexQuiz1);
		cs2340Sec1.addAssignment(rexQuiz2);
		cs2340Sec1.addAssignment(rexProject);
		cs2340Sec1.addAssignment(billTest1);
		cs2340Sec1.addAssignment(billTest2);
		cs2340Sec1.addAssignment(billQuiz1);
		cs2340Sec1.addAssignment(billQuiz1);
		cs2340Sec1.addAssignment(billProject);
		cs2340Sec1.addAssignment(patTest1);
		cs2340Sec1.addAssignment(patTest2);
		cs2340Sec1.addAssignment(patQuiz1);
		cs2340Sec1.addAssignment(patQuiz1);
		cs2340Sec1.addAssignment(patProject);
		
		cs2340Sec2.addAssignment(carlTest1);
		cs2340Sec2.addAssignment(carlTest2);
		cs2340Sec2.addAssignment(carlQuiz1);
		cs2340Sec2.addAssignment(carlQuiz2);
		cs2340Sec2.addAssignment(carlProject);
		cs2340Sec2.addAssignment(broTest1);
		cs2340Sec2.addAssignment(broTest2);
		cs2340Sec2.addAssignment(broQuiz1);
		cs2340Sec2.addAssignment(broQuiz2);
		cs2340Sec2.addAssignment(broProject);
	}
	
	@Test
	public void testPrereqs(){
		ArrayList<Course> prereqs = cs9000.getPrereqs();
		StringBuilder megaString = new StringBuilder();
		for(int i = 0; i<prereqs.size();i++){
			String curCourseName = prereqs.get(i).getName();
			System.out.println(curCourseName);
			megaString.append(curCourseName);
		}
		assertTrue(megaString.toString().equals("Objects and DesignData Structures and AlgorithmsMATLABIntro to Object Oriented Programming"));
	}
	
	@Test
	public void testDesignate(){
		assertTrue(cs2340Sec1.getSectionNumber()==1);
		assertTrue(cs2340Sec2.getSectionNumber()==2);
	}
	
	@Test
	public void testClassAverageScore() {
		assertTrue(GradingScheme.reportClassAverageScore(cs2340Class)==73);
	}
	
	@Test
	public void testSectionAverageScore(){
		assertTrue(GradingScheme.reportSectionAverageScore(cs2340Sec1)==85);
		assertTrue(GradingScheme.reportSectionAverageScore(cs2340Sec2)==62);
	}
	
	@Test
	public void testStudentAverageScore(){
		assertTrue(GradingScheme.reportStudentAverageScore(cs2340Sec1, cs2340student2)==84.1);
		assertTrue(GradingScheme.reportStudentAverageScore(cs2340Sec1, cs2340student1)==92.5);
		assertTrue(GradingScheme.reportStudentAverageScore(cs2340Sec1, cs2340student3)==81.85);
		assertTrue(GradingScheme.reportStudentAverageScore(cs2340Sec2, cs2340student4)==64.0);
		assertTrue(GradingScheme.reportStudentAverageScore(cs2340Sec2, cs2340student5)==60.7);
	}
	
	@Test
	public void testClassLetterGrade(){
		assertTrue(GradingScheme.calcLetterGrade(cs2340Class)=='C');
	}

	@Test
	public void testSectionLetterGrade(){
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec1)=='B');
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec2)=='D');
	}
	
	@Test
	public void testStudentLetterGrade(){
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec1, cs2340student2)=='B');
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec1, cs2340student1)=='A');
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec1, cs2340student3)=='B');
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec2, cs2340student4)=='D');
		assertTrue(GradingScheme.calcLetterGrade(cs2340Sec2, cs2340student5)=='D');
	}
}
