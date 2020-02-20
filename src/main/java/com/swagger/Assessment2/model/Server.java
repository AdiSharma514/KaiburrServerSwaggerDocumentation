package com.swagger.Assessment2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Server {
    @Getter @Setter
    private String name;
    @Id
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String language;
    @Getter @Setter
    private String framework;
}
