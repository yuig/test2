package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z4 implements a5, z40.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f133803a;

    /* renamed from: b, reason: collision with root package name */
    public final y4 f133804b;

    public z4(String __typename, y4 y4Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133803a = __typename;
        this.f133804b = y4Var;
    }

    @Override // z40.l
    public final z40.k a() {
        return this.f133804b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return Intrinsics.d(this.f133803a, z4Var.f133803a) && Intrinsics.d(this.f133804b, z4Var.f133804b);
    }

    public final int hashCode() {
        int hashCode = this.f133803a.hashCode() * 31;
        y4 y4Var = this.f133804b;
        return hashCode + (y4Var == null ? 0 : y4Var.hashCode());
    }

    public final String toString() {
        return "UserUsersConnectionContainerUsers(__typename=" + this.f133803a + ", connection=" + this.f133804b + ")";
    }
}
