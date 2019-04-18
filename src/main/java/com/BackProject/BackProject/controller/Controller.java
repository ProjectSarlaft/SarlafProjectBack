package com.BackProject.BackProject.controller;

import com.BackProject.BackProject.domain.Identification;
import com.BackProject.BackProject.services.ServiceIdentificacion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/identification/")
public class Controller {
    private final ServiceIdentificacion service_;

    public Controller(ServiceIdentificacion service_) {
        this.service_ = service_;
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Identification creatNewIdentification(@RequestBody Identification newIdentification){
        System.out.println("Someone is requesting the service" + newIdentification.toString());
        return service_.saveIdentification(newIdentification);
    }

    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Identification> getIdentification(){
        System.out.println("Someone is requesting the GET service");
        return service_.getAllIdentification();
    }

}
