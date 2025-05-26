package ie2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f72216b;

    public d(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f72216b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f72216b, ((d) obj).f72216b);
    }

    public final int hashCode() {
        return this.f72216b.hashCode();
    }

    public final String toString() {
        return "BitmapTarget(bitmap=" + this.f72216b + ')';
    }
}
