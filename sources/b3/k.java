package b3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f21334a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f21335b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f21336c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f21337d;

    public k(Path path) {
        this.f21334a = path;
    }

    public final void c() {
        this.f21334a.close();
    }

    public final a3.d d() {
        if (this.f21335b == null) {
            this.f21335b = new RectF();
        }
        RectF rectF = this.f21335b;
        Intrinsics.f(rectF);
        this.f21334a.computeBounds(rectF, true);
        return new a3.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean e(o0 o0Var, o0 o0Var2, int i13) {
        Path.Op op3 = kh2.j.B(i13, 0) ? Path.Op.DIFFERENCE : kh2.j.B(i13, 1) ? Path.Op.INTERSECT : kh2.j.B(i13, 4) ? Path.Op.REVERSE_DIFFERENCE : kh2.j.B(i13, 2) ? Path.Op.UNION : Path.Op.XOR;
        if (!(o0Var instanceof k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((k) o0Var).f21334a;
        if (o0Var2 instanceof k) {
            return this.f21334a.op(path, ((k) o0Var2).f21334a, op3);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void f(float f13, float f14, float f15, float f16) {
        this.f21334a.quadTo(f13, f14, f15, f16);
    }

    public final void g(float f13, float f14) {
        this.f21334a.rMoveTo(f13, f14);
    }

    public final void h() {
        this.f21334a.reset();
    }

    public final void i(int i13) {
        this.f21334a.setFillType(i13 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
