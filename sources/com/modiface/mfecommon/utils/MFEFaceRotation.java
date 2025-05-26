package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public class MFEFaceRotation {
    public float pitch;
    public float roll;
    public float yaw;

    public MFEFaceRotation(float f13, float f14, float f15) {
        this.pitch = f13;
        this.yaw = f14;
        this.roll = f15;
    }

    public MFEFaceRotation() {
        this(0.0f, 0.0f, 0.0f);
    }
}
