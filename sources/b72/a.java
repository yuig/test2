package b72;

import a72.b;
import a72.c;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f22095a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f22096b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f22097c;

    public a(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f22095a = matrix;
        this.f22096b = new StringBuilder();
        this.f22097c = new float[2];
    }

    public final void a(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        PointF point2 = new PointF(point);
        Intrinsics.checkNotNullParameter(point2, "point");
        float f13 = point2.x;
        float[] fArr = this.f22097c;
        fArr[0] = f13;
        fArr[1] = point2.y;
        this.f22095a.mapPoints(fArr);
        PointF pointF = new PointF(fArr[0], fArr[1]);
        StringBuilder sb3 = this.f22096b;
        sb3.append("L");
        sb3.append(pointF.x);
        sb3.append(" ");
        sb3.append(pointF.y);
    }

    public final void b(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        PointF point2 = new PointF(point);
        Intrinsics.checkNotNullParameter(point2, "point");
        float f13 = point2.x;
        float[] fArr = this.f22097c;
        fArr[0] = f13;
        fArr[1] = point2.y;
        this.f22095a.mapPoints(fArr);
        PointF pointF = new PointF(fArr[0], fArr[1]);
        StringBuilder sb3 = this.f22096b;
        sb3.append("M");
        sb3.append(pointF.x);
        sb3.append(" ");
        sb3.append(pointF.y);
    }

    public final void c(float f13, float f14, b init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Matrix matrix = new Matrix(this.f22095a);
        matrix.postScale(f13, f14);
        a aVar = new a(matrix);
        init.invoke(aVar);
        String sb3 = aVar.f22096b.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f22096b.append(sb3);
    }

    public final void d(float f13, float f14, c init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Matrix matrix = new Matrix(this.f22095a);
        matrix.postTranslate(f13, f14);
        a aVar = new a(matrix);
        init.invoke(aVar);
        String sb3 = aVar.f22096b.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f22096b.append(sb3);
    }
}
