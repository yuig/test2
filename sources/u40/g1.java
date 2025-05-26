package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f120328a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f120329b;

    public g1(Integer num, w0 w0Var) {
        this.f120328a = num;
        this.f120329b = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f120328a, g1Var.f120328a) && Intrinsics.d(this.f120329b, g1Var.f120329b);
    }

    public final int hashCode() {
        Integer num = this.f120328a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        w0 w0Var = this.f120329b;
        return hashCode + (w0Var != null ? w0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(followerCount=" + this.f120328a + ", followers=" + this.f120329b + ")";
    }
}
