package com.theothertim.beerclient.controller;

import com.theothertim.beerclient.dto.Beer;
import com.theothertim.beerclient.dto.BeerStyle;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class BeerController {

  private final static String API_URL = "https://sfg-beer-works.github.io/brewery-api/";

  public Mono<List<Beer>> listBeers(int pageNumber, int pageSize, String beerName, BeerStyle beerStyle, boolean showInventoryOnHand) {
    return Mono.just(List.of());
  }

  public Mono<String> createNewBear(String beerName, BeerStyle beerStyle, String upc, String price) {
    return Mono.just("");
  }

  public Mono<Beer> getBeerById(UUID id, boolean showInventoryOnHand) {
    return Mono.just(new Beer());
  }

  public Mono<Beer> getBeerByUpcCode(String upc) {
    return Mono.just(new Beer());
  }

  public Mono<Void> updateBeerById(UUID id, String bearName, BeerStyle beerStyle, String upc, int quantityOnHand, String price) {
    return Mono.empty();
  }

  public Mono<Void> deleteBeerById(UUID id) {
    return Mono.empty();
  }
}
