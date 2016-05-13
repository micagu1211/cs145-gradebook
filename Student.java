import java.util.Scanner;
import java.util.Random;

class Student {

	static String firstName(){
		Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your first name please: ");
        String name = scnr.next();
		return name;
	}

	static double high(double[] grades) {
        double high=grades[0];
        for(int i=0; i<grades.length; i++){
            if(grades[i]>high){
                high= grades[i];
            }
        }

      	return high;

       }

	static double low(double[] grades){ 
		double low=grades[0];
        for(int i=0; i<grades.length; i++){
            if(grades[i]<low){
                low=grades[i];
            }
        }
        return low;
       }
       
	static double average(double[] grades){
		double sum=0;

        for(int i=0; i<grades.length; i++)
            sum=sum+grades[i];

        double average=sum/grades.length;

		return average;

	}
	
	static char letterGrade(double[] grades){
		char x='-';
		double y= average(grades);
		if(y>90 && y<100){
			x='A';
		}
		else if(y>80 && y<89.99){
			x='B';
		}
		else if(y>70 && y<79.99){
			x='C';
		}
		else if(y>60 && y<69.99){
			x='D';
		}
		else if(y<60){
			x='F';
		}
		return x;
	}

}