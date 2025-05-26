package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s2 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133224a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133225b;

    public s2(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133224a = __typename;
        this.f133225b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return Intrinsics.d(this.f133224a, s2Var.f133224a) && Intrinsics.d(this.f133225b, s2Var.f133225b);
    }

    public final int hashCode() {
        int hashCode = this.f133224a.hashCode() * 31;
        Boolean bool = this.f133225b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133224a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133225b, ")");
    }
}
