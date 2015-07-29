package com.delia.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Delia on 7/10/2015.
 */
public abstract class AbstractEntity {

    @Id
    private String id;

    public String getId() {
        return id;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractEntity that = (AbstractEntity) obj;

        return this.id.equals(that.getId());
    }


    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
