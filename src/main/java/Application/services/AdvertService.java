package Application.services;

import Application.datastore.AdvertRepository;
import Application.models.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertService {

    @Autowired
    private AdvertRepository advertRepository;

    public List<Advert> getAllAdverts(){
        return advertRepository.findAll();
    }
    public Optional<Advert> findById(String id){
        return advertRepository.findById(id);
    }

    public Advert postAdvert(Advert advert){
        advert = advertRepository.save(advert);
        return advert;
    }
}
