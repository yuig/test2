package com.github.mikephil.charting.charts;

import ag.d;
import ag.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.data.PieEntry;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jo.b;
import tf.k;
import tf.m;
import zf.h;
import zf.q;

/* loaded from: classes3.dex */
public class PieChart extends PieRadarChartBase<k> {
    public final RectF B;
    public boolean C;
    public float[] D;
    public float[] E;
    public final boolean F;
    public final String G;
    public final d H;
    public final float I;

    /* renamed from: J, reason: collision with root package name */
    public final float f30173J;
    public final boolean K;
    public final float L;
    public final float M;

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new RectF();
        this.C = true;
        this.D = new float[1];
        this.E = new float[1];
        this.F = true;
        this.G = "";
        this.H = d.b(0.0f, 0.0f);
        this.I = 50.0f;
        this.f30173J = 55.0f;
        this.K = true;
        this.L = 100.0f;
        this.M = 360.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final void C() {
        int d2 = ((k) this.f30149a).d();
        if (this.D.length != d2) {
            this.D = new float[d2];
        } else {
            for (int i13 = 0; i13 < d2; i13++) {
                this.D[i13] = 0.0f;
            }
        }
        if (this.E.length != d2) {
            this.E = new float[d2];
        } else {
            for (int i14 = 0; i14 < d2; i14++) {
                this.E[i14] = 0.0f;
            }
        }
        float g13 = ((k) this.f30149a).g();
        ArrayList arrayList = ((k) this.f30149a).f117511i;
        float[] fArr = new float[d2];
        int i15 = 0;
        for (int i16 = 0; i16 < ((k) this.f30149a).c(); i16++) {
            m mVar = (m) arrayList.get(i16);
            for (int i17 = 0; i17 < mVar.f117526o.size(); i17++) {
                float abs = (Math.abs(((PieEntry) mVar.e(i17)).f117501a) / g13) * this.M;
                this.D[i15] = abs;
                if (i15 == 0) {
                    this.E[i15] = abs;
                } else {
                    float[] fArr2 = this.E;
                    fArr2[i15] = fArr2[i15 - 1] + abs;
                }
                i15++;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final int F(float f13) {
        float f14 = f13 - this.f30174y;
        DisplayMetrics displayMetrics = i.f15104a;
        while (f14 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 % 360.0f;
        int i13 = 0;
        while (true) {
            float[] fArr = this.E;
            if (i13 >= fArr.length) {
                return -1;
            }
            if (fArr[i13] > f15) {
                return i13;
            }
            i13++;
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float G() {
        RectF rectF = this.B;
        if (rectF == null) {
            return 0.0f;
        }
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float H() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public final float I() {
        return this.f30163o.f141840b.getTextSize() * 2.0f;
    }

    public final d J() {
        RectF rectF = this.B;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void h() {
        super.h();
        if (this.f30149a == null) {
            return;
        }
        RectF rectF = this.f30166r.f15115b;
        rectF.left += 0.0f;
        rectF.top += 0.0f;
        rectF.right -= 0.0f;
        rectF.bottom -= 0.0f;
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        d m13 = m();
        float f13 = ((k) this.f30149a).f().f117540u;
        RectF rectF2 = this.B;
        float f14 = m13.f15087b;
        float f15 = m13.f15088c;
        rectF2.set((f14 - min) + f13, (f15 - min) + f13, (f14 + min) - f13, (f15 + min) - f13);
        d.c(m13);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h hVar = this.f30164p;
        if (hVar != null && (hVar instanceof q)) {
            q qVar = (q) hVar;
            Canvas canvas = qVar.f141872q;
            if (canvas != null) {
                canvas.setBitmap(null);
                qVar.f141872q = null;
            }
            WeakReference weakReference = qVar.f141871p;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                qVar.f141871p.clear();
                qVar.f141871p = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30149a == null) {
            return;
        }
        this.f30164p.q(canvas);
        if (B()) {
            this.f30164p.s(canvas, this.f30169u);
        }
        this.f30164p.r(canvas);
        this.f30164p.t(canvas);
        this.f30163o.s(canvas);
        j(canvas);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final sf.m r() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        q qVar = new q(this.f30167s, this.f30166r);
        qVar.f141869n = new RectF();
        qVar.f141870o = new RectF[]{new RectF(), new RectF(), new RectF()};
        qVar.f141873r = new Path();
        qVar.f141874s = new RectF();
        qVar.f141875t = new Path();
        qVar.f141876u = new Path();
        qVar.f141877v = new RectF();
        qVar.f141861f = this;
        Paint paint = new Paint(1);
        qVar.f141862g = paint;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        qVar.f141863h = paint2;
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAlpha(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE);
        TextPaint textPaint = new TextPaint(1);
        qVar.f141865j = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(i.c(12.0f));
        qVar.f141835e.setTextSize(i.c(13.0f));
        qVar.f141835e.setColor(-1);
        Paint paint3 = qVar.f141835e;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint(1);
        qVar.f141866k = paint4;
        paint4.setColor(-1);
        paint4.setTextAlign(align);
        paint4.setTextSize(i.c(13.0f));
        Paint paint5 = new Paint(1);
        qVar.f141864i = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f30164p = qVar;
        this.f30156h = null;
        this.f30165q = new b(this, 0);
    }

    public PieChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.B = new RectF();
        this.C = true;
        this.D = new float[1];
        this.E = new float[1];
        this.F = true;
        this.G = "";
        this.H = d.b(0.0f, 0.0f);
        this.I = 50.0f;
        this.f30173J = 55.0f;
        this.K = true;
        this.L = 100.0f;
        this.M = 360.0f;
    }
}
