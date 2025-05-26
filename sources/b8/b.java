package b8;

import d7.c0;
import d7.d0;
import d7.n0;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22107a;

    /* renamed from: c, reason: collision with root package name */
    public k0 f22109c;

    /* renamed from: d, reason: collision with root package name */
    public int f22110d;

    /* renamed from: f, reason: collision with root package name */
    public long f22112f;

    /* renamed from: g, reason: collision with root package name */
    public long f22113g;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f22108b = new c0();

    /* renamed from: e, reason: collision with root package name */
    public long f22111e = -9223372036854775807L;

    public b(a8.k kVar) {
        this.f22107a = kVar;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22111e = j13;
        this.f22113g = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        bf.b.t(this.f22111e == -9223372036854775807L);
        this.f22111e = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 1);
        this.f22109c = D;
        D.b(this.f22107a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        int y13 = d0Var.y() & 3;
        int y14 = d0Var.y() & 255;
        long I2 = kh2.j.I2(this.f22113g, j13, this.f22111e, this.f22107a.f1380b);
        if (y13 != 0) {
            if (y13 == 1 || y13 == 2) {
                int i14 = this.f22110d;
                if (i14 > 0) {
                    k0 k0Var = this.f22109c;
                    int i15 = n0.f53866a;
                    k0Var.a(this.f22112f, 1, i14, 0, null);
                    this.f22110d = 0;
                }
            } else if (y13 != 3) {
                throw new IllegalArgumentException(String.valueOf(y13));
            }
            int a13 = d0Var.a();
            k0 k0Var2 = this.f22109c;
            k0Var2.getClass();
            k0Var2.d(a13, 0, d0Var);
            int i16 = this.f22110d + a13;
            this.f22110d = i16;
            this.f22112f = I2;
            if (z13 && y13 == 3) {
                k0 k0Var3 = this.f22109c;
                int i17 = n0.f53866a;
                k0Var3.a(I2, 1, i16, 0, null);
                this.f22110d = 0;
                return;
            }
            return;
        }
        int i18 = this.f22110d;
        if (i18 > 0) {
            k0 k0Var4 = this.f22109c;
            int i19 = n0.f53866a;
            k0Var4.a(this.f22112f, 1, i18, 0, null);
            this.f22110d = 0;
        }
        if (y14 == 1) {
            int a14 = d0Var.a();
            k0 k0Var5 = this.f22109c;
            k0Var5.getClass();
            k0Var5.d(a14, 0, d0Var);
            k0 k0Var6 = this.f22109c;
            int i23 = n0.f53866a;
            k0Var6.a(I2, 1, a14, 0, null);
            return;
        }
        byte[] bArr = d0Var.f53806a;
        c0 c0Var = this.f22108b;
        c0Var.getClass();
        c0Var.k(bArr.length, bArr);
        c0Var.p(2);
        for (int i24 = 0; i24 < y14; i24++) {
            q8.c i25 = q8.b.i(c0Var);
            k0 k0Var7 = this.f22109c;
            k0Var7.getClass();
            k0Var7.d(i25.f102891e, 0, d0Var);
            k0 k0Var8 = this.f22109c;
            int i26 = n0.f53866a;
            k0Var8.a(I2, 1, i25.f102891e, 0, null);
            I2 += (i25.f102892f / i25.f102889c) * 1000000;
            c0Var.p(i25.f102891e);
        }
    }
}
