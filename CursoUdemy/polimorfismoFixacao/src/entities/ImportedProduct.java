package entities;

public class ImportedProduct extends Product{

    private Double custonsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double custonsFee) {
        super(name, price);
        this.custonsFee = custonsFee;
    }

    public Double getCustonsFee() {
        return custonsFee;
    }

    public void setCustonsFee(Double custonsFee) {
        this.custonsFee = custonsFee;
    }

    public Double totalPrice (){
        return getPrice() + custonsFee;
    }

    @Override
    public String priceTag (){
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", custonsFee)
                + ")";
    }
}
