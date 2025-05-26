package com.modiface.mfecommon.camera;

/* loaded from: classes7.dex */
public class MFEAndroidCameraParameters {
    public static final int HINT_SIZE_MAX = -1;
    public static final int HINT_SIZE_SCREEN = 0;
    public boolean isFrontCamera = true;
    public boolean isContinuousAutoFocusOn = true;
    public CameraRotation cameraRotation = CameraRotation.ROTATE_0;
    public boolean shouldZoomIn = false;
    int hintWidth = 0;
    int hintHeight = 0;

    public enum CameraRotation {
        ROTATE_0,
        ROTATE_90,
        ROTATE_180,
        ROTATE_270
    }

    public void setHintSize(int i13, int i14) {
        if ((i13 <= 0 && i13 != 0 && i13 != -1) || (i14 <= 0 && i14 != 0 && i14 != -1)) {
            throw new IllegalArgumentException("invalid value(s) for setting hint size in MFEAndroidCameraParameters");
        }
        this.hintWidth = i13;
        this.hintHeight = i14;
    }
}
