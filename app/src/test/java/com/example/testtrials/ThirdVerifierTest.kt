package com.example.testtrials

import org.junit.Before
import org.junit.Test

class ThirdVerifierTest{

    lateinit var verifier: ThirdVerifier

    @Before
    fun setup(){
        verifier = ThirdVerifier()
    }

    @Test
    fun `check empty email return fslse`() {
        assert(!verifier.verify("", "1"))
    }

    @Test
    fun `check empty password return fslse`() {
        assert(!verifier.verify("s", ""))
    }

    @Test
    fun `check no dot in email return fslse`() {
        assert(!verifier.verify("@", "1"))
    }
}