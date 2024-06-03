package com.example.Icecream.icecream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class IcecreamService {

    private final IcecreamRepository icecreamRepository;

    @Autowired
    public IcecreamService(IcecreamRepository icecreamRepository) {
        this.icecreamRepository = icecreamRepository;
    }


    public List<Icecream> getIcecreams(){
        return icecreamRepository.findAll();
    }

    public void addNewFlavour(Icecream icecream) {

        Optional<Icecream> icecreamOptional = icecreamRepository.findIcreamFlavour(icecream.getFlavour());
        if (icecreamOptional.isPresent()){
            throw new IllegalStateException("Flavour is already add");
        }
        icecreamRepository.save(icecream);
    }

    public void deleteFlavour(Integer icecreamId) {
        icecreamRepository.findById(icecreamId);
            boolean exists = icecreamRepository.existsById(icecreamId);
            if (!exists){
                throw new IllegalStateException("flavour with id" + icecreamId + "does not exists");
            }
            icecreamRepository.deleteById(icecreamId);
    }

    @Transactional
    public void updateIcecream(Integer icecreamId, String flavour, String place) {
        Icecream icecream = icecreamRepository.findById(icecreamId).orElseThrow(() -> new IllegalStateException("icecream with id"
         + icecreamId + "does not exists"));

        if(flavour != null && flavour.length() > 0 && !Objects.equals(icecream.getFlavour(),flavour)){
            icecream.setFlavour(flavour);
        }
        if(place != null && place.length() > 0 && !Objects.equals(icecream.getPlace(),place)){
            icecream.setPlace(place);
        }

    }
}
