package beggnierjava;
class student
{
    int rollno;
    String name;
    int marks;
    
}
public class stringarr {
    public static void main(String[] args) {
        // int nums[]=new int[4];
        // nums[0]=5;
        // nums[1]=2;
        // nums[2]=4;
        // nums[3]=6;
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }



    student s1= new student();
    s1.rollno=5;
    s1.name="Navin";
    s1.marks=88;

    student s2= new student();
    s2.rollno=1;
    s2.name="Goku";
    s2.marks=0;


    student s3= new student();
    s3.rollno=2;
    s3.name="vegeta";
    s3.marks=60;

    student students[]=new student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    for(student stud: students){
        System.out.println(stud.name + " : " +stud.marks);
    }
    
    }
}
