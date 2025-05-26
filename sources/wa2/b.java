package wa2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f128666b;

    public b(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f128666b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f128666b, ((b) obj).f128666b);
    }

    public final int hashCode() {
        return this.f128666b.hashCode();
    }

    public final String toString() {
        return "BitmapThumbnail(bitmap=" + this.f128666b + ")";
    }
}
