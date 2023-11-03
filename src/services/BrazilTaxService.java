package services;

public class BrazilTaxService extends TaxService{

    @Override // Overwriting the tax method
    public double tax(double amount){
        return amount * 0.3;
    }
}
