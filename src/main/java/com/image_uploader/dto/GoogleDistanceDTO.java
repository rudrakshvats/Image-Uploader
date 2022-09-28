package com.image_uploader.dto;

import lombok.Data;

import java.util.List;

@Data
public class GoogleDistanceDTO {
    private List<String> destination_addresses;
    private List<String> origin_addresses;
    private List<Rows> rows;
    private String status;
}
@Data
class Rows{
    List<Elements> elements;
}
@Data
class Elements{
   private Distance distance;
   private Duration duration;
   private String status;
}
@Data
class Distance{
    private String text;
    private Long value;
}
@Data
class Duration{
    private String text;
    private Long value;
}