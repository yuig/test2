package b3;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final Paint f21325a;

    /* renamed from: b */
    public int f21326b = 3;

    /* renamed from: c */
    public Shader f21327c;

    /* renamed from: d */
    public p f21328d;

    /* renamed from: e */
    public p0 f21329e;

    public i(Paint paint) {
        this.f21325a = paint;
    }

    public final int a() {
        Paint.Cap strokeCap = this.f21325a.getStrokeCap();
        int i13 = strokeCap == null ? -1 : j.f21331a[strokeCap.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int b() {
        Paint.Join strokeJoin = this.f21325a.getStrokeJoin();
        int i13 = strokeJoin == null ? -1 : j.f21332b[strokeJoin.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void c(float f13) {
        this.f21325a.setAlpha((int) Math.rint(f13 * 255.0f));
    }

    public final void d(int i13) {
        if (s0.a(this.f21326b, i13)) {
            return;
        }
        this.f21326b = i13;
        int i14 = Build.VERSION.SDK_INT;
        Paint paint = this.f21325a;
        if (i14 >= 29) {
            c1.f21308a.a(paint, i13);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.w(i13)));
        }
    }

    public final void e(long j13) {
        this.f21325a.setColor(androidx.compose.ui.graphics.a.u(j13));
    }

    public final void f(p pVar) {
        this.f21328d = pVar;
        this.f21325a.setColorFilter(pVar != null ? pVar.f21344a : null);
    }

    public final void g(int i13) {
        this.f21325a.setFilterBitmap(!s0.c(i13, 0));
    }

    public final void h(p0 p0Var) {
        l lVar = (l) p0Var;
        this.f21325a.setPathEffect(lVar != null ? lVar.f21339a : null);
        this.f21329e = p0Var;
    }

    public final void i(Shader shader) {
        this.f21327c = shader;
        this.f21325a.setShader(shader);
    }

    public final void j(int i13) {
        this.f21325a.setStrokeCap(s0.d(i13, 2) ? Paint.Cap.SQUARE : s0.d(i13, 1) ? Paint.Cap.ROUND : s0.d(i13, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void k(int i13) {
        this.f21325a.setStrokeJoin(s0.e(i13, 0) ? Paint.Join.MITER : s0.e(i13, 2) ? Paint.Join.BEVEL : s0.e(i13, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void l(float f13) {
        this.f21325a.setStrokeWidth(f13);
    }

    public final void m(int i13) {
        this.f21325a.setStyle(i13 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
