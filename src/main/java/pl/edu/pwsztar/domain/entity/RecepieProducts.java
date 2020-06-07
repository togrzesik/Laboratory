package pl.edu.pwsztar.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="recepie_products")
public class RecepieProducts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="recepie_id")
    private Long recepieId;

    @Column(name="product_id")
    private Long productId;

    @Column(name="amount")
    private float amount;

    public RecepieProducts() {
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

    public float getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRecepieId(Long recepieId) {
        this.recepieId = recepieId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
