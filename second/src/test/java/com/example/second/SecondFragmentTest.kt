package com.example.second

import org.junit.Assert.*
import org.junit.Test

class SecondFragmentTest{
    @Test
    fun aaa(){
        val s = SecondFragment()
        assert(s.add(1,1)==2)
    }
}