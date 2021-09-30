package com.example.testtrials

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityUITest {

    @get:Rule
    var activityRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun clickButtonToChangeText() {
        onView(withId(R.id.button))
            .check(matches(isDisplayed()))
            .perform(click())
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")))
    }
}