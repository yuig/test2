package com.github.mikephil.charting.charts;

import ag.d;
import ag.i;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import sf.g;
import sf.j;
import sf.m;
import tf.c;
import yf.e;

/* loaded from: classes3.dex */
public abstract class PieRadarChartBase<T extends c> extends Chart<T> {
    public final boolean A;

    /* renamed from: y, reason: collision with root package name */
    public float f30174y;

    /* renamed from: z, reason: collision with root package name */
    public float f30175z;

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30174y = 270.0f;
        this.f30175z = 270.0f;
        this.A = true;
    }

    public void C() {
    }

    public final float D(float f13, float f14) {
        d m13 = m();
        float f15 = m13.f15087b;
        float f16 = f13 > f15 ? f13 - f15 : f15 - f13;
        float sqrt = (float) Math.sqrt(Math.pow(f14 > m13.f15088c ? f14 - r1 : r1 - f14, 2.0d) + Math.pow(f16, 2.0d));
        d.c(m13);
        return sqrt;
    }

    public final float E(float f13, float f14) {
        d m13 = m();
        double d2 = f13 - m13.f15087b;
        double d13 = f14 - m13.f15088c;
        float degrees = (float) Math.toDegrees(Math.acos(d13 / Math.sqrt((d13 * d13) + (d2 * d2))));
        if (f13 > m13.f15087b) {
            degrees = 360.0f - degrees;
        }
        float f15 = degrees + 90.0f;
        if (f15 > 360.0f) {
            f15 -= 360.0f;
        }
        d.c(m13);
        return f15;
    }

    public abstract int F(float f13);

    public abstract float G();

    public abstract float H();

    public abstract float I();

    @Override // android.view.View
    public final void computeScroll() {
        yf.c cVar = this.f30161m;
        if (cVar instanceof e) {
            e eVar = (e) cVar;
            if (eVar.f138950i == 0.0f) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f13 = eVar.f138950i;
            Chart chart = eVar.f138943d;
            PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
            float f14 = f13 * pieRadarChartBase.f30152d;
            eVar.f138950i = f14;
            float f15 = (f14 * ((currentAnimationTimeMillis - eVar.f138949h) / 1000.0f)) + pieRadarChartBase.f30174y;
            pieRadarChartBase.f30175z = f15;
            DisplayMetrics displayMetrics = i.f15104a;
            while (f15 < 0.0f) {
                f15 += 360.0f;
            }
            pieRadarChartBase.f30174y = f15 % 360.0f;
            eVar.f138949h = currentAnimationTimeMillis;
            if (Math.abs(eVar.f138950i) >= 0.001d) {
                chart.postInvalidateOnAnimation();
            } else {
                eVar.f138950i = 0.0f;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void h() {
        float f13;
        float f14;
        float f15;
        float f16;
        float c13;
        float f17;
        float f18;
        float f19;
        float f23;
        float f24;
        float f25;
        sf.i iVar;
        j jVar = this.f30159k;
        if (jVar == null || !jVar.f112469a) {
            f13 = 0.0f;
            f14 = 0.0f;
            f15 = 0.0f;
            f16 = 0.0f;
        } else {
            float min = Math.min(jVar.f112489r, this.f30166r.f15116c * jVar.f112488q);
            int i13 = rf.c.f107729c[this.f30159k.f112480i.ordinal()];
            if (i13 != 1) {
                if (i13 == 2 && ((iVar = this.f30159k.f112479h) == sf.i.TOP || iVar == sf.i.BOTTOM)) {
                    float I = I();
                    j jVar2 = this.f30159k;
                    f25 = Math.min(jVar2.f112490s + I, this.f30166r.f15117d * jVar2.f112488q);
                    int i14 = rf.c.f107727a[this.f30159k.f112479h.ordinal()];
                    if (i14 == 1) {
                        f24 = 0.0f;
                        f19 = f24;
                        f18 = f19;
                    } else if (i14 == 2) {
                        f24 = f25;
                        f25 = 0.0f;
                        f19 = 0.0f;
                        f18 = f19;
                    }
                }
                f25 = 0.0f;
                f24 = 0.0f;
                f19 = f24;
                f18 = f19;
            } else {
                j jVar3 = this.f30159k;
                g gVar = jVar3.f112478g;
                if (gVar != g.LEFT && gVar != g.RIGHT) {
                    c13 = 0.0f;
                } else if (jVar3.f112479h == sf.i.CENTER) {
                    c13 = i.c(13.0f) + min;
                } else {
                    c13 = i.c(8.0f) + min;
                    j jVar4 = this.f30159k;
                    float f26 = jVar4.f112490s + jVar4.f112491t;
                    d b13 = d.b(getWidth() / 2.0f, getHeight() / 2.0f);
                    float width = this.f30159k.f112478g == g.RIGHT ? (getWidth() - c13) + 15.0f : c13 - 15.0f;
                    float f27 = f26 + 15.0f;
                    float D = D(width, f27);
                    float G = G();
                    float E = E(width, f27);
                    d b14 = d.b(0.0f, 0.0f);
                    double d2 = G;
                    double d13 = E;
                    b14.f15087b = (float) (b13.f15087b + (Math.cos(Math.toRadians(d13)) * d2));
                    float sin = (float) ((Math.sin(Math.toRadians(d13)) * d2) + b13.f15088c);
                    b14.f15088c = sin;
                    float D2 = D(b14.f15087b, sin);
                    float c14 = i.c(5.0f);
                    if (f27 < b13.f15088c || getHeight() - c13 <= getWidth()) {
                        c13 = D < D2 ? (D2 - D) + c14 : 0.0f;
                    }
                    d.c(b13);
                    d.c(b14);
                }
                int i15 = rf.c.f107728b[this.f30159k.f112478g.ordinal()];
                if (i15 == 1) {
                    f17 = 0.0f;
                    f18 = 0.0f;
                    f19 = c13;
                    f23 = 0.0f;
                } else if (i15 != 2) {
                    if (i15 == 3) {
                        int i16 = rf.c.f107727a[this.f30159k.f112479h.ordinal()];
                        if (i16 == 1) {
                            j jVar5 = this.f30159k;
                            f23 = Math.min(jVar5.f112490s, this.f30166r.f15117d * jVar5.f112488q);
                            f17 = 0.0f;
                            f19 = 0.0f;
                            f18 = f19;
                        } else if (i16 == 2) {
                            j jVar6 = this.f30159k;
                            f17 = Math.min(jVar6.f112490s, this.f30166r.f15117d * jVar6.f112488q);
                            f23 = 0.0f;
                            f19 = f23;
                            f18 = f19;
                        }
                    }
                    f17 = 0.0f;
                    f23 = 0.0f;
                    f19 = f23;
                    f18 = f19;
                } else {
                    f17 = 0.0f;
                    f19 = 0.0f;
                    f18 = c13;
                    f23 = 0.0f;
                }
                float f28 = f23;
                f24 = f17;
                f25 = f28;
            }
            f16 = H() + f19;
            f14 = H() + f18;
            f15 = H() + f25;
            f13 = H() + f24;
        }
        float c15 = i.c(0.0f);
        if (this instanceof RadarChart) {
            m r13 = r();
            if (r13.f112469a && r13.f112460r) {
                c15 = Math.max(c15, r13.B);
            }
        }
        this.f30166r.h(Math.max(c15, f16 + 0.0f), Math.max(c15, f15 + 0.0f), Math.max(c15, f14 + 0.0f), Math.max(c15, Math.max(H(), f13 + 0.0f)));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yf.c cVar;
        return (!this.f30157i || (cVar = this.f30161m) == null) ? super.onTouchEvent(motionEvent) : cVar.onTouch(this, motionEvent);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void u() {
        super.u();
        e eVar = new e(this);
        eVar.f138946e = d.b(0.0f, 0.0f);
        eVar.f138947f = 0.0f;
        eVar.f138948g = new ArrayList();
        eVar.f138949h = 0L;
        eVar.f138950i = 0.0f;
        this.f30161m = eVar;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void v() {
        if (this.f30149a == null) {
            return;
        }
        C();
        if (this.f30159k != null) {
            this.f30163o.q(this.f30149a);
        }
        h();
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f30174y = 270.0f;
        this.f30175z = 270.0f;
        this.A = true;
    }
}
