package xj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c0.s0;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import kh2.g0;

/* loaded from: classes3.dex */
public final class d extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public float f135081b;

    /* renamed from: c, reason: collision with root package name */
    public float f135082c;

    /* renamed from: d, reason: collision with root package name */
    public float f135083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f135084e;

    /* renamed from: f, reason: collision with root package name */
    public float f135085f;

    @Override // c0.s0
    public final void b(Canvas canvas, Rect rect, float f13, boolean z13, boolean z14) {
        float width = rect.width() / s();
        float height = rect.height() / s();
        Object obj = this.f24333a;
        float f14 = (((CircularProgressIndicatorSpec) ((c) obj)).f32919h / 2.0f) + ((CircularProgressIndicatorSpec) ((c) obj)).f32920i;
        canvas.translate((f14 * width) + rect.left, (f14 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((CircularProgressIndicatorSpec) ((c) this.f24333a)).f32921j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f15 = -f14;
        canvas.clipRect(f15, f15, f14, f14);
        Object obj2 = this.f24333a;
        this.f135084e = ((CircularProgressIndicatorSpec) ((c) obj2)).f135074a / 2 <= ((CircularProgressIndicatorSpec) ((c) obj2)).f135075b;
        this.f135081b = ((CircularProgressIndicatorSpec) ((c) obj2)).f135074a * f13;
        this.f135082c = Math.min(((CircularProgressIndicatorSpec) ((c) obj2)).f135074a / 2, ((CircularProgressIndicatorSpec) ((c) obj2)).f135075b) * f13;
        Object obj3 = this.f24333a;
        float f16 = (((CircularProgressIndicatorSpec) ((c) obj3)).f32919h - ((CircularProgressIndicatorSpec) ((c) obj3)).f135074a) / 2.0f;
        this.f135083d = f16;
        if (z13 || z14) {
            if ((z13 && ((CircularProgressIndicatorSpec) ((c) obj3)).f135078e == 2) || (z14 && ((CircularProgressIndicatorSpec) ((c) obj3)).f135079f == 1)) {
                this.f135083d = (((1.0f - f13) * ((CircularProgressIndicatorSpec) ((c) obj3)).f135074a) / 2.0f) + f16;
            } else if ((z13 && ((CircularProgressIndicatorSpec) ((c) obj3)).f135078e == 1) || (z14 && ((CircularProgressIndicatorSpec) ((c) obj3)).f135079f == 2)) {
                this.f135083d = f16 - (((1.0f - f13) * ((CircularProgressIndicatorSpec) ((c) obj3)).f135074a) / 2.0f);
            }
        }
        if (z14 && ((CircularProgressIndicatorSpec) ((c) obj3)).f135079f == 3) {
            this.f135085f = f13;
        } else {
            this.f135085f = 1.0f;
        }
    }

    @Override // c0.s0
    public final void e(Canvas canvas, Paint paint, int i13, int i14) {
    }

    @Override // c0.s0
    public final void f(Canvas canvas, Paint paint, k kVar, int i13) {
        int m13 = b7.c.m(kVar.f135122c, i13);
        float f13 = kVar.f135120a;
        float f14 = kVar.f135121b;
        int i14 = kVar.f135123d;
        q(canvas, paint, f13, f14, m13, i14, i14);
    }

    @Override // c0.s0
    public final void g(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        q(canvas, paint, f13, f14, b7.c.m(i13, i14), i15, i15);
    }

    @Override // c0.s0
    public final int h() {
        return s();
    }

    @Override // c0.s0
    public final int i() {
        return s();
    }

    public final void q(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        float f15 = f14 >= f13 ? f14 - f13 : (f14 + 1.0f) - f13;
        float f16 = f13 % 1.0f;
        if (this.f135085f < 1.0f) {
            float f17 = f16 + f15;
            if (f17 > 1.0f) {
                q(canvas, paint, f16, 1.0f, i13, i14, 0);
                q(canvas, paint, 1.0f, f17, i13, 0, i15);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f135082c / this.f135083d);
        if (f16 == 0.0f && f15 >= 0.99f) {
            f15 += (((degrees * 2.0f) / 360.0f) * (f15 - 0.99f)) / 0.01f;
        }
        float h03 = g0.h0(1.0f - this.f135085f, 1.0f, f16);
        float h04 = g0.h0(0.0f, this.f135085f, f15);
        float degrees2 = (float) Math.toDegrees(i14 / this.f135083d);
        float degrees3 = ((h04 * 360.0f) - degrees2) - ((float) Math.toDegrees(i15 / this.f135083d));
        float f18 = (h03 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i13);
        paint.setStrokeWidth(this.f135081b);
        float f19 = degrees * 2.0f;
        if (degrees3 < f19) {
            float f23 = degrees3 / f19;
            paint.setStyle(Paint.Style.FILL);
            r(canvas, paint, (degrees * f23) + f18, this.f135082c * 2.0f, this.f135081b, f23);
            return;
        }
        float f24 = this.f135083d;
        float f25 = -f24;
        RectF rectF = new RectF(f25, f25, f24, f24);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f135084e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f18 + degrees;
        canvas.drawArc(rectF, f26, degrees3 - f19, false, paint);
        if (this.f135084e || this.f135082c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        r(canvas, paint, f26, this.f135082c * 2.0f, this.f135081b, 1.0f);
        r(canvas, paint, (f18 + degrees3) - degrees, this.f135082c * 2.0f, this.f135081b, 1.0f);
    }

    public final void r(Canvas canvas, Paint paint, float f13, float f14, float f15, float f16) {
        float min = (int) Math.min(f15, this.f135081b);
        float f17 = f14 / 2.0f;
        float min2 = Math.min(f17, (this.f135082c * min) / this.f135081b);
        RectF rectF = new RectF((-min) / 2.0f, (-f14) / 2.0f, min / 2.0f, f17);
        canvas.save();
        double d2 = f13;
        canvas.translate((float) (Math.cos(Math.toRadians(d2)) * this.f135083d), (float) (Math.sin(Math.toRadians(d2)) * this.f135083d));
        canvas.rotate(f13);
        canvas.scale(f16, f16);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int s() {
        Object obj = this.f24333a;
        return (((CircularProgressIndicatorSpec) ((c) obj)).f32920i * 2) + ((CircularProgressIndicatorSpec) ((c) obj)).f32919h;
    }
}
