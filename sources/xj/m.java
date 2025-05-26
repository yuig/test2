package xj;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import c0.s0;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import kh2.g0;

/* loaded from: classes3.dex */
public final class m extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public float f135127b;

    /* renamed from: c, reason: collision with root package name */
    public float f135128c;

    /* renamed from: d, reason: collision with root package name */
    public float f135129d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f135130e;

    /* renamed from: f, reason: collision with root package name */
    public float f135131f;

    @Override // c0.s0
    public final void b(Canvas canvas, Rect rect, float f13, boolean z13, boolean z14) {
        this.f135127b = rect.width();
        float f14 = ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135074a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f14) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) ((c) this.f24333a)).f32925j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f15 = this.f135127b / 2.0f;
        float f16 = f14 / 2.0f;
        canvas.clipRect(-f15, -f16, f15, f16);
        Object obj = this.f24333a;
        this.f135130e = ((LinearProgressIndicatorSpec) ((c) obj)).f135074a / 2 == ((LinearProgressIndicatorSpec) ((c) obj)).f135075b;
        this.f135128c = ((LinearProgressIndicatorSpec) ((c) obj)).f135074a * f13;
        this.f135129d = Math.min(((LinearProgressIndicatorSpec) ((c) obj)).f135074a / 2, ((LinearProgressIndicatorSpec) ((c) obj)).f135075b) * f13;
        if (z13 || z14) {
            if ((z13 && ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135078e == 2) || (z14 && ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135079f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z13 || (z14 && ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135079f != 3)) {
                canvas.translate(0.0f, ((1.0f - f13) * ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135074a) / 2.0f);
            }
        }
        if (z14 && ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135079f == 3) {
            this.f135131f = f13;
        } else {
            this.f135131f = 1.0f;
        }
    }

    @Override // c0.s0
    public final void e(Canvas canvas, Paint paint, int i13, int i14) {
        int m13 = b7.c.m(i13, i14);
        if (((LinearProgressIndicatorSpec) ((c) this.f24333a)).f32926k <= 0 || m13 == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(m13);
        PointF pointF = new PointF((this.f135127b / 2.0f) - (this.f135128c / 2.0f), 0.0f);
        int i15 = ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f32926k;
        r(canvas, paint, pointF, null, i15, i15);
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
        return ((LinearProgressIndicatorSpec) ((c) this.f24333a)).f135074a;
    }

    @Override // c0.s0
    public final int i() {
        return -1;
    }

    public final void q(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15) {
        float p13 = com.bumptech.glide.c.p(f13, 0.0f, 1.0f);
        float p14 = com.bumptech.glide.c.p(f14, 0.0f, 1.0f);
        float h03 = g0.h0(1.0f - this.f135131f, 1.0f, p13);
        float h04 = g0.h0(1.0f - this.f135131f, 1.0f, p14);
        int p15 = (int) ((com.bumptech.glide.c.p(h03, 0.0f, 0.01f) * i14) / 0.01f);
        float p16 = 1.0f - com.bumptech.glide.c.p(h04, 0.99f, 1.0f);
        float f15 = this.f135127b;
        int i16 = (int) ((h03 * f15) + p15);
        int i17 = (int) ((h04 * f15) - ((int) ((p16 * i15) / 0.01f)));
        float f16 = (-f15) / 2.0f;
        if (i16 <= i17) {
            float f17 = this.f135129d;
            float f18 = i16 + f17;
            float f19 = i17 - f17;
            float f23 = f17 * 2.0f;
            paint.setColor(i13);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f135128c);
            if (f18 >= f19) {
                r(canvas, paint, new PointF(f18 + f16, 0.0f), new PointF(f19 + f16, 0.0f), f23, this.f135128c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f135130e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f24 = f18 + f16;
            float f25 = f19 + f16;
            canvas.drawLine(f24, 0.0f, f25, 0.0f, paint);
            if (this.f135130e || this.f135129d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f18 > 0.0f) {
                r(canvas, paint, new PointF(f24, 0.0f), null, f23, this.f135128c);
            }
            if (f19 < this.f135127b) {
                r(canvas, paint, new PointF(f25, 0.0f), null, f23, this.f135128c);
            }
        }
    }

    public final void r(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f13, float f14) {
        float min = Math.min(f14, this.f135128c);
        float f15 = f13 / 2.0f;
        float min2 = Math.min(f15, (this.f135129d * min) / this.f135128c);
        RectF rectF = new RectF((-f13) / 2.0f, (-min) / 2.0f, f15, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
