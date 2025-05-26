package h8;

import g7.y;
import g8.a1;
import lb.l0;
import q8.k0;

/* loaded from: classes3.dex */
public final class r extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f68074o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.media3.common.b f68075p;

    /* renamed from: q, reason: collision with root package name */
    public long f68076q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f68077r;

    public r(g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, int i13, Object obj, long j13, long j14, long j15, int i14, androidx.media3.common.b bVar2) {
        super(fVar, iVar, bVar, i13, obj, j13, j14, -9223372036854775807L, -9223372036854775807L, j15);
        this.f68074o = i14;
        this.f68075p = bVar2;
    }

    @Override // h8.p
    public final boolean b() {
        return this.f68077r;
    }

    @Override // l8.u
    public final void h() {
        y yVar = this.f68031i;
        c cVar = this.f68000m;
        bf.b.w(cVar);
        for (a1 a1Var : cVar.f68006b) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.w();
            }
        }
        k0 a13 = cVar.a(this.f68074o);
        a13.b(this.f68075p);
        try {
            long d2 = yVar.d(this.f68024b.d(this.f68076q));
            if (d2 != -1) {
                d2 += this.f68076q;
            }
            q8.o oVar = new q8.o(this.f68031i, this.f68076q, d2);
            for (int i13 = 0; i13 != -1; i13 = a13.e(oVar, Integer.MAX_VALUE, true)) {
                this.f68076q += i13;
            }
            a13.a(this.f68029g, 1, (int) this.f68076q, 0, null);
            l0.H(yVar);
            this.f68077r = true;
        } catch (Throwable th3) {
            l0.H(yVar);
            throw th3;
        }
    }

    @Override // l8.u
    public final void o() {
    }
}
