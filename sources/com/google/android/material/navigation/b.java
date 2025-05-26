package com.google.android.material.navigation;

import ac2.s1;
import ac2.t1;
import ac2.u1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import bb1.p;
import bb1.s;
import bb1.w;
import bc2.q;
import com.google.android.material.slider.Slider;
import com.pinterest.api.model.f30;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import com.pinterest.feature.board.common.newideas.view.MoreIdeasBoardNameTextView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCameraToggle;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.settings.SettingsRoundHeaderView;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import ey.g4;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;
import oq.c0;
import oq.o;
import rq.h1;
import rq.s0;
import rq.w3;
import rq.y0;
import rq.y2;
import sf1.e1;
import sf1.h0;
import so.oa;
import tq.j0;

/* loaded from: classes3.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32848b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f32847a = i13;
        this.f32848b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        hj.a aVar;
        PinterestVideoView o13;
        bc2.k kVar;
        q qVar;
        int i24 = this.f32847a;
        Object obj = this.f32848b;
        switch (i24) {
            case 0:
                f fVar = (f) obj;
                if (fVar.f32864n.getVisibility() != 0 || (aVar = fVar.E) == null) {
                    return;
                }
                Rect rect = new Rect();
                ImageView imageView = fVar.f32864n;
                imageView.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.i(imageView, null);
                return;
            case 1:
                gk.a aVar2 = (gk.a) obj;
                int i25 = gk.a.P;
                aVar2.getClass();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                aVar2.K = iArr[0];
                view.getWindowVisibleDisplayFrame(aVar2.D);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                String uid = ((f30) obj).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                new g4(uid).i();
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                s0 s0Var = (s0) obj;
                s0Var.f109535a.w6(s0Var.getHeight());
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                y0 y0Var = (y0) obj;
                y0Var.f109657c.w6(y0Var.getHeight());
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                c0 c0Var = ((h1) obj).f109238t;
                if (c0Var != null) {
                    int width = c0Var.getWidth();
                    WebImageView j13 = c0Var.j();
                    int width2 = (width - (j13 != null ? j13.getWidth() : 0)) / 2;
                    o oVar = c0Var.I;
                    if (oVar != null) {
                        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(c0Var.getResources().getDimensionPixelSize(eo1.c.sema_space_300) + width2);
                        oVar.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                y2 y2Var = (y2) obj;
                y2Var.f109670c.w6(y2Var.getHeight());
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                w3 w3Var = (w3) obj;
                w3Var.f109621c.w6(w3Var.getHeight());
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                tq.c0 c0Var2 = (tq.c0) obj;
                c0Var2.f118814b.w6(c0Var2.getHeight());
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                j0 j0Var = (j0) obj;
                j0Var.f118862e.w6(j0Var.getHeight());
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                k90.c cVar = (k90.c) obj;
                int i26 = k90.c.f78723v1;
                RecyclerView g83 = cVar.g8();
                if (g83 != null) {
                    CutoutCarouselView cutoutCarouselView = cVar.f78736t1;
                    if (cutoutCarouselView != null) {
                        g83.setPaddingRelative(0, cutoutCarouselView.getBottom(), 0, 0);
                        return;
                    } else {
                        Intrinsics.r("collagesCarouselView");
                        throw null;
                    }
                }
                return;
            case 11:
                view.removeOnLayoutChangeListener(this);
                MoreIdeasBoardNameTextView moreIdeasBoardNameTextView = (MoreIdeasBoardNameTextView) obj;
                ViewGroup.LayoutParams layoutParams2 = moreIdeasBoardNameTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = bs1.c.W(moreIdeasBoardNameTextView, eo1.c.space_400) * (-1);
                    marginLayoutParams2.bottomMargin = bs1.c.W(moreIdeasBoardNameTextView, eo1.c.space_500);
                    return;
                }
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) obj;
                view2.setTranslationY(view2.getY());
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                ps0.g gVar = (ps0.g) obj;
                ViewGroup.LayoutParams layoutParams3 = gVar.f101259b.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams3).topMargin = (bs1.c.W(gVar, eo1.c.tab_bar_height) + hf0.b.f()) * (-1);
                gVar.requestLayout();
                return;
            case 14:
                IdeaPinCameraToggle ideaPinCameraToggle = (IdeaPinCameraToggle) obj;
                ideaPinCameraToggle.removeOnLayoutChangeListener(this);
                float x13 = ideaPinCameraToggle.getX() + (ideaPinCameraToggle.getWidth() / 2);
                ideaPinCameraToggle.f45911f = Float.valueOf(x13);
                int width3 = ideaPinCameraToggle.getWidth();
                if (ideaPinCameraToggle.f45909d == null) {
                    Intrinsics.r("photoTextViewContainer");
                    throw null;
                }
                float width4 = x13 - (width3 - (r9.getWidth() / 2));
                if (ideaPinCameraToggle.f45908c == null) {
                    Intrinsics.r("videoTextViewContainer");
                    throw null;
                }
                ideaPinCameraToggle.f45910e = new Pair(Float.valueOf(width4), Float.valueOf(x13 - (r9.getWidth() / 2)));
                ideaPinCameraToggle.c();
                ideaPinCameraToggle.d();
                return;
            case 15:
                view.removeOnLayoutChangeListener(this);
                b11.j0 j0Var2 = (b11.j0) obj;
                bs1.c.U1(j0Var2.f21040r);
                b11.j0.L(j0Var2);
                return;
            case 16:
                view.removeOnLayoutChangeListener(this);
                mf.i.a((mf.i) obj);
                return;
            case 17:
                view.removeOnLayoutChangeListener(this);
                GestaltTextField gestaltTextField = ((bb1.i) obj).f22513n0;
                if (gestaltTextField != null) {
                    gestaltTextField.g0();
                    return;
                } else {
                    Intrinsics.r("passwordEditText");
                    throw null;
                }
            case 18:
                view.removeOnLayoutChangeListener(this);
                GestaltTextField gestaltTextField2 = ((bb1.l) obj).f22527p0;
                if (gestaltTextField2 != null) {
                    gestaltTextField2.g0();
                    return;
                } else {
                    Intrinsics.r("verificationCodeEdit");
                    throw null;
                }
            case 19:
                view.removeOnLayoutChangeListener(this);
                GestaltTextField gestaltTextField3 = ((p) obj).f22543p0;
                if (gestaltTextField3 != null) {
                    gestaltTextField3.g0();
                    return;
                } else {
                    Intrinsics.r("emailEditableText");
                    throw null;
                }
            case 20:
                view.removeOnLayoutChangeListener(this);
                GestaltTextField gestaltTextField4 = ((s) obj).f22557o0;
                if (gestaltTextField4 != null) {
                    gestaltTextField4.g0();
                    return;
                } else {
                    Intrinsics.r("passwordEditText");
                    throw null;
                }
            case 21:
                view.removeOnLayoutChangeListener(this);
                GestaltTextField gestaltTextField5 = ((w) obj).f22571n0;
                if (gestaltTextField5 != null) {
                    gestaltTextField5.g0();
                    return;
                } else {
                    Intrinsics.r("phoneNumberEdit");
                    throw null;
                }
            case 22:
                view.removeOnLayoutChangeListener(this);
                IdeaPinScrubber ideaPinScrubber = ((h0) obj).f112590o;
                int i27 = IdeaPinScrubber.f48558n;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(ideaPinScrubber.f48567j);
                ideaPinScrubber.a(arrayList);
                return;
            case 23:
                view.removeOnLayoutChangeListener(this);
                e1 e1Var = (e1) obj;
                int i28 = e1.T;
                boolean z13 = e1Var.f112559r.f112592q.w().f96639a == rm1.q.MUTE;
                of1.b bVar = e1Var.F;
                if (z13) {
                    bVar.E();
                } else {
                    bVar.F();
                }
                sf1.s C = bVar.C(e1Var.f112558q.f19924d);
                if (C == null || (o13 = C.o()) == null || (kVar = o13.L) == null || (qVar = kVar.f22661e) == null) {
                    return;
                }
                boolean isPromoted = qVar.f22679h.isPromoted();
                h0 h0Var = e1Var.f112559r;
                if (isPromoted) {
                    h0Var.f112593r.t(sf1.c.f112525r);
                    h0Var.addOnLayoutChangeListener(new b(h0Var, 22));
                    return;
                }
                if (!qVar.b()) {
                    Context context = kb0.a.f79058b;
                    if (!((Boolean) ((u1) ((t1) ((oa) ((s1) l0.k0(f0.j0().getApplicationContext(), s1.class))).Sc.get())).f2063b.getValue()).booleanValue()) {
                        h0Var.f112593r.t(sf1.c.f112524q);
                        return;
                    }
                }
                PinterestVideoView o14 = C.o();
                if (o14 == null || !o14.k0(false)) {
                    return;
                }
                PinterestVideoView o15 = C.o();
                boolean f13 = o15 != null ? o15.s0().f1953a.f("PREF_ENABLE_CLOSED_CAPTIONS", false) : false;
                PinterestVideoView o16 = C.o();
                if (o16 != null) {
                    o16.A0(f13);
                }
                h0Var.getClass();
                h0Var.f112593r.t(new fd1.h(f13, 12));
                return;
            case 24:
                view.removeOnLayoutChangeListener(this);
                ((Function1) obj).invoke(view);
                return;
            case 25:
                view.removeOnLayoutChangeListener(this);
                jq1.c cVar2 = (jq1.c) obj;
                int i29 = jq1.c.f77464q0;
                View view3 = cVar2.b8().f27254m;
                int height = view3 != null ? view3.getHeight() : 0;
                ca2.e b83 = cVar2.b8();
                b83.f27245d = height;
                ca2.e.w(b83, 0, null, null, null, 15);
                return;
            case 26:
                view.removeOnLayoutChangeListener(this);
                qv1.f fVar2 = (qv1.f) obj;
                int i33 = qv1.f.f105250n;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fVar2.b(), fVar2.c() ? -fVar2.f105257g : fVar2.getWidth());
                ofFloat.setStartDelay(300L);
                ofFloat.setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
                ofFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 0.1f));
                ofFloat.setRepeatCount(-1);
                int i34 = 7;
                ofFloat.addListener(new ir.b(fVar2, i34));
                ofFloat.addUpdateListener(new e0(fVar2, i34));
                ofFloat.start();
                fVar2.f105261k = ofFloat;
                return;
            case 27:
                view.removeOnLayoutChangeListener(this);
                SettingsRoundHeaderView.L((SettingsRoundHeaderView) obj);
                return;
            case 28:
                view.removeOnLayoutChangeListener(this);
                Slider slider = (Slider) obj;
                slider.setRotation(270.0f);
                slider.setTranslationX((slider.getHeight() / 2.0f) + ((-slider.getWidth()) / 2.0f));
                slider.setTranslationY((slider.getWidth() / 2.0f) - (slider.getHeight() / 2.0f));
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                BasePlaceholderLoadingLayout basePlaceholderLoadingLayout = (BasePlaceholderLoadingLayout) obj;
                int i35 = BasePlaceholderLoadingLayout.f52288h;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(basePlaceholderLoadingLayout.d(), basePlaceholderLoadingLayout.f() ? -basePlaceholderLoadingLayout.f52290b : basePlaceholderLoadingLayout.getWidth());
                ofFloat2.setStartDelay(300L);
                ofFloat2.setDuration(BaseRecyclerCellView.AUTOSCROLL_DELAY);
                ofFloat2.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 0.1f));
                ofFloat2.setRepeatCount(-1);
                ofFloat2.addListener(new ir.b(basePlaceholderLoadingLayout, 10));
                ofFloat2.addUpdateListener(new e0(basePlaceholderLoadingLayout, 8));
                ofFloat2.start();
                basePlaceholderLoadingLayout.f52294f = ofFloat2;
                return;
        }
    }
}
