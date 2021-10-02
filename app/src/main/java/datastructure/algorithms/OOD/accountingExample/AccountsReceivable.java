package datastructure.algorithms.OOD.accountingExample;

public class AccountsReceivable {
    private Accounting transactionObject;

    public AccountsReceivable(Accounting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void postPayment() {
        transactionObject.chargeCustomer();
    }

    public void sendInvoice() {
        transactionObject.prepareInvoice();
    }
}
