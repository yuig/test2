package h8;

import a7.o0;
import d7.d0;
import g7.y;
import g8.a1;
import lb.l0;
import q8.k0;

/* loaded from: classes.dex */
public final class n extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f68062o;

    /* renamed from: p, reason: collision with root package name */
    public final long f68063p;

    /* renamed from: q, reason: collision with root package name */
    public final i f68064q;

    /* renamed from: r, reason: collision with root package name */
    public long f68065r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f68066s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68067t;

    public n(g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, int i13, Object obj, long j13, long j14, long j15, long j16, long j17, int i14, long j18, i iVar2) {
        super(fVar, iVar, bVar, i13, obj, j13, j14, j15, j16, j17);
        this.f68062o = i14;
        this.f68063p = j18;
        this.f68064q = iVar2;
    }

    @Override // h8.p
    public final long a() {
        return this.f68072j + this.f68062o;
    }

    @Override // h8.p
    public final boolean b() {
        return this.f68067t;
    }

    public final void d(c cVar) {
        androidx.media3.common.b bVar = this.f68026d;
        if (o0.o(bVar.f18764n)) {
            int i13 = bVar.L;
            int i14 = bVar.M;
            if ((i13 <= 1 && i14 <= 1) || i13 == -1 || i14 == -1) {
                return;
            }
            k0 a13 = cVar.a(4);
            int i15 = i13 * i14;
            long j13 = (this.f68030h - this.f68029g) / i15;
            for (int i16 = 1; i16 < i15; i16++) {
                a13.d(0, 0, new d0());
                a13.a(i16 * j13, 0, 0, 0, null);
            }
        }
    }

    @Override // l8.u
    public final void h() {
        c cVar = this.f68000m;
        bf.b.w(cVar);
        if (this.f68065r == 0) {
            long j13 = this.f68063p;
            for (a1 a1Var : cVar.f68006b) {
                if (a1Var.F != j13) {
                    a1Var.F = j13;
                    a1Var.w();
                }
            }
            i iVar = this.f68064q;
            long j14 = this.f67998k;
            long j15 = j14 == -9223372036854775807L ? -9223372036854775807L : j14 - this.f68063p;
            long j16 = this.f67999l;
            ((e) iVar).b(cVar, j15, j16 == -9223372036854775807L ? -9223372036854775807L : j16 - this.f68063p);
        }
        try {
            g7.i d2 = this.f68024b.d(this.f68065r);
            y yVar = this.f68031i;
            q8.o oVar = new q8.o(yVar, d2.f63791f, yVar.d(d2));
            while (!this.f68066s && ((e) this.f68064q).c(oVar)) {
                try {
                } finally {
                    this.f68065r = oVar.f102981d - this.f68024b.f63791f;
                }
            }
            d(cVar);
            this.f68065r = oVar.f102981d - this.f68024b.f63791f;
            l0.H(this.f68031i);
            this.f68067t = !this.f68066s;
        } catch (Throwable th3) {
            l0.H(this.f68031i);
            throw th3;
        }
    }

    @Override // l8.u
    public final void o() {
        this.f68066s = true;
    }
}
