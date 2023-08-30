import java.text.NumberFormat;
import java.util.Scanner;



class JavaCodesCSC300 
{
    public static void main(String[] args)
    {
       
                            //Employee Class object
        // Employee fernando = new Employee(40, "Manager");
        // System.out.println("Employee: Fernando" + "\n"+ fernando);
       
        
                            //Number Format
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        // String result = currency.format(12345678.543);
        // System.out.println(result);

        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result2 = percent.format(0.435324);
        // System.out.println(result2);


        // //Method Chaining the NumberFormat
        // String result3 = NumberFormat.getPercentInstance().format(0.1);
        // System.out.println(result3);

        
                            //Ternary operator PROFESSIONAL APPROACH
        // int income = 120_000;

        // String hasHighIncome = (income > 100_000 ? "First" : "Economy");

        // System.out.println(hasHighIncome);


                            //whileExample

        Scanner sc = new Scanner(System.in);

        // String input = "";

        // while(!input.equals("quit"))
        // {
        //     System.out.println("Input : ");

        //     input = sc.next().toLowerCase();
        //     System.out.println(input);

        // }

        // //While true loop

        // double userInput;

        // while(true)
        // {
        //     userInput = sc.nextDouble();
        //     if(userInput >= 1 && userInput <= 10)
        //     break;

        //     System.out.println("Invalid input try again!");
        // }

        // String input = "";   
        // while(true)
        //     {
        //         System.out.print("Input:");
        //         input = sc.next().toLowerCase();
        //         if(input.equals("pass"))
        //             continue;
        //         if(input.equals("quit"))
        //             break;
        //         System.out.println(input);
        //     }




                            //Switch Statements

            // String role ="mentor";

            // switch(role)
            // {
            //     case "admin": 
            //     System.out.println("You are an admin");
            //     break;

            //     case "mentor":
            //     System.out.println("You are a mentor");
            //     break;

            //     default:
            //     System.out.println("You are a guest");

                






            }

    }

    


