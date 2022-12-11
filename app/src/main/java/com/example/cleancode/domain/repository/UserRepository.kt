package com.example.cleancode.domain.repository

import com.example.cleancode.domain.models.SaveUserNameParam
import com.example.cleancode.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}