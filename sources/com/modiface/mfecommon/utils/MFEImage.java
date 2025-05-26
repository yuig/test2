package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEImage {

    @NonNull
    private final Bitmap mBitmap;
    private final int mFrameID;
    private final int mHeight;
    private boolean mIsClosed;

    @NonNull
    private final MFESharedGLTexture mTexture;
    private final int mWidth;

    public MFEImage(@NonNull Bitmap bitmap) {
        this(bitmap.getWidth(), bitmap.getHeight(), bitmap, new MFESharedGLTexture(bitmap));
    }

    public void close(boolean z13) {
        if (this.mIsClosed) {
            return;
        }
        this.mTexture.close();
        this.mIsClosed = true;
    }

    @NonNull
    public MFEImage createCopy() {
        if (this.mIsClosed) {
            throw new IllegalStateException("Cannot create a copy of a closed image");
        }
        return new MFEImage(this.mWidth, this.mHeight, this.mBitmap, this.mTexture.createCopy(), this.mFrameID);
    }

    public void finalize() {
        close(true);
        super.finalize();
    }

    @NonNull
    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public int getFrameID() {
        return this.mFrameID;
    }

    public int getHeight() {
        return this.mHeight;
    }

    @NonNull
    public MFESharedGLTexture getTexture() {
        return this.mTexture;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isClosed() {
        return this.mIsClosed;
    }

    public MFEImage(int i13, int i14, @NonNull Bitmap bitmap, @NonNull MFESharedGLTexture mFESharedGLTexture) {
        this(i13, i14, bitmap, mFESharedGLTexture, f.a());
    }

    public MFEImage(int i13, int i14, @NonNull Bitmap bitmap, @NonNull MFESharedGLTexture mFESharedGLTexture, int i15) {
        this.mIsClosed = false;
        if (!h.a(bitmap)) {
            this.mWidth = i13;
            this.mHeight = i14;
            this.mBitmap = bitmap;
            this.mTexture = mFESharedGLTexture;
            this.mFrameID = i15;
            return;
        }
        throw new IllegalArgumentException("Invalid bitmap to initialize MFEImage with");
    }

    public void close() {
        close(false);
    }
}
