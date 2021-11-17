package com.company.untitled112.entity

import com.haulmont.chile.core.annotations.NamePattern
import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Table

@NamePattern(value = "%s|name")
@Table(name = "UNTITLED112_USER")
@javax.persistence.Entity(name = "untitled112_User")
open class User : StandardEntity() {
    @Column(name = "NAME")
    var name: String? = null

    @Column(name = "AGE")
    var age: Int? = null

    companion object {
        private const val serialVersionUID = 512410799318765254L
    }
}