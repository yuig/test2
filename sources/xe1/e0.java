package xe1;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f134703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134704b;

    public e0(int i13, int i14) {
        this.f134703a = i13;
        this.f134704b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f134703a == e0Var.f134703a && this.f134704b == e0Var.f134704b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134704b) + (Integer.hashCode(this.f134703a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerticalPadding(topPadding=");
        sb3.append(this.f134703a);
        sb3.append(", bottomPadding=");
        return a.a.n(sb3, this.f134704b, ")");
    }
}
