package com.hoenscanner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {
    private final List<SearchResult> searchResults;

    public SearchResource(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    @POST
    public List<SearchResult> search(Search search) {
        String city = search.getCity().toLowerCase();
        return searchResults.stream()
                .filter(r -> r.city.toLowerCase().equals(city))
                .collect(Collectors.toList());
    }
}
