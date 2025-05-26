package bk;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f23128h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f23129b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23130c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23131d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23132e;

    /* renamed from: f, reason: collision with root package name */
    public float f23133f;

    /* renamed from: g, reason: collision with root package name */
    public float f23134g;

    public v(float f13, float f14, float f15, float f16) {
        this.f23129b = f13;
        this.f23130c = f14;
        this.f23131d = f15;
        this.f23132e = f16;
    }

    @Override // bk.x
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f23137a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f23128h;
        rectF.set(this.f23129b, this.f23130c, this.f23131d, this.f23132e);
        path.arcTo(rectF, this.f23133f, this.f23134g, false);
        path.transform(matrix);
    }
}
