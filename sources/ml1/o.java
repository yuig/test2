package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends m {

    /* renamed from: a, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f87534a = new AccelerateDecelerateInterpolator();

    @Override // ml1.m
    public final Animator b(com.pinterest.framework.screens.l screenFactory, ViewGroup transitionContainer, r action, d screenInfo, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        View j13 = ((il1.b) screenFactory).j(transitionScreenDescription);
        if (j13 == null) {
            return new AnimatorSet();
        }
        int i13 = n.f87533a[action.ordinal()];
        if (i13 == 1) {
            return d(j13, screenInfo.v(), 0.0f);
        }
        if (i13 == 2) {
            return d(j13, 0.0f, -screenInfo.v());
        }
        if (i13 == 3) {
            return d(j13, -screenInfo.v(), 0.0f);
        }
        if (i13 == 4) {
            return d(j13, 0.0f, screenInfo.v());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AnimatorSet d(View view, float f13, float f14) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.f87534a);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, f13, f14));
        return animatorSet;
    }
}
