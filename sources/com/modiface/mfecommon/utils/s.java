package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34364a;

    public s(MFESharedGLTextureThread mFESharedGLTextureThread) {
        this.f34364a = mFESharedGLTextureThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34364a.mNativeState;
        if (j13 != 0) {
            this.f34364a.jniOnPause();
        }
    }
}
