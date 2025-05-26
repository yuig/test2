package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ch implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132170a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132171b;

    public ch(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132170a = __typename;
        this.f132171b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return Intrinsics.d(this.f132170a, chVar.f132170a) && Intrinsics.d(this.f132171b, chVar.f132171b);
    }

    public final int hashCode() {
        int hashCode = this.f132170a.hashCode() * 31;
        Boolean bool = this.f132171b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132170a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132171b, ")");
    }
}
