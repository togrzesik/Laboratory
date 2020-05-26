package pl.edu.pwsztar.domain.dto;

public class RecepieProductsDto {

    private Long id;
    private Long recepieId;
    private Long productId;
    private int amount;

    public RecepieProductsDto() {
    }

    private RecepieProductsDto(Builder builder){
        this.id = builder.id;
        this.recepieId = builder.recepieId;
        this.productId = builder.productId;
        this.amount = builder.amount;
    }

    public Long getId() {
        return id;
    }

    public Long getRecepieId() {
        return recepieId;
    }

    public Long getProductId() {
        return productId;
    }

    public int getAmount() {
        return amount;
    }

    public final static class Builder{
        private Long id;
        private Long recepieId;
        private Long productId;
        private int amount;

        public Builder(){

        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder recepieId(Long recepieId){
            this.recepieId = recepieId;
            return this;
        }

        public Builder productId(Long productId){
            this.productId = productId;
            return this;
        }

        public Builder amount(int amount){
            this.amount = amount;
            return this;
        }

        public RecepieProductsDto build(){
            return new RecepieProductsDto(this);
        }
    }
}
