package pl.camp.it.services;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDataService {
    public static String generateCity(){

        List<String> cities = Arrays.asList("Krakow","warszawa","Poznan","New York",
                "London","Paris","Tokyo","Berlin","Toruń");


        return cities.get(new Random().nextInt(cities.size()));

    }

    public static String generateStreet() {

        List<String> cities = Arrays.asList("Długa", "3 Maja", "Topolowa", "Floriańska",
                "Baker", "Krótka", "Inne","Krucha","szewska");


        return cities.get(new Random().nextInt(cities.size()));

    }

    public static String generationInvoiceSignature(){
        Random random = new Random();
        int no = random.nextInt(10)+1;
        int month = random.nextInt(12)+1;
        int year = random.nextInt(6)+2015;

        return new StringBuilder().append("FV/")
                .append(no)
                .append("/")
                .append(month)
                .append("/")
                .append(year).toString();


    }
    public static String generateProdactName( ){
        List<String> names = Arrays.asList("woda", "Kiełbasa", "Papier", "Buty",
                "Piwo", "Salceson", "Pasztet","Paprykasz","Cola");


        return names.get(new Random().nextInt(names.size()));

    }
    public static double generateProductPrice() {
        int generatedNumber = new Random().nextInt(1901)+100;
        return ((double) generatedNumber) /100.0;
    }

    //sprawdz biblioteke Faker



}
