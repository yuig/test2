package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends m {
    @Override // ml1.m
    public final Animator b(com.pinterest.framework.screens.l screenFactory, ViewGroup transitionContainer, r action, d screenInfo, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        AnimatorSet animatorSet;
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        View j13 = ((il1.b) screenFactory).j(transitionScreenDescription);
        if (j13 == null) {
            return new AnimatorSet();
        }
        int i13 = g.f87525a[action.ordinal()];
        if (i13 == 1) {
            animatorSet = new AnimatorSet();
            animatorSet.setDuration(270L);
            animatorSet.setInterpolator(new DecelerateInterpolator(1.1f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 0.9f, 1.0f), ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.Y, screenInfo.v(), 0.0f));
        } else {
            if (i13 != 2) {
                return m.c(j13);
            }
            animatorSet = new AnimatorSet();
            animatorSet.setDuration(220L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(j13, (Property<View, Float>) View.Y, 0.0f, screenInfo.v()));
        }
        return animatorSet;
    }
}
