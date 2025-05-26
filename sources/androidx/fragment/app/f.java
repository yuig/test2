package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18318c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18319d;

    /* renamed from: e, reason: collision with root package name */
    public tb.e f18320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z1 operation, j5.d signal, boolean z13) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f18318c = z13;
    }

    public final tb.e c(Context context) {
        Animation loadAnimation;
        tb.e eVar;
        tb.e eVar2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f18319d) {
            return this.f18320e;
        }
        z1 z1Var = this.f18322a;
        Fragment fragment = z1Var.f18510c;
        boolean z13 = z1Var.f18508a == x1.VISIBLE;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = this.f18318c ? z13 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z13 ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(l6.b.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(l6.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z13, popEnterAnim);
            if (onCreateAnimation != null) {
                eVar2 = new tb.e(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z13, popEnterAnim);
                if (onCreateAnimator != null) {
                    eVar2 = new tb.e(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z13 ? b7.c.S(context, R.attr.activityOpenEnterAnimation) : b7.c.S(context, R.attr.activityOpenExitAnimation) : z13 ? l6.a.fragment_fade_enter : l6.a.fragment_fade_exit : z13 ? b7.c.S(context, R.attr.activityCloseEnterAnimation) : b7.c.S(context, R.attr.activityCloseExitAnimation) : z13 ? l6.a.fragment_close_enter : l6.a.fragment_close_exit : z13 ? l6.a.fragment_open_enter : l6.a.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e13) {
                                    throw e13;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    eVar = new tb.e(loadAnimation);
                                    eVar2 = eVar;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                eVar = new tb.e(loadAnimator);
                                eVar2 = eVar;
                            }
                        } catch (RuntimeException e14) {
                            if (equals) {
                                throw e14;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                eVar2 = new tb.e(loadAnimation2);
                            }
                        }
                    }
                }
            }
            this.f18320e = eVar2;
            this.f18319d = true;
            return eVar2;
        }
        eVar2 = null;
        this.f18320e = eVar2;
        this.f18319d = true;
        return eVar2;
    }
}
