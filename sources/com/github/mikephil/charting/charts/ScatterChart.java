package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import pk2.f;
import sf.m;
import wf.h;
import zf.s;

/* loaded from: classes3.dex */
public class ScatterChart extends BarLineChartBase<Object> implements h {
    public ScatterChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // wf.h
    public final void b() {
        f.q(this.f30149a);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.f30164p = new s(this, this.f30167s, this.f30166r);
        m mVar = this.f30156h;
        mVar.f112463u = 0.5f;
        mVar.f112464v = 0.5f;
    }

    public ScatterChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
