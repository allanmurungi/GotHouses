package com.velmurugan.mvvmwithkotlincoroutinesandretrofit

import com.got.houses.models.House
import com.got.houses.utils.ValidationUtil
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidationUtilTest {

    var testlist: List<String> = mutableListOf();
    @Test
    fun validateHouseTest() {

        val house = House(0,"testUrl","main","","","",testlist,testlist,"",
            "","","","","",testlist,testlist,testlist)
        assertEquals(true, ValidationUtil.validateHouse(house))
    }

    @Test
    fun validateHouseEmptyTest() {
        val house = House(0,"testUrl","main","","","",testlist,testlist,"",
            "","","","","",testlist,testlist,testlist)
        assertEquals(false, ValidationUtil.validateHouse(house))
    }

}