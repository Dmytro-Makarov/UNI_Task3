package uni.makarov;

public class Converter {
    Converter(double usd, double eur){
        this.usd = usd;
        this.eur = eur;
    }

    //Uah to Usd = 26,42
    //Uah to Eur = 30,65
    private double usd;
    private double eur;

    double UsdToUah(double USD){
        return USD * usd;
    }
    double EurToUah(double EUR){
        return EUR * eur;
    }
    double UahToUsd(double UAH){
        return UAH / usd;
    }
    double UahToEur(double UAH){
        return UAH / eur;
    }
}
