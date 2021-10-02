package baseline;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff()
    {
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        double s1 = -(1/30.0);

        double s2 = (1+(Solution26.b/Solution26.p) * (1- (Math.pow(1 + Solution26.i,30))));

        double s3 = Math.log(s2);

        double s4 = Math.log(Solution26.i +1);


        double n = (s1 * s3) / s4;
        n = Math.ceil(n);

        return n;

        //Return months left


    }

}
