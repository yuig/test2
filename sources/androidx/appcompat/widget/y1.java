package androidx.appcompat.widget;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class y1 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModifiedSwitchCompat f16738b;

    public y1(ModifiedSwitchCompat modifiedSwitchCompat, boolean z13) {
        this.f16738b = modifiedSwitchCompat;
        this.f16737a = z13;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ModifiedSwitchCompat modifiedSwitchCompat = this.f16738b;
        if (modifiedSwitchCompat.D == animation) {
            modifiedSwitchCompat.h(this.f16737a ? 1.0f : 0.0f);
            modifiedSwitchCompat.D = null;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
