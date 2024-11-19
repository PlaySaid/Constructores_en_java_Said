package constructores.en.java;

public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String tipoCuenta;
    
    public CuentaBancaria(){
        this.numeroCuenta = 0;
        this.saldo = 0;
        String tipoCuenta = "???";
    }
    public CuentaBancaria(String tipoCuenta, int numeroCuenta){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }
    public CuentaBancaria(String tipoCuenta, int numeroCuenta, double saldo){
        this(tipoCuenta, numeroCuenta);
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    
    }
    @Override
    public String toString(){
        return "---CUENTA BANCARIA---"+"\nTipo de cuenta: "+tipoCuenta+"\nNumero de cuenta: "+numeroCuenta+"\nSaldo: "+saldo;
    }
}
