package com.modiface.mfecommon.mfea;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: k, reason: collision with root package name */
    private long f34257k = 0;

    private native long a();

    private native void b();

    private long getNativeState() {
        return this.f34257k;
    }

    public static native void registerNatives();

    public native void c(int i13, float[] fArr, float[] fArr2, int i14, Bitmap bitmap, long j13);

    public void d() {
        this.f34257k = a();
    }

    public void e() {
        if (this.f34257k != 0) {
            b();
            this.f34257k = 0L;
        }
    }

    public boolean f() {
        return this.f34257k != 0;
    }

    public native void g(Bitmap bitmap, Bitmap bitmap2, int i13);
}
