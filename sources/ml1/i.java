package ml1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends m {
    @Override // ml1.m
    public final Animator b(com.pinterest.framework.screens.l screenFactory, ViewGroup transitionContainer, r action, d screenInfo, ScreenDescription transitionScreenDescription, ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionScreenDescription, "transitionScreenDescription");
        ObjectAnimator duration = ObjectAnimator.ofFloat(transitionContainer, (Property<ViewGroup, Float>) View.ALPHA, 1.0f).setDuration(0L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }
}
