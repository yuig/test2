package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import pk2.f;
import sf.m;
import wf.d;
import zf.e;

/* loaded from: classes3.dex */
public class CandleStickChart extends BarLineChartBase<Object> implements d {
    public CandleStickChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // wf.d
    public final void g() {
        f.q(this.f30149a);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.f30164p = new e(this, this.f30167s, this.f30166r);
        m mVar = this.f30156h;
        mVar.f112463u = 0.5f;
        mVar.f112464v = 0.5f;
    }

    public CandleStickChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
