package com.example.Icecream.icecream;

import java.util.List;

public class IcecreamService {

    public List<Icecream> getIcecreams(){
        return List.of(new Icecream(1,"czekolada","spytkowice"));
    }

}
