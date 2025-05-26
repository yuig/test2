package ae2;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Size f15057a;

    /* renamed from: b, reason: collision with root package name */
    public final b f15058b;

    public a(Size size, b pixelType) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(pixelType, "pixelType");
        this.f15057a = size;
        this.f15058b = pixelType;
    }

    public final boolean a(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Size size = this.f15057a;
        int width = size.getWidth();
        Size size2 = other.f15057a;
        return this.f15058b == other.f15058b && ((float) (Math.abs(width - size2.getWidth()) / (size2.getWidth() + size.getWidth()))) < 0.2f && ((float) (Math.abs(size.getHeight() - size2.getHeight()) / (size2.getHeight() + size.getHeight()))) < 0.2f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f15057a, aVar.f15057a) && this.f15058b == aVar.f15058b;
    }

    public final int hashCode() {
        return this.f15058b.hashCode() + (this.f15057a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(size=" + this.f15057a + ", pixelType=" + this.f15058b + ')';
    }
}
