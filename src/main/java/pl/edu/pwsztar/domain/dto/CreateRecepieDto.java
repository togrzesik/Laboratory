package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreateRecepieDto implements Serializable {

    private String name;
    private String image;
    private String description;

    public CreateRecepieDto() {
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

    @Override
    public String toString() {
        return "CreateRecepieDto{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
