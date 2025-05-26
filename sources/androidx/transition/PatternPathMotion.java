package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import ao2.m0;
import kh2.k3;
import org.xmlpull.v1.XmlPullParser;
import ua.k0;

/* loaded from: classes3.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a, reason: collision with root package name */
    public final Path f19830a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f19831b = new Matrix();

    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121287j);
        try {
            String E = m0.E(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (E == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(k3.J(E));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.transition.PathMotion
    public final Path a(float f13, float f14, float f15, float f16) {
        float f17 = f16 - f14;
        float sqrt = (float) Math.sqrt((f17 * f17) + (r6 * r6));
        double atan2 = Math.atan2(f17, f15 - f13);
        Matrix matrix = this.f19831b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(atan2));
        matrix.postTranslate(f13, f14);
        Path path = new Path();
        this.f19830a.transform(matrix, path);
        return path;
    }

    public final void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f13 = fArr[0];
        float f14 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f15 = fArr[0];
        float f16 = fArr[1];
        if (f15 == f13 && f16 == f14) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f19831b;
        matrix.setTranslate(-f15, -f16);
        float f17 = f14 - f16;
        float sqrt = 1.0f / ((float) Math.sqrt((f17 * f17) + (r2 * r2)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f17, f13 - f15)));
        path.transform(matrix, this.f19830a);
    }
}
