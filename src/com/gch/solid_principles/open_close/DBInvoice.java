package solid_principles.open_close;

import solid_principles.single_responsibility.Invoice;

public class DBInvoice implements IInvoice{

    @Override
    public void save(Invoice invoice) {
        // TODO to save invoice in DB
    }
}
