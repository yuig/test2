package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class m {
    public static boolean a(com.pinterest.framework.screens.l screenFactory, r action, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        il1.b bVar = (il1.b) screenFactory;
        return bVar.f(transitionScreenDescription) && screenDescription != null && bVar.f(screenDescription);
    }

    public static AnimatorSet c(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(0L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.X, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.Y, 0.0f));
        return animatorSet;
    }

    public abstract Animator b(com.pinterest.framework.screens.l lVar, ViewGroup viewGroup, r rVar, d dVar, ScreenDescription screenDescription, ScreenDescription screenDescription2);
}
