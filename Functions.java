1. Basic Addition Function
File: SumExample.java    
Concept: Basic function that takes two integers and returns their sum.
Code: 
import java.util.*;
public class Functions{
    public static int CalculateSum(int num1, int num2){
        int sum= num1+num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int sum= CalculateSum(num1,num2);
        System.out.print("Sum is : "+sum);
    }
}

2. Product Calculation with Multiple Calls
 File: ProductExample.java   
Concept: Shows how the same function can be called multiple times with different arguments.
Code:
import java.util.*;
public class Functions{
    public static int CalculateProduct(int a, int b){
        int product= a*b;
        return product;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: "); 
        int b= sc.nextInt();
        int product= CalculateProduct(a,b);
        System.out.println("Product is: " +product);
        product=CalculateProduct(10,20);
        System.out.println("Product is: " +product);
    }
}


3. Complex Function - Binomial Coefficient
File: BinomialCoefficient.java    
Concept: Demonstrates:
                 Function calling another function (bicoeff calls fact)
                 Mathematical calculations using functions
                 Code modularity    
Code:   

import java.util.*;
public class Functions{
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int bicoeff(int n, int r){
        int nfact= fact(n);
        int rfact= fact(r);
        int nmrfact= fact(n-r);
        int bicoeff= nfact/ (rfact*nmrfact);
        return bicoeff;
    }
    
    public static void main(String args[]){
        System.out.println(bicoeff(5,2));
    }
}

4. Function Overloading
File: FunctionOverloading.java
Concept: Method Overloading - Same function name with different:
        Number of parameters
        Types of parameters

Code: 

import java.util.*;
public class Functions{
    public static int sum(int a,int b){
        return a+b;
    }
    
    public static float sum(float a, float b, float c){
        return a+b+c;
    }

    public static void main(String args[]){
        System.out.println(sum(5,6));
        System.out.print(sum(40.3f,50.5f,1.5f));
    }
}
