package com.eric.kopring.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
class User {
    @Id
    var id: Int = 0

    var name: String? = null

    var age: Int? = null
}