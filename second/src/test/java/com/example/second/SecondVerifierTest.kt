package com.example.second

import org.junit.Before
import org.junit.Test

class SecondVerifierTestdd {

    lateinit var verifier: SecondVerifier

    @Before
    fun setup(){
        verifier = SecondVerifier()
    }

    @Test
    fun `check empty email return fslse`() {
     //   assert(!verifier.verify("", "1"))
    }

    @Test
    fun `check empty password return fslse`() {
        assert(!verifier.verify("s", ""))
    }

    @Test
    fun `check no dot in email return fslse`() {
        assert(!verifier.verify("@", "1"))
    }

    @Test
    fun `check corret return true`() {
        assert(verifier.verify("@.", "1"))
    }

}