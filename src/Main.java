public class Main
{

    public static void main(String[] args)
    {
	int creditCardBalance = 5000;
    double intrestRate = 0.17;
    double oneMonthIntrest = 0;
    double twoMonthIntrest = 0;
    double balanceTotal = 0;

    oneMonthIntrest = creditCardBalance * intrestRate;
    balanceTotal = creditCardBalance + oneMonthIntrest;
    twoMonthIntrest = (balanceTotal * intrestRate) + creditCardBalance;

    System.out.println("Your balance after one month is " + balanceTotal);
    System.out.println("Your balance after two months is " + twoMonthIntrest);

    }
}
