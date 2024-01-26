public class factorialNumber{
    public static void main(String[] args) {
        
        int n=5;
        int fact=1;
        for (int i = 2; i <= 5; i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+ n +" is "+fact);
    }
}