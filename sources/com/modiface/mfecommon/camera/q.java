package com.modiface.mfecommon.camera;

import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f34243a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f34244b;

    static {
        int[] iArr = new int[b.values().length];
        f34244b = iArr;
        try {
            iArr[b.ROTATE0_FLIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f34244b[b.ROTATE90_NOFLIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f34244b[b.ROTATE90_FLIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f34244b[b.ROTATE180_NOFLIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f34244b[b.ROTATE180_FLIP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f34244b[b.ROTATE270_NOFLIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f34244b[b.ROTATE270_FLIP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[MFEAndroidCameraParameters.CameraRotation.values().length];
        f34243a = iArr2;
        try {
            iArr2[MFEAndroidCameraParameters.CameraRotation.ROTATE_90.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f34243a[MFEAndroidCameraParameters.CameraRotation.ROTATE_180.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f34243a[MFEAndroidCameraParameters.CameraRotation.ROTATE_270.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f34243a[MFEAndroidCameraParameters.CameraRotation.ROTATE_0.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
