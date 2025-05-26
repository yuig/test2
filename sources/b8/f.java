package b8;

import androidx.media3.common.ParserException;
import d7.c0;
import d7.d0;
import d7.n0;
import pk.h1;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22147b;

    /* renamed from: c, reason: collision with root package name */
    public k0 f22148c;

    /* renamed from: d, reason: collision with root package name */
    public long f22149d;

    /* renamed from: e, reason: collision with root package name */
    public int f22150e;

    /* renamed from: f, reason: collision with root package name */
    public int f22151f;

    /* renamed from: g, reason: collision with root package name */
    public long f22152g;

    /* renamed from: h, reason: collision with root package name */
    public long f22153h;

    public f(a8.k kVar) {
        this.f22146a = kVar;
        try {
            this.f22147b = a(kVar.f1382d);
            this.f22149d = -9223372036854775807L;
            this.f22150e = -1;
            this.f22151f = 0;
            this.f22152g = 0L;
            this.f22153h = -9223372036854775807L;
        } catch (ParserException e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    public static int a(h1 h1Var) {
        String str = (String) h1Var.get("config");
        int i13 = 0;
        i13 = 0;
        if (str != null && str.length() % 2 == 0) {
            c0 c0Var = new c0(n0.v(str), 0, 0);
            int g13 = c0Var.g(1);
            if (g13 != 0) {
                throw new ParserException(a.a.d("unsupported audio mux version: ", g13), null, true, 0);
            }
            bf.b.h("Only supports allStreamsSameTimeFraming.", c0Var.g(1) == 1);
            int g14 = c0Var.g(6);
            bf.b.h("Only suppors one program.", c0Var.g(4) == 0);
            bf.b.h("Only suppors one layer.", c0Var.g(3) == 0);
            i13 = g14;
        }
        return i13 + 1;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22149d = j13;
        this.f22151f = 0;
        this.f22152g = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        bf.b.t(this.f22149d == -9223372036854775807L);
        this.f22149d = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 2);
        this.f22148c = D;
        int i14 = n0.f53866a;
        D.b(this.f22146a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        bf.b.w(this.f22148c);
        int a13 = a8.i.a(this.f22150e);
        if (this.f22151f > 0 && a13 < i13) {
            k0 k0Var = this.f22148c;
            k0Var.getClass();
            k0Var.a(this.f22153h, 1, this.f22151f, 0, null);
            this.f22151f = 0;
            this.f22153h = -9223372036854775807L;
        }
        for (int i14 = 0; i14 < this.f22147b; i14++) {
            int i15 = 0;
            while (d0Var.f53807b < d0Var.f53808c) {
                int y13 = d0Var.y();
                i15 += y13;
                if (y13 != 255) {
                    break;
                }
            }
            this.f22148c.d(i15, 0, d0Var);
            this.f22151f += i15;
        }
        this.f22153h = kh2.j.I2(this.f22152g, j13, this.f22149d, this.f22146a.f1380b);
        if (z13) {
            k0 k0Var2 = this.f22148c;
            k0Var2.getClass();
            k0Var2.a(this.f22153h, 1, this.f22151f, 0, null);
            this.f22151f = 0;
            this.f22153h = -9223372036854775807L;
        }
        this.f22150e = i13;
    }
}
