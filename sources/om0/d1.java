package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 implements e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f96478d;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f96479a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f96480b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f96481c;

    static {
        v0 v0Var = v0.f96607c;
        u50.h0 h0Var = u50.h0.f120562a;
        f96478d = new d1(v0Var, h0Var, h0Var);
    }

    public d1(v0 grid, u50.i0 title, u50.i0 ctaLabel) {
        Intrinsics.checkNotNullParameter(grid, "grid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        this.f96479a = grid;
        this.f96480b = title;
        this.f96481c = ctaLabel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.f96479a, d1Var.f96479a) && Intrinsics.d(this.f96480b, d1Var.f96480b) && Intrinsics.d(this.f96481c, d1Var.f96481c);
    }

    public final int hashCode() {
        return this.f96481c.hashCode() + ep.b.d(this.f96480b, this.f96479a.f96608a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SavedContentGrid(grid=");
        sb3.append(this.f96479a);
        sb3.append(", title=");
        sb3.append(this.f96480b);
        sb3.append(", ctaLabel=");
        return jq.b.k(sb3, this.f96481c, ")");
    }
}
