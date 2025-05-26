package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96497a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f96498b;

    public g(u50.k0 label, rm1.q qVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f96497a = label;
        this.f96498b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f96497a, gVar.f96497a) && this.f96498b == gVar.f96498b;
    }

    public final int hashCode() {
        int hashCode = this.f96497a.hashCode() * 31;
        rm1.q qVar = this.f96498b;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "Badge(label=" + this.f96497a + ", icon=" + this.f96498b + ")";
    }
}
