package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z8 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133810a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133811b;

    public z8(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133810a = __typename;
        this.f133811b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133811b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return Intrinsics.d(this.f133810a, z8Var.f133810a) && Intrinsics.d(this.f133811b, z8Var.f133811b);
    }

    public final int hashCode() {
        int hashCode = this.f133810a.hashCode() * 31;
        Boolean bool = this.f133811b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133810a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133811b, ")");
    }
}
