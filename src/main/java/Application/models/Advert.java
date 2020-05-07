package Application.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Advert {

    @Id
    String id;

    String title;

    @OneToOne
    User advertOwner;
    @OneToOne
    User applicant;
}
