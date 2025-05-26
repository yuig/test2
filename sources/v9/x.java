package v9;

import a.cb;
import d7.k0;

/* loaded from: classes3.dex */
public final class x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f124826a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.c0 f124827b = new d7.c0(new byte[10], 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public int f124828c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f124829d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f124830e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124831f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124832g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f124833h;

    /* renamed from: i, reason: collision with root package name */
    public int f124834i;

    /* renamed from: j, reason: collision with root package name */
    public int f124835j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124836k;

    /* renamed from: l, reason: collision with root package name */
    public long f124837l;

    public x(i iVar) {
        this.f124826a = iVar;
    }

    @Override // v9.i0
    public final void a(k0 k0Var, q8.u uVar, h0 h0Var) {
        this.f124830e = k0Var;
        this.f124826a.g(uVar, h0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [d7.c0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [v9.i] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // v9.i0
    public final void b(int i13, d7.d0 d0Var) {
        boolean z13;
        bf.b.w(this.f124830e);
        int i14 = i13 & 1;
        int i15 = -1;
        int i16 = 2;
        ?? r63 = this.f124826a;
        ?? r83 = 0;
        if (i14 != 0) {
            int i17 = this.f124828c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    d7.u.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f124835j != -1) {
                        d7.u.g("PesReader", "Unexpected start indicator: expected " + this.f124835j + " more bytes");
                    }
                    r63.h(d0Var.f53808c == 0);
                }
            }
            this.f124828c = 1;
            this.f124829d = 0;
        }
        int i18 = i13;
        while (d0Var.a() > 0) {
            int i19 = this.f124828c;
            if (i19 != 0) {
                ?? r102 = this.f124827b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 != 3) {
                            throw new IllegalStateException();
                        }
                        int a13 = d0Var.a();
                        int i23 = this.f124835j;
                        int i24 = i23 == i15 ? r83 : a13 - i23;
                        if (i24 > 0) {
                            a13 -= i24;
                            d0Var.J(d0Var.f53807b + a13);
                        }
                        r63.e(d0Var);
                        int i25 = this.f124835j;
                        if (i25 != i15) {
                            int i26 = i25 - a13;
                            this.f124835j = i26;
                            if (i26 == 0) {
                                r63.h(r83);
                                this.f124828c = 1;
                                this.f124829d = r83;
                            }
                        }
                    } else if (c(Math.min(10, this.f124834i), d0Var, r102.f53793b) && c(this.f124834i, d0Var, null)) {
                        r102.m(r83);
                        this.f124837l = -9223372036854775807L;
                        if (this.f124831f) {
                            r102.o(4);
                            r102.o(1);
                            r102.o(1);
                            long g13 = (r102.g(15) << 15) | (r102.g(3) << 30) | r102.g(15);
                            r102.o(1);
                            if (!this.f124833h && this.f124832g) {
                                r102.o(4);
                                r102.o(1);
                                r102.o(1);
                                r102.o(1);
                                this.f124830e.b((r102.g(15) << 15) | (r102.g(3) << 30) | r102.g(15));
                                this.f124833h = true;
                            }
                            this.f124837l = this.f124830e.b(g13);
                        }
                        i18 |= this.f124836k ? 4 : 0;
                        r63.i(i18, this.f124837l);
                        this.f124828c = 3;
                        this.f124829d = 0;
                        i15 = -1;
                        i16 = 2;
                        r83 = 0;
                    }
                    z13 = r83;
                } else if (c(9, d0Var, r102.f53793b)) {
                    this.f124828c = d() ? 2 : 0;
                    z13 = false;
                    this.f124829d = 0;
                } else {
                    z13 = false;
                }
            } else {
                z13 = r83;
                d0Var.L(d0Var.a());
            }
            r83 = z13;
            i15 = -1;
            i16 = 2;
        }
    }

    public final boolean c(int i13, d7.d0 d0Var, byte[] bArr) {
        int min = Math.min(d0Var.a(), i13 - this.f124829d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            d0Var.L(min);
        } else {
            d0Var.i(bArr, this.f124829d, min);
        }
        int i14 = this.f124829d + min;
        this.f124829d = i14;
        return i14 == i13;
    }

    public final boolean d() {
        d7.c0 c0Var = this.f124827b;
        c0Var.m(0);
        int g13 = c0Var.g(24);
        if (g13 != 1) {
            cb.t("Unexpected start code prefix: ", g13, "PesReader");
            this.f124835j = -1;
            return false;
        }
        c0Var.o(8);
        int g14 = c0Var.g(16);
        c0Var.o(5);
        this.f124836k = c0Var.f();
        c0Var.o(2);
        this.f124831f = c0Var.f();
        this.f124832g = c0Var.f();
        c0Var.o(6);
        int g15 = c0Var.g(8);
        this.f124834i = g15;
        if (g14 == 0) {
            this.f124835j = -1;
        } else {
            int i13 = (g14 - 3) - g15;
            this.f124835j = i13;
            if (i13 < 0) {
                d7.u.g("PesReader", "Found negative packet payload size: " + this.f124835j);
                this.f124835j = -1;
            }
        }
        return true;
    }

    @Override // v9.i0
    public final void f() {
        this.f124828c = 0;
        this.f124829d = 0;
        this.f124833h = false;
        this.f124826a.f();
    }
}
