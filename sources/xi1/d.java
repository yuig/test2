package xi1;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f135047b;

    public d(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f135047b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f135047b, ((d) obj).f135047b);
    }

    public final int hashCode() {
        return this.f135047b.hashCode();
    }

    public final String toString() {
        return "BitmapThumbnail(bitmap=" + this.f135047b + ")";
    }
}
