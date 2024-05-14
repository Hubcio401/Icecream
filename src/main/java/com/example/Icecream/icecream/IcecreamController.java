package com.example.Icecream.icecream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/icecream")
public class IcecreamController {


    private final IcecreamService icreamService;

    public IcecreamController(IcecreamService icreamService) {
        this.icreamService = icreamService;
    }


    @GetMapping
    public List<Icecream> getIcecreams(){
        return icreamService.getIcecreams();
    }

}
