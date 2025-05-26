package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f34365a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f34366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34367c;

    public t(MFESharedGLTextureThread mFESharedGLTextureThread, Bitmap bitmap, long j13) {
        this.f34367c = mFESharedGLTextureThread;
        this.f34365a = bitmap;
        this.f34366b = j13;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        j13 = this.f34367c.mNativeState;
        if (j13 != 0) {
            this.f34367c.jniCreateTexture(this.f34365a, this.f34366b);
        }
    }
}
