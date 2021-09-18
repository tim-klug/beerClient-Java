package com.theothertim.beerclient.dto;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Data
public class Beer {
  private String beerName;
  private String beerStyle;
  private String upc;
  private Integer quantityOnHand;
  private String price;
  private UUID id;
}
