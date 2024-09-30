package dev.gustavorh.crudjpa.entities;

import dev.gustavorh.crudjpa.validations.IsExistsDb;
import dev.gustavorh.crudjpa.validations.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @IsRequired
    @Size(min = 3, max = 20)
    private String name;

    @IsRequired
    @Size(min = 3, max = 50)
    private String description;

    @NotNull
    @Min(1000)
    private Integer price;

    @IsRequired
    @IsExistsDb
    private String sku;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
