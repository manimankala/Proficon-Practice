package com.Curd.ProficonLabs.Controller;


import com.Curd.ProficonLabs.Models.DataBase;
import com.Curd.ProficonLabs.Services.DataBaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/Database")
public class DataBaseController {

    @Autowired
    private DataBaseServices services;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public DataBase createData(@RequestBody DataBase data){
        return services.addData(data);
    }

    @GetMapping
    public List<DataBase> findAllData(){
        return services.getAllData();
    }

    @GetMapping("/Database")
    public DataBase findData(@PathVariable UUID id){
        return services.getDataById(id);
    }

    @PutMapping
    public DataBase setData(@RequestBody DataBase data){
        return services.updateData(data);
    }

    @DeleteMapping("/{id}")
    public String removeData(@PathVariable UUID id){
        return services.deleteData(id);
    }

}
