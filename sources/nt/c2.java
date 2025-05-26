package nt;

import android.content.Context;
import android.media.MediaCodec;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.education.view.EducationToolTipView;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import com.pinterest.feature.camera2.view.BasePhotoCameraView;
import com.pinterest.feature.camera2.view.BasePreviewCameraView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.FullScreenPhotoCameraView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.imageview.GlideWebImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91998b;

    public /* synthetic */ c2(Object obj, int i13) {
        this.f91997a = i13;
        this.f91998b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.pinterest.feature.board.organize.i iVar;
        int i13 = 0;
        switch (this.f91997a) {
            case 0:
                SbaAdsLeadGenExpandView this$0 = (SbaAdsLeadGenExpandView) this.f91998b;
                int i14 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f35272a.fullScroll(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
                return;
            case 1:
                ((BaseAdsScrollingModule) this.f91998b).c2();
                return;
            case 2:
                vu.k kVar = (vu.k) this.f91998b;
                int i15 = vu.k.P0;
                float f13 = 40;
                if (kVar.K0().getY() + f13 > kVar.U.getY()) {
                    cu.i K0 = kVar.K0();
                    float y13 = kVar.K0().getY() + f13;
                    View view = kVar.U;
                    int y14 = (int) (y13 - view.getY());
                    if (y14 > 0) {
                        pk.a0.k1(K0.f53208j, K0.j() + y14);
                        K0.C(K0.j() + y14);
                    }
                    if (y14 < 0) {
                        kVar.g2(view.getY());
                    }
                    kVar.K0 = view.getY();
                    return;
                }
                return;
            case 3:
                ((wu.i) this.f91998b).c2();
                return;
            case 4:
                e10.f this$02 = (e10.f) this.f91998b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                synchronized (this$02.f56775a) {
                    List list = (List) this$02.f56780f.get();
                    Intrinsics.f(list);
                    if (true ^ list.isEmpty()) {
                        this$02.f56775a.c(list);
                        this$02.f56780f.set(new ArrayList());
                        this$02.f56779e.set(System.nanoTime());
                        this$02.f56781g.getAndUpdate(new e10.e(i13, this$02.f56782h, this$02));
                    } else {
                        this$02.f56776b = e10.d.Paused;
                    }
                    Unit unit = Unit.f80348a;
                }
                return;
            case 5:
                n60.v this$03 = (n60.v) this.f91998b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (this$03.f89320i.x()) {
                    cy.c cVar = cy.d.f53395a;
                    vy.m mVar = this$03.f89313b;
                    tb.l lVar = this$03.f89320i;
                    cVar.getClass();
                    cy.c.b(mVar, lVar);
                    this$03.f89316e.F(new dv.a(20, n60.u.f89309j), new dv.a(21, n60.u.f89310k), ck2.i.f27923c, ck2.i.f27924d);
                    return;
                }
                return;
            case 6:
                vb0.h delayedAssertionError = (vb0.h) this.f91998b;
                Intrinsics.checkNotNullParameter(delayedAssertionError, "$delayedAssertionError");
                throw delayedAssertionError;
            case 7:
                yb0.n this$04 = (yb0.n) this.f91998b;
                int i16 = yb0.n.f138503p;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                GestaltText gestaltText = this$04.f138505b;
                if (gestaltText != null) {
                    bs1.c.M1(gestaltText);
                    return;
                } else {
                    Intrinsics.r("titleTv");
                    throw null;
                }
            case 8:
                yb0.p this$05 = (yb0.p) this.f91998b;
                int i17 = yb0.p.f138529f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                bs1.c.M1(this$05.f138533d);
                return;
            case 9:
                com.pinterest.creatorHub.feature.creatorpathways.f this$06 = (com.pinterest.creatorHub.feature.creatorpathways.f) this.f91998b;
                int i18 = com.pinterest.creatorHub.feature.creatorpathways.f.f44784q0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ((ca2.e) this$06.f44788m0.getValue()).s("creator_pathways_modal", true);
                return;
            case 10:
                LoadingView loadingView = (LoadingView) this.f91998b;
                boolean z13 = LoadingView.f44862d;
                se0.o oVar = new se0.o(loadingView.getContext(), loadingView.getResources().getDimensionPixelSize(eo1.c.spinner_diameter_small));
                loadingView.f44866c = oVar;
                loadingView.setImageDrawable(oVar);
                loadingView.f44866c.start();
                return;
            case 11:
                EducationToolTipView this$07 = (EducationToolTipView) this.f91998b;
                int i19 = EducationToolTipView.f45022m;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.c();
                return;
            case 12:
                gg0.e0 this$08 = (gg0.e0) this.f91998b;
                int i23 = gg0.e0.E;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                int width = (int) (this$08.f64923v.getWidth() / 1.715f);
                GlideWebImageView glideWebImageView = this$08.f64923v;
                ViewGroup.LayoutParams layoutParams = glideWebImageView.getLayoutParams();
                layoutParams.height = width;
                glideWebImageView.setLayoutParams(layoutParams);
                return;
            case 13:
                qi0.d this$09 = (qi0.d) this.f91998b;
                int i24 = qi0.d.f103974u;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                LegoPinGridCell legoPinGridCell = this$09.f103987p;
                Intrinsics.g(legoPinGridCell, "null cannot be cast to non-null type android.view.View");
                legoPinGridCell.animate().setInterpolator(new AccelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).start();
                return;
            case 14:
                ui0.e this$010 = (ui0.e) this.f91998b;
                int i25 = ui0.e.O0;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                this$010.P7();
                return;
            case 15:
                fk0.k this$011 = (fk0.k) this.f91998b;
                int i26 = fk0.k.L0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                GestaltTextField gestaltTextField = this$011.f62302r0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                gestaltTextField.requestFocus();
                GestaltTextField gestaltTextField2 = this$011.f62302r0;
                if (gestaltTextField2 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                hf0.b.s(gestaltTextField2);
                GestaltTextField gestaltTextField3 = this$011.f62302r0;
                if (gestaltTextField3 != null) {
                    gestaltTextField3.sendAccessibilityEvent(8);
                    return;
                } else {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
            case 16:
                kl0.z this$012 = (kl0.z) this.f91998b;
                int i27 = kl0.z.f80128e2;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.C8(this$012.X1);
                return;
            case 17:
                com.pinterest.feature.board.organize.l this$013 = (com.pinterest.feature.board.organize.l) this.f91998b;
                int i28 = com.pinterest.feature.board.organize.l.f45288u;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                ViewGroup.LayoutParams layoutParams2 = this$013.getLayoutParams();
                RecyclerView.LayoutParams layoutParams3 = layoutParams2 instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams2 : null;
                int k13 = layoutParams3 != null ? layoutParams3.f19268a.k() : -1;
                WeakReference weakReference = this$013.f45290q;
                if (weakReference == null || (iVar = (com.pinterest.feature.board.organize.i) weakReference.get()) == null) {
                    return;
                }
                ((rk0.j) iVar).r(k13, "Invalid adapter position found while trying to handle in-grid section reorder");
                return;
            case 18:
                cn0.i this$014 = (cn0.i) this.f91998b;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                MediaCodec mediaCodec = this$014.f28076i;
                if (mediaCodec == null) {
                    Intrinsics.r("encoder");
                    throw null;
                }
                mediaCodec.release();
                this$014.f28078k.close();
                return;
            case 19:
                kotlin.jvm.internal.j0 renderer = (kotlin.jvm.internal.j0) this.f91998b;
                Intrinsics.checkNotNullParameter(renderer, "$renderer");
                ((be2.b) renderer.f80434a).f22737a.l();
                return;
            case 20:
                rn0.e this$015 = (rn0.e) this.f91998b;
                int i29 = rn0.e.f108830v0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                GestaltTextField gestaltTextField4 = this$015.f108832f0;
                if (gestaltTextField4 != null) {
                    gestaltTextField4.d0();
                    return;
                } else {
                    Intrinsics.r("boardSectionTitleEditText");
                    throw null;
                }
            case 21:
                WebView webView = (WebView) this.f91998b;
                int i33 = to0.d.f118641d;
                webView.removeJavascriptInterface("jsinterface");
                return;
            case 22:
                InAppBrowserFragment this$016 = (InAppBrowserFragment) this.f91998b;
                int i34 = InAppBrowserFragment.T0;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                this$016.requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                return;
            case 23:
                ap0.i this$017 = (ap0.i) this.f91998b;
                int i35 = ap0.i.f20310r0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                mo1.d dVar = this$017.f20314m0;
                if (dVar == null) {
                    Intrinsics.r("intentHelper");
                    throw null;
                }
                lu1.b bVar = this$017.f20315n0;
                if (bVar == null) {
                    Intrinsics.r("activityHelper");
                    throw null;
                }
                Context requireContext = this$017.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                mo1.d.a(dVar, false, ((lu1.c) bVar).g(requireContext, u70.a.PROFILE, null), null, null, 13);
                return;
            case 24:
                BasePhotoCameraView this$018 = (BasePhotoCameraView) this.f91998b;
                int i36 = w.e.f126917d;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                return;
            case 25:
                BasePreviewCameraView this$019 = (BasePreviewCameraView) this.f91998b;
                int i37 = v.j1.f123518c;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                m81.d dVar2 = (m81.d) this$019.g();
                q81.a aVar = (q81.a) ((m81.b) dVar2.getView());
                aVar.f103016c.setEnabled(true);
                if (dVar2.f86533c == 0) {
                    ep0.d flashMode = ep0.d.FLASH_MODE_AUTO;
                    Intrinsics.checkNotNullParameter(flashMode, "flashMode");
                    FullScreenPhotoCameraView fullScreenPhotoCameraView = aVar.f103017d;
                    fullScreenPhotoCameraView.getClass();
                    Intrinsics.checkNotNullParameter(flashMode, "<set-?>");
                    fullScreenPhotoCameraView.f45439u = flashMode;
                    aVar.i(rm1.q.FLASH_AUTOMATIC);
                    aVar.f103015b.setEnabled(true);
                    return;
                }
                return;
            case 26:
                qp0.f this$020 = (qp0.f) this.f91998b;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.performHapticFeedback(3);
                return;
            case 27:
                lq0.o0 this$021 = (lq0.o0) this.f91998b;
                int i38 = lq0.o0.R1;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                if (!this$021.f91282J || this$021.N1) {
                    return;
                }
                lq0.b1 b1Var = this$021.W0;
                if (b1Var == null) {
                    Intrinsics.r("conversationThreadViewState");
                    throw null;
                }
                lq0.v1 v1Var = b1Var instanceof lq0.v1 ? (lq0.v1) b1Var : null;
                String str = v1Var != null ? v1Var.f84446a : null;
                q12.b bVar2 = this$021.D0;
                if (bVar2 == null) {
                    Intrinsics.r("conversationService");
                    throw null;
                }
                String str2 = this$021.U0;
                if (str2 == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                xj2.c o13 = bVar2.g(str2, str, this$021.f84389l1).r(tk2.e.f118017c).l(wj2.c.a()).o(new dq0.i(22, new lq0.k0(this$021, i13)), new dq0.i(23, lq0.d.E));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                this$021.R6(o13);
                return;
            case 28:
                qq0.b this$022 = (qq0.b) this.f91998b;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.performHapticFeedback(3);
                return;
            default:
                ((ac2.o1) ((rr0.g) this.f91998b).f109909u).w();
                return;
        }
    }
}
