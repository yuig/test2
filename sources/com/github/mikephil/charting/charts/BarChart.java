package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import pk2.f;
import sf.m;
import vf.c;
import wf.a;
import zf.b;

/* loaded from: classes3.dex */
public class BarChart extends BarLineChartBase<Object> implements a {
    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void C() {
        f.q(this.f30149a);
        throw null;
    }

    @Override // wf.a
    public final void f() {
        f.q(this.f30149a);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public c o(float f13, float f14) {
        if (this.f30149a != null) {
            return this.f30165q.A(f13, f14);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void u() {
        super.u();
        this.f30164p = new b(this, this.f30167s, this.f30166r);
        this.f30165q = new vf.a(this);
        m mVar = this.f30156h;
        mVar.f112463u = 0.5f;
        mVar.f112464v = 0.5f;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
