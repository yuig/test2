package zf;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.charts.RadarChart;

/* loaded from: classes3.dex */
public final class v extends t {

    /* renamed from: m, reason: collision with root package name */
    public RadarChart f141886m;

    @Override // zf.t
    public final void A() {
    }

    @Override // zf.t
    public final void x(Canvas canvas) {
        sf.m mVar = this.f141880h;
        if (mVar.f112469a && mVar.f112460r) {
            ag.d.b(0.5f, 0.25f);
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(mVar.f112472d);
            paint.setColor(mVar.f112473e);
            this.f141886m.J();
            throw null;
        }
    }
}
