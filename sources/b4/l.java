package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f21601a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f21602b;

    public l(String str, n0 n0Var) {
        this.f21601a = str;
        this.f21602b = n0Var;
    }

    @Override // b4.n
    public final n0 a() {
        return this.f21602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Intrinsics.d(this.f21601a, lVar.f21601a)) {
            return false;
        }
        if (!Intrinsics.d(this.f21602b, lVar.f21602b)) {
            return false;
        }
        lVar.getClass();
        return Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f21601a.hashCode() * 31;
        n0 n0Var = this.f21602b;
        return (hashCode + (n0Var != null ? n0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f21601a, ')');
    }
}
