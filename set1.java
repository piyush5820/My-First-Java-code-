import java.util.Scanner;
public class set1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub 1 mark");
        float m1= sc.nextFloat();
        System.out.println("Enter sub 2 marks");
        float m2= sc.nextFloat();
        System.out.println("Enter sub 3 marks");
        float m3= sc.nextFloat();
        float cgpa = (m1+m2+m3)/3;

        System.out.println(cgpa + "%");

    }
    
}
