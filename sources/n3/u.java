package n3;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final s3.k0 f89136a;

    /* renamed from: b, reason: collision with root package name */
    public final d f89137b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f89138c = new h1.b(4);

    /* renamed from: d, reason: collision with root package name */
    public final s3.v f89139d = new s3.v();

    /* renamed from: e, reason: collision with root package name */
    public boolean f89140e;

    public u(s3.k0 k0Var) {
        this.f89136a = k0Var;
        this.f89137b = new d(k0Var.f110837y.f110805b);
    }

    public final int a(s sVar, d0 d0Var, boolean z13) {
        boolean z14;
        d dVar;
        s3.v vVar = this.f89139d;
        if (this.f89140e) {
            return f0.h.e(false, false);
        }
        boolean z15 = true;
        try {
            this.f89140e = true;
            e g13 = this.f89138c.g(sVar, d0Var);
            int m13 = g13.b().m();
            for (int i13 = 0; i13 < m13; i13++) {
                q qVar = (q) g13.b().n(i13);
                if (!qVar.f() && !qVar.i()) {
                }
                z14 = false;
                break;
            }
            z14 = true;
            int m14 = g13.b().m();
            int i14 = 0;
            while (true) {
                dVar = this.f89137b;
                if (i14 >= m14) {
                    break;
                }
                q qVar2 = (q) g13.b().n(i14);
                if (z14 || c0.d.s(qVar2)) {
                    this.f89136a.z(qVar2.e(), this.f89139d, g0.a(qVar2.k(), 1), true);
                    if (!vVar.isEmpty()) {
                        dVar.a(qVar2.d(), vVar, c0.d.s(qVar2));
                        vVar.clear();
                    }
                }
                i14++;
            }
            dVar.f89042b.c();
            boolean b13 = dVar.b(g13, z13);
            if (!g13.d()) {
                int m15 = g13.b().m();
                for (int i15 = 0; i15 < m15; i15++) {
                    q qVar3 = (q) g13.b().n(i15);
                    if (c0.d.x2(qVar3) && qVar3.m()) {
                        break;
                    }
                }
            }
            z15 = false;
            int e13 = f0.h.e(b13, z15);
            this.f89140e = false;
            return e13;
        } catch (Throwable th3) {
            this.f89140e = false;
            throw th3;
        }
    }

    public final void b() {
        if (this.f89140e) {
            return;
        }
        ((g1.p) this.f89138c.f66449b).a();
        d dVar = this.f89137b;
        k2.e eVar = dVar.f89042b.f89065a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar.f78182a;
            int i14 = 0;
            do {
                ((h) objArr[i14]).d();
                i14++;
            } while (i14 < i13);
        }
        dVar.f89042b.f89065a.h();
    }
}
