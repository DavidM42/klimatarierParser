package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws IOException {
        ArrayList<Product> products = new ArrayList<>();


        // TODO catch network errors and get error here
        Document doc = Jsoup.connect("https://www.klimatarier.com/de/CO2_Rechner").get();

        // TODO catch all erors for selectors which could return null or something
        Elements calCategories = doc.select("#calCategories");
        Elements items = calCategories.select("li[data-value]");

        for (Element item: items) {
            String thumbnailUrl = item.attr("data-thumbnail");
            String unit = item.attr("data-unit");
            String value = item.attr("data-value");
            String name = item.text();
            Product prod = new Product(name, value, thumbnailUrl, unit);
            System.out.println(prod.toString());
            products.add(prod);
        }


        System.out.println(products);
    }

}
