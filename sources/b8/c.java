package b8;

import a.cb;
import d7.d0;
import d7.n0;
import java.util.Locale;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class c implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f22114h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f22115i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22116a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22118c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f22119d;

    /* renamed from: e, reason: collision with root package name */
    public long f22120e;

    /* renamed from: f, reason: collision with root package name */
    public long f22121f;

    /* renamed from: g, reason: collision with root package name */
    public int f22122g;

    public c(a8.k kVar) {
        this.f22116a = kVar;
        String str = kVar.f1381c.f18765o;
        str.getClass();
        this.f22117b = "audio/amr-wb".equals(str);
        this.f22118c = kVar.f1380b;
        this.f22120e = -9223372036854775807L;
        this.f22122g = -1;
        this.f22121f = 0L;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22120e = j13;
        this.f22121f = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        this.f22120e = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 1);
        this.f22119d = D;
        D.b(this.f22116a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        int a13;
        bf.b.w(this.f22119d);
        int i14 = this.f22122g;
        if (i14 != -1 && i13 != (a13 = a8.i.a(i14))) {
            int i15 = n0.f53866a;
            Locale locale = Locale.US;
            d7.u.g("RtpAmrReader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a13, "; received: ", i13, "."));
        }
        d0Var.L(1);
        int h10 = (d0Var.h() >> 3) & 15;
        boolean z14 = (h10 >= 0 && h10 <= 8) || h10 == 15;
        StringBuilder sb3 = new StringBuilder("Illegal AMR ");
        boolean z15 = this.f22117b;
        sb3.append(z15 ? "WB" : "NB");
        sb3.append(" frame type ");
        sb3.append(h10);
        bf.b.h(sb3.toString(), z14);
        int i16 = z15 ? f22115i[h10] : f22114h[h10];
        int a14 = d0Var.a();
        bf.b.h("compound payload not supported currently", a14 == i16);
        this.f22119d.d(a14, 0, d0Var);
        this.f22119d.a(kh2.j.I2(this.f22121f, j13, this.f22120e, this.f22118c), 1, a14, 0, null);
        this.f22122g = i13;
    }
}
