package b8;

import d7.c0;
import d7.d0;
import d7.n0;
import java.math.RoundingMode;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22098a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f22099b = new c0();

    /* renamed from: c, reason: collision with root package name */
    public final int f22100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22101d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22102e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22103f;

    /* renamed from: g, reason: collision with root package name */
    public long f22104g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f22105h;

    /* renamed from: i, reason: collision with root package name */
    public long f22106i;

    public a(a8.k kVar) {
        this.f22098a = kVar;
        this.f22100c = kVar.f1380b;
        String str = (String) kVar.f1382d.get("mode");
        str.getClass();
        if (com.bumptech.glide.c.z(str, "AAC-hbr")) {
            this.f22101d = 13;
            this.f22102e = 3;
        } else {
            if (!com.bumptech.glide.c.z(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f22101d = 6;
            this.f22102e = 2;
        }
        this.f22103f = this.f22102e + this.f22101d;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22104g = j13;
        this.f22106i = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        this.f22104g = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 1);
        this.f22105h = D;
        D.b(this.f22098a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        this.f22105h.getClass();
        short v13 = d0Var.v();
        int i14 = v13 / this.f22103f;
        long I2 = kh2.j.I2(this.f22106i, j13, this.f22104g, this.f22100c);
        c0 c0Var = this.f22099b;
        c0Var.l(d0Var);
        int i15 = this.f22102e;
        int i16 = this.f22101d;
        if (i14 == 1) {
            int g13 = c0Var.g(i16);
            c0Var.o(i15);
            this.f22105h.d(d0Var.a(), 0, d0Var);
            if (z13) {
                this.f22105h.a(I2, 1, g13, 0, null);
                return;
            }
            return;
        }
        d0Var.L((v13 + 7) / 8);
        for (int i17 = 0; i17 < i14; i17++) {
            int g14 = c0Var.g(i16);
            c0Var.o(i15);
            this.f22105h.d(g14, 0, d0Var);
            this.f22105h.a(I2, 1, g14, 0, null);
            I2 += n0.g0(i14, 1000000L, this.f22100c, RoundingMode.DOWN);
        }
    }
}
