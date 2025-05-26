package com.modiface.mfecommon.utils;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class MFENativeError {
    private long mNativeState;

    public MFENativeError() {
        this.mNativeState = 0L;
        this.mNativeState = jniInit();
    }

    private native int getCode();

    private native int getLine();

    private native String getMessage();

    private native boolean isError();

    private native boolean isGLError();

    private native void jniDestroy();

    private native long jniInit();

    public static native void registerNatives();

    public void close() {
        if (this.mNativeState != 0) {
            jniDestroy();
            this.mNativeState = 0L;
        }
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public Throwable getNativeError() {
        String str;
        if (!isError()) {
            return null;
        }
        int line = getLine();
        String message = getMessage();
        if (TextUtils.isEmpty(message)) {
            message = "(no message)";
        }
        if (isGLError()) {
            return MFEGLUtil.getErrorForGLCode(getCode(), line, message);
        }
        if (line >= 0) {
            str = " at line " + line;
        } else {
            str = "";
        }
        return new Throwable("MFE native error" + str + " with code " + getCode() + " (0x" + Integer.toHexString(getCode()) + ") with message: " + message);
    }

    public long getNativeState() {
        return this.mNativeState;
    }
}
