package u8;

import q8.c0;
import q8.g0;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120909a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f120910b;

    public a(int i13) {
        this.f120909a = i13;
        if (i13 != 1) {
            this.f120910b = new g0(16973, 2, "image/bmp");
        } else {
            this.f120910b = new g0(35152, 2, "image/png");
        }
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        int i13 = this.f120909a;
        g0 g0Var = this.f120910b;
        switch (i13) {
            case 0:
                g0Var.b(j13, j14);
                break;
            default:
                g0Var.b(j13, j14);
                break;
        }
    }

    @Override // q8.s
    public final int d(t tVar, c0 c0Var) {
        int i13 = this.f120909a;
        g0 g0Var = this.f120910b;
        switch (i13) {
        }
        return g0Var.d(tVar, c0Var);
    }

    @Override // q8.s
    public final void f(u uVar) {
        int i13 = this.f120909a;
        g0 g0Var = this.f120910b;
        switch (i13) {
            case 0:
                g0Var.f(uVar);
                break;
            default:
                g0Var.f(uVar);
                break;
        }
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        int i13 = this.f120909a;
        g0 g0Var = this.f120910b;
        switch (i13) {
        }
        return g0Var.i(tVar);
    }
}
