package pl.edu.pwsztar.domain.dto;

import javafx.util.Builder;

import java.io.Serializable;

public class ProductDto {

    private Long productId;
    private String name;
    private String barcode;
    private Integer amount;
    private String unit;

    public ProductDto() {

    }

    private ProductDto(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.barcode = builder.barcode;
        this.amount = builder.amount;
        this.unit = builder.unit;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public static final class Builder {
        private Long productId;
        private String name;
        private String barcode;
        private Integer amount;
        private String unit;


        public Builder() {
        }

        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder barcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public ProductDto build() {
            return new ProductDto(this);
        }
    }
}
