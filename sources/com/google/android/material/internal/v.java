package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class v implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f32803a;

    public v(Interpolator interpolator) {
        this.f32803a = interpolator;
    }

    public static TimeInterpolator a(boolean z13, Interpolator interpolator) {
        return z13 ? interpolator : new v(interpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        return 1.0f - this.f32803a.getInterpolation(f13);
    }
}
