package k1;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes2.dex */
public final class k2 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final k2 f77915a = new k2();

    @Override // k1.g2
    public final f2 a(View view, boolean z13, long j13, float f13, float f14, boolean z14, n4.b bVar, float f15) {
        if (z13) {
            return new j2(new Magnifier(view));
        }
        long v03 = bVar.v0(j13);
        float l03 = bVar.l0(f13);
        float l04 = bVar.l0(f14);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (v03 != y2.h.f136670b) {
            builder.setSize(ml2.c.c(a3.f.d(v03)), ml2.c.c(a3.f.b(v03)));
        }
        if (!Float.isNaN(l03)) {
            builder.setCornerRadius(l03);
        }
        if (!Float.isNaN(l04)) {
            builder.setElevation(l04);
        }
        if (!Float.isNaN(f15)) {
            builder.setInitialZoom(f15);
        }
        builder.setClippingEnabled(z14);
        return new j2(builder.build());
    }

    @Override // k1.g2
    public final boolean b() {
        return true;
    }
}
