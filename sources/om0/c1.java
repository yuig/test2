package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f96474a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f96475b;

    static {
        new c1(t0.f96595c, u50.h0.f120562a);
    }

    public c1(t0 carousel, u50.i0 title) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f96474a = carousel;
        this.f96475b = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f96474a, c1Var.f96474a) && Intrinsics.d(this.f96475b, c1Var.f96475b);
    }

    public final int hashCode() {
        return this.f96475b.hashCode() + (this.f96474a.f96596a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedContentCarousel(carousel=" + this.f96474a + ", title=" + this.f96475b + ")";
    }
}
