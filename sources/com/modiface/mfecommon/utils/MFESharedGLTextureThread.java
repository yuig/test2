package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import android.opengl.EGLContext;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class MFESharedGLTextureThread {
    private boolean mIsClosed;
    private boolean mIsPaused;
    private long mNativeState;
    private final n mThread;

    @NonNull
    private static WeakReference<MFESharedGLTextureThread> mInstanceRef = new WeakReference<>(null);
    private static long mInstanceRefCount = 0;
    private static final Object mInstanceLock = new Object();

    public /* synthetic */ MFESharedGLTextureThread(m mVar) {
        this();
    }

    public static /* synthetic */ long access$314(long j13) {
        long j14 = mInstanceRefCount + j13;
        mInstanceRefCount = j14;
        return j14;
    }

    public static /* synthetic */ long access$322(long j13) {
        long j14 = mInstanceRefCount - j13;
        mInstanceRefCount = j14;
        return j14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        if (this.mIsClosed) {
            return;
        }
        this.mThread.e(new r(this));
        this.mThread.a();
        this.mIsClosed = true;
    }

    private long getNativeState() {
        return this.mNativeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCopyTexture(long j13, long j14);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCreateTexture(Bitmap bitmap, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniDeleteTexture(long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniDestroy();

    /* JADX INFO: Access modifiers changed from: private */
    public native int jniGetTextureId(long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public native long jniInit();

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniOnPause();

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniTrackFence(long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniUntrackDeletedFences();

    public static void onPause() {
        synchronized (mInstanceLock) {
            try {
                MFESharedGLTextureThread mFESharedGLTextureThread = mInstanceRef.get();
                if (mFESharedGLTextureThread != null) {
                    mFESharedGLTextureThread.onPausePrivate();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void onPausePrivate() {
        if (!h.a()) {
            throw new IllegalStateException("must call onPause() in UI thread");
        }
        if (this.mIsPaused) {
            return;
        }
        this.mThread.c(new s(this));
        this.mIsPaused = true;
    }

    public static void onResume() {
        synchronized (mInstanceLock) {
            try {
                MFESharedGLTextureThread mFESharedGLTextureThread = mInstanceRef.get();
                if (mFESharedGLTextureThread != null) {
                    mFESharedGLTextureThread.onResumePrivate();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void onResumePrivate() {
        if (!h.a()) {
            throw new IllegalStateException("must call onResume() in UI thread");
        }
        if (this.mIsPaused) {
            this.mThread.b((EGLContext) null);
            this.mIsPaused = false;
        }
    }

    public static native void registerNatives();

    public void copyTexture(long j13, long j14) {
        this.mThread.e(new v(this, j13, j14));
    }

    public void createTexture(Bitmap bitmap, long j13) {
        this.mThread.e(new t(this, bitmap, j13));
    }

    public void deleteTexture(long j13) {
        this.mThread.e(new u(this, j13));
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public int getTextureId(long j13) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.mThread.e(new w(this, atomicInteger, j13));
        return atomicInteger.get();
    }

    public void trackFence(long j13) {
        this.mThread.e(new x(this, j13));
    }

    public void untrackDeletedFences() {
        this.mThread.e(new y(this));
    }

    private MFESharedGLTextureThread() {
        this.mNativeState = 0L;
        n nVar = new n("MFETextureThread");
        this.mThread = nVar;
        this.mIsPaused = false;
        this.mIsClosed = false;
        nVar.e(new m(this));
    }
}
