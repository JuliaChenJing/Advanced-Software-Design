package app;
public class Application {
	
	public static void main(String[] args) {
		Drive cdrive = new Drive("C");
		
		Directory appDir = new Directory("MyApplications");
		Directory dataDir = new Directory("MyData");
		Directory courseDir = new Directory("CS525");
		
		File excelfile = new File("msexcel.exe", 2353256);
		File wordfile = new File("msword.exe", 3363858);
		File studentsfile = new File("students.doc", 34252);
		
		cdrive.addComponent(appDir);
		cdrive.addComponent(dataDir);
		
		
		dataDir.addComponent(courseDir);
		
		appDir.addComponent(excelfile);
		appDir.addComponent(wordfile);
		
		courseDir.addComponent(studentsfile);
		
		cdrive.print();
	}
}