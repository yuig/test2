package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class MFEGLFramebuffer {
    private static int MAX_TEXTURE_SIZE = -1;
    protected ArrayList<Throwable> errors;
    protected int framebufferId;
    protected int height;
    protected final String name;
    protected Integer status;
    protected int textureId;
    protected int width;

    public MFEGLFramebuffer() {
        this(null);
    }

    private boolean bindTextureToFramebuffer() {
        if (this.textureId == 0 || this.framebufferId == 0) {
            return true;
        }
        GLES20.glActiveTexture(33985);
        if (checkGLError()) {
            return false;
        }
        GLES20.glBindFramebuffer(36160, this.framebufferId);
        if (checkGLError()) {
            return false;
        }
        GLES20.glBindTexture(3553, this.textureId);
        if (checkGLError()) {
            return false;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
        return !checkGLError();
    }

    private boolean checkAndSetGLFramebufferStatus() {
        this.status = Integer.valueOf(GLES20.glCheckFramebufferStatus(36160));
        return !checkGLError();
    }

    private boolean checkGLError(int i13) {
        Throwable errorForGLCode = MFEGLUtil.getErrorForGLCode(i13);
        if (errorForGLCode == null) {
            return false;
        }
        this.errors.add(generateError(errorForGLCode));
        return true;
    }

    private boolean checkNativeError(MFENativeError mFENativeError) {
        Throwable nativeError = mFENativeError.getNativeError();
        if (nativeError == null) {
            return false;
        }
        this.errors.add(generateError(nativeError));
        return true;
    }

    private Throwable generateError(Throwable th3) {
        return new Throwable("error on framebuffer \"" + this.name + "\":\n\twidth: " + this.width + "\n\theight: " + this.height + "\n\ttextureId: " + this.textureId + "\n\tframebufferId: " + this.framebufferId + "\n\tstatus: " + this.status, th3);
    }

    private boolean generateFramebuffer() {
        this.framebufferId = 0;
        int[] iArr = {0};
        GLES20.glBindFramebuffer(36160, 0);
        if (checkGLError()) {
            return false;
        }
        GLES20.glGenFramebuffers(1, iArr, 0);
        if (checkGLError()) {
            return false;
        }
        this.framebufferId = iArr[0];
        return true;
    }

    private boolean generateTexture() {
        this.textureId = 0;
        int[] iArr = {0};
        GLES20.glActiveTexture(33985);
        if (checkGLError()) {
            return false;
        }
        GLES20.glBindTexture(3553, 0);
        if (checkGLError()) {
            return false;
        }
        GLES20.glGenTextures(1, iArr, 0);
        if (checkGLError()) {
            return false;
        }
        GLES20.glBindTexture(3553, iArr[0]);
        if (checkGLError()) {
            return false;
        }
        GLES20.glTexParameteri(3553, 10241, 9729);
        if (checkGLError()) {
            return false;
        }
        GLES20.glTexParameteri(3553, 10240, 9729);
        if (checkGLError()) {
            return false;
        }
        GLES20.glTexParameteri(3553, 10242, 33071);
        if (checkGLError()) {
            return false;
        }
        GLES20.glTexParameteri(3553, 10243, 33071);
        if (checkGLError()) {
            return false;
        }
        this.textureId = iArr[0];
        return true;
    }

    private boolean generateTextureAndFramebuffer() {
        if (generateTexture() && generateFramebuffer()) {
            return bindTextureToFramebuffer();
        }
        return false;
    }

    public static int getMaxTextureSize() {
        if (MAX_TEXTURE_SIZE < 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            int i13 = iArr[0];
            if (i13 == 0) {
                i13 = Integer.MAX_VALUE;
            }
            MAX_TEXTURE_SIZE = i13;
        }
        return MAX_TEXTURE_SIZE;
    }

    private native void jniTexImage2DEmpty(int i13, int i14, long j13);

    private native void jniToBitmap(Bitmap bitmap, int i13, int i14, int i15, int i16, long j13);

    private native void jniToByteArray(byte[] bArr, int i13, int i14, int i15, int i16, long j13);

    public static native void registerNatives();

    public void attachTexture(int i13, int i14, int i15) {
        int i16 = this.width;
        int i17 = this.height;
        this.width = i14;
        this.height = i15;
        if (this.framebufferId == 0 && !generateFramebuffer()) {
            this.width = i16;
            this.height = i17;
            return;
        }
        int i18 = this.textureId;
        this.textureId = i13;
        if (!bindTextureToFramebuffer()) {
            this.textureId = i18;
            this.width = i16;
            this.height = i17;
            return;
        }
        GLES20.glBindFramebuffer(36160, this.framebufferId);
        if (!checkGLError() && checkAndSetGLFramebufferStatus()) {
            GLES20.glBindFramebuffer(36160, 0);
            if (checkGLError() || i18 == 0) {
                return;
            }
            GLES20.glDeleteTextures(1, new int[]{i18}, 0);
            checkGLError();
        }
    }

    public Bitmap captureToBitmap() {
        return captureToBitmap(null);
    }

    public byte[] captureToByteArray() {
        return captureToByteArray(null);
    }

    public void close() {
        int i13 = this.textureId;
        if (i13 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            checkGLError();
        }
        int i14 = this.framebufferId;
        if (i14 != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i14}, 0);
            checkGLError();
        }
        this.width = 0;
        this.height = 0;
        this.textureId = 0;
        this.framebufferId = 0;
        this.status = null;
    }

    public int detachTexture() {
        int i13 = this.textureId;
        this.textureId = 0;
        if (!bindTextureToFramebuffer()) {
            this.textureId = i13;
            return 0;
        }
        this.status = null;
        this.textureId = 0;
        return i13;
    }

    public void generateEmptyWithSize(int i13, int i14) {
        if (isValid() && i13 == this.width && i14 == this.height) {
            return;
        }
        close();
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException("Invalid size: Width and height cannot be less than 0");
        }
        int maxTextureSize = getMaxTextureSize();
        if (i13 > maxTextureSize || i14 > maxTextureSize) {
            throw new IllegalArgumentException("Invalid size: Width and height cannot be bigger than the maximum texture size");
        }
        this.width = i13;
        this.height = i14;
        if (generateTextureAndFramebuffer()) {
            GLES20.glActiveTexture(33985);
            if (checkGLError()) {
                return;
            }
            GLES20.glBindFramebuffer(36160, this.framebufferId);
            if (checkGLError()) {
                return;
            }
            GLES20.glBindTexture(3553, this.textureId);
            if (checkGLError()) {
                return;
            }
            MFENativeError mFENativeError = new MFENativeError();
            jniTexImage2DEmpty(this.width, this.height, mFENativeError.getNativeState());
            if (!checkNativeError(mFENativeError) && checkAndSetGLFramebufferStatus()) {
                GLES20.glActiveTexture(33985);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, 0);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindTexture(3553, 0);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, this.framebufferId);
                if (checkGLError()) {
                    return;
                }
                GLES20.glClear(16384);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, 0);
                checkGLError();
            }
        }
    }

    public ArrayList<Throwable> getAndClearErrors() {
        ArrayList<Throwable> arrayList = new ArrayList<>(this.errors);
        this.errors.clear();
        return arrayList;
    }

    public int getFramebufferId() {
        return this.framebufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public Integer getStatus() {
        return this.status;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasError() {
        return !this.errors.isEmpty();
    }

    public boolean isValid() {
        Integer num;
        return this.width > 0 && this.height > 0 && this.textureId != 0 && this.framebufferId != 0 && (num = this.status) != null && num.intValue() == 36053;
    }

    public void loadBitmap(Bitmap bitmap) {
        if (isValid() && bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() == this.width && bitmap.getHeight() == this.height && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            GLES20.glBindTexture(3553, this.textureId);
            if (checkGLError()) {
                return;
            }
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            if (checkGLError()) {
                return;
            }
            checkAndSetGLFramebufferStatus();
            return;
        }
        close();
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            return;
        }
        float min = Math.min(getMaxTextureSize() / Math.max(bitmap.getWidth(), bitmap.getHeight()), 1.0f);
        this.width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        this.height = height;
        if (min < 1.0f && min > 0.0f) {
            bitmap = Bitmap.createScaledBitmap(bitmap, this.width, height, true);
        }
        if (generateTextureAndFramebuffer()) {
            GLES20.glActiveTexture(33985);
            if (checkGLError()) {
                return;
            }
            GLES20.glBindFramebuffer(36160, this.framebufferId);
            if (checkGLError()) {
                return;
            }
            GLES20.glBindTexture(3553, this.textureId);
            if (checkGLError()) {
                return;
            }
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            if (!checkGLError() && checkAndSetGLFramebufferStatus()) {
                GLES20.glActiveTexture(33985);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, 0);
                if (checkGLError()) {
                    return;
                }
                GLES20.glBindTexture(3553, 0);
                checkGLError();
            }
        }
    }

    public MFEGLFramebuffer(String str) {
        this.width = 0;
        this.height = 0;
        this.textureId = 0;
        this.framebufferId = 0;
        this.status = null;
        this.errors = new ArrayList<>();
        this.name = str;
    }

    public Bitmap captureToBitmap(Bitmap bitmap) {
        return captureToBitmap(bitmap, 0, 0, this.width, this.height);
    }

    public byte[] captureToByteArray(byte[] bArr) {
        return captureToByteArray(bArr, 0, 0, this.width, this.height);
    }

    private boolean checkGLError() {
        Throwable gLError = MFEGLUtil.getGLError();
        if (gLError == null) {
            return false;
        }
        this.errors.add(generateError(gLError));
        return true;
    }

    public Bitmap captureToBitmap(int i13, int i14, int i15, int i16) {
        return captureToBitmap(null, i13, i14, i15, i16);
    }

    public byte[] captureToByteArray(int i13, int i14, int i15, int i16) {
        return captureToByteArray(null, i13, i14, i15, i16);
    }

    public Bitmap captureToBitmap(Bitmap bitmap, int i13, int i14, int i15, int i16) {
        if (!isValid() || i13 < 0 || i14 < 0 || i13 + i15 > this.width || i14 + i16 > this.height) {
            return null;
        }
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() != i15 || bitmap.getHeight() != i16 || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            bitmap = h.a(i15, i16, Bitmap.Config.ARGB_8888);
        }
        MFENativeError mFENativeError = new MFENativeError();
        jniToBitmap(bitmap, i13, i14, i15, i16, mFENativeError.getNativeState());
        if (checkNativeError(mFENativeError)) {
            return null;
        }
        return bitmap;
    }

    public byte[] captureToByteArray(byte[] bArr, int i13, int i14, int i15, int i16) {
        if (!isValid() || i13 < 0 || i14 < 0 || i13 + i15 > this.width || i14 + i16 > this.height) {
            return null;
        }
        if (bArr == null || bArr.length != i15 * i16 * 4) {
            bArr = new byte[i15 * i16 * 4];
        }
        MFENativeError mFENativeError = new MFENativeError();
        jniToByteArray(bArr, i13, i14, i15, i16, mFENativeError.getNativeState());
        if (checkNativeError(mFENativeError)) {
            return null;
        }
        return bArr;
    }
}
