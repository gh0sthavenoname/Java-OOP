public class IfElse_Year {
    public static void main(String[] args) {
      int year = 2022;
      if (year % 400 == 0) {
        System.out.println("Високосный год");
        } else if (year % 100 == 0){
          System.out.println("Невесокосный год");
        } else if (year % 4 ==  0 ) {
          System.out.println("Високосный год");
        } else{
           System.out.println("Невесокосный год");
         
        }
    }
    
}