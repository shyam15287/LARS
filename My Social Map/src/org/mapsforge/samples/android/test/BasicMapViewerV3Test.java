package org.mapsforge.samples.android.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

import org.mapsforge.samples.android.BasicMapViewerV3;

public class BasicMapViewerV3Test extends ActivityInstrumentationTestCase2<BasicMapViewerV3> {

    Solo solo;
    final static int iterations = TestUtils.iterations;

    public BasicMapViewerV3Test() {
        super(BasicMapViewerV3.class);
    }

    @Override
    public void setUp() throws Exception {
        this.solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testClickWithRotation() throws Exception {
        TestUtils.testClickWithRotation(this.solo, this.iterations);
    }

    public void testClickWithoutRotation() throws Exception {
        TestUtils.testClickWithoutRotation(this.solo, this.iterations);
    }

    public void testScrollWithRotation() throws Exception {
        TestUtils.testScrollWithRotation(this.solo, this.iterations);
    }

    public void testScrollWithoutRotation() throws Exception {
        TestUtils.testScrollWithoutRotation(this.solo, this.iterations);
    }

    @Override
    public void tearDown() throws Exception {
        this.solo.finishOpenedActivities();
    }
}
