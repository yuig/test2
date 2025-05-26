package wd;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class t extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f129204b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(nd.h.f90415a);

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f129204b);
    }

    @Override // wd.d
    public final Bitmap c(qd.d dVar, Bitmap bitmap, int i13, int i14) {
        return b0.b(dVar, bitmap, i13, i14);
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // nd.h
    public final int hashCode() {
        return 1572326941;
    }
}
