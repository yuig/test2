package el;

import il.o4;
import il.o5;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u extends uk.q {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f59536a;

    public u(v0 v0Var) {
        this.f59536a = v0Var;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f59536a.f59546b.E() != o5.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        v0 v0Var = ((u) obj).f59536a;
        v0 v0Var2 = this.f59536a;
        if (!v0Var2.f59546b.E().equals(v0Var.f59546b.E())) {
            return false;
        }
        String F = v0Var2.f59546b.F();
        o4 o4Var = v0Var.f59546b;
        return F.equals(o4Var.F()) && v0Var2.f59546b.G().equals(o4Var.G());
    }

    public final int hashCode() {
        v0 v0Var = this.f59536a;
        return Objects.hash(v0Var.f59546b, v0Var.f59545a);
    }

    public final String toString() {
        v0 v0Var = this.f59536a;
        String F = v0Var.f59546b.F();
        int i13 = t.f59535a[v0Var.f59546b.E().ordinal()];
        return a.a.m("(typeUrl=", F, ", outputPrefixType=", i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
