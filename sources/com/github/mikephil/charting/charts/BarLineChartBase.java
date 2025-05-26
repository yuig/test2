package com.github.mikephil.charting.charts;

import ag.c;
import ag.d;
import ag.g;
import ag.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import sf.j;
import sf.l;
import sf.m;
import sf.n;
import sf.p;
import tf.a;
import wf.b;
import zf.h;
import zf.t;
import zf.w;

@SuppressLint({"RtlHardcoded"})
/* loaded from: classes3.dex */
public abstract class BarLineChartBase<T extends a> extends Chart<T> implements b {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public Paint F;
    public Paint G;
    public float H;
    public p I;

    /* renamed from: J, reason: collision with root package name */
    public p f30146J;
    public w K;
    public w L;
    public g M;
    public g N;
    public t O;
    public RectF P;
    public Matrix Q;
    public c R;
    public c S;
    public float[] T;

    /* renamed from: y, reason: collision with root package name */
    public int f30147y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30148z;

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f30147y = 100;
        this.f30148z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.H = 15.0f;
        this.P = new RectF();
        this.Q = new Matrix();
        new Matrix();
        this.R = c.b(0.0d, 0.0d);
        this.S = c.b(0.0d, 0.0d);
        this.T = new float[2];
    }

    public void C() {
        float f13;
        float f14;
        m mVar = this.f30156h;
        a aVar = (a) this.f30149a;
        float f15 = aVar.f117506d;
        float f16 = aVar.f117505c;
        float f17 = mVar.f112465w ? mVar.f112468z : f15 - mVar.f112463u;
        float f18 = mVar.f112466x ? mVar.f112467y : f16 + mVar.f112464v;
        if (Math.abs(f18 - f17) == 0.0f) {
            f18 += 1.0f;
            f17 -= 1.0f;
        }
        mVar.f112468z = f17;
        mVar.f112467y = f18;
        mVar.A = Math.abs(f18 - f17);
        p pVar = this.I;
        a aVar2 = (a) this.f30149a;
        n nVar = n.LEFT;
        aVar2.getClass();
        float f19 = aVar2.f117508f;
        if (f19 == Float.MAX_VALUE) {
            f19 = aVar2.f117510h;
        }
        a aVar3 = (a) this.f30149a;
        aVar3.getClass();
        float f23 = aVar3.f117507e;
        if (f23 == -3.4028235E38f) {
            f23 = aVar3.f117509g;
        }
        pVar.p(f19, f23);
        p pVar2 = this.f30146J;
        a aVar4 = (a) this.f30149a;
        n nVar2 = n.RIGHT;
        aVar4.getClass();
        if (nVar2 == nVar) {
            f13 = aVar4.f117508f;
            if (f13 == Float.MAX_VALUE) {
                f13 = aVar4.f117510h;
            }
        } else {
            f13 = aVar4.f117510h;
            if (f13 == Float.MAX_VALUE) {
                f13 = aVar4.f117508f;
            }
        }
        a aVar5 = (a) this.f30149a;
        aVar5.getClass();
        if (nVar2 == nVar) {
            f14 = aVar5.f117507e;
            if (f14 == -3.4028235E38f) {
                f14 = aVar5.f117509g;
            }
        } else {
            f14 = aVar5.f117509g;
            if (f14 == -3.4028235E38f) {
                f14 = aVar5.f117507e;
            }
        }
        pVar2.p(f13, f14);
    }

    public final void D(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        j jVar = this.f30159k;
        if (jVar == null || !jVar.f112469a) {
            return;
        }
        jVar.getClass();
        int i13 = rf.a.f107726c[this.f30159k.f112480i.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            int i14 = rf.a.f107724a[this.f30159k.f112479h.ordinal()];
            if (i14 == 1) {
                float f13 = rectF.top;
                j jVar2 = this.f30159k;
                rectF.top = Math.min(jVar2.f112490s, this.f30166r.f15117d * jVar2.f112488q) + this.f30159k.f112471c + f13;
                return;
            } else {
                if (i14 != 2) {
                    return;
                }
                float f14 = rectF.bottom;
                j jVar3 = this.f30159k;
                rectF.bottom = Math.min(jVar3.f112490s, this.f30166r.f15117d * jVar3.f112488q) + this.f30159k.f112471c + f14;
                return;
            }
        }
        int i15 = rf.a.f107725b[this.f30159k.f112478g.ordinal()];
        if (i15 == 1) {
            float f15 = rectF.left;
            j jVar4 = this.f30159k;
            rectF.left = Math.min(jVar4.f112489r, this.f30166r.f15116c * jVar4.f112488q) + this.f30159k.f112470b + f15;
            return;
        }
        if (i15 == 2) {
            float f16 = rectF.right;
            j jVar5 = this.f30159k;
            rectF.right = Math.min(jVar5.f112489r, this.f30166r.f15116c * jVar5.f112488q) + this.f30159k.f112470b + f16;
        } else {
            if (i15 != 3) {
                return;
            }
            int i16 = rf.a.f107724a[this.f30159k.f112479h.ordinal()];
            if (i16 == 1) {
                float f17 = rectF.top;
                j jVar6 = this.f30159k;
                rectF.top = Math.min(jVar6.f112490s, this.f30166r.f15117d * jVar6.f112488q) + this.f30159k.f112471c + f17;
            } else {
                if (i16 != 2) {
                    return;
                }
                float f18 = rectF.bottom;
                j jVar7 = this.f30159k;
                rectF.bottom = Math.min(jVar7.f112490s, this.f30166r.f15117d * jVar7.f112488q) + this.f30159k.f112471c + f18;
            }
        }
    }

    public final p E() {
        return this.I;
    }

    public final p F() {
        return this.f30146J;
    }

    public final g G(n nVar) {
        return nVar == n.LEFT ? this.M : this.N;
    }

    public void H() {
        g gVar = this.N;
        m mVar = this.f30156h;
        float f13 = mVar.f112468z;
        float f14 = mVar.A;
        p pVar = this.f30146J;
        gVar.g(f13, f14, pVar.A, pVar.f112468z);
        g gVar2 = this.M;
        m mVar2 = this.f30156h;
        float f15 = mVar2.f112468z;
        float f16 = mVar2.A;
        p pVar2 = this.I;
        gVar2.g(f15, f16, pVar2.A, pVar2.f112468z);
    }

    public final void I() {
        this.f30148z = false;
    }

    @Override // wf.b
    public float c() {
        g G = G(n.LEFT);
        RectF rectF = this.f30166r.f15115b;
        float f13 = rectF.left;
        float f14 = rectF.bottom;
        c cVar = this.R;
        G.c(f13, f14, cVar);
        return (float) Math.max(this.f30156h.f112468z, cVar.f15084b);
    }

    @Override // android.view.View
    public final void computeScroll() {
        yf.c cVar = this.f30161m;
        if (cVar instanceof yf.a) {
            yf.a aVar = (yf.a) cVar;
            d dVar = aVar.f138937p;
            if (dVar.f15087b == 0.0f && dVar.f15088c == 0.0f) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f13 = dVar.f15087b;
            Chart chart = aVar.f138943d;
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            float f14 = barLineChartBase.f30152d;
            float f15 = f13 * f14;
            dVar.f15087b = f15;
            float f16 = dVar.f15088c * f14;
            dVar.f15088c = f16;
            float f17 = (currentAnimationTimeMillis - aVar.f138935n) / 1000.0f;
            d dVar2 = aVar.f138936o;
            float f18 = dVar2.f15087b + (f15 * f17);
            dVar2.f15087b = f18;
            float f19 = dVar2.f15088c + (f16 * f17);
            dVar2.f15088c = f19;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f18, f19, 0);
            boolean z13 = barLineChartBase.B;
            d dVar3 = aVar.f138928g;
            float f23 = z13 ? dVar2.f15087b - dVar3.f15087b : 0.0f;
            float f24 = barLineChartBase.C ? dVar2.f15088c - dVar3.f15088c : 0.0f;
            yf.b bVar = yf.b.NONE;
            aVar.f138926e.set(aVar.f138927f);
            ((BarLineChartBase) aVar.f138943d).getClass();
            aVar.b();
            aVar.f138926e.postTranslate(f23, f24);
            obtain.recycle();
            ag.j jVar = barLineChartBase.f30166r;
            Matrix matrix = aVar.f138926e;
            jVar.g(matrix, chart, false);
            aVar.f138926e = matrix;
            aVar.f138935n = currentAnimationTimeMillis;
            if (Math.abs(dVar.f15087b) >= 0.01d || Math.abs(dVar.f15088c) >= 0.01d) {
                DisplayMetrics displayMetrics = i.f15104a;
                chart.postInvalidateOnAnimation();
                return;
            }
            barLineChartBase.h();
            barLineChartBase.postInvalidate();
            d dVar4 = aVar.f138937p;
            dVar4.f15087b = 0.0f;
            dVar4.f15088c = 0.0f;
        }
    }

    @Override // wf.b
    public float d() {
        g G = G(n.LEFT);
        RectF rectF = this.f30166r.f15115b;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        c cVar = this.S;
        G.c(f13, f14, cVar);
        return (float) Math.min(this.f30156h.f112467y, cVar.f15084b);
    }

    @Override // android.view.View
    public final float getScaleX() {
        ag.j jVar = this.f30166r;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f15122i;
    }

    @Override // android.view.View
    public final float getScaleY() {
        ag.j jVar = this.f30166r;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f15123j;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void h() {
        RectF rectF = this.P;
        D(rectF);
        float f13 = rectF.left + 0.0f;
        float f14 = rectF.top + 0.0f;
        float f15 = rectF.right + 0.0f;
        float f16 = rectF.bottom + 0.0f;
        if (this.I.r()) {
            f13 += this.I.q(this.K.f141821e);
        }
        if (this.f30146J.r()) {
            f15 += this.f30146J.q(this.L.f141821e);
        }
        m mVar = this.f30156h;
        if (mVar.f112469a && mVar.f112460r) {
            float f17 = mVar.C + mVar.f112471c;
            l lVar = mVar.D;
            if (lVar == l.BOTTOM) {
                f16 += f17;
            } else {
                if (lVar != l.TOP) {
                    if (lVar == l.BOTH_SIDED) {
                        f16 += f17;
                    }
                }
                f14 += f17;
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

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30149a == null) {
            return;
        }
        System.currentTimeMillis();
        p pVar = this.I;
        if (pVar.f112469a) {
            this.K.q(pVar.f112468z, pVar.f112467y);
        }
        p pVar2 = this.f30146J;
        if (pVar2.f112469a) {
            this.L.q(pVar2.f112468z, pVar2.f112467y);
        }
        m mVar = this.f30156h;
        if (mVar.f112469a) {
            this.O.q(mVar.f112468z, mVar.f112467y);
        }
        this.O.y(canvas);
        this.K.x(canvas);
        this.L.x(canvas);
        if (this.f30156h.f112462t) {
            this.O.z(canvas);
        }
        if (this.I.f112462t) {
            this.K.y(canvas);
        }
        if (this.f30146J.f112462t) {
            this.L.y(canvas);
        }
        boolean z13 = this.f30156h.f112469a;
        boolean z14 = this.I.f112469a;
        boolean z15 = this.f30146J.f112469a;
        int save = canvas.save();
        canvas.clipRect(this.f30166r.f15115b);
        this.f30164p.q(canvas);
        if (!this.f30156h.f112462t) {
            this.O.z(canvas);
        }
        if (!this.I.f112462t) {
            this.K.y(canvas);
        }
        if (!this.f30146J.f112462t) {
            this.L.y(canvas);
        }
        if (B()) {
            this.f30164p.s(canvas, this.f30169u);
        }
        canvas.restoreToCount(save);
        this.f30164p.r(canvas);
        if (this.f30156h.f112469a) {
            this.O.A();
        }
        if (this.I.f112469a) {
            this.K.z();
        }
        if (this.f30146J.f112469a) {
            this.L.z();
        }
        this.O.x(canvas);
        this.K.w(canvas);
        this.L.w(canvas);
        this.f30164p.t(canvas);
        this.f30163o.s(canvas);
        j(canvas);
        k(canvas);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        float[] fArr = this.T;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        super.onSizeChanged(i13, i14, i15, i16);
        ag.j jVar = this.f30166r;
        jVar.g(jVar.f15114a, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        yf.c cVar = this.f30161m;
        if (cVar == null || this.f30149a == null || !this.f30157i) {
            return false;
        }
        return cVar.onTouch(this, motionEvent);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void u() {
        super.u();
        this.I = new p(n.LEFT);
        this.f30146J = new p(n.RIGHT);
        this.M = new g(this.f30166r);
        this.N = new g(this.f30166r);
        this.K = new w(this.f30166r, this.I, this.M);
        this.L = new w(this.f30166r, this.f30146J, this.N);
        this.O = new t(this.f30166r, this.f30156h, this.M);
        this.f30165q = new sp2.i(this);
        Matrix matrix = this.f30166r.f15114a;
        yf.a aVar = new yf.a(this);
        aVar.f138926e = new Matrix();
        aVar.f138927f = new Matrix();
        aVar.f138928g = d.b(0.0f, 0.0f);
        aVar.f138929h = d.b(0.0f, 0.0f);
        aVar.f138930i = 1.0f;
        aVar.f138931j = 1.0f;
        aVar.f138932k = 1.0f;
        aVar.f138935n = 0L;
        aVar.f138936o = d.b(0.0f, 0.0f);
        aVar.f138937p = d.b(0.0f, 0.0f);
        aVar.f138926e = matrix;
        aVar.f138938q = i.c(3.0f);
        aVar.f138939r = i.c(3.5f);
        this.f30161m = aVar;
        Paint paint = new Paint();
        this.F = paint;
        paint.setStyle(Paint.Style.FILL);
        this.F.setColor(Color.rgb(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
        Paint paint2 = new Paint();
        this.G = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.G.setColor(-16777216);
        this.G.setStrokeWidth(i.c(1.0f));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void v() {
        if (this.f30149a == null) {
            return;
        }
        h hVar = this.f30164p;
        if (hVar != null) {
            hVar.u();
        }
        C();
        w wVar = this.K;
        p pVar = this.I;
        wVar.q(pVar.f112468z, pVar.f112467y);
        w wVar2 = this.L;
        p pVar2 = this.f30146J;
        wVar2.q(pVar2.f112468z, pVar2.f112467y);
        t tVar = this.O;
        m mVar = this.f30156h;
        tVar.q(mVar.f112468z, mVar.f112467y);
        if (this.f30159k != null) {
            this.f30163o.q(this.f30149a);
        }
        h();
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30147y = 100;
        this.f30148z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.H = 15.0f;
        this.P = new RectF();
        this.Q = new Matrix();
        new Matrix();
        this.R = c.b(0.0d, 0.0d);
        this.S = c.b(0.0d, 0.0d);
        this.T = new float[2];
    }
}
