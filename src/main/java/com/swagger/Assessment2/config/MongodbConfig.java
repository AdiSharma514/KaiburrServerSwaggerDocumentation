package com.swagger.Assessment2.config;

import com.swagger.Assessment2.dao.ServersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = ServersRepository.class)
@Configuration
public class MongodbConfig {

    @Bean
    CommandLineRunner commandLineRunner(ServersRepository serversRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

            }
        };
    }
}
