package uni.makarov;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        double UAH = 100;
        double USD = 100;
        double EUR = 100;

        DecimalFormat df = new DecimalFormat("###.##");

        Converter converter = new Converter(26.42,30.65);

        System.out.println(df.format(converter.UsdToUah(USD)));

        System.out.println(df.format(converter.EurToUah(EUR)));

        System.out.println(df.format(converter.UahToUsd(UAH)));

        System.out.println(df.format(converter.UahToEur(UAH)));
    }
}
