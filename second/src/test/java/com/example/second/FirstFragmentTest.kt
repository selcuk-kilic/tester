package com.example.second

import org.junit.Assert.*
import org.junit.Test

class FirstFragmentTest{
    @Test
    fun aaa(){
        val f = FirstFragment()

        assert(f.add(2,2)==4)
    }
}