package com.store.model;

import com.store.model.common.BaseModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class ProductModel extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", allocationSize = 1, sequenceName = "product_seq")
    private Long id;

    @Column(name = "code")
    private String code;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private SeoModel seoModel;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "cat2products",
            joinColumns = {@JoinColumn(name = "product_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "category_id", nullable = false, updatable = false)})
    private Set<CategoryModel> categories = new HashSet<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryModel> categories) {
        this.categories = categories;
    }

    public SeoModel getSeoModel() {
        return seoModel;
    }

    public void setSeoModel(SeoModel seoModel) {
        this.seoModel = seoModel;
    }
}
