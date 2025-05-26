package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ka implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132671a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132672b;

    public ka(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132671a = __typename;
        this.f132672b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132672b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return Intrinsics.d(this.f132671a, kaVar.f132671a) && Intrinsics.d(this.f132672b, kaVar.f132672b);
    }

    public final int hashCode() {
        int hashCode = this.f132671a.hashCode() * 31;
        Boolean bool = this.f132672b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132671a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132672b, ")");
    }
}
