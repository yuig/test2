package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p3 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133020a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133021b;

    public p3(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133020a = __typename;
        this.f133021b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133021b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return Intrinsics.d(this.f133020a, p3Var.f133020a) && Intrinsics.d(this.f133021b, p3Var.f133021b);
    }

    public final int hashCode() {
        int hashCode = this.f133020a.hashCode() * 31;
        Boolean bool = this.f133021b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133020a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133021b, ")");
    }
}
