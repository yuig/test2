package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dd implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132245a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132246b;

    public dd(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132245a = __typename;
        this.f132246b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132246b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return Intrinsics.d(this.f132245a, ddVar.f132245a) && Intrinsics.d(this.f132246b, ddVar.f132246b);
    }

    public final int hashCode() {
        int hashCode = this.f132245a.hashCode() * 31;
        Boolean bool = this.f132246b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132245a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132246b, ")");
    }
}
