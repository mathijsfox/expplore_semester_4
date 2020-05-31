package Application.REST.controllers;

import Application.models.Advert;
import Application.models.User;
import Application.services.AdvertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adverts")
@CrossOrigin(origins = "*")
public class AdvertController {

    private AdvertService advertService;

    public AdvertController(AdvertService advertService){
        this.advertService = advertService;
    }

    @GetMapping
    public List<Advert>getAdverts(){return advertService.getAllAdverts();}

    @PostMapping
    public Advert postAdvert(@RequestBody Advert advert){
        System.out.println(advert.getEndingDate());
        System.out.println(advert.getDescription());
        return advertService.postAdvert(advert);
    }
}
