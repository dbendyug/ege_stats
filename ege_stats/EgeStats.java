package ege_stats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class EgeStats {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://cpk.msu.ru/rating/dep_01");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = reader.readLine()) != null)
            System.out.println(inputLine);
        reader.close();

    }
}
