package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends m {

    /* renamed from: a, reason: collision with root package name */
    public View f87524a;

    @Override // ml1.m
    public final Animator b(com.pinterest.framework.screens.l screenFactory, ViewGroup transitionContainer, r action, d screenInfo, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        if (screenDescription != null) {
            this.f87524a = ((il1.b) screenFactory).j(screenDescription);
        }
        View j13 = ((il1.b) screenFactory).j(transitionScreenDescription);
        if (j13 == null) {
            return new AnimatorSet();
        }
        int i13 = e.f87523a[action.ordinal()];
        if (i13 != 1 && i13 != 2) {
            return m.c(j13);
        }
        return d(j13);
    }

    public final AnimatorSet d(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        View view2 = this.f87524a;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 1.0f, 0.0f).setDuration(200L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(300L));
        return animatorSet;
    }
}
