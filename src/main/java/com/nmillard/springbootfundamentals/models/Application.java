package com.nmillard.springbootfundamentals.models;

import javax.persistence.*;
import java.util.UUID;

/*
You can use an H2 database when doing rapid prototyping. Only maven dependencies and application settings are
required. The "Application" class is automatically created as a table in the H2 database because of the
@Entity annotation.
 */

@Entity
public class Application {

    public Application() {
        this.id = UUID.randomUUID();
    }

    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;
}
