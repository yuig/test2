package k1;

import android.widget.Magnifier;

/* loaded from: classes2.dex */
public final class j2 extends h2 {
    @Override // k1.h2, k1.f2
    public final void a(long j13, long j14, float f13) {
        boolean isNaN = Float.isNaN(f13);
        Magnifier magnifier = this.f77875a;
        if (!isNaN) {
            magnifier.setZoom(f13);
        }
        if (com.bumptech.glide.c.y0(j14)) {
            magnifier.show(a3.c.d(j13), a3.c.e(j13), a3.c.d(j14), a3.c.e(j14));
        } else {
            magnifier.show(a3.c.d(j13), a3.c.e(j13));
        }
    }
}
