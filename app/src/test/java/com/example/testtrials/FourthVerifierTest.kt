package com.example.testtrials

import org.junit.Before
import org.junit.Test

class FourthVerifierTest{

    lateinit var verifier: FourthVerifier

    @Before
    fun setup(){
        verifier = FourthVerifier()
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