package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFESharedGLTexture {
    private boolean mClosed;
    private long mNativeState;
    private final Object mNativeStateLock;
    private final z mTextureThreadRef;

    public MFESharedGLTexture(@NonNull Bitmap bitmap) {
        this();
        init(bitmap);
    }

    private long getNativeState() {
        return this.mNativeState;
    }

    private native long jniAddNewFence();

    private native void jniDestroy();

    private native long jniInit();

    private native void jniWaitForFencesAndClear();

    public static native void registerNatives();

    public void addGLFence() {
        synchronized (this.mNativeStateLock) {
            try {
                if (this.mClosed) {
                    throw new IllegalStateException("Cannot add fence to closed texture");
                }
                if (this.mNativeState != 0) {
                    this.mTextureThreadRef.a().trackFence(jniAddNewFence());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public synchronized void close() {
        synchronized (this.mNativeStateLock) {
            if (this.mClosed) {
                return;
            }
            this.mClosed = true;
            if (this.mNativeState != 0) {
                this.mTextureThreadRef.a().deleteTexture(this.mNativeState);
                jniDestroy();
            }
            this.mNativeState = 0L;
            this.mTextureThreadRef.b();
        }
    }

    public MFESharedGLTexture createCopy() {
        MFESharedGLTexture mFESharedGLTexture;
        synchronized (this.mNativeStateLock) {
            if (this.mClosed) {
                throw new IllegalStateException("Cannot create copy of closed texture");
            }
            mFESharedGLTexture = new MFESharedGLTexture();
            synchronized (mFESharedGLTexture.mNativeStateLock) {
                this.mTextureThreadRef.a().copyTexture(this.mNativeState, mFESharedGLTexture.mNativeState);
            }
        }
        return mFESharedGLTexture;
    }

    public void finalize() {
        close();
        super.finalize();
    }

    public int getTextureId() {
        synchronized (this.mNativeStateLock) {
            try {
                if (this.mClosed) {
                    throw new IllegalStateException("Cannot get texture id from closed texture");
                }
                if (this.mNativeState == 0) {
                    return 0;
                }
                return this.mTextureThreadRef.a().getTextureId(this.mNativeState);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void init(Bitmap bitmap) {
        synchronized (this.mNativeStateLock) {
            try {
                if (this.mClosed) {
                    throw new IllegalStateException("Cannot initialize a closed texture");
                }
                this.mTextureThreadRef.a().createTexture(bitmap, this.mNativeState);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean isDeleted() {
        return getTextureId() == 0;
    }

    public void waitForGLFences() {
        synchronized (this.mNativeStateLock) {
            try {
                if (this.mClosed) {
                    throw new IllegalStateException("Cannot wait for fences in closed texture");
                }
                if (this.mNativeState != 0) {
                    jniWaitForFencesAndClear();
                    this.mTextureThreadRef.a().untrackDeletedFences();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private MFESharedGLTexture() {
        this.mNativeState = 0L;
        this.mTextureThreadRef = new z();
        Object obj = new Object();
        this.mNativeStateLock = obj;
        this.mClosed = false;
        synchronized (obj) {
            this.mNativeState = jniInit();
        }
    }
}
