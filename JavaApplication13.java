
package javaapplication13;
import java.util.Scanner;
import static javaapplication13.Exception1.input;

//Exception1
class FirstException extends Exception 
{FirstException (string s) (super (s);}}
class Exception1 (static void input (int a) throws FirstException
{
if (a==1) {System.out.printin ("How much money do you have in your account?");}
else if (a==0) {throw new FirstException ("You don't have an account");} 
else System.out.println ("Input correct number.");
}
}

//Exception 2
class SecondException extends Exception
{SecondException (string s) ( super (s) ;}}
class Exception2{static void input2 (int b) throws SecondException
{
if (b<0 || b>50000) (throw new Secondixception ('We don't preserve that amount of money");
else if (b>0 && b<50000) (System.out.println ("Your current money is: "+b);}
}}

//Exception3
class ThirdException extends Exception 
(ThirdException (string s) (super (s) ;}}
class Exception3{static void input3 (int c) throws ThirdException
if (c==1) (System. out. printIn ("How much money you want to put?"); }
else if (c==0) {System.out .printIn ("How much noney you want to withdraw?");}
else throw new ThirdException ("Please input correct number")
}

/ /Exception4
class FourthException extends Exception
(FourthException (string s) (super (s) ;}}
class Exception4 (static void input4 (int d) throws FourthException
{
if (d>50000) (throw new FourthException ("Exceds the bank capability");}
else if (d>0 && d<50000) (System.out.println ("Your current money is: "+d);}
}
}
//Exception5
class Exception5(static void input5 (int e) throws FourthException
{
if (e<O || e==0) (throw new FourthException (
"You can't withdraw all money, you have to have at least 500tk"')
else if (e>0) (System. out.printin ("Your current money is: "+e) ;}
}}

public class AtmBank {
public static void main (String[] args) {
    Scanner obj1= new Scanner (System.in) ;
    System.out.println("Select options: ");
    System. out printIn("If you have an Account input 1");
    system. out.printin ('IF you don't have an account input O');
    System.out.print ("Your input: ");
    int in1= obj1.nextInt() ;
    try(input (in1) ;}
    catch (Exception m) {System.out .printin (
        "Exception occured:You don't have an account, creat one first ");
        System.exit (0);}

    System.out.print ("Your input: ");
    int in2= obj1.nextInt () ;
    Exception2 obj2= new Exception2() ;
    try{obj2.input2 (in2) ;}
    catch (Exception n) (System.out.printin (
        "Exception occured: We don't preserve that amount of money");
System.exit (0) ;
}
System.out.printin ("If you want to input money type 1");
System.outprintin ("If you want to withdraw money type 0");
System.out.print ("Your input:");
int in3= obil.nextInt () ;
Exception3 obi3= new Exception3 () ;
try{obj3.input3 (in3) ;}
catch (Exception o) (System. out-printin (
"Exception Occured: Please input correct number"); }

System.out.print ("Your input:") ;
if (in3==1) (
int in4= obj1.nextint () ; 
int sum=in2+in4;
Exception4 obj4= new Exception4 () ;
try {(obj4. input4 (sum) ; }
catch (Exception p) (System. out println (
Exception occured: Exceds the bank capability (50000) "); }}

else if (in3==0) {
int in5= obil.nextInt () ;
int sum2= in2-in5;
Exception5 obj5= new Exception5 () ;
try(obj5. input5 (sum2) ; }
catch (Exception q) {System. out.printin (
"Exception Occured: You can't withdraw all your money. You have to leave 500tk
}
System. out.println (" ! ! Have a good day!.");
}}