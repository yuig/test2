package ek1;

/* loaded from: classes2.dex */
public final class b0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f59214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59215b;

    public b0(int i13, int i14) {
        this.f59214a = i13;
        this.f59215b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f59214a == b0Var.f59214a && this.f59215b == b0Var.f59215b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59215b) + (Integer.hashCode(this.f59214a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnPgcCellSizeChanged(measuredWidth=");
        sb3.append(this.f59214a);
        sb3.append(", measuredHeight=");
        return a.a.n(sb3, this.f59215b, ")");
    }
}
