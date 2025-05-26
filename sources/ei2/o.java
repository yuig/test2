package ei2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59026a;

    /* renamed from: b, reason: collision with root package name */
    public final oi2.b f59027b;

    public o(oi2.b bVar, boolean z13) {
        this.f59026a = z13;
        this.f59027b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f59026a == oVar.f59026a && Intrinsics.d(this.f59027b, oVar.f59027b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f59026a) * 31;
        oi2.b bVar = this.f59027b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "Parent(isValid=" + this.f59026a + ", spanReference=" + this.f59027b + ')';
    }
}
