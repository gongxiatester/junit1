package Com;

public class ComplexCalculation {

    public static  int Division(int a,int b){        
        return (a/b);        
    }

    public static int Multiply(int a,int b){        
        return (a*b);        
    }
public static void main(String [] args)
{
	
	int a=ComplexCalculation.Division(3,3);
	int b=ComplexCalculation.Multiply(5,6);
	System.out.println(a);
	System.out.println(b);
}
}
