package com.example.second

class FourthVerifier {

    fun verify(email: String, password: String): Boolean{
        if(email.isBlank()){
            return false
        }
        if (password.isBlank()){
            return false
        }

        if(email.contains("@")){
            if (email.contains(".")){
                return true
            }
        }

        return false
    }
}