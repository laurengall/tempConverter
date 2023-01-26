import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  start();
  }
  public static void start(){
     Scanner input = new Scanner(System.in); 
    System.out.println("Which way will you be converting?"); 
    System.out.println("Type 1 for Fahrenheit to Celsius."); 
    System.out.println("Type 2 for Celsius to Fahrenheit."); 
    int num = input.nextInt(); 
    if (num == 1){
      System.out.println("Type in your temperature: "); 
      double tempF = input.nextDouble(); 
      fToC(tempF); 
     again(); 
    } else if (num == 2){
      System.out.println("Type in your temperature: "); 
      double tempC = input.nextDouble(); 
      cToF(tempC); 
      again(); 
      
    } else {
      System.out.println("Not a valid input."); 
      System.out.println("Type 1 for Fahrenheit to Celsius."); 
    System.out.println("Type 2 for Celsius to Fahrenheit."); 
      num = input.nextInt(); 
    }
  }
  public static void fToC(double tempF){
    double cels; 
      cels = (tempF - 32) * 5/9; 
      System.out.println(tempF + " degrees Fahrenheit is " + cels + " degrees Celsius."); 
    
  }
  public static void cToF(double tempC){
    double fahr = (tempC * 9/5) + 32; 
      System.out.println(tempC + " degrees Celsius is " + fahr + " degrees Fahrenheit."); 
  }
  public static void again(){
  Scanner input = new Scanner(System.in); 
     System.out.println("Would you like to make another conversion?"); 
      System.out.println("Type 1 for yes."); 
      System.out.println("Type 2 for no."); 
      int num2 = input.nextInt(); 
    if (num2 == 1){
      start() ;
    } else if (num2 == 2){
      System.exit(0); 
    } else {
      System.out.println("Not a valid input."); 
      System.out.println("Type 1 for a new conversion."); 
    System.out.println("Type 2 to end the program."); 
      num2 = input.nextInt(); 
  }
}}