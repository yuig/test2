package dw0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f56409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56410b;

    public a(int i13, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f56409a = bitmap;
        this.f56410b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f56409a, aVar.f56409a) && this.f56410b == aVar.f56410b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56410b) + (this.f56409a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapFrame(bitmap=" + this.f56409a + ", delay=" + this.f56410b + ")";
    }
}
