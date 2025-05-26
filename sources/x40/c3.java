package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c3 implements d3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132093a;

    /* renamed from: b, reason: collision with root package name */
    public final b3 f132094b;

    public c3(String __typename, b3 b3Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132093a = __typename;
        this.f132094b = b3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return Intrinsics.d(this.f132093a, c3Var.f132093a) && Intrinsics.d(this.f132094b, c3Var.f132094b);
    }

    public final int hashCode() {
        int hashCode = this.f132093a.hashCode() * 31;
        b3 b3Var = this.f132094b;
        return hashCode + (b3Var == null ? 0 : b3Var.hashCode());
    }

    public final String toString() {
        return "UserUsersConnectionContainerUsers(__typename=" + this.f132093a + ", connection=" + this.f132094b + ")";
    }
}
