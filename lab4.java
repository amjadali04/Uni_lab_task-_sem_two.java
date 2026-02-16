import java.util.Scanner;
public class lab4 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter ur universty name : ");
    String uniName = Sc.nextLine();
     System.out.println("Enter ur department name : ");
    String department = Sc.nextLine();
     System.out.println("Enter total student in depart : ");
    int totalStudent = Sc.nextInt();
    System.out.println("universty name:"+(uniName));
    System.out.println("department name:"+(department));
    System.out.println("total students in depart:"+(totalStudent));
    for(int i = 1; i<= 120; i++)
{
if(i%2==0){
    System.out.println("roll no : "+i);
}
}    
    
    
    
    }
    
}
