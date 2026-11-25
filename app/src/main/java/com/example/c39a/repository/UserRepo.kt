package com.example.c39a.repository

interface UserRepo {
//    {
//     "message":"login success/failed",
//    "success":true
//    }



    fun login(email: String, password: String,
              callback: (String, Boolean) -> Unit)

    fun register()
    fun addUserToDatabase()
    fun getUserById()
    fun getAllUser()
    fun editProfile()
    fun deleteUser()
    fun logout()
}