import java.util.Scanner;

public class Policy.java {

    
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
       
        do {
        System.out.print("Please enter the Policy Number: \n");
        int polNum = scnr.nextInt();

        System.out.println("Please enter the Provider Name: ");
        String provName = scnr.nextString();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scnr.nextString();
        
        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scnr.nextString();
        
        System.out.print("Please enter the Policyholder’s Age: ");
        String polAge = scnr.nextString();
        
        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokeStatus = scnr.nextString();
        
        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        String polHeight = scnr.nextString();
        
        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        String polWeight = scnr.nextString();
        

        String firstName;

        

        System.out.print("Please enter the Customer's Name:\n");
        String userName = scnr.nextLine();

        System.out.print("Please enter the Account Balance:\n");
        double accBal = scnr.nextDouble();

        double polBmi = (polWeight * 703 ) / (polHeight^2);

        System.out.println("Policy Number:  " + polNum);
        System.out.println("Provider Name: " + provName);
        System.out.println("Policyholder’s First Name: " + firstName);
        System.out.println("Policyholder’s Last Name: " + lastName);
        System.out.println("Policyholder’s Age: " + polAge);
        System.out.println("Policyholder’s Smoking Status: : " + smokeStatus);
        System.out.println("Policyholder’s Height: " + polHeight);
        System.out.println("Policyholder’s Weight:  " + polWeight);
        System.out.println("PoPolicyholder’s BMI:  " + polBmi);
        System.out.println("Policy Price: " + polPrice);

        
        }
        }