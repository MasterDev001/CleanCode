package com.example.cleancode.domain.usecase

import com.example.cleancode.data.repository.UserRepositoryImpl
import com.example.cleancode.domain.models.SaveUserNameParam
import com.example.cleancode.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        val oldUserName = userRepository.getName()
        if (oldUserName.firstName == param.name) {
            return true
        }
        val result = userRepository.saveName(saveParam = param)
        return result
    }
}