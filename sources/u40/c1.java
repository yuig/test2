package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120313a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f120314b;

    public c1(String str, b1 b1Var) {
        this.f120313a = str;
        this.f120314b = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.f120313a, c1Var.f120313a) && Intrinsics.d(this.f120314b, c1Var.f120314b);
    }

    public final int hashCode() {
        String str = this.f120313a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        b1 b1Var = this.f120314b;
        return hashCode + (b1Var != null ? b1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Edge(cursor=" + this.f120313a + ", node=" + this.f120314b + ")";
    }
}
