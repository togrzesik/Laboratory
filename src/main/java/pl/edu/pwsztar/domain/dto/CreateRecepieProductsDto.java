package pl.edu.pwsztar.domain.dto;

public class CreateRecepieProductsDto {

    private Long recepieId;
    private Long productId;
    private int amount;

    public CreateRecepieProductsDto(){

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

    @Override
    public String toString() {
        return "CreateRecepieProductsDto{" +
                "recepieId=" + recepieId +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
