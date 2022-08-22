package com.odebar.oop

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }
}