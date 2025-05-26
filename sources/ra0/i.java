package ra0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f106946a;

    public i(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f106946a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f106946a, ((i) obj).f106946a);
    }

    public final int hashCode() {
        return this.f106946a.hashCode();
    }

    public final String toString() {
        return "ImageBitmap(bitmap=" + this.f106946a + ")";
    }
}
