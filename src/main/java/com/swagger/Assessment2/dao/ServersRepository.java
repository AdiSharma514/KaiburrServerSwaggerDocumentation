package com.swagger.Assessment2.dao;

import com.swagger.Assessment2.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ServersRepository extends MongoRepository<Server,Long> {
    List<Server> findByName(String name);
}
