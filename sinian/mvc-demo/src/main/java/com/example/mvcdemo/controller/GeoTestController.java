package com.example.mvcdemo.controller;

import com.example.mvcdemo.repo.GeoInfo;
import com.example.mvcdemo.repo.GeoInfoRepository;
import com.mongodb.client.model.geojson.codecs.PolygonCodec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.springframework.data.geo.Point;
import org.springframework.data.geo.Polygon;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.geo.GeoJsonGeometryCollection;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/25
 */
@RestController
@RequestMapping("/geo")
public class GeoTestController {

  private GeoInfoRepository geoInfoRepository;

  public GeoTestController(GeoInfoRepository geoInfoRepository) {
    this.geoInfoRepository = geoInfoRepository;
  }

  @GetMapping
  public GeoInfo list(){
    Iterable<GeoInfo> all = geoInfoRepository.findAll();
    return all.iterator().next();
  }

  @GetMapping("/foo")
  public GeoInfo foo(){
    final GeoInfo geoInfo = new GeoInfo();
    geoInfo.setName("风花雪月");
    geoInfo.setPoint(new GeoJsonPoint(30.000001,108.231231231));

    // 试试polygon
    final GeoJsonPolygon polygon = new GeoJsonPolygon(
        new Point(1, 1),
        new Point(2, 1),
        new Point(2, 2),
        new Point(2, 1),
        new Point(1, 1));
    geoInfo.setPolygon(polygon);

    // 试试geoJson
    final GeoJsonGeometryCollection geoCollection = new GeoJsonGeometryCollection(Arrays.asList(polygon));
    geoInfo.setGeoJson(geoCollection);

    final GeoInfo save = geoInfoRepository.save(geoInfo);
    return save;

  }
}
