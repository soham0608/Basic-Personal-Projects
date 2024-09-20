import java.util.Scanner;

class SimpleCalculator{
    
    int a,b,c;
    void Add()
    {
        System.out.println("Result: " + (a + b));
    }
    
    void Sub()
    {
        System.out.println("Result: " + Math.abs(a - b));
    }
    
    void Mul()
    {
        System.out.println("Result: " + (a * b));
    }
    
    void Div()
    {
        if (b == 0) {
            System.out.println("Denominator Cannot be Zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter Nos ");
        Scanner sc=new Scanner(System.in);
        SimpleCalculator c=new SimpleCalculator();
        c.a=sc.nextInt();
        c.b=sc.nextInt();
        
        while(true){
            System.out.println("1] Addition");
            System.out.println("2] Subtraction");
            System.out.println("3] Multiplication");
            System.out.println("4] Division");
            System.out.println("5] Exit");
            
            System.out.println("Select which operation to perform");
            int Selection=sc.nextInt();
        
        switch(Selection)
        {
            case 1:
                c.Add();
                break;
            case 2:
                c.Sub();
                break;
            case 3:
                c.Mul();
                break;
            case 4:
                c.Div();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }
  }
}