package com.Curd.ProficonLabs.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Document
public class DataBase {

    @Id
    private UUID id;
    private String name;
    private String location;
    private String number;
}
