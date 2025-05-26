package com.pinterest.shuffles.scene.composer;

import android.view.animation.Interpolator;

/* loaded from: classes4.dex */
public final class y0 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52179a;

    /* renamed from: b, reason: collision with root package name */
    public final float f52180b;

    public y0() {
        this.f52179a = 0;
        this.f52180b = 2.0f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        int i13 = this.f52179a;
        float f14 = this.f52180b;
        switch (i13) {
            case 0:
                return ((((float) Math.atan(((float) Math.sin((f13 - 0.5f) * 3.1415927f)) * f14)) * 0.5f) / ((float) Math.atan(f14))) + 0.5f;
            default:
                float f15 = ql2.s.f(f13, 0.0f, 1.0f);
                float f16 = 1;
                return ep.b.a(f16, f15, f16 - (((float) Math.exp((-5.4365635f) * f15)) * ((float) Math.cos(((f16 - f14) * 15) * f15))), f15);
        }
    }

    public y0(float f13) {
        this.f52179a = 1;
        this.f52180b = f13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i13) {
        this(0.2f);
        this.f52179a = 1;
    }
}
