package com.example.kaju.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kaju on 7/2/2017.
 */
public class MainActivityTest {
   @Rule
   public ActivityTestRule<MainActivity> testRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mActivity=null;

    @Before
    public void setUp() throws Exception {

        mActivity=testRule.getActivity();

    }

    @Test
    public void testLanch(){

        View  view=mActivity.findViewById(R.id.tv);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        mActivity=null;
    }

}