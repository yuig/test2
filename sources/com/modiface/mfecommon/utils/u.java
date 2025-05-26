package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f34368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34369b;

    public u(MFESharedGLTextureThread mFESharedGLTextureThread, long j13) {
        this.f34369b = mFESharedGLTextureThread;
        this.f34368a = j13;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34369b.mNativeState;
        if (j13 != 0) {
            this.f34369b.jniDeleteTexture(this.f34368a);
        }
    }
}
