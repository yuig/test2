package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k8 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132669a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132670b;

    public k8(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132669a = __typename;
        this.f132670b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132670b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return Intrinsics.d(this.f132669a, k8Var.f132669a) && Intrinsics.d(this.f132670b, k8Var.f132670b);
    }

    public final int hashCode() {
        int hashCode = this.f132669a.hashCode() * 31;
        Boolean bool = this.f132670b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132669a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132670b, ")");
    }
}
