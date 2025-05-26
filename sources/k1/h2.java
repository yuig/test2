package k1;

import android.widget.Magnifier;

/* loaded from: classes2.dex */
public class h2 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f77875a;

    public h2(Magnifier magnifier) {
        this.f77875a = magnifier;
    }

    @Override // k1.f2
    public void a(long j13, long j14, float f13) {
        this.f77875a.show(a3.c.d(j13), a3.c.e(j13));
    }

    public final void b() {
        this.f77875a.dismiss();
    }

    public final long c() {
        Magnifier magnifier = this.f77875a;
        return lb.l0.d(magnifier.getWidth(), magnifier.getHeight());
    }

    public final void d() {
        this.f77875a.update();
    }
}
