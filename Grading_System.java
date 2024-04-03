import java.util.Scanner;

public class PassSheet{
  
  
  
  public static void Category(int mark){
    if (mark >= 80){
      System.out.println("Congratulations you have an A");
    } else if(mark < 80 && mark >= 60){
      System.out.println("Congratulations you have a B");
    }else if (mark < 60 && mark >= 50){
      System.out.println("You have a C");
    }else if (mark < 50 && mark >= 40){
      System.out.println("You have a D");
    } else{
      System.out.println("You failed");
    }
  }
  
  public static void Qualification(int mark){
    if (mark >= 50){
      System.out.println("Congratulations!!!👌👌👍😂 You qualify for the university");
    }else{
      System.out.println("Am sorry but you do not qualify for the university");
    }
  }
  
  
public static void main (String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Input your marks below");
  
    int mark = scanner.nextInt();
    
    
    Category(mark);
    Qualification(mark);
    

  }
  
}
