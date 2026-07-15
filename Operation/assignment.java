package Operation;

public class assignment {
    public static void main(String[] args) {
        // int a = 5,b = 7;
        // System.out.println(b += a);  //b=12
        // System.out.println(a -= ++b);  //a=5 12=0
        // System.out.println(b *= a++);  //b=12 0=12
        // System.out.println(a /= --b);  //a=0 12=-12
        // System.out.println(b %= a);  //a=-12 12=-144
        // System.out.println(b *= a++);  //a=-12 12=-156
        

        // parang acitvity pero hindi 
    //     int x = 10;
    //     int y = 5;

    //  System.out.println(x > y);          
    //  System.out.println(x == y);         
    //  System.out.println((x * 2) != y);   
    //  System.out.println((x / 2) < y);    
    //  System.out.println(++x >= y--);
     
        int x = 10;
        int y = 5;

System.out.println((x > y) && ((x + y) > 12));
System.out.println((x == y) || ((x - y) == 5));
System.out.println(((x * 2) != y) && ((y * 3) < x * 2));
System.out.println(((x / 2) < y) || ((x % 3) == 1));
System.out.println((++x >= y--) && ((x + y) >= 15));
    }
}