package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.s f16946a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new m1(2));
        f16946a = new c0.s(linkedHashSet);
    }

    public static void a(Context context, androidx.appcompat.app.d dVar, c0.s sVar) {
        Integer b13;
        int i13 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && d0.i.f(context) != 0) {
            LinkedHashSet o13 = dVar.o();
            if (o13.isEmpty()) {
                throw new CameraValidator$CameraIdListIncorrectException(0, "No cameras available", null);
            }
            kh2.m0.p("CameraValidator", "Virtual device with ID: " + d0.i.f(context) + " has " + o13.size() + " cameras. Skipping validation.");
            return;
        }
        if (sVar != null) {
            try {
                b13 = sVar.b();
                if (b13 == null) {
                    kh2.m0.X0("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e13) {
                kh2.m0.t("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e13);
                return;
            }
        } else {
            b13 = null;
        }
        kh2.m0.p("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + b13);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (sVar != null) {
                    if (b13.intValue() == 1) {
                    }
                }
                c0.s.f24331c.c(dVar.o());
                i13 = 1;
            }
        } catch (IllegalArgumentException e14) {
            illegalArgumentException = e14;
            kh2.m0.Y0("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (sVar != null) {
                    if (b13.intValue() == 0) {
                    }
                }
                c0.s.f24330b.c(dVar.o());
                i13++;
            }
        } catch (IllegalArgumentException e15) {
            illegalArgumentException = e15;
            kh2.m0.Y0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f16946a.c(dVar.o());
            kh2.m0.p("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i13++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        kh2.m0.s("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + dVar.o());
        throw new CameraValidator$CameraIdListIncorrectException(i13, "Expected camera missing from device.", illegalArgumentException);
    }
}
