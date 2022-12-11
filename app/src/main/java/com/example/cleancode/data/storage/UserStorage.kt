package com.example.cleancode.data.storage

import com.example.cleancode.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}