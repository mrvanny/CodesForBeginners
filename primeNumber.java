public class primeNumber {
    public static void main(String[] args) {

        int n=27;
        boolean flag=true;

        for (int i = 2; i <i*i; i++) {
            //To  handle Special case
            if (n==2) {
                flag=true;
                break;
            }
            if (n%i==0) {
                flag=false;
                break;
            }

        }
        if (flag) {
            System.out.println("This is prime number");
        }
        else{
            System.out.println("This is not prime number");
        }
    }
}
