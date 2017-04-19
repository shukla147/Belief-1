package com.example.tabish.belief.cameraback.HiddenCamera.config;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings("WeakerAccess")
public final class CameraImageFormat {

    /**
     * Image format for .jpg/.jpeg.
     */
    public static final int FORMAT_JPEG = 849;
    /**
     * Image format for .png.
     */
    public static final int FORMAT_PNG = 545;
    /**
     * Image format for .png.
     */
    public static final int FORMAT_WEBP = 563;

    private CameraImageFormat() {
        throw new RuntimeException("Cannot initialize CameraImageFormat.");
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({FORMAT_JPEG, FORMAT_PNG, FORMAT_WEBP})
    public @interface SupportedImageFormat {
    }
}
