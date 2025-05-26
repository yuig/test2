package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kh implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132681a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132682b;

    public kh(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132681a = __typename;
        this.f132682b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132682b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return Intrinsics.d(this.f132681a, khVar.f132681a) && Intrinsics.d(this.f132682b, khVar.f132682b);
    }

    public final int hashCode() {
        int hashCode = this.f132681a.hashCode() * 31;
        Boolean bool = this.f132682b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132681a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132682b, ")");
    }
}
