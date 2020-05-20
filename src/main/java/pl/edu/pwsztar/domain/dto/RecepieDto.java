package pl.edu.pwsztar.domain.dto;

import javafx.util.Builder;

public class RecepieDto {

    private Long recepieId;
    private String name;
    private String image;
    private String description;

    public RecepieDto() {

    }

    private RecepieDto(Builder builder){
        this.recepieId = builder.recepieId;
        this.name = builder.name;
        this.image = builder.image;
        this.description = builder.description;
    }

    public Long getProductId() {
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

    public static final class Builder{
        private Long recepieId;
        private String name;
        private String image;
        private String description;

        public Builder(){

        }

        public Builder recepieId(Long recepieId){
            this.recepieId = recepieId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder image(String image){
            this.image = image;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public RecepieDto build(){
            return new RecepieDto(this);
        }
    }
}
