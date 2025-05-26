package np;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.q11;
import com.pinterest.api.model.wy0;
import com.pinterest.education.ActionPromptView;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.view.TopBottomGradientView;
import com.pinterest.video.core.view.PinterestVideoView;
import ha2.a0;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.b4;
import lh0.g1;
import lh0.h3;
import lh0.o4;
import lh0.w3;
import lh0.z3;
import m60.e0;
import m60.r0;
import m60.t0;
import m60.x0;
import x81.o0;

/* loaded from: classes3.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91688b;

    public /* synthetic */ f(Object obj, int i13) {
        this.f91687a = i13;
        this.f91688b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        String str;
        String G2;
        View view;
        i81.d dVar;
        Number valueOf;
        i81.d dVar2;
        com.pinterest.feature.search.visual.cropper.m mVar;
        i81.d dVar3;
        com.pinterest.feature.search.visual.cropper.m mVar2;
        i81.d dVar4;
        GestaltIconButton gestaltIconButton;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        i81.d dVar5;
        View view2;
        Function0 function0;
        int i13 = this.f91687a;
        boolean z13 = true;
        Object obj = this.f91688b;
        switch (i13) {
            case 0:
                ((CameraActivity) obj).f34895f.setVisibility(8);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ActionPromptView actionPromptView = (ActionPromptView) obj;
                actionPromptView.n().setVisibility(8);
                actionPromptView.setVisibility(8);
                return;
            case 2:
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) obj;
                int i14 = SearchGridMultiSectionFragment.O2;
                searchGridMultiSectionFragment.k9().f27256o = false;
                Context context = searchGridMultiSectionFragment.getContext();
                if (context != null) {
                    FragmentActivity E4 = searchGridMultiSectionFragment.E4();
                    Window window = E4 != null ? E4.getWindow() : null;
                    if (window != null) {
                        window.setStatusBarColor(dl2.b.x0(context, eo1.a.sema_color_background_wash_dark));
                    }
                }
                FrameLayout frameLayout = searchGridMultiSectionFragment.M1;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                HairPatternEducationView hairPatternEducationView = searchGridMultiSectionFragment.K1;
                if (hairPatternEducationView == null || !Intrinsics.d(e0.b(), "en")) {
                    return;
                }
                List j13 = f0.j("US", "CA", "GB", "IE", "AU", "NZ");
                b60.b bVar = hairPatternEducationView.f47655g;
                if (bVar == null) {
                    Intrinsics.r("activeUserManager");
                    throw null;
                }
                wy0 f13 = ((b60.d) bVar).f();
                if (f13 == null || (G2 = f13.G2()) == null) {
                    str = null;
                } else {
                    str = G2.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                }
                if (CollectionsKt.L(j13, str)) {
                    PinterestVideoView i15 = hairPatternEducationView.i();
                    bc2.q videoTracks = dl2.b.n1(1.7777778f, "https://v1.pinimg.com/videos/mc/hls/96/04/dd/9604dd22030139f2f0e09984df291397.m3u8", null, false);
                    Intrinsics.checkNotNullParameter("hair-pattern-education-video", "uid");
                    Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
                    oc2.i.g(i15, new bc2.k("hair-pattern-education-video", videoTracks.a(), null, null, videoTracks, null), null, 6);
                    hairPatternEducationView.i().q0().w();
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                l81.l lVar = (l81.l) obj;
                i81.c cVar = lVar.f82177p1;
                if (cVar != null) {
                    k81.l lVar2 = (k81.l) cVar;
                    if (lVar2.isBound()) {
                        i81.d dVar6 = (i81.d) lVar2.getViewIfBound();
                        if (dVar6 != null) {
                            l81.l lVar3 = (l81.l) dVar6;
                            ca2.e eVar = lVar3.f82176o2;
                            int[] iArr = lVar3.f82170l2;
                            if (eVar != null && (view2 = eVar.f27254m) != null) {
                                view2.getLocationOnScreen(iArr);
                            }
                            lVar3.f82168k2 = iArr[1];
                        }
                        i81.e eVar2 = lVar2.f78617f;
                        i81.e eVar3 = i81.e.FLASHLIGHT;
                        if (eVar2 == eVar3) {
                            lVar2.v3();
                            lVar2.j4();
                        }
                        if (lVar2.f78617f == i81.e.P2Z && !hf0.b.n() && (dVar5 = (i81.d) lVar2.getViewIfBound()) != null) {
                            l81.l lVar4 = (l81.l) dVar5;
                            if (lVar4.getContext() != null) {
                                Context context2 = lVar4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                Intrinsics.checkNotNullParameter(context2, "context");
                                GestaltIconButton gestaltIconButton2 = new GestaltIconButton(context2, new om1.c(rm1.q.FLASHLIGHT, null, om1.f.WASH_DARK_GRAY, null, null, false, t0.flashlight_search_button, 762));
                                gestaltIconButton2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
                                lVar4.L1 = gestaltIconButton2;
                                FrameLayout frameLayout2 = lVar4.D1;
                                if (frameLayout2 == null) {
                                    Intrinsics.r("zoomableImageRootContainer");
                                    throw null;
                                }
                                frameLayout2.addView(gestaltIconButton2);
                                GestaltIconButton gestaltIconButton3 = lVar4.L1;
                                if (gestaltIconButton3 != null) {
                                    int dimensionPixelSize = gestaltIconButton3.getResources().getDimensionPixelSize(r0.margin);
                                    ViewGroup.LayoutParams layoutParams = gestaltIconButton3.getLayoutParams();
                                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                                    if (layoutParams2 != null) {
                                        layoutParams2.gravity = 8388693;
                                        ca2.e eVar4 = lVar4.f82176o2;
                                        layoutParams2.bottomMargin = eVar4 != null ? eVar4.f27245d + dimensionPixelSize : 0;
                                        layoutParams2.setMarginEnd(dimensionPixelSize);
                                    }
                                    gestaltIconButton3.t(l81.e.f82121j);
                                    gestaltIconButton3.u(new lq0.o(26, lVar4, gestaltIconButton3));
                                }
                            }
                        }
                        o4 o4Var = lVar2.f78645t;
                        o4Var.getClass();
                        z3 z3Var = a4.f83297a;
                        g1 g1Var = (g1) o4Var.f83453a;
                        if ((g1Var.o("android_visual_search_unified_entry_point", "enabled", z3Var) || g1Var.l("android_visual_search_unified_entry_point") || g1Var.o("android_visual_search_unified_entry_point_row", "enabled", z3Var) || g1Var.l("android_visual_search_unified_entry_point_row")) && lVar2.K != null && (dVar = (i81.d) lVar2.getViewIfBound()) != null) {
                            f30 pin = lVar2.K;
                            Intrinsics.f(pin);
                            l81.l lVar5 = (l81.l) dVar;
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            if (lVar5.getContext() != null) {
                                Context context3 = lVar5.requireContext();
                                Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                                om1.f style = lVar5.v9() ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.WASH_DARK_GRAY;
                                Intrinsics.checkNotNullParameter(context3, "context");
                                Intrinsics.checkNotNullParameter(style, "style");
                                GestaltIconButton gestaltIconButton4 = new GestaltIconButton(context3, new om1.c(rm1.q.SCISSORS, null, style, null, null, false, 0, 1018));
                                gestaltIconButton4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
                                lVar5.M1 = gestaltIconButton4;
                                FrameLayout frameLayout3 = lVar5.D1;
                                if (frameLayout3 == null) {
                                    Intrinsics.r("zoomableImageRootContainer");
                                    throw null;
                                }
                                frameLayout3.addView(gestaltIconButton4);
                                GestaltIconButton gestaltIconButton5 = lVar5.M1;
                                if (gestaltIconButton5 != null) {
                                    int dimensionPixelSize2 = gestaltIconButton5.getResources().getDimensionPixelSize(r0.margin);
                                    int dimensionPixelSize3 = gestaltIconButton5.getResources().getDimensionPixelSize(eo1.c.button_height);
                                    if (lVar5.v9()) {
                                        ViewGroup.LayoutParams layoutParams3 = gestaltIconButton5.getLayoutParams();
                                        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                                        if (layoutParams4 != null) {
                                            layoutParams4.gravity = 8388661;
                                            layoutParams4.topMargin = gestaltIconButton5.getResources().getDimensionPixelSize(eo1.c.space_200);
                                            layoutParams4.setMarginEnd(dimensionPixelSize2);
                                        }
                                    } else {
                                        if (lVar5.L1 != null) {
                                            ca2.e eVar5 = lVar5.f82176o2;
                                            valueOf = Integer.valueOf(eVar5 != null ? (dimensionPixelSize2 * 2) + dimensionPixelSize3 + eVar5.f27245d : 0);
                                        } else {
                                            valueOf = Float.valueOf(lVar5.f82153c2 - (lVar5.f82176o2 != null ? r11.g() - dimensionPixelSize2 : 0));
                                        }
                                        ViewGroup.LayoutParams layoutParams5 = gestaltIconButton5.getLayoutParams();
                                        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                                        if (layoutParams6 != null) {
                                            layoutParams6.gravity = 8388693;
                                            layoutParams6.bottomMargin = valueOf.intValue();
                                            layoutParams6.setMarginEnd(dimensionPixelSize2);
                                        }
                                    }
                                    gestaltIconButton5.t(l81.e.f82123l);
                                    gestaltIconButton5.u(new lq0.o(27, lVar5, pin));
                                    if (lVar5.f82189v1 == eVar3) {
                                        gestaltIconButton5.setAlpha(0.0f);
                                    }
                                }
                            }
                        }
                        i81.d dVar7 = (i81.d) lVar2.getViewIfBound();
                        if (dVar7 != null) {
                            l81.l lVar6 = (l81.l) dVar7;
                            TopBottomGradientView topBottomGradientView = lVar6.J1;
                            if (topBottomGradientView != null) {
                                topBottomGradientView.b();
                            }
                            GestaltIconButton gestaltIconButton6 = lVar6.Q1;
                            if (gestaltIconButton6 != null && (animate2 = gestaltIconButton6.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null) {
                                duration2.start();
                            }
                            if (lVar6.f82189v1 == eVar3 && (gestaltIconButton = lVar6.M1) != null && (animate = gestaltIconButton.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
                                duration.start();
                            }
                        }
                        i81.e eVar6 = lVar2.f78617f;
                        boolean z14 = lVar2.f78639q;
                        if (eVar6 == eVar3) {
                            if (lVar2.X != -1) {
                                q11 q11Var = lVar2.W;
                                if (q11Var != null && (dVar4 = (i81.d) lVar2.getViewIfBound()) != null) {
                                    Double t13 = q11Var.t();
                                    Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
                                    double doubleValue = t13.doubleValue();
                                    Double u13 = q11Var.u();
                                    Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
                                    double doubleValue2 = u13.doubleValue();
                                    Double s13 = q11Var.s();
                                    Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
                                    double doubleValue3 = s13.doubleValue();
                                    Double o13 = q11Var.o();
                                    Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
                                    double doubleValue4 = o13.doubleValue();
                                    int i16 = lVar2.X;
                                    l81.l lVar7 = (l81.l) dVar4;
                                    com.pinterest.feature.search.visual.cropper.m mVar3 = lVar7.K1;
                                    if (mVar3 != null) {
                                        mVar3.b();
                                    }
                                    h81.c cVar2 = lVar7.B2;
                                    if (cVar2 != null) {
                                        cVar2.a(doubleValue, doubleValue2, doubleValue3, doubleValue4, i16, false);
                                    }
                                }
                            } else if (z14) {
                                i81.d dVar8 = (i81.d) lVar2.getViewIfBound();
                                if (dVar8 != null) {
                                    l81.l lVar8 = (l81.l) dVar8;
                                    i92.k kVar = lVar8.f82152c1;
                                    if (kVar == null) {
                                        Intrinsics.r("toastUtils");
                                        throw null;
                                    }
                                    kVar.h(x0.generic_error);
                                    h81.c cVar3 = lVar8.B2;
                                    if (cVar3 != null) {
                                        cVar3.b();
                                    }
                                    lVar8.F9();
                                    dx.a aVar = lVar8.K2;
                                    if (aVar != null) {
                                        aVar.c();
                                    }
                                }
                            } else if (!lVar2.f78621h && (dVar3 = (i81.d) lVar2.getViewIfBound()) != null && (mVar2 = ((l81.l) dVar3).K1) != null) {
                                mVar2.a();
                            }
                        }
                        if (z14 && (dVar2 = (i81.d) lVar2.getViewIfBound()) != null && (mVar = ((l81.l) dVar2).K1) != null) {
                            mVar.l();
                        }
                    }
                }
                ca2.e eVar7 = lVar.f82176o2;
                l81.o oVar = eVar7 instanceof l81.o ? (l81.o) eVar7 : null;
                if (oVar != null) {
                    BottomSheetBehavior bottomSheetBehavior = oVar.f27255n;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.T(true);
                    }
                    oVar.f82199s = true;
                }
                ca2.e eVar8 = lVar.f82176o2;
                lVar.f82186t2 = (eVar8 == null || (view = eVar8.f27254m) == null) ? lVar.f82164i2 : view.getY();
                FrameLayout frameLayout4 = lVar.W1;
                if (frameLayout4 == null) {
                    return;
                }
                frameLayout4.setTranslationY((-(lVar.f82176o2 != null ? r3.f27245d : 0.0f)) + bs1.c.a0(eo1.c.space_100));
                return;
            case 4:
                s81.p pVar = (s81.p) obj;
                if (pVar.isBound()) {
                    a0 a0Var = s81.p.f111919b0;
                    u81.r rVar = (u81.r) ((m81.q) pVar.getView());
                    rVar.y9();
                    if (pVar.f111941s == s81.h.SEARCH_RESULTS) {
                        rVar.E9(pVar.I);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                m81.r rVar2 = ((u81.r) obj).X1;
                if (rVar2 != null) {
                    s81.p pVar2 = (s81.p) rVar2;
                    pVar2.O = false;
                    if (pVar2.isBound()) {
                        m81.q qVar = (m81.q) pVar2.getView();
                        h3 h3Var = o4.f83450b;
                        if (o4.f83451c == null) {
                            int i17 = h3Var.f83383a;
                            switch (i17) {
                                case 13:
                                    function0 = w3.f83500d;
                                    break;
                                default:
                                    function0 = o4.f83452d;
                                    break;
                            }
                            function0.invoke();
                            b4 b4Var = b4.f83303j;
                            switch (i17) {
                                case 13:
                                    Intrinsics.checkNotNullParameter(b4Var, "<set-?>");
                                    w3.f83500d = b4Var;
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(b4Var, "<set-?>");
                                    o4.f83452d = b4Var;
                                    break;
                            }
                        }
                        o4 o4Var2 = o4.f83451c;
                        if (o4Var2 == null) {
                            Intrinsics.r("INSTANCE");
                            throw null;
                        }
                        ((g1) o4Var2.f83453a).c("android_lens_unified_feed");
                        u81.r rVar3 = (u81.r) qVar;
                        RecyclerView g83 = rVar3.g8();
                        if (g83 != null) {
                            ((pr0.g) rVar3.Z1.getValue()).p(g83, false);
                        }
                        if (pVar2.H3()) {
                            pVar2.f4();
                        }
                        pVar2.U2();
                        return;
                    }
                    return;
                }
                return;
            default:
                o0 o0Var = (o0) obj;
                o0Var.I = false;
                if (o0Var.isBound()) {
                    x81.v vVar = (x81.v) o0Var.getView();
                    GestaltIconButton gestaltIconButton7 = ((x81.f0) ((x81.v) o0Var.getView())).f134209i1;
                    if (gestaltIconButton7 == null) {
                        Intrinsics.r("navigationButton");
                        throw null;
                    }
                    gestaltIconButton7.t(new u81.h(z13, 2));
                    x81.f0 f0Var = (x81.f0) vVar;
                    n81.a aVar2 = f0Var.f134225w1;
                    ViewParent parent = aVar2 != null ? aVar2.getParent() : null;
                    CoordinatorLayout coordinatorLayout = f0Var.f134218p1;
                    if (coordinatorLayout == null) {
                        Intrinsics.r("coordinatorLayout");
                        throw null;
                    }
                    if (Intrinsics.d(parent, coordinatorLayout)) {
                        CoordinatorLayout coordinatorLayout2 = f0Var.f134218p1;
                        if (coordinatorLayout2 != null) {
                            coordinatorLayout2.removeView(f0Var.f134225w1);
                            return;
                        } else {
                            Intrinsics.r("coordinatorLayout");
                            throw null;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.f91687a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f91687a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }
}
