package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.Transition;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.education.view.EducationPulsarView;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNamingView;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.ui.recyclerview.FastScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16539b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f16538a = i13;
        this.f16539b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i13 = this.f16538a;
        Object obj = this.f16539b;
        switch (i13) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f16245w = null;
                actionBarOverlayLayout.f16232j = false;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(animator, "animator");
                onAnimationEnd(animator);
                break;
            case 25:
                FastScrollerView fastScrollerView = (FastScrollerView) obj;
                kh2.k3.Q1(fastScrollerView.f52634b, 4);
                fastScrollerView.f52638f = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f16538a;
        Object obj = this.f16539b;
        switch (i13) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f16245w = null;
                actionBarOverlayLayout.f16232j = false;
                return;
            case 1:
                ((Transition) obj).s();
                animator.removeListener(this);
                return;
            case 2:
                va.f fVar = (va.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f125034e);
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((va.c) arrayList.get(i14)).a(fVar);
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f32239i = null;
                return;
            case 4:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.Y(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.U.get()).requestLayout();
                return;
            case 5:
                ((oj.g) obj).j();
                return;
            case 6:
                m.h hVar = (m.h) obj;
                if (((ValueAnimator) hVar.f85198c) == animator) {
                    hVar.f85198c = null;
                    return;
                }
                return;
            case 7:
                vj.g gVar = (vj.g) obj;
                gVar.f125890b.setTranslationY(0.0f);
                gVar.c(0.0f);
                return;
            case 8:
            case 16:
            default:
                super.onAnimationEnd(animator);
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.D(5);
                WeakReference weakReference2 = sideSheetBehavior.f33034p;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.f33034p.get()).requestLayout();
                return;
            case 10:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) obj;
                kVar.q();
                kVar.f33247r.start();
                return;
            case 11:
                ((ExpandableTransformationBehavior) obj).f33376b = null;
                return;
            case 12:
                we0.c cVar = (we0.c) obj;
                PinterestToastContainer pinterestToastContainer = cVar.f129249e;
                View view = cVar.f129248d;
                pinterestToastContainer.l(view);
                PinterestToastContainer.g(view);
                return;
            case 13:
                EducationPulsarView educationPulsarView = (EducationPulsarView) obj;
                educationPulsarView.f45019c.removeAllListeners();
                educationPulsarView.a();
                return;
            case 14:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((BoardCreateBoardNamingView) obj).f45159a.requestFocus();
                return;
            case 15:
                Intrinsics.checkNotNullParameter(animator, "animation");
                lq0.o0 o0Var = (lq0.o0) obj;
                bs1.c.U1(o0Var.X8());
                GestaltIconButton gestaltIconButton = o0Var.B1;
                if (gestaltIconButton == null) {
                    Intrinsics.r("addGifReactionToConvoButton");
                    throw null;
                }
                gestaltIconButton.t(lq0.n0.f84371k);
                if (o0Var.W8().b()) {
                    o0Var.f9().clearFocus();
                } else {
                    o0Var.b9().clearFocus();
                }
                nx.d0.B(o0Var.s7(), h32.f1.VIEW, h32.g0.CONVERSATION_GIF_REACTION_TRAY, null, null, 28);
                return;
            case 17:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((AnimatorSet) obj).start();
                return;
            case 18:
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((Animator) obj).start();
                return;
            case 19:
                Intrinsics.checkNotNullParameter(animator, "animator");
                mf.i iVar = (mf.i) obj;
                int i15 = mf.i.f87075f;
                iVar.getClass();
                rg0.n b13 = ((dh0.d) rg0.y.a()).b(i32.y0.ANDROID_REPIN_DIALOG_TAKEOVER);
                if (b13 != null) {
                    b13.a(null, null);
                }
                ViewParent parent = iVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(iVar);
                    return;
                }
                return;
            case 20:
                Intrinsics.checkNotNullParameter(animator, "animation");
                x61.c cVar2 = (x61.c) obj;
                if (!cVar2.f133936d) {
                    cVar2.a();
                    return;
                }
                cVar2.f133936d = false;
                GestaltButtonToggle gestaltButtonToggle = cVar2.f133937e;
                if (gestaltButtonToggle != null) {
                    gestaltButtonToggle.s(x61.b.f133930l);
                    return;
                }
                return;
            case 21:
                Intrinsics.checkNotNullParameter(animator, "animation");
                g71.c cVar3 = (g71.c) obj;
                if (cVar3.f63889b) {
                    return;
                }
                boolean z13 = cVar3.f63888a;
                kg.a.A(z13 ? 0.0f : 1.0f, z13 ? 1.0f : 0.0f, 250L, cVar3.f63891d).start();
                return;
            case 22:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ((sj1.a) obj).c();
                return;
            case 23:
                Intrinsics.checkNotNullParameter(animator, "animation");
                View view2 = ((GestaltSheetHeader) obj).f49587d;
                if (view2 != null) {
                    view2.setVisibility(4);
                    return;
                } else {
                    Intrinsics.r("dragHandle");
                    throw null;
                }
            case 24:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ((ua2.s) obj).f121502f.postInvalidate();
                return;
            case 25:
                FastScrollerView fastScrollerView = (FastScrollerView) obj;
                kh2.k3.Q1(fastScrollerView.f52634b, 4);
                fastScrollerView.f52638f = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f16538a) {
            case 8:
                super.onAnimationRepeat(animator);
                xj.n nVar = (xj.n) this.f16539b;
                nVar.f135136f = (nVar.f135136f + 1) % nVar.f135135e.f135076c.length;
                nVar.f135137g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f16538a;
        Object obj = this.f16539b;
        switch (i13) {
            case 2:
                va.f fVar = (va.f) obj;
                ArrayList arrayList = new ArrayList(fVar.f125034e);
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((va.c) arrayList.get(i14)).b(fVar);
                }
                break;
            case 5:
                ((oj.g) obj).b();
                break;
            case 14:
                Intrinsics.checkNotNullParameter(animator, "animator");
                BoardCreateBoardNamingView boardCreateBoardNamingView = (BoardCreateBoardNamingView) obj;
                kh2.k3.R1(boardCreateBoardNamingView.f45161c, true);
                boardCreateBoardNamingView.f45161c.setAlpha(0.0f);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(animator, "animation");
                lq0.o0 o0Var = (lq0.o0) obj;
                if (o0Var.f84390m1) {
                    bs1.c.k0(o0Var.getContext()).getWindow().setSoftInputMode(32);
                }
                if (bs1.c.j1(o0Var.X8())) {
                    bs1.c.U1(o0Var.X8());
                    break;
                }
                break;
            case 16:
                Intrinsics.checkNotNullParameter(animator, "animation");
                RoundedCornersLayout roundedCornersLayout = ((ly0.h) obj).f85145k;
                if (roundedCornersLayout != null) {
                    roundedCornersLayout.bringToFront();
                    break;
                }
                break;
            case 22:
                Intrinsics.checkNotNullParameter(animator, "animation");
                sj1.a aVar = (sj1.a) obj;
                int x13 = aVar.x();
                pj1.i iVar = aVar.f100282f;
                aVar.f113020s = x13 - iVar.B;
                iVar.L = true;
                break;
            case 24:
                Intrinsics.checkNotNullParameter(animator, "animation");
                ua2.s sVar = (ua2.s) obj;
                sVar.x();
                int i15 = sVar.E().I;
                sVar.getClass();
                sVar.E().S = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
