package ua2;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121641b;

    public z0(int i13, int i14) {
        this.f121640a = i13;
        this.f121641b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f121640a == z0Var.f121640a && this.f121641b == z0Var.f121641b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121641b) + (Integer.hashCode(this.f121640a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MeasureResult(width=");
        sb3.append(this.f121640a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f121641b, ")");
    }
}
