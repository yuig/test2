package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class x1 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19699a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        switch (this.f19699a) {
            case 0:
                float f14 = f13 - 1.0f;
                return (f14 * f14 * f14 * f14 * f14) + 1.0f;
            default:
                float f15 = f13 - 1.0f;
                return (f15 * f15 * f15 * f15 * f15) + 1.0f;
        }
    }
}
