package v9;

import a7.o0;
import q8.k0;

/* loaded from: classes3.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d7.d0 f124786a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c f124787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f124788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124789d;

    /* renamed from: e, reason: collision with root package name */
    public final String f124790e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f124791f;

    /* renamed from: g, reason: collision with root package name */
    public String f124792g;

    /* renamed from: h, reason: collision with root package name */
    public int f124793h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f124794i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124795j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124796k;

    /* renamed from: l, reason: collision with root package name */
    public long f124797l;

    /* renamed from: m, reason: collision with root package name */
    public int f124798m;

    /* renamed from: n, reason: collision with root package name */
    public long f124799n;

    public u(String str, int i13, String str2) {
        d7.d0 d0Var = new d7.d0(4);
        this.f124786a = d0Var;
        d0Var.f53806a[0] = -1;
        this.f124787b = new q8.c();
        this.f124799n = -9223372036854775807L;
        this.f124788c = str;
        this.f124789d = i13;
        this.f124790e = str2;
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        bf.b.w(this.f124791f);
        while (d0Var.a() > 0) {
            int i13 = this.f124793h;
            d7.d0 d0Var2 = this.f124786a;
            if (i13 == 0) {
                byte[] bArr = d0Var.f53806a;
                int i14 = d0Var.f53807b;
                int i15 = d0Var.f53808c;
                while (true) {
                    if (i14 >= i15) {
                        d0Var.K(i15);
                        break;
                    }
                    byte b13 = bArr[i14];
                    boolean z13 = (b13 & 255) == 255;
                    boolean z14 = this.f124796k && (b13 & 224) == 224;
                    this.f124796k = z13;
                    if (z14) {
                        d0Var.K(i14 + 1);
                        this.f124796k = false;
                        d0Var2.f53806a[1] = bArr[i14];
                        this.f124794i = 2;
                        this.f124793h = 1;
                        break;
                    }
                    i14++;
                }
            } else if (i13 == 1) {
                int min = Math.min(d0Var.a(), 4 - this.f124794i);
                d0Var.i(d0Var2.f53806a, this.f124794i, min);
                int i16 = this.f124794i + min;
                this.f124794i = i16;
                if (i16 >= 4) {
                    d0Var2.K(0);
                    int k13 = d0Var2.k();
                    q8.c cVar = this.f124787b;
                    if (cVar.a(k13)) {
                        this.f124798m = cVar.f102889c;
                        if (!this.f124795j) {
                            this.f124797l = (cVar.f102893g * 1000000) / cVar.f102890d;
                            a7.q qVar = new a7.q();
                            qVar.f1168a = this.f124792g;
                            qVar.f1180m = o0.r(this.f124790e);
                            qVar.f1181n = o0.r((String) cVar.f102888b);
                            qVar.f1182o = 4096;
                            qVar.D = cVar.f102891e;
                            qVar.E = cVar.f102890d;
                            qVar.f1171d = this.f124788c;
                            qVar.f1173f = this.f124789d;
                            this.f124791f.b(new androidx.media3.common.b(qVar));
                            this.f124795j = true;
                        }
                        d0Var2.K(0);
                        this.f124791f.d(4, 0, d0Var2);
                        this.f124793h = 2;
                    } else {
                        this.f124794i = 0;
                        this.f124793h = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(d0Var.a(), this.f124798m - this.f124794i);
                this.f124791f.d(min2, 0, d0Var);
                int i17 = this.f124794i + min2;
                this.f124794i = i17;
                if (i17 >= this.f124798m) {
                    bf.b.t(this.f124799n != -9223372036854775807L);
                    this.f124791f.a(this.f124799n, 1, this.f124798m, 0, null);
                    this.f124799n += this.f124797l;
                    this.f124794i = 0;
                    this.f124793h = 0;
                }
            }
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124793h = 0;
        this.f124794i = 0;
        this.f124796k = false;
        this.f124799n = -9223372036854775807L;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124792g = h0Var.f124635e;
        h0Var.b();
        this.f124791f = uVar.D(h0Var.f124634d, 1);
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124799n = j13;
    }
}
