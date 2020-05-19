package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreateProductDto implements Serializable {
    private String name;
    private String barcode;
    private Integer amount;
    private String unit;

    public CreateProductDto() {
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

    @Override
    public String toString() {
        return "CreateProductDto{" +
                "name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", amount='" + amount + '\'' +
                ", unit=" + unit +
                '}';
    }
}
