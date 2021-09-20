package com.theothertim.beerclient.dto;

import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
@Builder
public class Versioned {

  private int version;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
}
