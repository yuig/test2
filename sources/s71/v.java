package s71;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f111414a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f111415b;

    public v(String url, Size size) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f111414a = url;
        this.f111415b = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f111414a, vVar.f111414a) && Intrinsics.d(this.f111415b, vVar.f111415b) && Float.compare(-5.0f, -5.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-5.0f) + ((this.f111415b.hashCode() + (this.f111414a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebImageIcon(url=" + this.f111414a + ", size=" + this.f111415b + ", rotation=-5.0)";
    }
}
