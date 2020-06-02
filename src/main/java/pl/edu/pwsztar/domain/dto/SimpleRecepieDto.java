package pl.edu.pwsztar.domain.dto;

public class SimpleRecepieDto {

    private Long recepieId;
    private String name;
    private String image;

    public SimpleRecepieDto() {

    }

    private SimpleRecepieDto(SimpleRecepieDto.Builder builder){
        this.recepieId = builder.recepieId;
        this.name = builder.name;
        this.image = builder.image;
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


    public static final class Builder{
        private Long recepieId;
        private String name;
        private String image;

        public Builder(){

        }

        public SimpleRecepieDto.Builder recepieId(Long recepieId){
            this.recepieId = recepieId;
            return this;
        }

        public SimpleRecepieDto.Builder name(String name){
            this.name = name;
            return this;
        }
        public SimpleRecepieDto.Builder image(String image){
            this.image = image;
            return this;
        }

        public SimpleRecepieDto build(){
            return new SimpleRecepieDto(this);
        }
    }
}
