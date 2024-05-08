package com.example.a2007026;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void ClickSquare() {
        Espresso.onView(withId(R.id.sqrBtn)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.viewShape))
                .check(ViewAssertions.matches(ViewMatchers.withText("Square")));

    }

    @Test
    public void ClickCircle() {
        Espresso.onView(withId(R.id.circleBtn)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.viewShape))
                .check(ViewAssertions.matches(ViewMatchers.withText("Circle")));
    }

    @Test
    public void ClickTriangle() {
        Espresso.onView(withId(R.id.triangleBtn)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.viewShape))
                .check(ViewAssertions.matches(ViewMatchers.withText("Triangle")));
    }

    @Test
    public void ClickRed() {
        Espresso.onView(withId(R.id.btnRed)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.viewColor))
                .check(ViewAssertions.matches(ViewMatchers.withText("Color: Red")));
    }

    @Test
    public void ClickBlue() {
        Espresso.onView(withId(R.id.btnBlue)).perform(click());
        Espresso.onView(ViewMatchers.withId(R.id.viewColor))
                .check(ViewAssertions.matches(ViewMatchers.withText("Color: Blue")));
    }


}
