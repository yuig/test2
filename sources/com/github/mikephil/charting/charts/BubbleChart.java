package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import pk2.f;
import wf.c;
import zf.d;

/* loaded from: classes3.dex */
public class BubbleChart extends BarLineChartBase<Object> implements c {
    public BubbleChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // wf.c
    public final void a() {
        f.q(this.f30149a);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.f30164p = new d(this, this.f30167s, this.f30166r);
    }

    public BubbleChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
