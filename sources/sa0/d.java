package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final p f112162a;

    public d(p dimensions) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.f112162a = dimensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f112162a, ((d) obj).f112162a);
    }

    public final int hashCode() {
        return this.f112162a.hashCode();
    }

    public final String toString() {
        return "CutoutSourceDimensionUpdated(dimensions=" + this.f112162a + ")";
    }
}
