package wd;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f129169b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(nd.h.f90415a);

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f129169b);
    }

    @Override // wd.d
    public final Bitmap c(qd.d dVar, Bitmap bitmap, int i13, int i14) {
        float width;
        float height;
        Paint paint = b0.f129156a;
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f13 = 0.0f;
        if (bitmap.getWidth() * i14 > bitmap.getHeight() * i13) {
            width = i14 / bitmap.getHeight();
            f13 = (i13 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i13 / bitmap.getWidth();
            height = (i14 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f13 + 0.5f), (int) (height + 0.5f));
        Bitmap g13 = dVar.g(i13, i14, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        g13.setHasAlpha(bitmap.hasAlpha());
        b0.a(bitmap, g13, matrix);
        return g13;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // nd.h
    public final int hashCode() {
        return -599754482;
    }
}
