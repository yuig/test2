package s80;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f111587a;

    /* renamed from: b, reason: collision with root package name */
    public final double f111588b;

    /* renamed from: c, reason: collision with root package name */
    public final r72.l1 f111589c;

    public i4(Bitmap bitmap, double d2, r72.l1 offset) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f111587a = bitmap;
        this.f111588b = d2;
        this.f111589c = offset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return Intrinsics.d(this.f111587a, i4Var.f111587a) && Double.compare(this.f111588b, i4Var.f111588b) == 0 && Intrinsics.d(this.f111589c, i4Var.f111589c);
    }

    public final int hashCode() {
        return this.f111589c.hashCode() + a.c.a(this.f111588b, this.f111587a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AddDrawing(bitmap=" + this.f111587a + ", scale=" + this.f111588b + ", offset=" + this.f111589c + ")";
    }
}
