package solid_principles.open_close;

import solid_principles.single_responsibility.Invoice;

public interface IInvoice {
    void save(Invoice invoice);
}
