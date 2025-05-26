package q6;

import a.cb;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f102586a;

    /* renamed from: b, reason: collision with root package name */
    public final float f102587b;

    public d(float[] fArr) {
        this.f102586a = fArr;
        this.f102587b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        if (f13 >= 1.0f) {
            return 1.0f;
        }
        if (f13 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f102586a;
        int min = Math.min((int) ((fArr.length - 1) * f13), fArr.length - 2);
        float f14 = this.f102587b;
        float a13 = cb.a(min, f14, f13, f14);
        float f15 = fArr[min];
        return ep.b.a(fArr[min + 1], f15, a13, f15);
    }
}
