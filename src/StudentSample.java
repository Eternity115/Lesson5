
public class StudentSample {

    public static void main(String[] args) {
        Student s1, s2;
        s1 = new Student();
        
        s1.setName("Bob Jones");
        s1.setMark(1,75);
        s1.setMark(2,62);
        s1.setMark(3,68);

        System.out.println(s1); //runs the toString method
        s2=s1; //1 object with 2 names
        s2.setName("Bob the Same Guy");
        
        System.out.println(s1); //runs the toString method
        System.out.println("Top score is: " + s2.getHighScore());
        //System.out.println("Average is: " + s2.getAverage());    //This is now privat helper
        s2 = new Student(s1);
        Student s3 = new Student("Jimmy Wilson", 80, 90, 85);
        System.out.println(s3);
        s2.setMark(70);
        System.out.println(s2);
        
    }
    
}
