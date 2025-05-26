package com.github.mikephil.charting.charts;

import ag.b;
import ag.c;
import ag.g;
import ag.h;
import ag.i;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import sf.l;
import sf.m;
import sf.n;
import sf.p;
import vf.d;
import zf.u;
import zf.x;

/* loaded from: classes3.dex */
public class HorizontalBarChart extends BarChart {
    public final RectF U;

    public HorizontalBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = new RectF();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public final void H() {
        g gVar = this.N;
        p pVar = this.f30146J;
        float f13 = pVar.f112468z;
        float f14 = pVar.A;
        m mVar = this.f30156h;
        gVar.g(f13, f14, mVar.A, mVar.f112468z);
        g gVar2 = this.M;
        p pVar2 = this.I;
        float f15 = pVar2.f112468z;
        float f16 = pVar2.A;
        m mVar2 = this.f30156h;
        gVar2.g(f15, f16, mVar2.A, mVar2.f112468z);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, wf.b
    public final float c() {
        g G = G(n.LEFT);
        RectF rectF = this.f30166r.f15115b;
        float f13 = rectF.left;
        float f14 = rectF.bottom;
        c cVar = this.R;
        G.c(f13, f14, cVar);
        return (float) Math.max(this.f30156h.f112468z, cVar.f15085c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, wf.b
    public final float d() {
        g G = G(n.LEFT);
        RectF rectF = this.f30166r.f15115b;
        float f13 = rectF.left;
        float f14 = rectF.top;
        c cVar = this.S;
        G.c(f13, f14, cVar);
        return (float) Math.min(this.f30156h.f112467y, cVar.f15085c);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void h() {
        RectF rectF = this.U;
        D(rectF);
        float f13 = rectF.left + 0.0f;
        float f14 = rectF.top + 0.0f;
        float f15 = rectF.right + 0.0f;
        float f16 = rectF.bottom + 0.0f;
        if (this.I.r()) {
            p pVar = this.I;
            this.K.f141821e.setTextSize(pVar.f112472d);
            f14 += (pVar.f112471c * 2.0f) + i.a(r7, pVar.e());
        }
        if (this.f30146J.r()) {
            p pVar2 = this.f30146J;
            this.L.f141821e.setTextSize(pVar2.f112472d);
            f16 += (pVar2.f112471c * 2.0f) + i.a(r7, pVar2.e());
        }
        m mVar = this.f30156h;
        float f17 = mVar.B;
        if (mVar.f112469a) {
            l lVar = mVar.D;
            if (lVar == l.BOTTOM) {
                f13 += f17;
            } else {
                if (lVar != l.TOP) {
                    if (lVar == l.BOTH_SIDED) {
                        f13 += f17;
                    }
                }
                f15 += f17;
            }
        }
        float c13 = i.c(this.H);
        this.f30166r.h(Math.max(c13, f13 + 0.0f), Math.max(c13, f14 + 0.0f), Math.max(c13, f15 + 0.0f), Math.max(c13, f16 + 0.0f));
        g gVar = this.N;
        this.f30146J.getClass();
        gVar.f();
        g gVar2 = this.M;
        this.I.getClass();
        gVar2.f();
        H();
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public final vf.c o(float f13, float f14) {
        if (this.f30149a == null) {
            return null;
        }
        return this.f30165q.A(f14, f13);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        this.f30166r = new b();
        super.u();
        this.M = new h(this.f30166r);
        this.N = new h(this.f30166r);
        zf.i iVar = new zf.i(this, this.f30167s, this.f30166r);
        new RectF();
        iVar.f141835e.setTextAlign(Paint.Align.LEFT);
        this.f30164p = iVar;
        this.f30165q = new d(this);
        this.K = new x(this.f30166r, this.I, this.M);
        this.L = new x(this.f30166r, this.f30146J, this.N);
        u uVar = new u(this.f30166r, this.f30156h, this.M);
        uVar.f141885m = new Path();
        this.O = uVar;
    }

    public HorizontalBarChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.U = new RectF();
    }
}
