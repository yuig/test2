package v9;

import a7.o0;
import q8.k0;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d7.c0 f124521a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f124523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124524d;

    /* renamed from: e, reason: collision with root package name */
    public final String f124525e;

    /* renamed from: f, reason: collision with root package name */
    public String f124526f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f124527g;

    /* renamed from: h, reason: collision with root package name */
    public int f124528h;

    /* renamed from: i, reason: collision with root package name */
    public int f124529i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124530j;

    /* renamed from: k, reason: collision with root package name */
    public long f124531k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.common.b f124532l;

    /* renamed from: m, reason: collision with root package name */
    public int f124533m;

    /* renamed from: n, reason: collision with root package name */
    public long f124534n;

    public d(String str, int i13, String str2) {
        d7.c0 c0Var = new d7.c0(new byte[16], 0, 0);
        this.f124521a = c0Var;
        this.f124522b = new d7.d0(c0Var.f53793b);
        this.f124528h = 0;
        this.f124529i = 0;
        this.f124530j = false;
        this.f124534n = -9223372036854775807L;
        this.f124523c = str;
        this.f124524d = i13;
        this.f124525e = str2;
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        bf.b.w(this.f124527g);
        while (d0Var.a() > 0) {
            int i13 = this.f124528h;
            d7.d0 d0Var2 = this.f124522b;
            if (i13 == 0) {
                while (d0Var.a() > 0) {
                    if (this.f124530j) {
                        int y13 = d0Var.y();
                        this.f124530j = y13 == 172;
                        if (y13 == 64 || y13 == 65) {
                            boolean z13 = y13 == 65;
                            this.f124528h = 1;
                            byte[] bArr = d0Var2.f53806a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z13 ? 65 : 64);
                            this.f124529i = 2;
                        }
                    } else {
                        this.f124530j = d0Var.y() == 172;
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = d0Var2.f53806a;
                int min = Math.min(d0Var.a(), 16 - this.f124529i);
                d0Var.i(bArr2, this.f124529i, min);
                int i14 = this.f124529i + min;
                this.f124529i = i14;
                if (i14 == 16) {
                    d7.c0 c0Var = this.f124521a;
                    c0Var.m(0);
                    q8.d b13 = q8.e.b(c0Var);
                    androidx.media3.common.b bVar = this.f124532l;
                    int i15 = b13.f102895a;
                    if (bVar == null || 2 != bVar.E || i15 != bVar.F || !"audio/ac4".equals(bVar.f18765o)) {
                        a7.q qVar = new a7.q();
                        qVar.f1168a = this.f124526f;
                        qVar.f1180m = o0.r(this.f124525e);
                        qVar.f1181n = o0.r("audio/ac4");
                        qVar.D = 2;
                        qVar.E = i15;
                        qVar.f1171d = this.f124523c;
                        qVar.f1173f = this.f124524d;
                        androidx.media3.common.b bVar2 = new androidx.media3.common.b(qVar);
                        this.f124532l = bVar2;
                        this.f124527g.b(bVar2);
                    }
                    this.f124533m = b13.f102896b;
                    this.f124531k = (b13.f102897c * 1000000) / this.f124532l.F;
                    d0Var2.K(0);
                    this.f124527g.d(16, 0, d0Var2);
                    this.f124528h = 2;
                }
            } else if (i13 == 2) {
                int min2 = Math.min(d0Var.a(), this.f124533m - this.f124529i);
                this.f124527g.d(min2, 0, d0Var);
                int i16 = this.f124529i + min2;
                this.f124529i = i16;
                if (i16 == this.f124533m) {
                    bf.b.t(this.f124534n != -9223372036854775807L);
                    this.f124527g.a(this.f124534n, 1, this.f124533m, 0, null);
                    this.f124534n += this.f124531k;
                    this.f124528h = 0;
                }
            }
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124528h = 0;
        this.f124529i = 0;
        this.f124530j = false;
        this.f124534n = -9223372036854775807L;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124526f = h0Var.f124635e;
        h0Var.b();
        this.f124527g = uVar.D(h0Var.f124634d, 1);
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124534n = j13;
    }
}
