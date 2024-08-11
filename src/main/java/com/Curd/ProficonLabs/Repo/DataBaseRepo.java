package com.Curd.ProficonLabs.Repo;

import com.Curd.ProficonLabs.Models.DataBase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DataBaseRepo extends MongoRepository<DataBase, UUID> {
}
