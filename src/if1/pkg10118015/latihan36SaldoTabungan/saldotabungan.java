package if1.pkg10118015.latihan36SaldoTabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class saldotabungan {

	private double saldoawal;
	private double bunga;
	private double saldotarget;     
        

	public void hitungsaldo(double saldoawal, double bunga, double saldotarget) {
            DecimalFormat ind = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp.");
            formatRp.setMonetaryDecimalSeparator('.');
            formatRp.setGroupingSeparator('.');
            ind.setDecimalFormatSymbols(formatRp);
            int i = 1;
            while (i <= 10) {
                double hbunga = bunga * saldoawal;
                saldoawal = (int) (saldoawal + hbunga);
                System.out.printf("Saldo di bulan ke-"+ i + " %s%n",ind.format(saldoawal));
                i++;
                if (saldoawal >= 6000000) 
                    break;
            }
	}

}