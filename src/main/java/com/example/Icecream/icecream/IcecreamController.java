package com.example.Icecream.icecream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/icecream")
public class IcecreamController {


    private final IcecreamService icecreamService;

    @Autowired
    public IcecreamController(IcecreamService icreamService) {
        this.icecreamService = icreamService;
    }


    @GetMapping
    public List<Icecream> getIcecreams(){
        return icecreamService.getIcecreams();
    }

    @PostMapping
    public void registerNewFlavour(@RequestBody Icecream icecream){
        icecreamService.addNewFlavour(icecream);
    }

    @DeleteMapping(path = "{icecreamId}")
    public void deleteFlavour(@PathVariable("icecreamId") Integer icecreamId){
        icecreamService.deleteFlavour(icecreamId);
    }

    @PutMapping(path = "{icecreamId}")
    public void updateIcecream(
        @PathVariable("icecreamId") Integer icecreamId,
        @RequestParam(required = false) String flavour,
        @RequestParam(required = false) String place )
    {
        icecreamService.updateIcecream(icecreamId,flavour,place);
    }
}
