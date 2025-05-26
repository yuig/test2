package rq;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f109501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f109502b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109503c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109504d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f109505e;

    public r0(boolean z13, String searchQuery, boolean z14) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f109501a = z13;
        this.f109502b = searchQuery;
        this.f109503c = false;
        this.f109504d = false;
        this.f109505e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f109501a == r0Var.f109501a && Intrinsics.d(this.f109502b, r0Var.f109502b) && this.f109503c == r0Var.f109503c && this.f109504d == r0Var.f109504d && this.f109505e == r0Var.f109505e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109505e) + ep.b.e(this.f109504d, ep.b.e(this.f109503c, cb.d(this.f109502b, Boolean.hashCode(this.f109501a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupCarouselParams(isProductImageCarousel=");
        sb3.append(this.f109501a);
        sb3.append(", searchQuery=");
        sb3.append(this.f109502b);
        sb3.append(", shouldShowProductImageIndexTracker=");
        sb3.append(this.f109503c);
        sb3.append(", isVTO=");
        sb3.append(this.f109504d);
        sb3.append(", isCloseupRedesignEnabled=");
        return a.a.r(sb3, this.f109505e, ")");
    }
}
