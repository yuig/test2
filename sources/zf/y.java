package zf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.charts.RadarChart;

/* loaded from: classes3.dex */
public final class y extends w {

    /* renamed from: n, reason: collision with root package name */
    public RadarChart f141895n;

    @Override // zf.a
    public final void r(float f13, float f14) {
        int i13;
        char c13;
        float f15 = f13;
        sf.a aVar = this.f141818b;
        int i14 = aVar.f112456n;
        double abs = Math.abs(f14 - f15);
        if (i14 == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            aVar.f112453k = new float[0];
            aVar.f112454l = 0;
            return;
        }
        double f16 = ag.i.f(abs / i14);
        double f17 = ag.i.f(Math.pow(10.0d, (int) Math.log10(f16)));
        if (((int) (f16 / f17)) > 5) {
            f16 = Math.floor(f17 * 10.0d);
        }
        if (aVar.f112457o) {
            float f18 = ((float) abs) / (i14 - 1);
            aVar.f112454l = i14;
            if (aVar.f112453k.length < i14) {
                aVar.f112453k = new float[i14];
            }
            for (int i15 = 0; i15 < i14; i15++) {
                aVar.f112453k[i15] = f15;
                f15 += f18;
            }
        } else {
            double ceil = f16 == 0.0d ? 0.0d : Math.ceil(f15 / f16) * f16;
            double e13 = f16 == 0.0d ? 0.0d : ag.i.e(Math.floor(f14 / f16) * f16);
            if (f16 != 0.0d) {
                i13 = 0;
                for (double d2 = ceil; d2 <= e13; d2 += f16) {
                    i13++;
                }
            } else {
                i13 = 0;
            }
            int i16 = i13 + 1;
            aVar.f112454l = i16;
            if (aVar.f112453k.length < i16) {
                aVar.f112453k = new float[i16];
            }
            for (int i17 = 0; i17 < i16; i17++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                aVar.f112453k[i17] = (float) ceil;
                ceil += f16;
            }
            i14 = i16;
        }
        if (f16 < 1.0d) {
            aVar.f112455m = (int) Math.ceil(-Math.log10(f16));
            c13 = 0;
        } else {
            c13 = 0;
            aVar.f112455m = 0;
        }
        float[] fArr = aVar.f112453k;
        float f19 = fArr[c13];
        aVar.f112468z = f19;
        float f23 = fArr[i14 - 1];
        aVar.f112467y = f23;
        aVar.A = Math.abs(f23 - f19);
    }

    @Override // zf.w
    public final void w(Canvas canvas) {
        sf.p pVar = this.f141887h;
        if (pVar.f112469a && pVar.f112460r) {
            Paint paint = this.f141821e;
            paint.setTypeface(null);
            paint.setTextSize(pVar.f112472d);
            paint.setColor(pVar.f112473e);
            RadarChart radarChart = this.f141895n;
            ag.d m13 = radarChart.m();
            ag.d b13 = ag.d.b(0.0f, 0.0f);
            RectF rectF = radarChart.f30166r.f15115b;
            float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) / radarChart.C.A;
            int i13 = pVar.C ? pVar.f112454l : pVar.f112454l - 1;
            for (int i14 = !pVar.B ? 1 : 0; i14 < i13; i14++) {
                float f13 = (pVar.f112453k[i14] - pVar.f112468z) * min;
                float f14 = radarChart.f30174y;
                DisplayMetrics displayMetrics = ag.i.f15104a;
                double d2 = f13;
                double d13 = f14;
                b13.f15087b = (float) (m13.f15087b + (Math.cos(Math.toRadians(d13)) * d2));
                b13.f15088c = (float) ((Math.sin(Math.toRadians(d13)) * d2) + m13.f15088c);
                canvas.drawText(pVar.d(i14), b13.f15087b + 10.0f, b13.f15088c, paint);
            }
            ag.d.c(m13);
            ag.d.c(b13);
        }
    }

    @Override // zf.w
    public final void z() {
        if (this.f141887h.f112461s == null) {
            return;
        }
        this.f141895n.J();
        throw null;
    }
}
