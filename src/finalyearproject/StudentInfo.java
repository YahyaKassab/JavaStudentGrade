
package finalyearproject;

public class StudentInfo {
    private String name;
    private int hwScore;
    private int tScore;
    private int sTotal;
    //constructor to get student data values from the database
    StudentInfo(String sName, int homework, int test, int Total) {
        this.name = sName;
        this.hwScore = homework;
        this.tScore = test;
        this.sTotal = Total;
    }
    //Encapsulation applied here
   
    public String getSName()
    {
        //returns student name
        return name;
    }
    public int getHScore()
    {
        //returns homework score
        return hwScore;
    }
    public int getSTest()
    {
        //returns student test score
        return tScore;
    }
    public int getTotals()
    {
        return sTotal;
    }
}
