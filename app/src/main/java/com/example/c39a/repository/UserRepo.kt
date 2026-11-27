package com.example.c39a.repository

import com.example.c39a.model.UserModel

interface UserRepo {


    //authentication
    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    )

    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    )

    fun logout(callback: (Boolean, String) -> Unit)

    fun forgetPassword(email: String, callback: (Boolean, String) -> Unit)
//
//    {
//     "success":true,
//     "message":"Data fetched",
//    }

    //database
    fun addUserToDatabase(id: String, model: UserModel,
                          callback: (Boolean, String) -> Unit)

    fun getUserById(id:String,
                    callback: (Boolean, String, UserModel?) -> Unit)


    fun getAllUser(callback: (Boolean, String,List<UserModel>?) -> Unit  )

    fun editProfile(id: String,model: UserModel,callback: (Boolean, String) -> Unit)

    fun deleteUser(id: String,callback: (Boolean, String) -> Unit)

}