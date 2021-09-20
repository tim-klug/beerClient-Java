package com.theothertim.beerclient.controller;

import com.theothertim.beerclient.dto.Beer;
import com.theothertim.beerclient.dto.BeerPagedList;
import com.theothertim.beerclient.dto.BeerStyle;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class BeerController {

  private final static String API_URL = "https://sfg-beer-works.github.io/brewery-api/";

  public Mono<BeerPagedList> listBeers(int pageNumber, int pageSize, String beerName, BeerStyle beerStyle, boolean showInventoryOnHand) {
    return Mono.just(null);
  }

  public Mono<String> createNewBear(Beer beer) {
    return Mono.just("");
  }

  public Mono<Beer> getBeerById(UUID id, boolean showInventoryOnHand) {
    return Mono.just(new Beer());
  }

  public Mono<Beer> getBeerByUpcCode(String upc) {
    return Mono.just(new Beer());
  }

  public Mono<ResponseEntity> updateBeerById(Beer beer) {
    return null;
  }

  public Mono<ResponseEntity> deleteBeerById(UUID id) {
    return null;
  }
}
