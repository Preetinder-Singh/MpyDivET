/*
 * 
 *@author Preetinder Singh
   date: 08/03/18
**/
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MpyDiviET
{
              
public static void main(String[] args)
{

double v1, v2, Product, et1, et2, div1, div2, div12, PD; 
double Division, let;

Scanner java= new Scanner(System.in);  //to take the value from the console


System.out.println("value of v1:");  //enter the first value
v1 = java.nextDouble();
System.out.print("Enter the error term of fist value:");  //enter the first error term
et1 = java.nextDouble();
 
System.out.println("value of v2:");   //enter the second term
v2= java.nextDouble();
System.out.print("Enter the error term of second value:");  //enter the second error term

et2= java.nextDouble();

java.close();
DecimalFormat New=new DecimalFormat(); //for rounding of the result
New.format(Product = v1*v2);
New.format(div1 = et1/v1);
New.format(div2 = et2/v2);
New.format(div12=div1+div2);
New.format(PD=div12*Product);
New.format(Division = v1/v2);
New.format(let=div12*Division);


//mpy
System.out.println("--->Multiplication <---");
System.out.println("");

System.out.println(getSignificant(Product, 9) + "±" + getSignificant(PD, 1));
System.out.println("");

//Div
System.out.println("--->Division <---");
System.out.println("");

System.out.println(getSignificant(Division, 9) + "±" + getSignificant(let, 1));
System.out.println("");

//significant method

}

public static String getSignificant(double value, int sigFigs) {
    MathContext mc = new MathContext(sigFigs, RoundingMode.DOWN);
    BigDecimal bigDecimal = new BigDecimal(value, mc);
    return bigDecimal.toPlainString();
}

}


