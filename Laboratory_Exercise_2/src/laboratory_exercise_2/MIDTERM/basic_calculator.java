
package MIDTERM;


public class basic_calculator {
    public static int add(int a,int b){
        return a + b;
    }
    public static int sub(int a,int b){
        return a - b;
    }
    public static int Mult(int a,int b){
        return a * b;
    }
    public static int Div(int a,int b){
        return a / b;
    }
    public static float per(float c,float d){
        return c * (d/100);
        
    }
    
    public static void main(String[] args) {
        
        int result1 = add(15,10);
        System.out.println("Addition: " + result1);
        int result2 = sub(20,10);
        System.out.println("Subtraction: " + result2);
        int result3 = Mult(50,59);
        System.out.println("Multiplication: " + result3);
        int result4 = Div(15,5);
        System.out.println("Division: " + result4);
        float result5 = per(100,50);
        System.out.println("Percentage: " + result5 );
    }
    
    
}
