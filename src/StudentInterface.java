import TerminalIO.KeyboardReader;
public class StudentInterface {

    
    public static void main(String[] args) {
        //Instantiate the students and the keyboard object
        Student student1 = new Student();
        Student student2 = new Student();
        KeyboardReader reader = new KeyboardReader();
        
        String name;
        int score;
        
        //Input the first student's data
        while (true){
            name = reader.readLine("Enter first student's name (min 1 letter): ");
            student1.setName(name);
            for (int i = 1; i <=3; i++) {
                score = reader.readInt("Enter score " + i + " for student: ");
                student1.setMark(i,score);
            }
            //validate the student's data
            String errormsg = student1.validateData();
            if (errormsg==null) break; //no error means all is okay
            //print error if there is one, and stay in this loop
            System.out.println(errormsg);
        }
        //Input the second student's data
        while (true){
            name = reader.readLine("Enter second student's name (min 1 letter): ");
            student2.setName(name);
            for (int i = 1; i <=3; i++) {
                score = reader.readInt("Enter score " + i + " for student: ");
                student2.setMark(i,score);
            }
            //validate the student's data
            String errormsg = student1.validateData();
            if (errormsg==null) break; //no error means all is okay
            //print error if there is one, and stay in this loop
            System.out.println(errormsg);
        }
        //Output the two students' information
            System.out.println(student1);
            System.out.println(student2);
            
        if (student1.getHighScore() > student2.getHighScore()) {
            System.out.println("" + student1.getName() + " has a higher score");
        }
        else
            System.out.println("" + student2.getName() + " has a higher score");
        if (student1.getAverage() > student2.getAverage()) {
            System.out.println("" + student1.getName() + " has a higher average");
        } 
        else
            System.out.println("" + student2.getName() + " has a higher average");
    }
        
        
        
    }
    

