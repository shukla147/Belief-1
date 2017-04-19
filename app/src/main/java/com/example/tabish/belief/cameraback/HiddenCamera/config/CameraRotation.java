package com.example.tabish.belief.cameraback.HiddenCamera.config;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CameraRotation {

    /**
     * Rotate image by 90 degrees.
     */
    public static final int ROTATION_90 = 90;
    /**
     * Rotate image by 180 degrees.
     */
    public static final int ROTATION_180 = 180;
    /**
     * Rotate image by 270 (or -90) degrees.
     */
    public static final int ROTATION_270 = 270;
    /**
     * Don't rotate the image.
     */
    public static final int ROTATION_0 = 0;

    private CameraRotation() {
        throw new RuntimeException("Cannot initialize this class.");
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({ROTATION_0, ROTATION_90, ROTATION_180, ROTATION_270})
    public @interface SupportedRotation {
    }
}
