package gc0;

import b3.x0;
import kotlin.jvm.internal.Intrinsics;
import v1.h;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f64768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64769b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64770c;

    public a(h shape, int i13, int i14) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f64768a = shape;
        this.f64769b = i13;
        this.f64770c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f64768a, aVar.f64768a) && this.f64769b == aVar.f64769b && this.f64770c == aVar.f64770c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64770c) + ep.b.b(this.f64769b, this.f64768a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinterestBackgroundDisplayState(shape=");
        sb3.append(this.f64768a);
        sb3.append(", tint=");
        sb3.append(this.f64769b);
        sb3.append(", size=");
        return a.a.n(sb3, this.f64770c, ")");
    }
}
