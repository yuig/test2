package com.github.mikephil.charting.charts;

import ag.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import jo.b;
import pk2.f;
import sf.m;
import sf.n;
import sf.p;
import zf.r;
import zf.v;
import zf.y;

/* loaded from: classes3.dex */
public class RadarChart extends PieRadarChartBase<Object> {
    public final boolean B;
    public p C;
    public y D;
    public v E;

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Color.rgb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        Color.rgb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        this.B = true;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final void C() {
        f.q(this.f30149a);
        n nVar = n.LEFT;
        throw null;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int F(float f13) {
        DisplayMetrics displayMetrics = i.f15104a;
        J();
        throw null;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float G() {
        RectF rectF = this.f30166r.f15115b;
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float H() {
        m mVar = this.f30156h;
        return (mVar.f112469a && mVar.f112460r) ? mVar.B : i.c(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float I() {
        return this.f30163o.f141840b.getTextSize() * 4.0f;
    }

    public final void J() {
        f.q(this.f30149a);
        throw null;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30149a == null) {
            return;
        }
        m mVar = this.f30156h;
        if (mVar.f112469a) {
            this.E.q(mVar.f112468z, mVar.f112467y);
        }
        this.E.x(canvas);
        if (this.B) {
            this.f30164p.r(canvas);
        }
        boolean z13 = this.C.f112469a;
        this.f30164p.q(canvas);
        if (B()) {
            this.f30164p.s(canvas, this.f30169u);
        }
        if (this.C.f112469a) {
            this.D.z();
        }
        this.D.w(canvas);
        this.f30164p.t(canvas);
        this.f30163o.s(canvas);
        j(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.C = new p(n.LEFT);
        i.c(1.5f);
        i.c(0.75f);
        r rVar = new r(this.f30167s, this.f30166r);
        new Path();
        new Path();
        rVar.f141878h = this;
        Paint paint = new Paint(1);
        rVar.f141834d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        rVar.f141834d.setStrokeWidth(2.0f);
        rVar.f141834d.setColor(Color.rgb(255, RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE));
        new Paint(1).setStyle(style);
        new Paint(1);
        this.f30164p = rVar;
        y yVar = new y(this.f30166r, this.C, null);
        new Path();
        yVar.f141895n = this;
        this.D = yVar;
        v vVar = new v(this.f30166r, this.f30156h, null);
        vVar.f141886m = this;
        this.E = vVar;
        this.f30165q = new b(this, 1);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void v() {
        if (this.f30149a == null) {
            return;
        }
        C();
        throw null;
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Color.rgb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        Color.rgb(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        this.B = true;
    }
}
