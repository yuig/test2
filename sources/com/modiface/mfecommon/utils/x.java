package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f34376a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34377b;

    public x(MFESharedGLTextureThread mFESharedGLTextureThread, long j13) {
        this.f34377b = mFESharedGLTextureThread;
        this.f34376a = j13;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34377b.mNativeState;
        if (j13 != 0) {
            this.f34377b.jniTrackFence(this.f34376a);
        }
    }
}
