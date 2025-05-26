package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.b0 f124963a;

    /* renamed from: b, reason: collision with root package name */
    public final r72.i1 f124964b;

    public u0(sa0.b0 source, r72.i1 i1Var) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f124963a = source;
        this.f124964b = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f124963a, u0Var.f124963a) && Intrinsics.d(this.f124964b, u0Var.f124964b);
    }

    public final int hashCode() {
        int hashCode = this.f124963a.hashCode() * 31;
        r72.i1 i1Var = this.f124964b;
        return hashCode + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        return "Init(source=" + this.f124963a + ", mask=" + this.f124964b + ")";
    }
}
