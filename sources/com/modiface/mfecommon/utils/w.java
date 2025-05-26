package com.modiface.mfecommon.utils;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicInteger f34373a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f34374b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFESharedGLTextureThread f34375c;

    public w(MFESharedGLTextureThread mFESharedGLTextureThread, AtomicInteger atomicInteger, long j13) {
        this.f34375c = mFESharedGLTextureThread;
        this.f34373a = atomicInteger;
        this.f34374b = j13;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j13;
        int jniGetTextureId;
        j13 = this.f34375c.mNativeState;
        if (j13 != 0) {
            AtomicInteger atomicInteger = this.f34373a;
            jniGetTextureId = this.f34375c.jniGetTextureId(this.f34374b);
            atomicInteger.set(jniGetTextureId);
        }
    }
}
