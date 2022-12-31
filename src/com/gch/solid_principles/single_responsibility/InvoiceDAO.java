package solid_principles.single_responsibility;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveInvoice(){
        //  Save invoice into DB
    }

}
