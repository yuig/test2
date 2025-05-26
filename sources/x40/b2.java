package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b2 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132001a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132002b;

    public b2(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132001a = __typename;
        this.f132002b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132002b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Intrinsics.d(this.f132001a, b2Var.f132001a) && Intrinsics.d(this.f132002b, b2Var.f132002b);
    }

    public final int hashCode() {
        int hashCode = this.f132001a.hashCode() * 31;
        Boolean bool = this.f132002b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132001a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132002b, ")");
    }
}
