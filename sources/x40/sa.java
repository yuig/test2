package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sa implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133261a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133262b;

    public sa(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133261a = __typename;
        this.f133262b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133262b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return Intrinsics.d(this.f133261a, saVar.f133261a) && Intrinsics.d(this.f133262b, saVar.f133262b);
    }

    public final int hashCode() {
        int hashCode = this.f133261a.hashCode() * 31;
        Boolean bool = this.f133262b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133261a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133262b, ")");
    }
}
