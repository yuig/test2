package a41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f600a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f601b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f602c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f603d;

    public h0(g0 icon, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f600a = icon;
        this.f601b = z13;
        this.f602c = z14;
        this.f603d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f600a == h0Var.f600a && this.f601b == h0Var.f601b && this.f602c == h0Var.f602c && this.f603d == h0Var.f603d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f603d) + ep.b.e(this.f602c, ep.b.e(this.f601b, this.f600a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollapsedIconState(icon=");
        sb3.append(this.f600a);
        sb3.append(", shouldAllow=");
        sb3.append(this.f601b);
        sb3.append(", shouldShow=");
        sb3.append(this.f602c);
        sb3.append(", shouldAnimateStateChange=");
        return a.a.r(sb3, this.f603d, ")");
    }
}
