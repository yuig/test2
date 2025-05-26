package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c8 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132102a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132103b;

    public c8(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132102a = __typename;
        this.f132103b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132103b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return Intrinsics.d(this.f132102a, c8Var.f132102a) && Intrinsics.d(this.f132103b, c8Var.f132103b);
    }

    public final int hashCode() {
        int hashCode = this.f132102a.hashCode() * 31;
        Boolean bool = this.f132103b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132102a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132103b, ")");
    }
}
