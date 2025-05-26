package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: e, reason: collision with root package name */
    public static final y0 f106715e = new y0("", 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f106716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f106719d;

    public y0(String url, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f106716a = url;
        this.f106717b = i13;
        this.f106718c = i14;
        this.f106719d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f106716a, y0Var.f106716a) && this.f106717b == y0Var.f106717b && this.f106718c == y0Var.f106718c && this.f106719d == y0Var.f106719d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106719d) + ep.b.b(this.f106718c, ep.b.b(this.f106717b, this.f106716a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageAttributes(url=");
        sb3.append(this.f106716a);
        sb3.append(", width=");
        sb3.append(this.f106717b);
        sb3.append(", height=");
        sb3.append(this.f106718c);
        sb3.append(", requestedWidth=");
        return a.a.n(sb3, this.f106719d, ")");
    }
}
