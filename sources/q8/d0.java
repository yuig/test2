package q8;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f102898a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f102899b;

    public d0(f0 f0Var) {
        this.f102898a = f0Var;
        this.f102899b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f102898a.equals(d0Var.f102898a) && this.f102899b.equals(d0Var.f102899b);
    }

    public final int hashCode() {
        return this.f102899b.hashCode() + (this.f102898a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("[");
        f0 f0Var = this.f102898a;
        sb3.append(f0Var);
        f0 f0Var2 = this.f102899b;
        if (f0Var.equals(f0Var2)) {
            str = "";
        } else {
            str = ", " + f0Var2;
        }
        return a.a.p(sb3, str, "]");
    }

    public d0(f0 f0Var, f0 f0Var2) {
        this.f102898a = f0Var;
        this.f102899b = f0Var2;
    }
}
