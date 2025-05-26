package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j2 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132584a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132585b;

    public j2(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132584a = __typename;
        this.f132585b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132585b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.d(this.f132584a, j2Var.f132584a) && Intrinsics.d(this.f132585b, j2Var.f132585b);
    }

    public final int hashCode() {
        int hashCode = this.f132584a.hashCode() * 31;
        Boolean bool = this.f132585b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132584a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132585b, ")");
    }
}
