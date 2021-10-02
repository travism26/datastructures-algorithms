package datastructure.algorithms.OOD.accountingExample;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
        String reportListing="";
        for (Product product : this.products) {
            reportListing += product.getName() + " ";
        }
        return reportListing;
    }

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared....");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charge customer");
    }
}

