package h4;

import a.cb;

/* loaded from: classes3.dex */
public final class c0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f67527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67528b;

    public c0(int i13, int i14) {
        this.f67527a = i13;
        this.f67528b = i14;
    }

    @Override // h4.j
    public final void a(l lVar) {
        if (lVar.f67589d != -1) {
            lVar.f67589d = -1;
            lVar.f67590e = -1;
        }
        z zVar = lVar.f67586a;
        int g13 = ql2.s.g(this.f67527a, 0, zVar.a());
        int g14 = ql2.s.g(this.f67528b, 0, zVar.a());
        if (g13 != g14) {
            if (g13 < g14) {
                lVar.e(g13, g14);
            } else {
                lVar.e(g14, g13);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f67527a == c0Var.f67527a && this.f67528b == c0Var.f67528b;
    }

    public final int hashCode() {
        return (this.f67527a * 31) + this.f67528b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetComposingRegionCommand(start=");
        sb3.append(this.f67527a);
        sb3.append(", end=");
        return cb.l(sb3, this.f67528b, ')');
    }
}
