package uc0;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121859b;

    public s0(int i13, int i14) {
        this.f121858a = i13;
        this.f121859b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f121858a == s0Var.f121858a && this.f121859b == s0Var.f121859b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121859b) + (Integer.hashCode(this.f121858a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GestaltDisplayState(vectorImage=");
        sb3.append(this.f121858a);
        sb3.append(", title=");
        return a.a.n(sb3, this.f121859b, ")");
    }
}
