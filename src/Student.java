
public class Student {
    //Step 1- declare private instance variables
    private String name;
    private int mark1,mark2,mark3;
    
    //Step 2- Constructor Method
    //its job is to initialize some or all properties of the object
    /*
    public Student(){
        name="";
        mark1=0;
        mark2=0;
        mark3=0;
    }
    //now I can go: Student s = new Student ("Bob", 75,81,64)
    public Student(String s, int m1, int m2,int m3){
        name=s;
        mark1=m1;
        mark2=m2;
        mark3=m3;                
    }
    //now I can go: Student s2 = new Student(s1); //where s1 is an existing student
    public Student(Student other){
        name=other.name;
        mark1=other.mark1;
        mark2=other.mark2;
        mark3=other.mark3;
    }
    */
    
    //OFFICIAL VERSION OF CONSTRUCTORS: CHAINING
    
    //this is the default constructor, the one that requires no arguments
    public Student(){
        this ("",0,0,0);
    }
    //now I can go: Student s = new Student ("Bob", 75,81,64)
    public Student(String s, int m1, int m2,int m3){
        name=s;
        mark1=m1;
        mark2=m2;
        mark3=m3;                
    }
    //now I can go: Student s2 = new Student(s1); //where s1 is an existing student
    public Student(Student other){
        this(other.name,other.mark1,other.mark2, other.mark3);
    }
    
    
    
    
    //later I can go: s.setName("Bob") to run this code
    /**
     * Sets the name of the student
     * @param n student name
     */
    public void setName (String n){
        name = n;
    }
    
    //later I can go: System.out.print(s.getName());
    /**
     * Returns the name of the student
     * @return Student name
     */
    public String getName(){
        return name;
    }
    
    //later I can go: s.setMark(2,95);
    /**
     * Sets a given mark for the student
     * @param i Student mark to set
     * @param score score to apply to a given mark
     */
    public void setMark(int i, int score){
        if (i==1) mark1=score;
        else if (i==2) mark2=score;
        else mark3=score; //defaults to 3 if not 1 or 2
    }
    
    //overloading the setMark method
    //this is allow because it has a different signiture
    /**
     * Sets all marks to a given value
     * @param score  Mark to be set to all value
     */
    public void setMark (int score){
        mark1=score;
        mark2=score;
        mark3=score;
    }
    
    //later I can go: System.out.print("Mark 2 is " + s.getMark(2));
    /**
     * Gets a mark from the student
     * @param i which mark to request
     * @return Requested mark
     */
    public int getMark(int i){
        if(i==1) return mark1;
        else if(i==2) return mark2;
        else return mark3;
    }
    
    //later I can go: System.out.print("Top mark is " + s.getHighScore());
    /**
     * Returns the highest mark from the student
     * @return highest mark
     */
    public int getHighScore(){
        int high =mark1;
        if (mark2>high) high = mark2;
        if (mark3>high) high = mark3;
        return high;
    }
    
    //later I can go: System.out.print("Average is " + s.getAverage());
    /**
     * Gets the average mark for the student
     * @return Average Mark
     */
    public int getAverage(){
        return ((mark1+mark2+mark3)/3);
    }
    public String validateData(){
        String em=null;
        if (name.equals(""))//then a name was not entered
            em="Name is required";
        if (mark1<0 || mark1>100 || mark2<0 || mark2>100 || mark3<0 || mark3>100)
            if (em==null)//then there has been no error yet
                em= "At least 1 mark is out of the acceptable range";
            else //add on to the message with +=
                em += "\nAt least 1 mark is out of the acceptable range";
        if (em!=null)//then we have an error so add the following line after it
            em+="\nPlease re-enter all the data\n";
        return em;
    }
    
    //common method for MOST objects
    //runs automatically when you print the object
    //ex-> System.out.print(s); where s is a student object
    /**
     * gets all the students properties
     * @return String representation of student
     */
    public String toString(){
        String s = "Name:\t" + name;
        s += "\nMark1:\t" +mark1;
        s += "\nMark2:\t" +mark2;
        s += "\nMark3:\t" +mark3;
        s += "\n====================";
        s += "\nAverage:\t" + getAverage();
        return s;
    }

}
