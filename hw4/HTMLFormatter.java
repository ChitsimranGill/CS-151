package hw4;

import javax.swing.text.html.HTML;

public class HTMLFormatter implements InvoiceFormatter
{
	public String formatHeader()
   {
		total = 0;
	      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total = (IT.bunCount*26.91) + (IT.hamcount*19.95) ;
      return (String.format("%s: $%.2f\n",item.toString(),item.getPrice()));
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
   private InvoiceTester IT = new InvoiceTester();

}

