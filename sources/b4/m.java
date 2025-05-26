package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f21613a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f21614b;

    public m(String str, n0 n0Var) {
        this.f21613a = str;
        this.f21614b = n0Var;
    }

    @Override // b4.n
    public final n0 a() {
        return this.f21614b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!Intrinsics.d(this.f21613a, mVar.f21613a)) {
            return false;
        }
        if (!Intrinsics.d(this.f21614b, mVar.f21614b)) {
            return false;
        }
        mVar.getClass();
        return Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f21613a.hashCode() * 31;
        n0 n0Var = this.f21614b;
        return (hashCode + (n0Var != null ? n0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("LinkAnnotation.Url(url="), this.f21613a, ')');
    }
}
