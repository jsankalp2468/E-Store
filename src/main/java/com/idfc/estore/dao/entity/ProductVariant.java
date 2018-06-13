package com.idfc.estore.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_VARIANT")
public class ProductVariant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VARIANT_ID")
    private Long id;

    @Column(name = "VARIANT_NAME")
    private String VariantName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVariantName() {
        return VariantName;
    }

    public void setVariantName(String variantName) {
        VariantName = variantName;
    }

    @Override
    public String toString() {
        return "ProductVariant{" + "id=" + id + ", VariantName='" + VariantName + '\'' + '}';
    }
}
