package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y2 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133720a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133721b;

    public y2(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133720a = __typename;
        this.f133721b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133721b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.d(this.f133720a, y2Var.f133720a) && Intrinsics.d(this.f133721b, y2Var.f133721b);
    }

    public final int hashCode() {
        int hashCode = this.f133720a.hashCode() * 31;
        Boolean bool = this.f133721b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133720a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133721b, ")");
    }
}
