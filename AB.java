package com.programmes;

public class AB 
{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine(); 

        int sumEven = 0;
        int sumOdd = 0;

        
        for (char ch : input.toCharArray()) {
           
            int digit = Character.getNumericValue(ch);

            
            if (digit % 2 == 0) {
                sumEven += digit; 
            } else {
                sumOdd += digit; 
            }
        }

        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Sum of odd digits: " + sumOdd);
    }

}
