package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sc implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133265a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133266b;

    public sc(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133265a = __typename;
        this.f133266b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133266b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return Intrinsics.d(this.f133265a, scVar.f133265a) && Intrinsics.d(this.f133266b, scVar.f133266b);
    }

    public final int hashCode() {
        int hashCode = this.f133265a.hashCode() * 31;
        Boolean bool = this.f133266b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133265a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133266b, ")");
    }
}
