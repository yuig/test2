package sf;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public final class p extends a {
    public final n G;
    public final boolean B = true;
    public final boolean C = true;
    public final float D = 10.0f;
    public final float E = 10.0f;
    public final o F = o.OUTSIDE_CHART;
    public final float H = Float.POSITIVE_INFINITY;

    public p(n nVar) {
        this.G = nVar;
        this.f112471c = 0.0f;
    }

    public final void p(float f13, float f14) {
        if (Math.abs(f14 - f13) == 0.0f) {
            f14 += 1.0f;
            f13 -= 1.0f;
        }
        float abs = Math.abs(f14 - f13);
        float f15 = this.f112465w ? this.f112468z : f13 - ((abs / 100.0f) * this.E);
        this.f112468z = f15;
        float f16 = this.f112466x ? this.f112467y : f14 + ((abs / 100.0f) * this.D);
        this.f112467y = f16;
        this.A = Math.abs(f15 - f16);
    }

    public final float q(Paint paint) {
        paint.setTextSize(this.f112472d);
        String e13 = e();
        DisplayMetrics displayMetrics = ag.i.f15104a;
        float measureText = (this.f112470b * 2.0f) + ((int) paint.measureText(e13));
        float f13 = this.H;
        if (f13 > 0.0f && f13 != Float.POSITIVE_INFINITY) {
            f13 = ag.i.c(f13);
        }
        if (f13 <= 0.0d) {
            f13 = measureText;
        }
        return Math.max(0.0f, Math.min(measureText, f13));
    }

    public final boolean r() {
        if (this.f112469a && this.f112460r) {
            return this.F == o.OUTSIDE_CHART;
        }
        return false;
    }
}
