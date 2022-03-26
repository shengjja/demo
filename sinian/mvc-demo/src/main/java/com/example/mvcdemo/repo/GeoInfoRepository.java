package com.example.mvcdemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/25
 */
@Repository
public interface GeoInfoRepository extends CrudRepository<GeoInfo, String> {

}
