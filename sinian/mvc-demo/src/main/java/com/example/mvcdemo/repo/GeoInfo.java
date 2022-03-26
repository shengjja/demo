package com.example.mvcdemo.repo;

import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/25
 */
@Data
@Document
public class GeoInfo {
  @Id
  private String id;
  private String name;
  private GeoJsonPoint point;
  private GeoJsonPolygon polygon;
  private GeoJson geoJson;

}
