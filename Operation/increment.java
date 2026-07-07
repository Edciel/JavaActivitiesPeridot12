package Operation;

public class increment {
     public static void main(String[] args) {
        System.out.println(
            "Increamenting an integer:");
            int x = 5;
            System.out.println(
                "Initial value of x:" + ++x);
            System.out.println(x);
            System.out.println(x++); 
            System.out.println(x);   
            System.out.println(--x);
            System.out.println(x);
            System.out.println(x--);
            System.out.println(x);
            int y = 10;
            System.out.println(
              "combined operation:" +  (x + y));
            System.out.println(++x + y);//6+10
            System.out.println(x + ++y);//6+11
            System.out.println(x++ + y++);//6+11
            System.out.println(x + y);//7+12
            System.out.println(--x + y);//6+12
            System.out.println(x + y--);//6+12
            System.out.println(--x + ++y);//5+12
            System.out.println(--y + x);//11+5
            System.out.println(x + ++y);//5+12
            System.out.println(x-- - y);//5-12
            System.out.println(--y + y);//11+11
            System.out.println(y - ++y);
            System.out.println(--x - --y);
            System.out.println(x);//3
            System.out.println(y);//11
            System.out.println(x-- + ++y);
            System.out.println(x++*y++);



               

     }
}
