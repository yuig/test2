package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v4 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133537a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133538b;

    public v4(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133537a = __typename;
        this.f133538b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return Intrinsics.d(this.f133537a, v4Var.f133537a) && Intrinsics.d(this.f133538b, v4Var.f133538b);
    }

    public final int hashCode() {
        int hashCode = this.f133537a.hashCode() * 31;
        Boolean bool = this.f133538b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133537a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133538b, ")");
    }
}
