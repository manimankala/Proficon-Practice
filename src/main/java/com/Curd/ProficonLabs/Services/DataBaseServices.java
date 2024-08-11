package com.Curd.ProficonLabs.Services;


import com.Curd.ProficonLabs.Models.DataBase;
import com.Curd.ProficonLabs.Repo.DataBaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DataBaseServices {

    @Autowired
    private DataBaseRepo repo;

    public DataBase addData(DataBase data){
        return repo.save(data);
    }

    public List<DataBase> getAllData(){
        return repo.findAll();
    }

    public DataBase getDataById(UUID id){
        return repo.findById(id).get();
    }

    public DataBase updateData(DataBase dataUpdate){
        // get data from database
        //update the req data from the database

        DataBase existingData=repo.findById(dataUpdate.getId()).get();
        existingData.setName(dataUpdate.getName());
        existingData.setLocation(dataUpdate.getLocation());
        existingData.setNumber(dataUpdate.getNumber());

        return repo.save(existingData);

    }

    public String deleteData(UUID id){
         repo.deleteById(id);
         return "Deleted Successfully ";
    }


}
