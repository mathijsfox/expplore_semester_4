package Application.REST.controllers;

import Application.models.Advert;
import Application.models.User;
import Application.services.AdvertService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adverts")
@CrossOrigin(origins = "*")
public class AdvertController {

    private AdvertService advertService;

    public AdvertController(AdvertService advertService){
        this.advertService = advertService;
    }

    @PostMapping
    public Advert postAdvert(@RequestBody Advert advert){
        return advertService.postAdvert(advert);
    }
}
