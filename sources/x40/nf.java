package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nf implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132897a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132898b;

    public nf(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132897a = __typename;
        this.f132898b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132898b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf)) {
            return false;
        }
        nf nfVar = (nf) obj;
        return Intrinsics.d(this.f132897a, nfVar.f132897a) && Intrinsics.d(this.f132898b, nfVar.f132898b);
    }

    public final int hashCode() {
        int hashCode = this.f132897a.hashCode() * 31;
        Boolean bool = this.f132898b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132897a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132898b, ")");
    }
}
