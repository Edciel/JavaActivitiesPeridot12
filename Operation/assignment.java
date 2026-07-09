package Operation;

public class assignment {
    public static void main(String[] args) {
        int a = 5,b = 7;
        System.out.println(b += a);  //b=12
        System.out.println(a -= ++b);  //a=5 12=0
        System.out.println(b *= a++);  //b=12 0=12
        System.out.println(a /= --b);  //a=0 12=-12
        System.out.println(b %= a);  //a=-12 12=-144
        System.out.println(b *= a++);  //a=-12 12=-156
        
        

      
        
    }
}