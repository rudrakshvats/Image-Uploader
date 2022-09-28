package com.image_uploader.dto;

import lombok.Data;

import java.util.List;

@Data
public class GooglePlaceDTO {

private List<String> html_attributions;
private List<Result>results;
private String status;
}

@Data
class Result{
    private  String formatted_address;
    private Geometry geometry;
    private String icon;
    private String icon_background_color;
    private String icon_mask_base_uri;
    private String name;
    private List<Photos> photos;
    private  String place_id;
    private String reference;
    private List<String> types;
}
@Data
class Geometry{
    private Location location;
    private Viewport viewport;
}
@Data
class Viewport{
    private Northeast northeast;
    private Southwest southwest;
}
@Data
class Location{
    private String lat;
    private String lng;
}
@Data
class Southwest{
    private String lat;
    private String lng;
}
@Data
class Northeast{
    private String lat;
    private String lng;
}
@Data
class Photos{
    private Long height;
    private List<String> html_attributions;
    private String photo_reference;
    private  Long width;
}
