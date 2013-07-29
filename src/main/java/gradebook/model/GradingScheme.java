package gradebook.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * calculates average grade values and
 * letter grades
 * @author Rex
 *
 */
public class GradingScheme {

	public static int reportClassAverageScore(Class allSections){
		int total = 0;
		ArrayList<Section> sections = allSections.getSections();
		for(int i = 0; i<sections.size();i++){
			Section curSection = sections.get(i);
			total += reportSectionAverageScore(curSection);
		}
		return total/sections.size();
	}
	
	public static int reportSectionAverageScore(Section section){
		int total = 0;
		ArrayList<Student> students = section.getStudents();
		for(int i = 0; i<students.size();i++){
			Student curStudent = students.get(i);
			total += reportStudentAverageScore(section, curStudent);
		}
		return total/students.size();
	}
	
	public static double reportStudentAverageScore(Section section, Student student){
		double average = 0;
		HashMap<GradebookCategory, ArrayList<Integer>> gradeMapper = createHash(section, student);
		java.util.Iterator<Entry<GradebookCategory, ArrayList<Integer>>> calculator = gradeMapper.entrySet().iterator();
		while(calculator.hasNext()){
			int miniTotal = 0;
			Map.Entry<GradebookCategory, ArrayList<Integer>> pair = calculator.next();
			ArrayList<Integer> grades = pair.getValue();
			double weight = (pair.getKey().getWeight());
			weight = weight/100;
			for(int j = 0; j<grades.size();j++){
				miniTotal += grades.get(j);
			}
			double nextToAdd = miniTotal/grades.size();
			average += nextToAdd*weight;
		}
		return average;
	}
	
	public static HashMap<GradebookCategory, ArrayList<Integer>> createHash(Section section, Student student){
		HashMap<GradebookCategory, ArrayList<Integer>> gradeMapper;
		gradeMapper = new HashMap<GradebookCategory, ArrayList<Integer>>();
		ArrayList<StudentGradebookItem> allGrades = section.getGradedWork();
		for(int i = 0; i<allGrades.size();i++){
			StudentGradebookItem currentItem = allGrades.get(i);
			if(currentItem.getStudent().equals(student)){
				GradebookCategory currentCategory = currentItem.getGradeItem().getCategory();
				int score = currentItem.getScore();
				if(!gradeMapper.containsKey(currentCategory)){
					ArrayList<Integer> scores = new ArrayList<Integer>();
					scores.add(score);
					gradeMapper.put(currentCategory, scores);
				}else{
					gradeMapper.get(currentCategory).add(score);
				}
			}
		}
		return gradeMapper;
	}
	
	public static Character calcLetterGrade(Class allSections){
		int numberAverage = reportClassAverageScore(allSections);
		return calcLetter(numberAverage);
	}
	
	public static Character calcLetterGrade(Section section){
		int numberAverage = reportSectionAverageScore(section);
		return calcLetter(numberAverage);
	}
	
	public static Character calcLetterGrade(Section section, Student student){
		double numberAverage = reportStudentAverageScore(section, student);
		return calcLetter(numberAverage);
	}
	
	private static Character calcLetter(double numberAverage){
		if(numberAverage>=90){
			return 'A';
		}else if(numberAverage>=80){
			return 'B';
		}else if(numberAverage>=70){
			return 'C';
		}else if(numberAverage>=60){
			return 'D';
		}else{
			return 'F';
		}
	}
}
