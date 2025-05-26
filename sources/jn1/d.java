package jn1;

import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface d extends Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    default void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    default void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
