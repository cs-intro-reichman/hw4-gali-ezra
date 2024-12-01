public class Primes {
    public static void main(String[] args) {
     int num = Integer.parseInt(args[0]);
     int countPrime = 0;
     int precentPrime = 0;
        boolean [] isPrime = new boolean[num+1];
        //set all value in array
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i=2 ; i<= isPrime.length/2; i++)
        {

                for (int j=i+i; j < isPrime.length; j=j+i)
                {
                    isPrime[j]= false;
                }

        }
        System.out.println("Prime numbers up to " +num +":");
        for (int i=0;i<isPrime.length; i++)
        {
            if (isPrime[i]) {
                System.out.println(i);
                countPrime++;
            }
        }

            precentPrime = (int)((countPrime/(double)num)*100);
            System.out.println("There are " + countPrime + " primes between 2 and " + num + " (" + precentPrime+ "% are primes)");

    }
}