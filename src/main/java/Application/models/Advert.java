package Application.models;


import Application.enums.Category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Advert {

    @Id
    String id;
    String title;
    Category category;
    String description;
    double price;
    String place;
    int length;
    int width;
    int height;
    Date startingDate;
    Date endingDate;

    @OneToOne
    User advertOwner;
    @OneToOne
    User applicant;
}
