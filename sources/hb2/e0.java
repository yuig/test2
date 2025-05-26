package hb2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class e0 extends AnimatorListenerAdapter {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        super.onAnimationEnd(animation);
        animation.setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        animation.start();
    }
}
