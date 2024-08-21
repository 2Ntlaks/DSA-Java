package Recursion.Math;

public class Power {
  public int pow(int m,n)
    {
        if(n == 0)
            return 1;
        else
            return m*pow(m,n-1);
    }
    
    public static void main(String[] args) {
              int results = pow(5,2);

        System.out.println(results);
    }


}
