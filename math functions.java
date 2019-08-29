package simplecalculator;
import java.util.Scanner;
import java.lang.Math;
public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter numbers and operation you want to perform");
        Scanner s = new Scanner(System.in);
        float num1 = s.nextFloat() , num2 = s.nextFloat();
        String operator= s. next();        
        switch(operator){ 
case "+":
System.out.println(num1+num2); break;
case "-":
System.out.println(num1-num2); break;
case "*":
System.out.println(num1*num2); break;
case "/":
System.out.println(num1/num2); break;
case "%":
System.out.println(num1%num2); break;
case "++":
System.out.println(++num1 +"\n"+ ++num2); break;
case "--":
System.out.println(--num1 +"\n"+ --num2); break;
case "sin":
System.out.println("1st No. is considered 2nd is ignored\nsin "+num1+" = "+Math.sin(num1)); break;
case "cos":
System.out.println("1st No. is considered 2nd is ignored\ncos "+num1+" = "+Math.cos(num1)); break;           
case "tan":
System.out.println("1st No. is considered 2nd is ignored\ntan "+num1+" = "+Math.tan(num1)); break;
case "cot":
System.out.println("1st No. is considered 2nd is ignored\ncot "+num1+" = "+1/Math.tan(num1)); break;
default:
System.out.println("Input is wrong");
        }    }   }