package com.modiface.mfemakeupkit.mfea;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.k;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: k, reason: collision with root package name */
    private long f34527k = 0;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    private native long a();

    private native void b();

    private long getNativeState() {
        return this.f34527k;
    }

    private static native void registerNatives();

    public native void c(int i13, float[] fArr, float[] fArr2, MFEDebugInfo mFEDebugInfo, long j13);

    public void d() {
        this.f34527k = a();
    }

    public void e() {
        if (this.f34527k != 0) {
            b();
            this.f34527k = 0L;
        }
    }

    public boolean f() {
        return this.f34527k != 0;
    }
}
