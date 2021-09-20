package com.theothertim.beerclient.dto;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.With;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Data
public class Beer extends Versioned {
  @NotBlank
  private String beerName;
  @NotBlank
  private BeerStyle beerStyle;
  private String upc;
  private Integer quantityOnHand;
  private String price;

  @NotNull
  private UUID id;
}
