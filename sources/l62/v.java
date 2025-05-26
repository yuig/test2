package l62;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f81692a;

    public v(Bitmap bitmap) {
        this.f81692a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f81692a, ((v) obj).f81692a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f81692a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "ThumbnailGenerated(bitmap=" + this.f81692a + ")";
    }
}
