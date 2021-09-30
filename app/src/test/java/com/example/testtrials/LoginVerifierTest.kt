package com.example.testtrials

import org.junit.Before
import org.junit.Test

class LoginVerifierTest{

    lateinit var verifier: LoginVerifier

    @Before
    fun setup(){
        verifier = LoginVerifier()
    }

    @Test
    fun `check empty email return fslse`() {
        assert(!verifier.verify("", "1"))
    }
}