package k9;

import androidx.media3.common.ParserException;
import d7.d0;
import d7.n0;
import q8.s;
import q8.t;
import q8.u;
import x4.e0;

/* loaded from: classes3.dex */
public final class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public u f78678a;

    /* renamed from: b, reason: collision with root package name */
    public i f78679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f78680c;

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        i iVar = this.f78679b;
        if (iVar != null) {
            e0 e0Var = iVar.f78691a;
            f fVar = (f) e0Var.f131741d;
            fVar.f78681a = 0;
            fVar.f78682b = 0L;
            fVar.f78683c = 0;
            fVar.f78684d = 0;
            fVar.f78685e = 0;
            ((d0) e0Var.f131742e).H(0);
            e0Var.f131738a = -1;
            e0Var.f131740c = false;
            if (j13 == 0) {
                iVar.d(!iVar.f78702l);
                return;
            }
            if (iVar.f78698h != 0) {
                long j15 = (iVar.f78699i * j14) / 1000000;
                iVar.f78695e = j15;
                g gVar = iVar.f78694d;
                int i13 = n0.f53866a;
                gVar.R(j15);
                iVar.f78698h = 2;
            }
        }
    }

    public final boolean c(t tVar) {
        f fVar = new f();
        if (fVar.a(tVar, true) && (fVar.f78681a & 2) == 2) {
            int min = Math.min(fVar.f78685e, 8);
            d0 d0Var = new d0(min);
            tVar.s(d0Var.f53806a, 0, min);
            d0Var.K(0);
            if (d0Var.a() >= 5 && d0Var.y() == 127 && d0Var.A() == 1179402563) {
                this.f78679b = new d();
            } else {
                d0Var.K(0);
                try {
                    if (ig1.b.p1(1, d0Var, true)) {
                        this.f78679b = new k();
                    }
                } catch (ParserException unused) {
                }
                d0Var.K(0);
                if (h.e(d0Var, h.f78688o)) {
                    this.f78679b = new h();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r21, q8.c0 r22) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f78678a = uVar;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        try {
            return c(tVar);
        } catch (ParserException unused) {
            return false;
        }
    }
}
