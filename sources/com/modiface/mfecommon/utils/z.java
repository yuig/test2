package com.modiface.mfecommon.utils;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private MFESharedGLTextureThread f34379a;

    public z() {
        Object obj;
        WeakReference weakReference;
        obj = MFESharedGLTextureThread.mInstanceLock;
        synchronized (obj) {
            try {
                weakReference = MFESharedGLTextureThread.mInstanceRef;
                MFESharedGLTextureThread mFESharedGLTextureThread = (MFESharedGLTextureThread) weakReference.get();
                this.f34379a = mFESharedGLTextureThread;
                if (mFESharedGLTextureThread == null) {
                    this.f34379a = new MFESharedGLTextureThread(null);
                    WeakReference unused = MFESharedGLTextureThread.mInstanceRef = new WeakReference(this.f34379a);
                    long unused2 = MFESharedGLTextureThread.mInstanceRefCount = 0L;
                }
                MFESharedGLTextureThread.access$314(1L);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public MFESharedGLTextureThread a() {
        return this.f34379a;
    }

    public synchronized void b() {
        Object obj;
        long j13;
        long j14;
        if (this.f34379a == null) {
            return;
        }
        obj = MFESharedGLTextureThread.mInstanceLock;
        synchronized (obj) {
            try {
                MFESharedGLTextureThread.access$322(1L);
                j13 = MFESharedGLTextureThread.mInstanceRefCount;
                long unused = MFESharedGLTextureThread.mInstanceRefCount = Math.max(0L, j13);
                j14 = MFESharedGLTextureThread.mInstanceRefCount;
                if (j14 == 0) {
                    this.f34379a.close();
                    WeakReference unused2 = MFESharedGLTextureThread.mInstanceRef = new WeakReference(null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f34379a = null;
    }
}
