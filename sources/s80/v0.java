package s80;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f111819a;

    /* renamed from: b, reason: collision with root package name */
    public final double f111820b;

    /* renamed from: c, reason: collision with root package name */
    public final r72.l1 f111821c;

    public v0(Bitmap bitmap, double d2, r72.l1 offset) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f111819a = bitmap;
        this.f111820b = d2;
        this.f111821c = offset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f111819a, v0Var.f111819a) && Double.compare(this.f111820b, v0Var.f111820b) == 0 && Intrinsics.d(this.f111821c, v0Var.f111821c);
    }

    public final int hashCode() {
        return this.f111821c.hashCode() + a.c.a(this.f111820b, this.f111819a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DrawingGenerated(bitmap=" + this.f111819a + ", scale=" + this.f111820b + ", offset=" + this.f111821c + ")";
    }
}
