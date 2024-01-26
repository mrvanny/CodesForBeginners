public class sumOfDigits {
    public static void main(String[] args) {
        int n=12340;
        int sum=0;
        while (n>0) {
            sum=sum+n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
