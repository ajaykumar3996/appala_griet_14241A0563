import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) 
        {
         int num;
         String name;
         double roll;
         Date dob;
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         name=sc.nextLine();
         roll=sc.nextDouble();
         Date date = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        while (date == null) {
        String line = sc.nextLine();
        try {
            date = format.parse(line);
            } catch (ParseException e) {
     System.out.println("Sorry, that's not valid. Please try again.");
    }
}

//You may test that your code works find here
		//Please check that your code works and has no 
	
          //compilation problems before to submit
	}

}   
