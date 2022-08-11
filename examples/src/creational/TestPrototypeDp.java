package creational;

//Prototype DP --> cloning/copy of an existing object

interface Prototype{

    public Prototype getClone();
}

class StudentRecord implements Prototype{

    private int rollno;
    private String name;

    public StudentRecord(){
        System.out.println("Hello from Student Record constructor.");
    }

    public StudentRecord(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void getIntro(){
        System.out.println("Hey this "+ this.name +" and my rollno is "+ this.rollno);
    }

    @Override
    public Prototype getClone() {
        return new StudentRecord(rollno,name);
    }
}

public class TestPrototypeDp {
    public static void main(String[] args){
        StudentRecord st1 = new StudentRecord(101,"Rajesh");
        st1.getIntro();

        StudentRecord st2 = (StudentRecord) st1.getClone();
        st2.getIntro();

    }
}
