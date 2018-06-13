package com.idfc.estore.dao.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class ProductDetail {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PRODUCT_NAME")
    @NotNull
    private String productName;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT")
    private String description;

    @Column(name = "UNIT_PRICE")
    @NotNull
    private Float unitPrice;

    @Column(name = "CREATED_BY")
    @NotNull
    private String createdBy;

    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name="PRODUCT_ID")
            ,inverseJoinColumns = @JoinColumn(name = "VARIANT_ID"))
    Collection<ProductVariant> productVariant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Collection<ProductVariant> getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(Collection<ProductVariant> productVariant) {
        this.productVariant = productVariant;
    }

    @Override
    public String toString() {
        return "ProductDetail{" + "id=" + id + ", productName='" + productName + '\'' + ", description='" + description + '\'' + ", unitPrice=" + unitPrice + ", createdBy='" + createdBy + '\'' + ", productVariant=" + productVariant + '}';
    }
}
