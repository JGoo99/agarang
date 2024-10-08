package com.kuit.agarang.domain.home.model.dto;

import com.kuit.agarang.domain.memory.model.dto.MemoryImageDTO;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
public class HomeResponse {

  private LocalDate today;
  private String babyName;
  private Integer dDay;
  private String characterUrl;
  private String speechBubble;
  private List<MemoryImageDTO> memories;
}
