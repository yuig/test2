package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t8 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133335a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f133336b;

    public t8(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133335a = __typename;
        this.f133336b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f133336b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return Intrinsics.d(this.f133335a, t8Var.f133335a) && Intrinsics.d(this.f133336b, t8Var.f133336b);
    }

    public final int hashCode() {
        int hashCode = this.f133335a.hashCode() * 31;
        Boolean bool = this.f133336b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f133335a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f133336b, ")");
    }
}
