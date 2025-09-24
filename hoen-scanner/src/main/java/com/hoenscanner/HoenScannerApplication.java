package com.hoenscanner;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class HoenScannerApplication extends Application<HoenScannerConfiguration> {

    public static void main(String[] args) throws Exception {
        new HoenScannerApplication().run(args);
    }

    @Override
    public void run(HoenScannerConfiguration configuration, Environment environment) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<SearchResult> searchResults = new ArrayList<>();

        InputStream hotels = getClass().getResourceAsStream("/hotels.json");
        InputStream rentals = getClass().getResourceAsStream("/rental_cars.json");

        List<SearchResult> hotelResults = mapper.readValue(hotels, new TypeReference<List<SearchResult>>() {});
        List<SearchResult> rentalResults = mapper.readValue(rentals, new TypeReference<List<SearchResult>>() {});

        searchResults.addAll(hotelResults);
        searchResults.addAll(rentalResults);

        environment.jersey().register(new SearchResource(searchResults));
    }
}
