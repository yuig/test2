package ir;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import qa2.a1;
import x81.o0;

/* loaded from: classes3.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73449b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f73448a = i13;
        this.f73449b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f73448a) {
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ((o0) this.f73449b).f134266c0 = false;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rg0.n nVar;
        gb2.k kVar;
        int i13 = this.f73448a;
        Object obj = this.f73449b;
        switch (i13) {
            case 0:
                ((GridPlaceholderLoadingLayout) obj).i();
                break;
            case 1:
                TabBarPlaceholderLoadingLayout c13 = ((c) obj).c();
                if (c13 != null) {
                    c13.i();
                    break;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                m81.r rVar = ((u81.m) obj).f121049a.X1;
                if (rVar != null && (nVar = ((s81.p) rVar).T) != null) {
                    nVar.g();
                    nVar.a(null, null);
                    break;
                }
                break;
            case 3:
                ((AnimatorSet) obj).start();
                break;
            case 4:
                ((RelativeLayout) obj).removeAllViews();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ((o0) obj).f134266c0 = false;
                break;
            case 6:
                xi1.c cVar = (xi1.c) obj;
                xi1.i iVar = cVar.f135036h;
                vn1.c cVar2 = cVar.f135045q;
                if (cVar2 == null) {
                    cVar2 = cVar.f135038j;
                }
                iVar.q(cVar2);
                rm1.c cVar3 = cVar.f135046r;
                if (cVar3 == null) {
                    cVar3 = cVar.f135039k;
                }
                cVar.f135036h.p(cVar3);
                cVar.f135041m = true;
                break;
            case 7:
                break;
            case 8:
                ((ViewGroup) obj).setVisibility(8);
                break;
            case 9:
                ((com.pinterest.shuffles.scene.composer.n) obj).f52104b.invoke();
                break;
            case 10:
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animator, "animation");
                a1 a1Var = (a1) obj;
                if (!a1Var.E && (kVar = a1Var.C) != null) {
                    gb2.f fVar = gb2.f.f64747a;
                    gb2.f.c(new gb2.k(kVar.f64758a, wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE, kVar.f64760c, kVar.f64761d));
                    break;
                }
                break;
            case 12:
                ua2.n nVar2 = (ua2.n) obj;
                wa2.g gVar = nVar2.f121572q;
                vn1.c color = nVar2.f121578w;
                if (color == null) {
                    color = nVar2.f121576u;
                }
                gVar.getClass();
                Intrinsics.checkNotNullParameter(color, "color");
                gVar.f128711s = color;
                rm1.c color2 = nVar2.f121579x;
                if (color2 == null) {
                    color2 = nVar2.f121577v;
                }
                wa2.g gVar2 = nVar2.f121572q;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(color2, "color");
                gVar2.f128712t = color2;
                nVar2.getClass();
                break;
            default:
                hb2.t tVar = (hb2.t) obj;
                pk.a0.q(tVar.f68609c, bs1.c.j2(new String[0], x0.back_online_indicator));
                tVar.a(BaseRecyclerCellView.AUTOSCROLL_DELAY, false);
                tVar.f68611e = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f73448a) {
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animator, "animation");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f73448a;
        Object obj = this.f73449b;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ((o0) obj).f134266c0 = true;
                break;
            case 7:
                ((qv1.f) obj).f105262l = true;
                break;
            case 10:
                ((BasePlaceholderLoadingLayout) obj).f52295g = true;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(animator, "animation");
                break;
        }
    }
}
