package t8;

import d7.d0;
import q8.c0;
import q8.g0;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116674a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f116675b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f116676c;

    public a(int i13) {
        this.f116674a = i13;
        if (i13 == 1) {
            this.f116675b = new d0(4);
            this.f116676c = new g0(-1, -1, "image/heif");
        } else if (i13 != 2) {
            this.f116675b = new d0(4);
            this.f116676c = new g0(-1, -1, "image/avif");
        } else {
            this.f116675b = new d0(4);
            this.f116676c = new g0(-1, -1, "image/webp");
        }
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        int i13 = this.f116674a;
        g0 g0Var = this.f116676c;
        switch (i13) {
            case 0:
                g0Var.b(j13, j14);
                break;
            case 1:
                g0Var.b(j13, j14);
                break;
            default:
                g0Var.b(j13, j14);
                break;
        }
    }

    @Override // q8.s
    public final int d(t tVar, c0 c0Var) {
        int i13 = this.f116674a;
        g0 g0Var = this.f116676c;
        switch (i13) {
        }
        return g0Var.d(tVar, c0Var);
    }

    @Override // q8.s
    public final void f(u uVar) {
        int i13 = this.f116674a;
        g0 g0Var = this.f116676c;
        switch (i13) {
            case 0:
                g0Var.f(uVar);
                break;
            case 1:
                g0Var.f(uVar);
                break;
            default:
                g0Var.f(uVar);
                break;
        }
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        d0 d0Var = this.f116675b;
        switch (this.f116674a) {
            case 0:
                tVar.m(4);
                d0Var.H(4);
                tVar.s(d0Var.f53806a, 0, 4);
                if (d0Var.A() == 1718909296) {
                    d0Var.H(4);
                    tVar.s(d0Var.f53806a, 0, 4);
                    if (d0Var.A() == 1635150182) {
                        return true;
                    }
                }
                return false;
            case 1:
                tVar.m(4);
                d0Var.H(4);
                tVar.s(d0Var.f53806a, 0, 4);
                if (d0Var.A() == 1718909296) {
                    d0Var.H(4);
                    tVar.s(d0Var.f53806a, 0, 4);
                    if (d0Var.A() == 1751476579) {
                        return true;
                    }
                }
                return false;
            default:
                d0Var.H(4);
                tVar.s(d0Var.f53806a, 0, 4);
                if (d0Var.A() != 1380533830) {
                    return false;
                }
                tVar.m(4);
                d0Var.H(4);
                tVar.s(d0Var.f53806a, 0, 4);
                return d0Var.A() == 1464156752;
        }
    }
}
