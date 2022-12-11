package com.example.cleancode.domain.usecase

import com.example.cleancode.domain.models.UserName
import com.example.cleancode.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}