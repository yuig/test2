package wd;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f129171b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(nd.h.f90415a);

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f129171b);
    }

    @Override // wd.d
    public final Bitmap c(qd.d dVar, Bitmap bitmap, int i13, int i14) {
        Paint paint = b0.f129156a;
        if (bitmap.getWidth() > i13 || bitmap.getHeight() > i14) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return b0.b(dVar, bitmap, i13, i14);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // nd.h
    public final int hashCode() {
        return -670243078;
    }
}
