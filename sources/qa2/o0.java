package qa2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f103330b;

    public /* synthetic */ o0(p0 p0Var, int i13) {
        this.f103329a = i13;
        this.f103330b = p0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        f30 f30Var;
        ti1.f fVar;
        View view;
        f30 f30Var2;
        int i13 = this.f103329a;
        p0 p0Var = this.f103330b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                p0Var.setLayerType(p0Var.getLayerType(), null);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animator");
                f30Var = p0Var.pin;
                Intrinsics.f(f30Var);
                b40.Z0(f30Var, d40.PARTIAL_HIDDEN);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animator");
                fVar = p0Var.gridCell;
                KeyEvent.Callback internalCell = fVar.getInternalCell();
                Intrinsics.g(internalCell, "null cannot be cast to non-null type android.view.View");
                ((View) internalCell).setVisibility(8);
                view = p0Var.feedbackView;
                view.setVisibility(0);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                p0Var.setLayerType(p0Var.getLayerType(), null);
                f30Var2 = p0Var.pin;
                Intrinsics.f(f30Var2);
                b40.Z0(f30Var2, d40.PARTIAL_HIDDEN);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        View view;
        View view2;
        int i13 = this.f103329a;
        p0 p0Var = this.f103330b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                p0Var.setLayerType(2, null);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                view = p0Var.feedbackView;
                view.setVisibility(0);
                view2 = p0Var.feedbackView;
                view2.setAlpha(0.0f);
                p0Var.setLayerType(2, null);
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
