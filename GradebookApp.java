// GradebookApp.java v.20160502
class GradebookApp {
	static double[] grades(){
		System.out.println("HERE ARE YOUR GRADES");
		double[] randGrades= new double[10];
		for(int i=0; i<randGrades.length; i++){
			randGrades[i]=(Math.random()*100)+1;
			System.out.print(randGrades[i]+"\n");
		}
		return randGrades;
	}

	public static void main(String[] args) {
		double[] m=grades();
		String n=Student.firstName();
		System.out.println("HELLO " + n);
		double x=Student.high(m);
		double y=Student.low(m);
		double z=Student.average(m);
		char g=Student.letterGrade(m);
		System.out.print("YOUR HIGH: " + x + "\n\n" + "YOUR LOW: " + y + "\n\n" + "YOUR AVERAGE: " + z+"\n" + "YOUR LETTER GRADE: " + g + "\n");
	}
	//436 //350

}