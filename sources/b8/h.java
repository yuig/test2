package b8;

import a.cb;
import a7.q;
import d7.d0;
import d7.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22161a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f22162b;

    /* renamed from: d, reason: collision with root package name */
    public long f22164d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22167g;

    /* renamed from: c, reason: collision with root package name */
    public long f22163c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f22165e = -1;

    public h(a8.k kVar) {
        this.f22161a = kVar;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22163c = j13;
        this.f22164d = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        this.f22163c = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 1);
        this.f22162b = D;
        D.b(this.f22161a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        bf.b.w(this.f22162b);
        if (!this.f22166f) {
            int i14 = d0Var.f53807b;
            bf.b.h("ID Header has insufficient data", d0Var.f53808c > 18);
            bf.b.h("ID Header missing", d0Var.w(8, StandardCharsets.UTF_8).equals("OpusHead"));
            bf.b.h("version number must always be 1", d0Var.y() == 1);
            d0Var.K(i14);
            ArrayList D = gh0.b.D(d0Var.f53806a);
            q a13 = this.f22161a.f1381c.a();
            a13.f1184q = D;
            this.f22162b.b(new androidx.media3.common.b(a13));
            this.f22166f = true;
        } else if (this.f22167g) {
            int a14 = a8.i.a(this.f22165e);
            if (i13 != a14) {
                int i15 = n0.f53866a;
                Locale locale = Locale.US;
                d7.u.g("RtpOpusReader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a14, "; received: ", i13, "."));
            }
            int a15 = d0Var.a();
            this.f22162b.d(a15, 0, d0Var);
            this.f22162b.a(kh2.j.I2(this.f22164d, j13, this.f22163c, 48000), 1, a15, 0, null);
        } else {
            bf.b.h("Comment Header has insufficient data", d0Var.f53808c >= 8);
            bf.b.h("Comment Header should follow ID Header", d0Var.w(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f22167g = true;
        }
        this.f22165e = i13;
    }
}
