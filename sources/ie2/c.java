package ie2;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final Size f72215b;

    public c(Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f72215b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f72215b, ((c) obj).f72215b);
    }

    public final int hashCode() {
        return this.f72215b.hashCode();
    }

    public final String toString() {
        return "BitmapNoTarget(size=" + this.f72215b + ')';
    }
}
