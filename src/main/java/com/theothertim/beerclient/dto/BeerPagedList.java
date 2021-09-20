package com.theothertim.beerclient.dto;

import java.io.Serializable;
import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BeerPagedList extends PageImpl<Beer> implements Serializable {



  public BeerPagedList(List<Beer> content, Pageable pageable, long total) {
    super(content, pageable, total);
  }

  public BeerPagedList(List<Beer> content) {
    super(content);
  }
}
