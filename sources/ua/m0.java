package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.transition.Transition;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121316c;

    public /* synthetic */ m0(int i13, Object obj, Object obj2) {
        this.f121314a = i13;
        this.f121316c = obj;
        this.f121315b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f121314a) {
            case 8:
                ((PinterestToastContainer) this.f121316c).l((View) this.f121315b);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        RelativeLayout relativeLayout;
        int i13 = this.f121314a;
        Object obj = this.f121316c;
        Object obj2 = this.f121315b;
        switch (i13) {
            case 0:
                ((g1.g) obj2).remove(animation);
                ((Transition) obj).f19851s.remove(animation);
                return;
            case 1:
                View view = (View) obj2;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            case 2:
                DrawerLayout drawerLayout = (DrawerLayout) obj2;
                drawerLayout.b((View) obj, false);
                drawerLayout.f18180d = -1728053248;
                drawerLayout.invalidate();
                return;
            case 3:
                oj.g gVar = (oj.g) obj2;
                oj.f a13 = gVar.a();
                a13.f95356c = Float.MAX_VALUE;
                gVar.q(a13);
                return;
            case 4:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((ViewGroup) obj2).setVisibility(8);
                ViewGroup viewGroup = ((tq.b) obj).f118805f;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.setVisibility(0);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(animation, "animator");
                Object obj3 = (yb0.q) obj;
                Intrinsics.g(obj3, "null cannot be cast to non-null type android.view.View");
                ((AlertContainer) obj2).removeView((View) obj3);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((ModalContainer) obj2).f44766k.onAnimationEnd(animation);
                ((jc0.a0) obj).onDisplayed();
                return;
            case 7:
            case 11:
            default:
                super.onAnimationEnd(animation);
                return;
            case 8:
                ((PinterestToastContainer) obj).l((View) obj2);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((View) obj2).setVisibility(8);
                GestaltSpinner gestaltSpinner = ((tt0.l0) obj).A0;
                if (gestaltSpinner != null) {
                    dl2.b.X2(gestaltSpinner, ln1.e.NONE);
                    return;
                } else {
                    Intrinsics.r("cameraLoadingIndicatorView");
                    throw null;
                }
            case 10:
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view2 = (View) obj2;
                if (view2 != null && (relativeLayout = ((com.pinterest.feature.pin.d) obj).f47150g) != null) {
                    relativeLayout.removeView(view2);
                }
                WebImageView webImageView = ((com.pinterest.feature.pin.d) obj).f47149f;
                if (webImageView == null) {
                    return;
                }
                webImageView.setVisibility(0);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) obj).invoke();
                return;
            case 13:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (((ir.q) ((pd.s) obj2).f99750d) != null) {
                    u70.a tab = (u70.a) obj;
                    Intrinsics.checkNotNullParameter(tab, "tab");
                }
                super.onAnimationEnd(animation);
                return;
            case 14:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((pd.s) obj2).j(((View) obj).getId());
                super.onAnimationEnd(animation);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f121314a;
        Object obj = this.f121316c;
        Object obj2 = this.f121315b;
        switch (i13) {
            case 0:
                ((Transition) obj).f19851s.add(animation);
                break;
            case 7:
                for (View view : (List) obj2) {
                    int i14 = PinterestToastContainer.f44919c;
                    if (!(view.getTag() instanceof we0.a) || !((we0.a) view.getTag()).f129241a) {
                        ((PinterestToastContainer) obj).f(view);
                    }
                }
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animation, "animation");
                View view2 = (View) obj2;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = ((vh.d) obj).d();
                }
                view2.getLayoutParams().height = view2.getMeasuredHeight();
                view2.requestLayout();
                view2.setVisibility(0);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) obj2).invoke();
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }

    public /* synthetic */ m0(Object obj, Object obj2, int i13) {
        this.f121314a = i13;
        this.f121315b = obj;
        this.f121316c = obj2;
    }
}
