package ev;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.pinterest.ads.feature.waista.view.GenAiDisclosureSkeletonLoadingView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GenAiDisclosureSkeletonLoadingView f60226b;

    public /* synthetic */ j(GenAiDisclosureSkeletonLoadingView genAiDisclosureSkeletonLoadingView, int i13) {
        this.f60225a = i13;
        this.f60226b = genAiDisclosureSkeletonLoadingView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f60225a;
        GenAiDisclosureSkeletonLoadingView genAiDisclosureSkeletonLoadingView = this.f60226b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                genAiDisclosureSkeletonLoadingView.setVisibility(8);
                genAiDisclosureSkeletonLoadingView.setAlpha(1.0f);
                AnimatorSet animatorSet = genAiDisclosureSkeletonLoadingView.f35415g;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                genAiDisclosureSkeletonLoadingView.clearAnimation();
                genAiDisclosureSkeletonLoadingView.f35415g = null;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                genAiDisclosureSkeletonLoadingView.setVisibility(8);
                genAiDisclosureSkeletonLoadingView.setAlpha(1.0f);
                AnimatorSet animatorSet2 = genAiDisclosureSkeletonLoadingView.f35415g;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                genAiDisclosureSkeletonLoadingView.clearAnimation();
                genAiDisclosureSkeletonLoadingView.f35415g = null;
                break;
        }
    }
}
