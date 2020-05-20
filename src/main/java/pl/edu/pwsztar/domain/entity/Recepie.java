package pl.edu.pwsztar.domain.entity;


import javax.persistence.*;

@Entity
@Table(name = "recepie")
public class Recepie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recepie_id")
    private Long recepieId;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;

    @Column(name="description")
    private String description;

    Recepie(){

    }

    public Long getRecepieId() {
        return recepieId;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setRecepieId(Long recepieId) {
        this.recepieId = recepieId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
