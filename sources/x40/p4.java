package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p4 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133022a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133023b;

    public p4(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133022a = __typename;
        this.f133023b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133023b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return Intrinsics.d(this.f133022a, p4Var.f133022a) && Intrinsics.d(this.f133023b, p4Var.f133023b);
    }

    public final int hashCode() {
        int hashCode = this.f133022a.hashCode() * 31;
        Boolean bool = this.f133023b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133022a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133023b, ")");
    }
}
