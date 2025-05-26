package ag;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public final j f15099c;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f15097a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f15098b = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public float[] f15100d = new float[1];

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f15101e = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final float[] f15102f = new float[2];

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f15103g = new Matrix();

    public g(j jVar) {
        new Matrix();
        this.f15099c = jVar;
    }

    public final c a(float f13, float f14) {
        float[] fArr = this.f15102f;
        fArr[0] = f13;
        fArr[1] = f14;
        e(fArr);
        return c.b(fArr[0], fArr[1]);
    }

    public final c b(float f13, float f14) {
        c b13 = c.b(0.0d, 0.0d);
        c(f13, f14, b13);
        return b13;
    }

    public final void c(float f13, float f14, c cVar) {
        float[] fArr = this.f15102f;
        fArr[0] = f13;
        fArr[1] = f14;
        Matrix matrix = this.f15101e;
        matrix.reset();
        this.f15098b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f15099c.f15114a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f15097a.invert(matrix);
        matrix.mapPoints(fArr);
        cVar.f15084b = fArr[0];
        cVar.f15085c = fArr[1];
    }

    public final void d(Path path) {
        path.transform(this.f15097a);
        path.transform(this.f15099c.f15114a);
        path.transform(this.f15098b);
    }

    public final void e(float[] fArr) {
        this.f15097a.mapPoints(fArr);
        this.f15099c.f15114a.mapPoints(fArr);
        this.f15098b.mapPoints(fArr);
    }

    public void f() {
        Matrix matrix = this.f15098b;
        matrix.reset();
        j jVar = this.f15099c;
        matrix.postTranslate(jVar.f15115b.left, jVar.f15117d - jVar.f());
    }

    public final void g(float f13, float f14, float f15, float f16) {
        j jVar = this.f15099c;
        float width = jVar.f15115b.width() / f14;
        float height = jVar.f15115b.height() / f15;
        if (Float.isInfinite(width)) {
            width = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        Matrix matrix = this.f15097a;
        matrix.reset();
        matrix.postTranslate(-f13, -f16);
        matrix.postScale(width, -height);
    }
}
