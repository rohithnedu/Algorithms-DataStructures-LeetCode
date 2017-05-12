  
//  Implement pow(x, n).
  
  public double myPow(double x, int n) {
         double result = 1;

        while (n > 0) {
            if (n % 2 != 0) {
                result = result * x;
            }

            x = x * x;
            n = n / 2;
        }

        return result;
    
    }
}