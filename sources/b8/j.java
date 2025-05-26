package b8;

import a.cb;
import android.util.Log;
import d7.d0;
import d7.n0;
import java.util.Locale;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a8.k f22168a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f22169b;

    /* renamed from: c, reason: collision with root package name */
    public long f22170c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f22171d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f22172e = -1;

    public j(a8.k kVar) {
        this.f22168a = kVar;
    }

    @Override // b8.i
    public final void b(long j13, long j14) {
        this.f22170c = j13;
        this.f22171d = j14;
    }

    @Override // b8.i
    public final void c(long j13) {
        this.f22170c = j13;
    }

    @Override // b8.i
    public final void d(u uVar, int i13) {
        k0 D = uVar.D(i13, 1);
        this.f22169b = D;
        D.b(this.f22168a.f1381c);
    }

    @Override // b8.i
    public final void e(int i13, long j13, d0 d0Var, boolean z13) {
        int a13;
        this.f22169b.getClass();
        int i14 = this.f22172e;
        if (i14 != -1 && i13 != (a13 = a8.i.a(i14))) {
            int i15 = n0.f53866a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", cb.j("Received RTP packet with unexpected sequence number. Expected: ", a13, "; received: ", i13, "."));
        }
        long I2 = kh2.j.I2(this.f22171d, j13, this.f22170c, this.f22168a.f1380b);
        int a14 = d0Var.a();
        this.f22169b.d(a14, 0, d0Var);
        this.f22169b.a(I2, 1, a14, 0, null);
        this.f22172e = i13;
    }
}
