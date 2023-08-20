package com.example.myproyect

import MainActivity
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        onView(withId(R.id.editText1)).perform(typeText("hello"))
        onView(withId(R.id.editText2)).perform(typeText("world"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
