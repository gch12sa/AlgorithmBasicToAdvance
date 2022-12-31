package solid_principles.open_close;

import solid_principles.single_responsibility.Invoice;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveInvoiceInDB(){
        //  Save invoice into DB
    }

    public void saveInvoiceInFile(){
        //  Save invoice into DB
    }

}
