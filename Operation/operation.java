package Operation;

public class operation {
    public static void main(String[] args) {
        int addend1 = 10, addend2 = 20, sum;
        sum = addend1 + addend2;
        System.out.println("The sum of " 
        + addend1 + " and " + addend2 + " is: " + sum);
        int minued = 30, subtrahend = 15, difference;
        difference = minued - subtrahend;
        System.out.println("The difference of "
         + minued + " and " + subtrahend + " is: " + difference);
         addend1 = 5; addend2 = 4; sum = addend1 * addend2;
         System.out.println("The product of "
         + addend1 + " and " + addend2 + " is: " + sum);
         float dividend = 20, divisor = 4; 
         float quotient = dividend / divisor;
         float remainder = dividend % divisor;
         System.out.println("The quotient of "
         + dividend + " and " + divisor + " is: " + quotient);
         System.out.println("The remainder of "
         + dividend + " and " + divisor + " is: " + remainder);

    }
}