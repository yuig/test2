package com.modiface.mfecommon.utils;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEGLUtil {
    public static boolean DoCheckGLError = false;
    public static final int EmptyGLId = 0;
    public static final float[] untransformedVertices = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] untransformedTextureCoordinates = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public static void assertOnGLError() {
        l lVar;
        if (DoCheckGLError) {
            int glGetError = GLES20.glGetError();
            l[] values = l.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    lVar = null;
                    break;
                }
                lVar = values[i13];
                if (glGetError == lVar.f34341a) {
                    break;
                } else {
                    i13++;
                }
            }
            if (lVar != l.NO_ERROR) {
                throw new RuntimeException("GL error with code: " + (lVar != null ? lVar.name() : "UNKNOWN") + " (" + Integer.toHexString(glGetError) + ")");
            }
        }
    }

    public static Throwable getEGLError() {
        b bVar;
        int eglGetError = EGL14.eglGetError();
        b[] values = b.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                bVar = null;
                break;
            }
            bVar = values[i13];
            if (eglGetError == bVar.f34282a) {
                break;
            }
            i13++;
        }
        if (bVar == b.SUCCESS) {
            return null;
        }
        return new Throwable("EGL error with code: " + (bVar != null ? bVar.name() : "UNKNOWN") + " (" + Integer.toHexString(eglGetError) + ")");
    }

    public static Throwable getErrorForGLCode(int i13) {
        return getErrorForGLCode(i13, -1, null);
    }

    public static int getGLESMajorVersion(@NonNull Context context) {
        FeatureInfo[] systemAvailableFeatures;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null && systemAvailableFeatures.length > 0) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name == null) {
                    int i13 = featureInfo.reqGlEsVersion;
                    if (i13 != 0) {
                        return (i13 & (-65536)) >> 16;
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    public static Throwable getGLError() {
        return getErrorForGLCode(GLES20.glGetError());
    }

    public static boolean isGLES3Supported(@NonNull Context context) {
        return getGLESMajorVersion(context) >= 3;
    }

    public static Throwable getErrorForGLCode(int i13, int i14, String str) {
        l lVar;
        String str2;
        l[] values = l.values();
        int length = values.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                lVar = null;
                break;
            }
            lVar = values[i15];
            if (i13 == lVar.f34341a) {
                break;
            }
            i15++;
        }
        if (lVar == l.NO_ERROR) {
            return null;
        }
        String name = lVar != null ? lVar.name() : "UNKNOWN";
        if (i14 >= 0) {
            str2 = " at line " + i14;
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "(no message)";
        }
        return new Throwable("GL error with code " + name + " (0x" + Integer.toHexString(i13) + ")" + str2 + " with message: " + str);
    }
}
