package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f34370a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f34371b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34372c;

    public v(MFESharedGLTextureThread mFESharedGLTextureThread, long j13, long j14) {
        this.f34372c = mFESharedGLTextureThread;
        this.f34370a = j13;
        this.f34371b = j14;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34372c.mNativeState;
        if (j13 != 0) {
            this.f34372c.jniCopyTexture(this.f34370a, this.f34371b);
        }
    }
}
