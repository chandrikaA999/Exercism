class PrimeCalculator
{
    int nth(int nth) {
        if(nth==0){
            throw new IllegalArgumentException();
        }
        int prime=2;
        int primeCount=1;
        while(primeCount<=nth)
        {
            for(int i=prime;primeCount<=nth;i++)
            {
                boolean isPrime =true;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        isPrime =false;
                        break;
                    }
                }
                if(isPrime)
                {
                    primeCount++;
                }
                prime++;
            }
        }
        return prime-1;

    }

}
