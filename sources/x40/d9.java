package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d9 implements e9, z40.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f132234a;

    /* renamed from: b, reason: collision with root package name */
    public final c9 f132235b;

    public d9(String __typename, c9 c9Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132234a = __typename;
        this.f132235b = c9Var;
    }

    @Override // z40.l
    public final z40.k a() {
        return this.f132235b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return Intrinsics.d(this.f132234a, d9Var.f132234a) && Intrinsics.d(this.f132235b, d9Var.f132235b);
    }

    public final int hashCode() {
        int hashCode = this.f132234a.hashCode() * 31;
        c9 c9Var = this.f132235b;
        return hashCode + (c9Var == null ? 0 : c9Var.hashCode());
    }

    public final String toString() {
        return "UserUsersConnectionContainerUsers(__typename=" + this.f132234a + ", connection=" + this.f132235b + ")";
    }
}
