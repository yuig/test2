package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34363a;

    public r(MFESharedGLTextureThread mFESharedGLTextureThread) {
        this.f34363a = mFESharedGLTextureThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34363a.mNativeState;
        if (j13 != 0) {
            this.f34363a.jniDestroy();
        }
        this.f34363a.mNativeState = 0L;
    }
}
