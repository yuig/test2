package pn2;

/* loaded from: classes2.dex */
public abstract class h1 implements g1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return b() == g1Var.b() && c() == g1Var.c() && getType().equals(g1Var.getType());
    }

    public final int hashCode() {
        int hashCode = c().hashCode();
        if (t1.p(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (b()) {
            return "*";
        }
        if (c() == w1.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
