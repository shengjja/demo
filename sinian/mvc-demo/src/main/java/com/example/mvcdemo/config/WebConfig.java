package com.example.mvcdemo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.geo.GeoModule;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.geo.GeoJsonModule;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/25
 */

public class WebConfig implements WebMvcConfigurer {


//  @Override
//  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//    final Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
//        .modulesToInstall(new GeoJsonModule());
//    converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
//  }
}
