package sa0;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112201a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f112202b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f112203c;

    public z(String url, Size dimensions, d0 imageSource) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        this.f112201a = url;
        this.f112202b = dimensions;
        this.f112203c = imageSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f112201a, zVar.f112201a) && Intrinsics.d(this.f112202b, zVar.f112202b) && this.f112203c == zVar.f112203c;
    }

    public final int hashCode() {
        return this.f112203c.hashCode() + ((this.f112202b.hashCode() + (this.f112201a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocalImage(url=" + this.f112201a + ", dimensions=" + this.f112202b + ", imageSource=" + this.f112203c + ")";
    }
}
