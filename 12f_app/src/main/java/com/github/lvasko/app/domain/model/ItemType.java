package com.github.lvasko.app.domain.model;

/**
 * Created by 38102090301 on 13.11.2017.
 */
public enum ItemType {

    UNKNOWN(1L),
    ELECTRONICS(2L),
    CD(3L);

    Long id;

    ItemType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
