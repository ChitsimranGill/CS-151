package hw4;
import java.util.*;
import javax.swing.event.*;

/**
   An invoice for a sale, consisting of line items.
*/
public class Invoice
{
   /**
      Constructs a blank invoice.
   */
   public Invoice()
   {
      items = new ArrayList<>();
      listeners = new ArrayList<>();
   }

  /**
      Adds an item to the invoice.
      @param item the item to add
   */
   public void addItem(LineItem item)
   {
      items.add(item);
      // Notify all observers of the change to the invoice
      ChangeEvent event = new ChangeEvent(this);
      for (ChangeListener listener : listeners)
         listener.stateChanged(event);
   }
   
   public void addHammer()
   {
	   if (IT.bunCount==0)
	   {
	   items.removeAll(items);
	   }
	   else
	   {
		   items.removeAll(items);
		   items = testitems1;
	   }
	   Product ham = new Product("Hammer", 19.95);
	   ham.ChangeString("Hammer "+ "("+IT.hamcount+")");
	   items.add(ham);
	   ChangeEvent event = new ChangeEvent(this);
	   for (ChangeListener listener : listeners)
	         listener.stateChanged(event);
	   testitems = items;
   }
   
   public void addBundle()
   {
	   items = testitems;
	   Product hammer = new Product("Hammer", 19.95);
	   Product nails = new Product("Assorted nails", 9.95);
	   Bundle bundle = new Bundle();
	   bundle.add(hammer);
	   bundle.add(nails);
	   DiscountedItem discountItem1 = new DiscountedItem(bundle, 10);
	   if (IT.bunCount<2)
	   {
	   items.add(discountItem1);
	   }
	   ChangeEvent event = new ChangeEvent(this);
	   for (ChangeListener listener : listeners)
	         listener.stateChanged(event);
	   testitems1 = items;
	   
	   
   }

   /**
      Adds a change listener to the invoice.
      @param listener the change listener to add
   */
   public void addChangeListener(ChangeListener listener)
   {
      listeners.add(listener);
   }

   /**
      Gets an iterator that iterates through the items.
      @return an iterator for the items
   */
   public Iterator<LineItem> getItems()
   {
      return new
         Iterator<LineItem>()
         {
            public boolean hasNext()
            {
               return current < items.size();
            }

            public LineItem next()
            {
               return items.get(current++);
            }

            public void remove()
            {
               throw new UnsupportedOperationException();
            }

            private int current = 0;
         };
   }

   public String format(InvoiceFormatter formatter)
   {
      String r = formatter.formatHeader();
      Iterator<LineItem> iter = getItems();
      while (iter.hasNext())
         r += formatter.formatLineItem(iter.next());
      return r + formatter.formatFooter();
   }

   private ArrayList<LineItem> items;
   private ArrayList<LineItem> testitems;
   private ArrayList<LineItem> testitems1;
   private InvoiceTester IT = new InvoiceTester();
   private ArrayList<ChangeListener> listeners;
}
