package com.example.tabish.belief.cameraback.HiddenCamera;

import android.content.Context;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CameraError {

    /**
     * This error can occur if there is any error while opening camera. Mostly because another
     * application is using the camera.
     */
    public static final int ERROR_CAMERA_OPEN_FAILED = 1122;
    /**
     * This error wil occur if the camera permission is not available. Developer should ask user for
     * the runtime permission and once the permission granted, should try the to initialize the camera
     * again.
     */
    public static final int ERROR_CAMERA_PERMISSION_NOT_AVAILABLE = 5472;
    /**
     * If the application does not have draw over other app permission, error will occur.
     * This permission is available to all the application below Android M (<API 23).
     * But for the API 23 and above user has to enable it manually, if the permission is not
     * available by opening Settings -> Apps -> Gear icon on top-right corner -> Draw Over other apps.
     * <p>
     * This error can occur only while using the hidden camera from the service using {@link HiddenCameraService}.
     * Developer should check if the {@link android.Manifest.permission#SYSTEM_ALERT_WINDOW} permission
     * is defined in the AndroidManifest.xml and display information dialog/snackbar to the
     * user, explaining steps to grant draw over other app permission.
     * <p>
     * Developer can open permission grant screen using {@link HiddenCameraUtils#openDrawOverPermissionSetting(Context)}.
     * <p>
     * <B>Note:</B> This error will stop the service. Developer has to start service once
     * "Draw over other app" permission is granted. You can check if the permission is available by
     * calling {@link HiddenCameraUtils#canOverDrawOtherApps(Context)}.
     *
     * @see 'http://www.androidpolice.com/2015/09/07/android-m-begins-locking-down-floating-apps-requires-users-to-grant-special-permission-to-draw-on-other-apps/'
     */
    public static final int ERROR_DOES_NOT_HAVE_OVERDRAW_PERMISSION = 3136;
    /**
     * If the device does not have front facing camera and application tries to capture image
     * using front facing camera, this error will occur.
     * <p>
     * Developer can check if the device has
     * front camera or not by using {@link HiddenCameraUtils#isFrontCameraAvailable(Context)}
     * before initializing the camera.
     */
    public static final int ERROR_DOES_NOT_HAVE_REAR_CAMERA = 8722;
    /**
     * This error code will be generated when application is not able to write the captured image into
     * output file provide.
     */
    public static final int ERROR_IMAGE_WRITE_FAILED = 9854;

    private CameraError() {
        throw new RuntimeException("Cannot initiate CameraError.");
    }

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({ERROR_CAMERA_PERMISSION_NOT_AVAILABLE,
            ERROR_CAMERA_OPEN_FAILED,
            ERROR_DOES_NOT_HAVE_REAR_CAMERA,
            ERROR_DOES_NOT_HAVE_OVERDRAW_PERMISSION,
            ERROR_IMAGE_WRITE_FAILED})
    public @interface CameraErrorCodes {
    }
}