package kl0;

import a.cb;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.q0;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.y2;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.n8;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilter;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilterToolbar;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.board.detail.invite.view.lego.LegoBoardDetailInviteView;
import com.pinterest.feature.board.detail.view.BoardRefreshToastView;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.feature.board.join.view.RequestToJoinButton;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.boardpreview.view.ShareBoardUpsellView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import gg0.l0;
import h32.a4;
import i32.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kh2.a1;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.k0;
import m60.r0;
import m60.t0;
import so.d4;
import so.k5;
import so.oa;
import so.z4;
import x02.i2;
import x02.x0;
import x02.z0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u0006:\u0001\nB\t\b\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkl0/z;", "Lwk1/k;", "Ldl1/s;", "Lcom/pinterest/feature/board/detail/a;", "Lnr0/j;", "Lar0/v;", "", "Lgg0/l0;", "<init>", "()V", "pe/i", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class z extends h0<dl1.s> implements com.pinterest.feature.board.detail.a, ar0.v, l0 {

    /* renamed from: e2, reason: collision with root package name */
    public static final /* synthetic */ int f80128e2 = 0;
    public boolean A1;
    public rk0.j B1;
    public boolean C1;
    public GestaltToolbarImpl D1;
    public GestaltIconButton E1;
    public GestaltIconButton F1;
    public GestaltIconButton G1;
    public GestaltIconButton H1;
    public RequestToJoinButton I1;
    public LegoBoardDetailInviteView J1;
    public LegoBoardDetailHeader K1;
    public AppBarLayout L1;
    public BoardPinsFilterToolbar M1;
    public BoardPinsFilter N1;
    public LinearLayout O1;
    public FloatingToolbarView P1;
    public FloatingToolbarView Q1;
    public x0 R0;
    public BoardSelectPinsHeaderView R1;
    public no1.d S0;
    public ConstraintLayout S1;
    public z0 T0;
    public BoardHeaderImageView T1;
    public zf0.f U0;
    public BoardRefreshToastView U1;
    public i2 V0;
    public final m1 V1;
    public d4 W0;
    public final xk2.k W1;
    public yk1.j X0;
    public final wu.f X1;
    public nx.f0 Y0;
    public final i Y1;
    public uk1.e Z0;
    public is1.x Z1;

    /* renamed from: a1, reason: collision with root package name */
    public m60.d0 f80129a1;

    /* renamed from: a2, reason: collision with root package name */
    public final a8.v f80130a2;

    /* renamed from: b1, reason: collision with root package name */
    public jl0.b f80131b1;

    /* renamed from: b2, reason: collision with root package name */
    public final r f80132b2;

    /* renamed from: c1, reason: collision with root package name */
    public z4 f80133c1;

    /* renamed from: c2, reason: collision with root package name */
    public final g f80134c2;

    /* renamed from: d1, reason: collision with root package name */
    public i92.k f80135d1;
    public final h32.d4 d2;

    /* renamed from: e1, reason: collision with root package name */
    public rw0.f f80136e1;

    /* renamed from: f1, reason: collision with root package name */
    public lh0.r f80137f1;

    /* renamed from: g1, reason: collision with root package name */
    public gi2.b f80138g1;

    /* renamed from: h1, reason: collision with root package name */
    public tj0.b0 f80139h1;

    /* renamed from: i1, reason: collision with root package name */
    public c2 f80140i1;

    /* renamed from: j1, reason: collision with root package name */
    public r41.k f80141j1;

    /* renamed from: k1, reason: collision with root package name */
    public g70.h f80142k1;

    /* renamed from: l1, reason: collision with root package name */
    public se2.a f80143l1;

    /* renamed from: m1, reason: collision with root package name */
    public k5 f80144m1;

    /* renamed from: n1, reason: collision with root package name */
    public com.pinterest.feature.board.detail.b f80145n1;

    /* renamed from: o1, reason: collision with root package name */
    public String f80146o1;

    /* renamed from: p1, reason: collision with root package name */
    public View f80147p1;

    /* renamed from: q1, reason: collision with root package name */
    public ShareBoardUpsellView f80148q1;

    /* renamed from: r1, reason: collision with root package name */
    public hk0.j f80149r1;

    /* renamed from: s1, reason: collision with root package name */
    public final HashSet f80150s1;

    /* renamed from: t1, reason: collision with root package name */
    public ur0.e f80151t1;

    /* renamed from: u1, reason: collision with root package name */
    public final xk2.v f80152u1;

    /* renamed from: v1, reason: collision with root package name */
    public final Rect f80153v1;

    /* renamed from: w1, reason: collision with root package name */
    public final qc2.d f80154w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f80155x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f80156y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f80157z1;

    public z() {
        this.Y = true;
        this.f80150s1 = new HashSet();
        this.f80152u1 = xk2.m.b(j.f80096i);
        this.f80153v1 = new Rect();
        this.f80154w1 = new qc2.d();
        this.f80156y1 = true;
        int i13 = 0;
        w wVar = new w(this, i13);
        xk2.n nVar = xk2.n.NONE;
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(8, wVar));
        this.V1 = a1.s(this, k0.f80436a.b(il0.v.class), new mq.e0(a13, 29), new x(null, a13, i13), new y(this, a13, i13));
        this.W1 = xk2.m.a(nVar, new l(this, i13));
        this.X1 = new wu.f(this, 1);
        this.Y1 = new i(this);
        this.f80130a2 = new a8.v(this, 28);
        this.f80132b2 = new r(this);
        this.f80134c2 = new g(this);
        this.d2 = h32.d4.BOARD;
    }

    public static final void j9(z zVar, i32.r rVar) {
        com.pinterest.feature.board.detail.b bVar;
        zVar.getClass();
        int i13 = f.f80079c[rVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2 && (bVar = zVar.f80145n1) != null) {
                ((hl0.v) bVar).T3();
                return;
            }
            return;
        }
        com.pinterest.feature.board.detail.b bVar2 = zVar.f80145n1;
        if (bVar2 != null) {
            ((hl0.v) bVar2).S3();
        }
    }

    public static final void k9(z zVar, LegoBoardDetailInviteView legoBoardDetailInviteView, boolean z13) {
        ViewGroup.LayoutParams layoutParams;
        LegoBoardDetailHeader legoBoardDetailHeader = zVar.K1;
        if (legoBoardDetailHeader == null) {
            Intrinsics.r("boardHeader");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = legoBoardDetailHeader.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 == null) {
            LegoBoardDetailHeader legoBoardDetailHeader2 = zVar.K1;
            if (legoBoardDetailHeader2 == null) {
                Intrinsics.r("boardHeader");
                throw null;
            }
            layoutParams = legoBoardDetailHeader2.getLayoutParams();
        } else if (z13) {
            layoutParams3.topMargin = zVar.getResources().getDimensionPixelOffset(y60.a.lego_board_header_top_margin_small);
            layoutParams3.addRule(3, legoBoardDetailInviteView.getId());
            layoutParams = layoutParams3;
        } else {
            layoutParams3.topMargin = zVar.getResources().getDimensionPixelOffset(y60.a.lego_board_header_top_margin_large);
            layoutParams3.removeRule(3);
            layoutParams = layoutParams3;
        }
        legoBoardDetailHeader.setLayoutParams(layoutParams);
    }

    public static void x9(z zVar, i32.l lVar, long j13) {
        y0 y0Var = y0.ANDROID_BOARD_TAKEOVER;
        xk2.v vVar = zVar.f80152u1;
        ((Handler) vVar.getValue()).removeCallbacksAndMessages(null);
        ((Handler) vVar.getValue()).postDelayed(new ja.y(zVar, y0Var, lVar, 15), j13);
    }

    public final void A9(zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        wa2.i iVar = W8().f103320a;
        int i13 = f.f80077a[boardViewType.ordinal()];
        if (i13 == 1) {
            iVar.f128797t = true;
            iVar.f128791q = true;
            iVar.f128793r = false;
        } else if (i13 != 2) {
            iVar.f128797t = false;
            iVar.f128791q = false;
            iVar.f128793r = false;
        } else {
            iVar.f128797t = false;
            iVar.f128791q = false;
            iVar.f128793r = true;
        }
        com.pinterest.feature.board.detail.b bVar = this.f80145n1;
        if (bVar != null) {
            ((hl0.v) bVar).x4(W8().f103320a);
        }
        RecyclerView g83 = g8();
        l2 l2Var = g83 != null ? g83.f19242n : null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            m60.d0 d0Var = this.f80129a1;
            if (d0Var == null) {
                Intrinsics.r("gridColumnCountProvider");
                throw null;
            }
            pinterestStaggeredGridLayoutManager.h1(d0Var.a(boardViewType.toGridRepStyle()));
        }
        P8();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        boolean a13 = fVar.a(requireContext);
        if (a13) {
            f7().h(this.f80132b2);
            j0 j0Var = new j0();
            fk2.g gVar = new fk2.g(new dp.a(14, j0Var, this), 3);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            uj2.a0 a0Var = tk2.e.f118017c;
            R6(gVar.m(5L, timeUnit, a0Var).l(a0Var).h(wj2.c.a()).i(new fp.a(5, j0Var, this), new zk0.b(19, b.f80063l)));
        }
        if (q9().g()) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            boolean G0 = pk.a0.G0(requireContext2, "android.permission.READ_EXTERNAL_STORAGE");
            int i13 = Build.VERSION.SDK_INT >= 34 ? 1 : 0;
            tb0.h b63 = b6();
            tb0.k kVar = new tb0.k();
            Intrinsics.checkNotNullExpressionValue("screen", "LOGGING_SCREEN_KEY");
            kVar.c("screen", this.d2.toString());
            Intrinsics.checkNotNullExpressionValue("canObserveScreenshots", "LOGGING_CAN_OBSERVE_KEY");
            kVar.c("canObserveScreenshots", String.valueOf(a13 ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue("hasReadStoragePermission", "LOGGING_READ_STORAGE_PERMISSION_KEY");
            kVar.c("hasReadStoragePermission", String.valueOf(G0 ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue("hasFullGalleryPermissions", "LOGGING_FULL_GALLERY_PERMISSION_KEY");
            kVar.c("hasFullGalleryPermissions", String.valueOf(a13 ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue("supportsDetectScreenCapturePermission", "LOGGING_SUPPORTS_DETECT_SCREENCAPTURE_KEY");
            kVar.c("supportsDetectScreenCapturePermission", String.valueOf(i13));
            b63.k("screenshot_eligibility_log", kVar.f117102a);
        }
        f7().h(this.f80134c2);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        super.L7();
        hk0.j jVar = this.f80149r1;
        if (jVar != null) {
            jVar.l();
        }
        if (this.f80151t1 != null) {
            p9();
            zf0.f.a(this.f80151t1);
        }
        f7().j(this.f80132b2);
        f7().j(this.f80134c2);
        is1.x xVar = this.Z1;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        com.pinterest.feature.board.detail.b bVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_SECTION_MERGE_RESULT_CODE")) {
            this.f80146o1 = result.getString("com.pinterest.EXTRA_BOARD_SECTION_MERGE_SOURCE_ID");
            return;
        }
        if ((Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_EDIT_RESULT_CODE") && Intrinsics.d(result.getString("com.pinterest.EXTRA_BOARD_EDIT_ACTION"), "com.pinterest.EXTRA_BOARD_EDIT_ACTION_LEAVE")) || Intrinsics.d(result.getString("com.pinterest.EXTRA_BOARD_EDIT_ACTION"), "com.pinterest.EXTRA_BOARD_EDIT_ACTION_DELETE")) {
            P7();
            return;
        }
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_OR_SECTION_RESULT_CODE") && result.getBoolean("com.pinterest.EXTRA_BOARD_OR_SECTION_PIN_DELETED")) {
            com.pinterest.feature.board.detail.b bVar2 = this.f80145n1;
            if (bVar2 != null) {
                ((hl0.v) bVar2).s3();
                return;
            }
            return;
        }
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_PREVIEW_TEMPLATE_RESULT_CODE") || Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_PREVIEW_VIDEO_RESULT_CODE")) {
            String string = result.getString("ARG_TEMPLATE_ID");
            ArrayList<String> stringArrayList = result.getStringArrayList("ARG_TEMPLATE_PINS");
            com.pinterest.feature.board.detail.b bVar3 = this.f80145n1;
            if (bVar3 != null) {
                ((hl0.v) bVar3).V3(string, stringArrayList);
                return;
            }
            return;
        }
        if (Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_EDIT_RESULT_CODE") && Intrinsics.d(result.getString("com.pinterest.EXTRA_BOARD_EDIT_ACTION"), "com.pinterest.EXTRA_BOARD_HEADER_IMAGE_RESULT_IMAGE_MODIFIED")) {
            com.pinterest.feature.board.detail.b bVar4 = this.f80145n1;
            if (bVar4 != null) {
                ((hl0.v) bVar4).N3();
                return;
            }
            return;
        }
        if (!Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_VIEW_TYPE_RESULT_CODE") || (bVar = this.f80145n1) == null) {
            return;
        }
        ((hl0.v) bVar).W3(result.getInt("com.pinterest.EXTRA_BOARD_VIEW_TYPE"));
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        nx.d0 s73 = s7();
        y32.f fVar = y32.f.BOARD;
        boolean t93 = t9();
        p9();
        return new a(s73, fVar, pinActionHandler, t93, zf0.f.h(), true, 0).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        long x03;
        wa2.i iVar = W8().f103320a;
        p9();
        boolean h10 = zf0.f.h();
        iVar.f128797t = h10;
        iVar.F = h10;
        String g13 = cb.g("toString(...)");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.Z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(new gv.a(this, g13, ((uk1.a) eVar).f122378a));
        i2 i2Var = this.V0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        boolean G = com.bumptech.glide.d.G(this, "is_from_auto_organize", false);
        ew.a(n9());
        d4 d4Var = this.W0;
        if (d4Var == null) {
            Intrinsics.r("boardPresenterFactory");
            throw null;
        }
        String n93 = n9();
        x0 x0Var = this.R0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        boolean G2 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_DEEPLINK", false);
        boolean G3 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_SHOULD_AUTO_SHOW_BOARD_COLLABORATOR_MODAL", false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS", "key");
        ScreenDescription screenDescription = this.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c == null || !f49207c.containsKey("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS")) {
            ll.j jVar = this.V;
            if (jVar != null) {
                Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS", "key");
                Intent intent = (Intent) jVar.f83754b;
                Long valueOf = (intent == null || !intent.hasExtra("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS")) ? null : Long.valueOf(((Intent) jVar.f83754b).getLongExtra("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS", -1L));
                if (valueOf != null) {
                    x03 = valueOf.longValue();
                }
                x03 = 0;
            } else {
                Navigation navigation = this.I;
                if (navigation != null) {
                    x03 = navigation.x0();
                }
                x03 = 0;
            }
        } else {
            x03 = f49207c.getLong("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS");
        }
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null;
        boolean G4 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_FROM_URL", false);
        boolean s93 = s9();
        boolean G5 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_BOARD_SPONSORED_PREVIEW_MODE", false);
        se2.a aVar = this.f80143l1;
        if (aVar != null) {
            return d4Var.a(n93, g13, a13, x0Var, G2, G3, x03, G, v03, G4, s93, G5, aVar);
        }
        Intrinsics.r("closeupSendShareUtils");
        throw null;
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void c2(q0 itemTouchHelper, boolean z13) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "itemTouchHelper");
        itemTouchHelper.i(z13 ? g8() : null);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void d4(rk0.j organizeMultiToolbar) {
        Intrinsics.checkNotNullParameter(organizeMultiToolbar, "organizeMultiToolbar");
        this.B1 = organizeMultiToolbar;
        View findViewById = requireView().findViewById(y60.c.organize_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.R1 = (BoardSelectPinsHeaderView) findViewById;
        View findViewById2 = requireView().findViewById(y60.c.organize_floating_toolbar_card);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById2;
        this.Q1 = floatingToolbarView;
        if (floatingToolbarView == null) {
            Intrinsics.r("bottomOrganizeFloatingToolbarCard");
            throw null;
        }
        floatingToolbarView.setTranslationY(400.0f);
        FloatingToolbarView floatingToolbarView2 = this.Q1;
        if (floatingToolbarView2 == null) {
            Intrinsics.r("bottomOrganizeFloatingToolbarCard");
            throw null;
        }
        ca0.y yVar = new ca0.y(o9().c(), 12);
        BoardSelectPinsHeaderView boardSelectPinsHeaderView = this.R1;
        if (boardSelectPinsHeaderView == null) {
            Intrinsics.r("topOrganizeAppBar");
            throw null;
        }
        organizeMultiToolbar.v(floatingToolbarView2, yVar, boardSelectPinsHeaderView, n9());
        com.pinterest.feature.board.detail.b bVar = this.f80145n1;
        Intrinsics.g(bVar, "null cannot be cast to non-null type com.pinterest.feature.board.organize.OrganizeView.OrganizeViewListener");
        organizeMultiToolbar.m(bVar, this);
        organizeMultiToolbar.j(g8());
        AppBarLayout appBarLayout = this.L1;
        if (appBarLayout != null) {
            appBarLayout.b(organizeMultiToolbar.q());
        } else {
            Intrinsics.r("boardHeaderContainer");
            throw null;
        }
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9, reason: merged with bridge method [inline-methods] */
    public final void y8(yq0.z adapter, sq0.f0 dataSourceProvider) {
        int i13 = 1;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        int[] iArr = {32, 33, 28, 30, 100, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, 36};
        int i14 = 0;
        for (int i15 = 0; i15 < 7; i15++) {
            adapter.G(iArr[i15], new l(this, i13));
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int[] iArr2 = mj0.j.f87276a;
        nx.f0 f0Var = this.Y0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        int i16 = 2;
        nx.d0 d0Var = new n70.o(this, f0Var, i16).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        qa2.n W8 = W8();
        uj2.q p73 = p7();
        tj0.b0 b0Var = this.f80139h1;
        if (b0Var == null) {
            Intrinsics.r("oneTapSavePinVideoGridCellFactory");
            throw null;
        }
        mj0.j.b(adapter, requireContext, d0Var, W8, p73, b0Var);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, new ba.q(requireContext, 19));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, new ba.q(requireContext, 20));
        adapter.H(new int[]{70, 71, 72}, new ba.q(requireContext, 21));
        adapter.H(new int[]{86753091, 86753092, 86753093}, new l(this, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE, new ba.q(requireContext, 22));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, new ba.q(requireContext, 23));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_ON_ENDLESS_SCROLL_HEADER, new ba.q(requireContext, 24));
        adapter.G(66, dl2.b.m2(s7(), W8(), new l(this, 4)));
        adapter.G(52, new ba.q(requireContext, 16));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_BOARDS, new n(requireContext, this, i14));
        adapter.G(1122334455, new ba.q(requireContext, 17));
        adapter.G(22788101, new ba.q(requireContext, 18));
        adapter.G(894721, new n(requireContext, this, i13));
        adapter.G(894722, new l(this, i16));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        jl0.d p13;
        rk0.j jVar = this.B1;
        if (!com.bumptech.glide.d.o0((jVar == null || (p13 = jVar.p()) == null) ? null : Boolean.valueOf(p13.inOrganize()))) {
            nl1.d.J7();
            return false;
        }
        rk0.j jVar2 = this.B1;
        if (jVar2 != null) {
            jVar2.u(jl0.d.VIEW);
        }
        return true;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getK0() {
        return s9() ? a4.BOARD_FOR_ME : t9() ? a4.BOARD_SELF : a4.BOARD_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final h32.d4 getF140010x0() {
        return this.d2;
    }

    @Override // gg0.l0
    public final View h5() {
        FloatingToolbarView floatingToolbarView = this.Q1;
        if (floatingToolbarView == null) {
            return null;
        }
        if (floatingToolbarView != null) {
            return floatingToolbarView;
        }
        Intrinsics.r("bottomOrganizeFloatingToolbarCard");
        throw null;
    }

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        return new androidx.recyclerview.widget.s();
    }

    public final yb0.n l9(String str, SpannableStringBuilder spannableStringBuilder, String str2) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        yb0.n nVar = new yb0.n(requireContext);
        nVar.w(str);
        nVar.u(spannableStringBuilder);
        nVar.q(str2);
        String string = getString(m60.x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.m(string);
        nVar.setFocusable(true);
        nVar.setFocusableInTouchMode(true);
        nVar.requestFocus();
        return nVar;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(y60.d.fragment_board, y60.c.p_recycler_view);
        eVar.f979c = y60.c.empty_state_container;
        eVar.c(y60.c.swipe_container);
        return eVar;
    }

    public final GestaltIconButton m9(int i13, rm1.q qVar, String str, d dVar) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, requireContext, (AttributeSet) null);
        gestaltIconButton.t(new h(str, qVar, i13, 0));
        gestaltIconButton.u(new jq.m(dVar, gestaltIconButton, 2));
        GestaltToolbarImpl gestaltToolbarImpl = this.D1;
        if (gestaltToolbarImpl != null) {
            gestaltToolbarImpl.c(gestaltIconButton);
            return gestaltIconButton;
        }
        Intrinsics.r("topAppBar");
        throw null;
    }

    @Override // com.pinterest.feature.board.organize.g
    public final y2 n5(int i13) {
        RecyclerView g83 = g8();
        if (g83 != null) {
            return g83.S0(i13);
        }
        return null;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        l2 l2Var = n83.f19650a;
        Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager");
        ((PinterestStaggeredGridLayoutManager) l2Var).f1(2);
        return n83;
    }

    public final String n9() {
        v7 P1;
        Navigation navigation = this.I;
        String str = null;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b != null) {
            return f49940b;
        }
        Navigation navigation2 = this.I;
        if (navigation2 != null && (P1 = navigation2.P1()) != null) {
            str = P1.getUid();
        }
        return str == null ? "" : str;
    }

    @Override // yq0.t
    public final ar0.f o8() {
        return new m(this, 0);
    }

    public final il0.v o9() {
        return (il0.v) this.V1.getValue();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (s9()) {
            x0 x0Var = this.R0;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            x0 i03 = x0Var.i0();
            Intrinsics.checkNotNullParameter(i03, "<set-?>");
            this.R0 = i03;
        }
        q9().a();
        super.onCreate(bundle);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        HashSet hashSet = this.f80150s1;
        ArrayList Q = CollectionsKt.Q(CollectionsKt.F0(hashSet));
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Animator) next).isRunning()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        hashSet.clear();
        AppBarLayout appBarLayout = this.L1;
        if (appBarLayout == null) {
            Intrinsics.r("boardHeaderContainer");
            throw null;
        }
        appBarLayout.l((com.google.android.material.appbar.h) this.W1.getValue());
        ((Handler) this.f80152u1.getValue()).removeCallbacksAndMessages(null);
        ((l82.c) o9().c()).a(il0.b.f72526a);
        this.B1 = null;
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(v13, "v");
        v7 a13 = ew.a(n9());
        if (a13 != null && kh2.w.i0(a13)) {
            q9().b();
        }
        View findViewById = v13.findViewById(y60.c.board_pins_filter);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.N1 = (BoardPinsFilter) findViewById;
        View findViewById2 = v13.findViewById(y60.c.board_pins_filter_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.M1 = (BoardPinsFilterToolbar) findViewById2;
        View findViewById3 = v13.findViewById(y60.c.board_header_container);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById3;
        appBarLayout.b((com.google.android.material.appbar.h) this.W1.getValue());
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.L1 = appBarLayout;
        View findViewById4 = v13.findViewById(y60.c.board_host_header_view);
        LegoBoardDetailHeader legoBoardDetailHeader = (LegoBoardDetailHeader) findViewById4;
        legoBoardDetailHeader.setPinalytics(s7());
        final int i13 = 0;
        legoBoardDetailHeader.m(com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_BOARD_SPONSORED_PREVIEW_MODE", false));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.K1 = legoBoardDetailHeader;
        String n93 = n9();
        x0 x0Var = this.R0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        z0 z0Var = this.T0;
        if (z0Var == null) {
            Intrinsics.r("boardSectionRepository");
            throw null;
        }
        jl0.b bVar = this.f80131b1;
        if (bVar == null) {
            Intrinsics.r("boardUtils");
            throw null;
        }
        r41.k kVar = this.f80141j1;
        if (kVar == null) {
            Intrinsics.r("profileNavigator");
            throw null;
        }
        wk0.c cVar = new wk0.c(n93, x0Var, z0Var, bVar, kVar);
        LegoBoardDetailHeader legoBoardDetailHeader2 = this.K1;
        if (legoBoardDetailHeader2 == null) {
            Intrinsics.r("boardHeader");
            throw null;
        }
        legoBoardDetailHeader2.l(cVar);
        yk1.j jVar = this.X0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        LegoBoardDetailHeader legoBoardDetailHeader3 = this.K1;
        if (legoBoardDetailHeader3 == null) {
            Intrinsics.r("boardHeader");
            throw null;
        }
        jVar.d(legoBoardDetailHeader3, cVar);
        View findViewById5 = v13.findViewById(y60.c.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) findViewById5;
        this.D1 = gestaltToolbarImpl;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("topAppBar");
            throw null;
        }
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        final int i14 = 1;
        gestaltToolbarImpl.N(1);
        gestaltToolbarImpl.M(eo1.b.color_themed_background_default);
        Context context3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
        int i15 = eo1.b.color_themed_dark_gray;
        Intrinsics.checkNotNullParameter(context3, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context3.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context3, "context");
        if (drawable2 != null) {
            int color = i15 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i15);
            Intrinsics.checkNotNullParameter(context3, "context");
            if (color == 0) {
                color = context3.getColor(df0.a.f54892a);
            }
            drawable = drawable2.mutate();
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        gestaltToolbarImpl.S(drawable);
        gestaltToolbarImpl.v().setOnClickListener(new d(this, i14));
        gestaltToolbarImpl.z().setOnClickListener(new d(this, 2));
        gestaltToolbarImpl.z().setAlpha(0.0f);
        gestaltToolbarImpl.H();
        int i16 = t0.board_host_preview_icon;
        rm1.q qVar2 = rm1.q.EYE;
        String string = getResources().getString(y60.e.accessibility_preview_icon);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.H1 = m9(i16, qVar2, string, new d(this, 3));
        int i17 = t0.board_host_message_icon;
        rm1.q qVar3 = rm1.q.SPEECH_ELLIPSIS;
        String string2 = getResources().getString(d70.g.accessibility_message_icon);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.G1 = m9(i17, qVar3, string2, new d(this, 4));
        int i18 = t0.board_host_share_icon;
        rm1.q qVar4 = rm1.q.ANDROID_SHARE;
        String string3 = getResources().getString(y60.e.accessibility_share_icon);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.F1 = m9(i18, qVar4, string3, new d(this, 5));
        int i19 = t0.board_host_options_icon;
        rm1.q qVar5 = rm1.q.ELLIPSIS;
        String string4 = getResources().getString(m60.x0.more_options);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.E1 = m9(i19, qVar5, string4, new d(this, 6));
        super.onViewCreated(v13, bundle);
        if (!q9().e()) {
            addRecyclerViewEventListener(new zq0.a());
        }
        addScrollListener(this.Y1);
        v8();
        View findViewById6 = v13.findViewById(y60.c.board_detail_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.S1 = (ConstraintLayout) findViewById6;
        View findViewById7 = v13.findViewById(y60.c.board_request_to_join_button);
        RequestToJoinButton requestToJoinButton = (RequestToJoinButton) findViewById7;
        requestToJoinButton.a();
        bs1.c.X0(requestToJoinButton);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.I1 = requestToJoinButton;
        if (!s9()) {
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            String uid = f13 != null ? f13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            String str = uid;
            String n94 = n9();
            x0 x0Var2 = this.R0;
            if (x0Var2 == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
            i92.k kVar2 = this.f80135d1;
            if (kVar2 == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            no1.d dVar = this.S0;
            if (dVar == null) {
                Intrinsics.r("graphQLBoardRemoteDataSource");
                throw null;
            }
            xl0.d dVar2 = new xl0.d(str, n94, x0Var2, aVar, kVar2, dVar);
            yk1.j jVar2 = this.X0;
            if (jVar2 == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            RequestToJoinButton requestToJoinButton2 = this.I1;
            if (requestToJoinButton2 == null) {
                Intrinsics.r("requestToJoinButton");
                throw null;
            }
            jVar2.d(requestToJoinButton2, dVar2);
        }
        View findViewById8 = v13.findViewById(y60.c.board_invite_view);
        LegoBoardDetailInviteView legoBoardDetailInviteView = (LegoBoardDetailInviteView) findViewById8;
        legoBoardDetailInviteView.e(new u(this, legoBoardDetailInviteView));
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.J1 = legoBoardDetailInviteView;
        if (!s9()) {
            z4 z4Var = this.f80133c1;
            if (z4Var == null) {
                Intrinsics.r("boardInviteViewPresenterFactory");
                throw null;
            }
            zk0.e a14 = z4Var.a(n9());
            yk1.j jVar3 = this.X0;
            if (jVar3 == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            LegoBoardDetailInviteView legoBoardDetailInviteView2 = this.J1;
            if (legoBoardDetailInviteView2 == null) {
                Intrinsics.r("boardInviteView");
                throw null;
            }
            jVar3.d(legoBoardDetailInviteView2, a14);
        }
        View findViewById9 = v13.findViewById(y60.c.board_sensitive_content_warning);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.O1 = (LinearLayout) findViewById9;
        ((GestaltButton) v13.findViewById(y60.c.view_anyway_btn)).e(new gm1.a(this) { // from class: kl0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f80076b;

            {
                this.f80076b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i23 = i14;
                z this$0 = this.f80076b;
                switch (i23) {
                    case 0:
                        int i24 = z.f80128e2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.feature.board.detail.b bVar2 = this$0.f80145n1;
                        if (bVar2 != null) {
                            ((hl0.v) bVar2).i4();
                            break;
                        }
                        break;
                    default:
                        int i25 = z.f80128e2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.feature.board.detail.b bVar3 = this$0.f80145n1;
                        if (bVar3 != null) {
                            ((hl0.v) bVar3).l4();
                            break;
                        }
                        break;
                }
            }
        });
        ((GestaltButton) v13.findViewById(y60.c.go_back_btn)).e(new gm1.a(this) { // from class: kl0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f80076b;

            {
                this.f80076b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i23 = i13;
                z this$0 = this.f80076b;
                switch (i23) {
                    case 0:
                        int i24 = z.f80128e2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.feature.board.detail.b bVar2 = this$0.f80145n1;
                        if (bVar2 != null) {
                            ((hl0.v) bVar2).i4();
                            break;
                        }
                        break;
                    default:
                        int i25 = z.f80128e2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        com.pinterest.feature.board.detail.b bVar3 = this$0.f80145n1;
                        if (bVar3 != null) {
                            ((hl0.v) bVar3).l4();
                            break;
                        }
                        break;
                }
            }
        });
        ((GestaltText) v13.findViewById(y60.c.sensitive_content_community_guidelines_msg)).i(new t(this, i13));
        View findViewById10 = v13.findViewById(y60.c.board_header_image_container);
        BoardHeaderImageView boardHeaderImageView = (BoardHeaderImageView) findViewById10;
        Intrinsics.f(boardHeaderImageView);
        boardHeaderImageView.Z(bs1.c.W(boardHeaderImageView, d70.b.board_header_image_height));
        boardHeaderImageView.setOnClickListener(new d(this, 7));
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.T1 = boardHeaderImageView;
        View findViewById11 = v13.findViewById(y60.c.refresh_feed_toast);
        BoardRefreshToastView boardRefreshToastView = (BoardRefreshToastView) findViewById11;
        bs1.c.X0(boardRefreshToastView);
        boardRefreshToastView.setOnClickListener(new d(this, i13));
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.U1 = boardRefreshToastView;
        il0.v o93 = o9();
        h32.i0 d03 = gi2.b.d0(getK0(), this.d2, n9());
        String n95 = n9();
        com.pinterest.feature.board.detail.b bVar2 = this.f80145n1;
        String B3 = bVar2 != null ? ((hl0.v) bVar2).B3() : null;
        boolean s93 = s9();
        tk0.c.Companion.getClass();
        o93.h(d03, n95, B3, s93, tk0.b.a());
        com.pinterest.feature.board.detail.b bVar3 = this.f80145n1;
        if (bVar3 != null) {
            ((l82.c) o9().c()).a(new il0.c(bVar3));
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new q(this, null), 3);
    }

    public final zf0.f p9() {
        zf0.f fVar = this.U0;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("educationHelper");
        throw null;
    }

    public final lh0.r q9() {
        lh0.r rVar = this.f80137f1;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qa2.h0 r9() {
        RecyclerView g83 = g8();
        if (g83 == null) {
            return null;
        }
        FloatingToolbarView floatingToolbarView = this.P1;
        if (floatingToolbarView == null) {
            Intrinsics.r("bottomFloatingToolbarCard");
            throw null;
        }
        Rect rect = this.f80153v1;
        floatingToolbarView.getGlobalVisibleRect(rect);
        Set b13 = g1.b(new qc2.b(rect.left, rect.top, rect.right, rect.bottom));
        Iterator it = d7.b.O(g83).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            boolean z13 = this.f80154w1.d(view, g83, b13) > 99.5f;
            if ((view instanceof qa2.f0) && z13) {
                return ((qa2.f0) view).getInternalCell();
            }
        }
        return null;
    }

    public final boolean s9() {
        return com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_BOARD_IS_AUTO_MAGICAL", false);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void showLoadingSpinner(boolean z13) {
        if (q9().f()) {
            setShowPaginationSpinner(z13);
        }
    }

    public final boolean t9() {
        v7 a13 = ew.a(n9());
        if (a13 == null) {
            n8 n8Var = n8.f40341a;
            String n93 = n9();
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            n8Var.getClass();
            Boolean a14 = n8.a(f13, n93);
            if (a14 != null) {
                return a14.booleanValue();
            }
            return false;
        }
        wy0 f14 = ((b60.d) getActiveUserManager()).f();
        Boolean bool = null;
        if (f14 != null) {
            wy0 k13 = a13.k1();
            String uid = k13 != null ? k13.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            bool = Boolean.valueOf(dl2.b.S1(f14, uid));
        }
        return com.bumptech.glide.d.o0(bool);
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void u5(boolean z13) {
        LegoBoardDetailHeader legoBoardDetailHeader = this.K1;
        if (legoBoardDetailHeader == null) {
            Intrinsics.r("boardHeader");
            throw null;
        }
        legoBoardDetailHeader.setAlpha(z13 ? 1.0f : 0.4f);
        legoBoardDetailHeader.setEnabled(z13);
        if (!z13) {
            AppBarLayout appBarLayout = this.L1;
            if (appBarLayout == null) {
                Intrinsics.r("boardHeaderContainer");
                throw null;
            }
            appBarLayout.m(false, true);
        }
        BoardPinsFilter boardPinsFilter = this.N1;
        if (boardPinsFilter == null) {
            Intrinsics.r("boardPinsFilter");
            throw null;
        }
        boardPinsFilter.setEnabled(z13);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout == null) {
            return;
        }
        pinterestSwipeRefreshLayout.setEnabled(z13);
    }

    public final void u9() {
        RecyclerView g83 = g8();
        Object obj = g83 != null ? g83.f19242n : null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = obj instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) obj : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            pinterestStaggeredGridLayoutManager.e1(-1, 0);
        }
        yq0.z zVar = (yq0.z) this.f139732f0;
        if (zVar != null) {
            com.pinterest.feature.board.detail.b bVar = this.f80145n1;
            zVar.l(0, bVar != null ? ((hl0.v) bVar).D3() : 0);
        }
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.BOARD;
    }

    public final void v9() {
        GestaltToolbarImpl gestaltToolbarImpl = this.D1;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("topAppBar");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        gestaltToolbarImpl.setBackgroundColor(dl2.b.x0(requireContext, eo1.a.sema_color_background_transparent));
        w9(om1.f.TRANSPARENT_ALWAYS_LIGHT, eo1.b.color_themed_icon_light);
    }

    public final void w9(om1.f fVar, int i13) {
        GestaltIconButton gestaltIconButton = this.F1;
        if (gestaltIconButton == null) {
            Intrinsics.r("shareButton");
            throw null;
        }
        gestaltIconButton.t(new s(fVar, 0));
        GestaltIconButton gestaltIconButton2 = this.G1;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("messageButton");
            throw null;
        }
        gestaltIconButton2.t(new s(fVar, 1));
        GestaltIconButton gestaltIconButton3 = this.E1;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("overflowButton");
            throw null;
        }
        gestaltIconButton3.t(new s(fVar, 2));
        GestaltToolbarImpl gestaltToolbarImpl = this.D1;
        if (gestaltToolbarImpl != null) {
            gestaltToolbarImpl.u().setTint(bs1.c.C(this, i13));
        } else {
            Intrinsics.r("topAppBar");
            throw null;
        }
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }

    public final void y9(qa2.h0 h0Var) {
        zf0.f p93 = p9();
        xk2.v vVar = zf0.f.f141903e;
        y0 y0Var = y0.ANDROID_BOARD_TAKEOVER;
        rg0.n b13 = j1.D0(y0Var, i32.l.ANDROID_BOARD_FAVORITE_BUTTON_TOOLTIP) ? ((dh0.d) p93.f141904a).b(y0Var) : null;
        if (b13 == null) {
            return;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int[] iArr = new int[2];
        h0Var.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int dimensionPixelOffset = resources.getDimensionPixelOffset(r0.margin_quarter);
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Rect rect = new Rect(h0Var.getFavoriteButtonRect());
        int centerX = rect.centerX() + i13;
        int centerY = (rect.centerY() + i14) - dimensionPixelOffset;
        int i15 = i13 + rect.right;
        int i16 = i14 + rect.bottom;
        int dimensionPixelOffset2 = ((float) centerX) >= ((float) hf0.b.f69002b) / ((float) 2) ? resources.getDimensionPixelOffset(r0.margin) : 0;
        Rect rect2 = new Rect(centerX + dimensionPixelOffset2, centerY, i15 + dimensionPixelOffset2, i16);
        m60.w f73 = f7();
        m.h educationNew = b13.f108071m;
        Intrinsics.checkNotNullExpressionValue(educationNew, "educationNew");
        f73.d(new dg0.a(educationNew, rect2));
        ((Handler) this.f80152u1.getValue()).post(new nt.c2(this, 16));
    }

    @Override // com.pinterest.feature.board.organize.g
    public final void z4(rk0.j organizeMultiToolbar) {
        Intrinsics.checkNotNullParameter(organizeMultiToolbar, "organizeMultiToolbar");
        this.B1 = organizeMultiToolbar;
        View findViewById = requireView().findViewById(y60.c.board_floating_toolbar_card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById;
        this.P1 = floatingToolbarView;
        if (floatingToolbarView == null) {
            Intrinsics.r("bottomFloatingToolbarCard");
            throw null;
        }
        ca0.y yVar = new ca0.y(o9().c(), 11);
        GestaltToolbarImpl gestaltToolbarImpl = this.D1;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("topAppBar");
            throw null;
        }
        organizeMultiToolbar.h(floatingToolbarView, yVar, gestaltToolbarImpl, n9(), s7());
        organizeMultiToolbar.b(g8());
        b9(getResources().getDimensionPixelOffset(d70.b.floating_toolbar_recycler_padding));
    }

    public final void z9(boolean z13) {
        this.Y1.a(z13);
        BoardRefreshToastView boardRefreshToastView = this.U1;
        if (boardRefreshToastView == null) {
            Intrinsics.r("refreshFeedPromptView");
            throw null;
        }
        if (boardRefreshToastView.getVisibility() == 0) {
            return;
        }
        BoardRefreshToastView boardRefreshToastView2 = this.U1;
        if (boardRefreshToastView2 == null) {
            Intrinsics.r("refreshFeedPromptView");
            throw null;
        }
        boardRefreshToastView2.setAlpha(0.0f);
        boardRefreshToastView2.setTranslationY(bs1.c.b0(boardRefreshToastView2, eo1.c.space_600) * (-1.0f));
        bs1.c.U1(boardRefreshToastView2);
        boardRefreshToastView2.animate().alpha(1.0f).translationY(0.0f).setDuration(400L).start();
    }
}
