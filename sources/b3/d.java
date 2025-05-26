package b3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f21309a = e.f21312a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f21310b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f21311c;

    @Override // b3.u
    public final void a(float f13, float f14, float f15, float f16, i iVar) {
        this.f21309a.drawRect(f13, f14, f15, f16, iVar.f21325a);
    }

    @Override // b3.u
    public final void b(float f13, float f14) {
        this.f21309a.scale(f13, f14);
    }

    @Override // b3.u
    public final void d(o0 o0Var, int i13) {
        Canvas canvas = this.f21309a;
        if (!(o0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((k) o0Var).f21334a, kh2.d.q(i13) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b3.u
    public final void e(float f13, float f14, float f15, float f16, int i13) {
        this.f21309a.clipRect(f13, f14, f15, f16, kh2.d.q(i13) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // b3.u
    public final void f(float f13, float f14) {
        this.f21309a.translate(f13, f14);
    }

    @Override // b3.u
    public final void g() {
        kg.t.w(this.f21309a, true);
    }

    @Override // b3.u
    public final void h(long j13, long j14, i iVar) {
        this.f21309a.drawLine(a3.c.d(j13), a3.c.e(j13), a3.c.d(j14), a3.c.e(j14), iVar.f21325a);
    }

    @Override // b3.u
    public final void i(float f13, float f14, float f15, float f16, float f17, float f18, i iVar) {
        this.f21309a.drawRoundRect(f13, f14, f15, f16, f17, f18, iVar.f21325a);
    }

    @Override // b3.u
    public final void j() {
        this.f21309a.save();
    }

    @Override // b3.u
    public final void k() {
        kg.t.w(this.f21309a, false);
    }

    @Override // b3.u
    public final void l(float[] fArr) {
        int i13 = 0;
        while (i13 < 4) {
            int i14 = 0;
            while (i14 < 4) {
                if (fArr[(i13 * 4) + i14] != (i13 == i14 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    androidx.compose.ui.graphics.a.r(matrix, fArr);
                    this.f21309a.concat(matrix);
                    return;
                }
                i14++;
            }
            i13++;
        }
    }

    @Override // b3.u
    public final void m(f0 f0Var, long j13, i iVar) {
        this.f21309a.drawBitmap(androidx.compose.ui.graphics.a.l(f0Var), a3.c.d(j13), a3.c.e(j13), iVar.f21325a);
    }

    @Override // b3.u
    public final void n() {
        this.f21309a.rotate(45.0f);
    }

    @Override // b3.u
    public final void o(a3.d dVar, i iVar) {
        Canvas canvas = this.f21309a;
        Paint paint = iVar.f21325a;
        canvas.saveLayer(dVar.f484a, dVar.f485b, dVar.f486c, dVar.f487d, paint, 31);
    }

    @Override // b3.u
    public final void p(o0 o0Var, i iVar) {
        Canvas canvas = this.f21309a;
        if (!(o0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((k) o0Var).f21334a, iVar.f21325a);
    }

    @Override // b3.u
    public final void r(float f13, long j13, i iVar) {
        this.f21309a.drawCircle(a3.c.d(j13), a3.c.e(j13), f13, iVar.f21325a);
    }

    @Override // b3.u
    public final void restore() {
        this.f21309a.restore();
    }

    @Override // b3.u
    public final void s(f0 f0Var, long j13, long j14, long j15, long j16, i iVar) {
        if (this.f21310b == null) {
            this.f21310b = new Rect();
            this.f21311c = new Rect();
        }
        Canvas canvas = this.f21309a;
        Bitmap l13 = androidx.compose.ui.graphics.a.l(f0Var);
        Rect rect = this.f21310b;
        Intrinsics.f(rect);
        int i13 = (int) (j13 >> 32);
        rect.left = i13;
        int i14 = (int) (j13 & 4294967295L);
        rect.top = i14;
        rect.right = i13 + ((int) (j14 >> 32));
        rect.bottom = i14 + ((int) (j14 & 4294967295L));
        Unit unit = Unit.f80348a;
        Rect rect2 = this.f21311c;
        Intrinsics.f(rect2);
        int i15 = (int) (j15 >> 32);
        rect2.left = i15;
        int i16 = (int) (j15 & 4294967295L);
        rect2.top = i16;
        rect2.right = i15 + ((int) (j16 >> 32));
        rect2.bottom = i16 + ((int) (j16 & 4294967295L));
        canvas.drawBitmap(l13, rect, rect2, iVar.f21325a);
    }

    public final Canvas t() {
        return this.f21309a;
    }

    public final void u(Canvas canvas) {
        this.f21309a = canvas;
    }
}
