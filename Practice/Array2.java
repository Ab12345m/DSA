class Student {
    public int rollno;
    public String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class Array2 {
    public static void main(String[] args) {

        Student[] arr = new Student[3];

        arr[0] = new Student(1, "Abhi");
        arr[1] = new Student(2, "B");
        arr[2] = new Student(4, "C");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("index"+i+"rollno"+":"+arr[i].rollno+"name"+arr[i].name);
        }

        
    }
}
