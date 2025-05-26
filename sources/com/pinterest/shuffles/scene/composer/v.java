package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class v extends wd.d {

    /* renamed from: b, reason: collision with root package name */
    public final String f52157b;

    public v(String cacheSalt) {
        Intrinsics.checkNotNullParameter(cacheSalt, "cacheSalt");
        this.f52157b = cacheSalt;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        byte[] bytes = d().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }

    @Override // wd.d
    public final Bitmap c(qd.d pool, Bitmap toTransform, int i13, int i14) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        if (toTransform.getWidth() < 4096 && toTransform.getHeight() < 4096) {
            return toTransform;
        }
        int i15 = t62.a.f116456a;
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        float f13 = width / height;
        if (width > 4096 || height > 4096) {
            if (width > height) {
                height = (int) (4096 / f13);
                width = 4096;
            } else {
                width = (int) (4096 * f13);
                height = 4096;
            }
            if (width > 4096 || height > 4096) {
                width = width > height ? 4096 : (int) (4096 * f13);
                height = height <= width ? (int) (4096 / f13) : 4096;
            }
        }
        Bitmap g13 = pool.g(Integer.valueOf(width).intValue(), Integer.valueOf(height).intValue(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(g13, "get(...)");
        Canvas canvas = new Canvas(g13);
        Matrix matrix = new Matrix();
        matrix.setScale(r6.intValue() / toTransform.getWidth(), r7.intValue() / toTransform.getHeight());
        canvas.setMatrix(matrix);
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, (Paint) null);
        return g13;
    }

    public final String d() {
        StringBuilder D = ep.b.D(kotlin.jvm.internal.k0.f80436a.b(wd.d.class).f(), "-4096,");
        D.append(this.f52157b);
        return D.toString();
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.scene.composer.ScaleForXRendererTransformation");
        return Intrinsics.d(d(), ((v) obj).d());
    }

    @Override // nd.h
    public final int hashCode() {
        return Integer.hashCode(4096) + (d().hashCode() * 31);
    }
}
