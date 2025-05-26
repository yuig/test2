package y5;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class c implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        float f14 = f13 - 1.0f;
        return (f14 * f14 * f14 * f14 * f14) + 1.0f;
    }
}
