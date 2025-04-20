package OOPSinJAVA;

public class Student {
    //creating a new data type

    //   private  int rno;
    int rno;
    double percentage;
    String name;
    final String schoolName = "MDS INTER COLLEGE";
    private static int numberOfStudent;

    //default constructor
    public Student() {

    }

    public Student(String name, int rno, double per) {
        this.name = name;
        this.rno = rno;
        percentage = per;
        numberOfStudent++;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

//    public int getRno() {//getter
//        return rno;
//    }
//
//    public void setRno(int rno) {//setter
//       this.rno = rno;
//    }
}
