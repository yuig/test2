package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class m0 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19511a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        switch (this.f19511a) {
            case 0:
                return f13 * f13 * f13 * f13 * f13;
            default:
                float f14 = f13 - 1.0f;
                return (f14 * f14 * f14 * f14 * f14) + 1.0f;
        }
    }
}
