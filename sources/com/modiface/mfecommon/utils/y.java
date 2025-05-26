package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34378a;

    public y(MFESharedGLTextureThread mFESharedGLTextureThread) {
        this.f34378a = mFESharedGLTextureThread;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34378a.mNativeState;
        if (j13 != 0) {
            this.f34378a.jniUntrackDeletedFences();
        }
    }
}
