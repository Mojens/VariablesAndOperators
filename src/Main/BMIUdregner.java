package Main;

import java.util.Scanner;

public class BMIUdregner {

  public static void main(String[] args) {
    //ligning der bliver brugt for at regne bmi er: vægt(kg)/højde(m)^2
    Scanner scanner = new Scanner(System.in); // laver scanner objekt
    System.out.print("Enter your weight in kilograms: ");
    double weight = scanner.nextDouble(); //giver brugeren mulighed for at skrive
    System.out.print("Enter your height in meters: ");
    double height = scanner.nextDouble();
    double bmi = weight / Math.pow(height,2); //(height * height)
    System.out.print("your bmi is: ");
    /*bmi=(double) ((int) (bmi*100))/100; //ændre det til kun 2 decimaler */
    System.out.printf("%.2f",bmi); //ændre til 2 decimaler med printf

  }
}

