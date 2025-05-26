package h4;

import a.cb;

/* loaded from: classes3.dex */
public final class e0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f67539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67540b;

    public e0(int i13, int i14) {
        this.f67539a = i13;
        this.f67540b = i14;
    }

    @Override // h4.j
    public final void a(l lVar) {
        int g13 = ql2.s.g(this.f67539a, 0, lVar.f67586a.a());
        int g14 = ql2.s.g(this.f67540b, 0, lVar.f67586a.a());
        if (g13 < g14) {
            lVar.f(g13, g14);
        } else {
            lVar.f(g14, g13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f67539a == e0Var.f67539a && this.f67540b == e0Var.f67540b;
    }

    public final int hashCode() {
        return (this.f67539a * 31) + this.f67540b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetSelectionCommand(start=");
        sb3.append(this.f67539a);
        sb3.append(", end=");
        return cb.l(sb3, this.f67540b, ')');
    }
}
