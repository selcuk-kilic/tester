package com.example.testtrials

class ThirdVerifier {

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