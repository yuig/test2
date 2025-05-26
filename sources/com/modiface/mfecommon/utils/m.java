package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34344a;

    public m(MFESharedGLTextureThread mFESharedGLTextureThread) {
        this.f34344a = mFESharedGLTextureThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jniInit;
        MFESharedGLTextureThread mFESharedGLTextureThread = this.f34344a;
        jniInit = mFESharedGLTextureThread.jniInit();
        mFESharedGLTextureThread.mNativeState = jniInit;
    }
}
