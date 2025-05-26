package b2;

import a.cb;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f21175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21177c;

    /* renamed from: d, reason: collision with root package name */
    public final b4.m0 f21178d;

    public m(int i13, int i14, int i15, b4.m0 m0Var) {
        this.f21175a = i13;
        this.f21176b = i14;
        this.f21177c = i15;
        this.f21178d = m0Var;
    }

    public final n a(int i13) {
        return new n(l3.c.L(this.f21178d, i13), i13, 1L);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionInfo(id=1, range=(");
        int i13 = this.f21175a;
        sb3.append(i13);
        sb3.append('-');
        b4.m0 m0Var = this.f21178d;
        sb3.append(l3.c.L(m0Var, i13));
        sb3.append(',');
        int i14 = this.f21176b;
        sb3.append(i14);
        sb3.append('-');
        sb3.append(l3.c.L(m0Var, i14));
        sb3.append("), prevOffset=");
        return cb.l(sb3, this.f21177c, ')');
    }
}
