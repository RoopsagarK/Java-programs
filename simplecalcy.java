import java.util.*;
public class simplecalcy{
    public static void main(String argus[]){
    
Scanner sc = new Scanner(System.in);
float a,b;
System.out.println("Enter any two numbers");
a = sc.nextFloat();
b = sc.nextFloat();

char op;
System.out.println("Enter the operator");
op = sc.next().charAt(0);

switch(op){
    case '+':{
        System.out.println("Sum ="+(a+b));
        break;
    }
    case '-' :{
        System.out.println("Diff = "+(a-b));
        break;
    }
    case '*' :{
        System.out.println("Product = "+(a*b));
        break;
    }
    case '/' :{
        System.out.println("Div = "+(a/b));
        break;
    }
    case '%' :{
        System.out.println("Mod = "+(a%b));
        break;
    }
    default:{
        System.out.println("Enter valid operator....!");
    }
}
    }
}