package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y3 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133722a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133723b;

    public y3(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133722a = __typename;
        this.f133723b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133723b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return Intrinsics.d(this.f133722a, y3Var.f133722a) && Intrinsics.d(this.f133723b, y3Var.f133723b);
    }

    public final int hashCode() {
        int hashCode = this.f133722a.hashCode() * 31;
        Boolean bool = this.f133723b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133722a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133723b, ")");
    }
}
