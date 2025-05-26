package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends my.b implements b2 {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f60424e;

    /* renamed from: f, reason: collision with root package name */
    public final br.a f60425f;

    /* renamed from: g, reason: collision with root package name */
    public final int f60426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q1 pwtSearchType, br.a searchContext, int i13) {
        super(pwtSearchType);
        Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
        Intrinsics.checkNotNullParameter(searchContext, "searchContext");
        this.f60424e = pwtSearchType;
        this.f60425f = searchContext;
        this.f60426g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f60424e == a0Var.f60424e && this.f60425f == a0Var.f60425f && this.f60426g == a0Var.f60426g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60426g) + ((this.f60425f.hashCode() + (this.f60424e.hashCode() * 31)) * 31);
    }

    public final int l() {
        return this.f60426g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SearchStartEvent(pwtSearchType=");
        sb3.append(this.f60424e);
        sb3.append(", searchContext=");
        sb3.append(this.f60425f);
        sb3.append(", sourceFragmentId=");
        return a.a.n(sb3, this.f60426g, ")");
    }
}
