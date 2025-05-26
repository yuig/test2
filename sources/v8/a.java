package v8;

import a7.n0;
import a7.o0;
import a7.q;
import a8.t0;
import a8.v;
import androidx.media3.common.ParserException;
import d7.d0;
import d9.i;
import ig1.b;
import java.util.Arrays;
import jk.r;
import pk.c1;
import pk.d1;
import q8.c0;
import q8.e0;
import q8.g;
import q8.k0;
import q8.s;
import q8.t;
import q8.u;
import q8.w;
import q8.x;
import t5.e;

/* loaded from: classes3.dex */
public final class a implements s {

    /* renamed from: e, reason: collision with root package name */
    public u f124468e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f124469f;

    /* renamed from: h, reason: collision with root package name */
    public n0 f124471h;

    /* renamed from: i, reason: collision with root package name */
    public x f124472i;

    /* renamed from: j, reason: collision with root package name */
    public int f124473j;

    /* renamed from: k, reason: collision with root package name */
    public int f124474k;

    /* renamed from: l, reason: collision with root package name */
    public d1 f124475l;

    /* renamed from: m, reason: collision with root package name */
    public int f124476m;

    /* renamed from: n, reason: collision with root package name */
    public long f124477n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f124464a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final d0 f124465b = new d0(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124466c = false;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f124467d = new t0(1);

    /* renamed from: g, reason: collision with root package name */
    public int f124470g = 0;

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        if (j13 == 0) {
            this.f124470g = 0;
        } else {
            d1 d1Var = this.f124475l;
            if (d1Var != null) {
                d1Var.c(j14);
            }
        }
        this.f124477n = j14 != 0 ? -1L : 0L;
        this.f124476m = 0;
        this.f124465b.H(0);
    }

    @Override // q8.s
    public final int d(t tVar, c0 c0Var) {
        x xVar;
        e0 wVar;
        long j13;
        long j14;
        long j15;
        boolean z13;
        int i13 = this.f124470g;
        n0 n0Var = null;
        int i14 = 0;
        if (i13 == 0) {
            boolean z14 = !this.f124466c;
            tVar.g();
            long k13 = tVar.k();
            n0 x13 = new e(15).x(tVar, z14 ? null : i.f54023f);
            if (x13 != null && x13.f1152a.length != 0) {
                n0Var = x13;
            }
            tVar.p((int) (tVar.k() - k13));
            this.f124471h = n0Var;
            this.f124470g = 1;
            return 0;
        }
        byte[] bArr = this.f124464a;
        if (i13 == 1) {
            tVar.s(bArr, 0, bArr.length);
            tVar.g();
            this.f124470g = 2;
            return 0;
        }
        int i15 = 3;
        if (i13 == 2) {
            d0 d0Var = new d0(4);
            tVar.readFully(d0Var.f53806a, 0, 4);
            if (d0Var.A() != 1716281667) {
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            this.f124470g = 3;
            return 0;
        }
        if (i13 != 3) {
            long j16 = 0;
            if (i13 == 4) {
                tVar.g();
                d0 d0Var2 = new d0(2);
                tVar.s(d0Var2.f53806a, 0, 2);
                int E = d0Var2.E();
                if ((E >> 2) != 16382) {
                    tVar.g();
                    throw ParserException.a("First frame does not start with sync code.", null);
                }
                tVar.g();
                this.f124474k = E;
                u uVar = this.f124468e;
                int i16 = d7.n0.f53866a;
                long h10 = tVar.h();
                long length = tVar.getLength();
                this.f124472i.getClass();
                x xVar2 = this.f124472i;
                if (xVar2.f103007k != null) {
                    wVar = new w(xVar2, h10, 0);
                } else if (length == -1 || xVar2.f103006j <= 0) {
                    wVar = new w(xVar2.b());
                } else {
                    int i17 = this.f124474k;
                    v vVar = new v(xVar2, 3);
                    bn0.a aVar = new bn0.a(xVar2, i17);
                    long b13 = xVar2.b();
                    int i18 = xVar2.f102999c;
                    int i19 = xVar2.f103000d;
                    if (i19 > 0) {
                        j13 = (i19 + i18) / 2;
                        j14 = 1;
                    } else {
                        int i23 = xVar2.f102998b;
                        int i24 = xVar2.f102997a;
                        j13 = ((((i24 != i23 || i24 <= 0) ? 4096L : i24) * xVar2.f103003g) * xVar2.f103004h) / 8;
                        j14 = 64;
                    }
                    d1 d1Var = new d1(vVar, aVar, b13, xVar2.f103006j, h10, length, j13 + j14, Math.max(6, i18));
                    this.f124475l = d1Var;
                    wVar = (g) d1Var.f102947b;
                }
                uVar.j(wVar);
                this.f124470g = 5;
                return 0;
            }
            if (i13 != 5) {
                throw new IllegalStateException();
            }
            this.f124469f.getClass();
            this.f124472i.getClass();
            d1 d1Var2 = this.f124475l;
            if (d1Var2 != null && d1Var2.f102949d != null) {
                return d1Var2.a(tVar, c0Var);
            }
            if (this.f124477n == -1) {
                x xVar3 = this.f124472i;
                tVar.g();
                tVar.m(1);
                byte[] bArr2 = new byte[1];
                tVar.s(bArr2, 0, 1);
                boolean z15 = (bArr2[0] & 1) == 1;
                tVar.m(2);
                r10 = z15 ? 7 : 6;
                d0 d0Var3 = new d0(r10);
                byte[] bArr3 = d0Var3.f53806a;
                int i25 = 0;
                while (i25 < r10) {
                    int o13 = tVar.o(bArr3, i25, r10 - i25);
                    if (o13 == -1) {
                        break;
                    }
                    i25 += o13;
                }
                d0Var3.J(i25);
                tVar.g();
                try {
                    long F = d0Var3.F();
                    if (!z15) {
                        F *= xVar3.f102998b;
                    }
                    j16 = F;
                } catch (NumberFormatException unused) {
                    r5 = false;
                }
                if (!r5) {
                    throw ParserException.a(null, null);
                }
                this.f124477n = j16;
                return 0;
            }
            d0 d0Var4 = this.f124465b;
            int i26 = d0Var4.f53808c;
            if (i26 < 32768) {
                int read = tVar.read(d0Var4.f53806a, i26, 32768 - i26);
                r5 = read == -1;
                if (!r5) {
                    d0Var4.J(i26 + read);
                } else if (d0Var4.a() == 0) {
                    long j17 = this.f124477n * 1000000;
                    x xVar4 = this.f124472i;
                    int i27 = d7.n0.f53866a;
                    this.f124469f.a(j17 / xVar4.f103001e, 1, this.f124476m, 0, null);
                    return -1;
                }
            } else {
                r5 = false;
            }
            int i28 = d0Var4.f53807b;
            int i29 = this.f124476m;
            int i33 = this.f124473j;
            if (i29 < i33) {
                d0Var4.L(Math.min(i33 - i29, d0Var4.a()));
            }
            this.f124472i.getClass();
            int i34 = d0Var4.f53807b;
            while (true) {
                int i35 = d0Var4.f53808c - 16;
                t0 t0Var = this.f124467d;
                if (i34 <= i35) {
                    d0Var4.K(i34);
                    if (ph.a.t(d0Var4, this.f124472i, this.f124474k, t0Var)) {
                        d0Var4.K(i34);
                        j15 = t0Var.f1462a;
                        break;
                    }
                    i34++;
                } else {
                    if (r5) {
                        while (true) {
                            int i36 = d0Var4.f53808c;
                            if (i34 > i36 - this.f124473j) {
                                d0Var4.K(i36);
                                break;
                            }
                            d0Var4.K(i34);
                            try {
                                z13 = ph.a.t(d0Var4, this.f124472i, this.f124474k, t0Var);
                            } catch (IndexOutOfBoundsException unused2) {
                                z13 = false;
                            }
                            if (d0Var4.f53807b <= d0Var4.f53808c && z13) {
                                d0Var4.K(i34);
                                j15 = t0Var.f1462a;
                                break;
                            }
                            i34++;
                        }
                    } else {
                        d0Var4.K(i34);
                    }
                    j15 = -1;
                }
            }
            int i37 = d0Var4.f53807b - i28;
            d0Var4.K(i28);
            this.f124469f.d(i37, 0, d0Var4);
            int i38 = this.f124476m + i37;
            this.f124476m = i38;
            if (j15 != -1) {
                long j18 = this.f124477n * 1000000;
                x xVar5 = this.f124472i;
                int i39 = d7.n0.f53866a;
                this.f124469f.a(j18 / xVar5.f103001e, 1, i38, 0, null);
                this.f124476m = 0;
                this.f124477n = j15;
            }
            int length2 = d0Var4.f53806a.length - d0Var4.f53808c;
            if (d0Var4.a() >= 16 || length2 >= 16) {
                return 0;
            }
            int a13 = d0Var4.a();
            byte[] bArr4 = d0Var4.f53806a;
            System.arraycopy(bArr4, d0Var4.f53807b, bArr4, 0, a13);
            d0Var4.K(0);
            d0Var4.J(a13);
            return 0;
        }
        x xVar6 = this.f124472i;
        while (true) {
            tVar.g();
            d7.c0 c0Var2 = new d7.c0(new byte[4], i14, i14);
            tVar.s(c0Var2.f53793b, i14, 4);
            boolean f13 = c0Var2.f();
            int g13 = c0Var2.g(r10);
            int g14 = c0Var2.g(24) + 4;
            if (g13 == 0) {
                byte[] bArr5 = new byte[38];
                tVar.readFully(bArr5, i14, 38);
                xVar6 = new x(bArr5, 4);
            } else {
                if (xVar6 == null) {
                    throw new IllegalArgumentException();
                }
                if (g13 == i15) {
                    d0 d0Var5 = new d0(g14);
                    tVar.readFully(d0Var5.f53806a, i14, g14);
                    xVar = new x(xVar6.f102997a, xVar6.f102998b, xVar6.f102999c, xVar6.f103000d, xVar6.f103001e, xVar6.f103003g, xVar6.f103004h, xVar6.f103006j, r.t(d0Var5), xVar6.f103008l);
                } else {
                    n0 n0Var2 = xVar6.f103008l;
                    if (g13 == 4) {
                        d0 d0Var6 = new d0(g14);
                        tVar.readFully(d0Var6.f53806a, 0, g14);
                        d0Var6.L(4);
                        n0 S0 = b.S0(Arrays.asList((String[]) b.V0(d0Var6, false, false).f23561d));
                        if (n0Var2 != null) {
                            S0 = n0Var2.b(S0);
                        }
                        xVar = new x(xVar6.f102997a, xVar6.f102998b, xVar6.f102999c, xVar6.f103000d, xVar6.f103001e, xVar6.f103003g, xVar6.f103004h, xVar6.f103006j, xVar6.f103007k, S0);
                    } else if (g13 == 6) {
                        d0 d0Var7 = new d0(g14);
                        tVar.readFully(d0Var7.f53806a, 0, g14);
                        d0Var7.L(4);
                        n0 n0Var3 = new n0(c1.v(b9.a.d(d0Var7)));
                        if (n0Var2 != null) {
                            n0Var3 = n0Var2.b(n0Var3);
                        }
                        xVar = new x(xVar6.f102997a, xVar6.f102998b, xVar6.f102999c, xVar6.f103000d, xVar6.f103001e, xVar6.f103003g, xVar6.f103004h, xVar6.f103006j, xVar6.f103007k, n0Var3);
                    } else {
                        tVar.p(g14);
                    }
                }
                xVar6 = xVar;
            }
            int i43 = d7.n0.f53866a;
            this.f124472i = xVar6;
            if (f13) {
                this.f124473j = Math.max(xVar6.f102999c, 6);
                androidx.media3.common.b c13 = this.f124472i.c(bArr, this.f124471h);
                k0 k0Var = this.f124469f;
                q a14 = c13.a();
                a14.f1180m = o0.r("audio/flac");
                k0Var.b(new androidx.media3.common.b(a14));
                k0 k0Var2 = this.f124469f;
                this.f124472i.b();
                k0Var2.getClass();
                this.f124470g = 4;
                return 0;
            }
            i14 = 0;
            i15 = 3;
            r10 = 7;
        }
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f124468e = uVar;
        this.f124469f = uVar.D(0, 1);
        uVar.A();
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        n0 x13 = new e(15).x(tVar, i.f54023f);
        if (x13 != null) {
            int length = x13.f1152a.length;
        }
        d0 d0Var = new d0(4);
        tVar.s(d0Var.f53806a, 0, 4);
        return d0Var.A() == 1716281667;
    }
}
