package jk2;

/* loaded from: classes4.dex */
public final class t1 extends uj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final int f76699a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final long f76700b;

    public t1(int i13) {
        this.f76700b = 1 + i13;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        uj2.v vVar2;
        s1 s1Var = new s1(vVar, this.f76699a, this.f76700b);
        vVar.b(s1Var);
        if (s1Var.f76692d) {
            return;
        }
        long j13 = s1Var.f76691c;
        while (true) {
            long j14 = s1Var.f76690b;
            vVar2 = s1Var.f76689a;
            if (j13 == j14 || s1Var.get() != 0) {
                break;
            }
            vVar2.c(Integer.valueOf((int) j13));
            j13++;
        }
        if (s1Var.get() == 0) {
            s1Var.lazySet(1);
            vVar2.a();
        }
    }
}
