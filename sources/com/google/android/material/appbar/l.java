package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f32201a = {R.attr.stateListAnimator};

    public static void a(View view, float f13) {
        int integer = view.getResources().getInteger(fj.h.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j13 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, fj.c.state_liftable, -fj.c.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j13));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f13).setDuration(j13));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
