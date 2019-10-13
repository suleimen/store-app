package com.store.model.common;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    public BaseModel() {
    }

    public abstract Long getId();

    public abstract void setId(Long id);

    public BaseModel takeThis() {
        return this;
    }

    public String toString() {
        return "BaseModel{id=" + this.getId() + '}';
    }
}
