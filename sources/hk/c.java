package hk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.h;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wa2.a0;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69294a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f69295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f69297d;

    public c(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z13, View view) {
        this.f69297d = fabTransformationScrimBehavior;
        this.f69295b = z13;
        this.f69296c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f69294a) {
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) this.f69296c;
                legoFloatingBottomNavBar.f49968p = false;
                legoFloatingBottomNavBar.f49969q = false;
                break;
            default:
                super.onAnimationCancel(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        a0 a0Var;
        int i13 = this.f69294a;
        boolean z13 = this.f69295b;
        Object obj = this.f69296c;
        Object obj2 = this.f69297d;
        switch (i13) {
            case 0:
                if (!z13) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                h hVar = (h) obj;
                f30 f30Var = (f30) obj2;
                if (!((es.c) hVar.f47222o).M(f30Var) && !b40.X0(f30Var) && !hVar.l()) {
                    v7 G5 = f30Var.G5();
                    if ((G5 != null ? G5.j1() : null) != null || z13) {
                        a0Var = a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION;
                        hVar.m(f30Var, a0Var, z13);
                        break;
                    }
                }
                a0Var = a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN;
                hVar.m(f30Var, a0Var, z13);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj;
                legoFloatingBottomNavBar.f49968p = false;
                legoFloatingBottomNavBar.f49969q = false;
                ((Function1) obj2).invoke(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f69294a;
        boolean z13 = this.f69295b;
        Object obj = this.f69296c;
        switch (i13) {
            case 0:
                if (z13) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animation);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj;
                legoFloatingBottomNavBar.f49968p = z13;
                legoFloatingBottomNavBar.f49969q = !z13;
                break;
        }
    }

    public c(h hVar, f30 f30Var, boolean z13) {
        this.f69296c = hVar;
        this.f69297d = f30Var;
        this.f69295b = z13;
    }

    public c(LegoFloatingBottomNavBar legoFloatingBottomNavBar, boolean z13, Function1 function1) {
        this.f69296c = legoFloatingBottomNavBar;
        this.f69295b = z13;
        this.f69297d = function1;
    }
}
