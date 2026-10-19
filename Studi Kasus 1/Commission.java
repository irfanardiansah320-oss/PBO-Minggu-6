public class Commission extends Hourly {

    private double totalSales;
    private double commisionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);

        commisionRate = commRate;
        totalSales = 0;
    }

    public void addSales (double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay ()
   {
      double payment = super.pay();
      payment += totalSales * commisionRate;

      totalSales = 0;

      return payment;
   }

   public String toString()
   {
      String result = super.toString();

      result += "\nTotal Sales: " + totalSales;

      return result;
   }
    
}
