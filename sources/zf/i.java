package zf;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;

/* loaded from: classes3.dex */
public final class i extends b {
    @Override // zf.b, zf.h
    public final void t(Canvas canvas) {
        wf.a aVar = this.f141824g;
        if (v(aVar)) {
            aVar.f();
            throw null;
        }
    }

    @Override // zf.b, zf.h
    public final void u() {
        this.f141824g.f();
        throw null;
    }

    @Override // zf.h
    public final boolean v(wf.e eVar) {
        return ((float) ((Chart) eVar).f30149a.d()) < ((float) ((BarLineChartBase) eVar).f30147y) * ((ag.j) this.f24333a).f15123j;
    }
}
