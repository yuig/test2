package jm0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n3;
import androidx.recyclerview.widget.v0;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.i0;
import h32.x3;
import java.util.List;
import java.util.UUID;
import kh2.a1;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ni1.d0;
import ni1.t2;
import o82.b3;
import qa2.j0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljm0/j;", "Lo82/v2;", "Lha2/f;", "<init>", "()V", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends b0 implements ha2.f {

    /* renamed from: k1, reason: collision with root package name */
    public static final /* synthetic */ int f76978k1 = 0;
    public n3 L0;
    public j0 M0;
    public t2 N0;
    public d0 O0;
    public m60.d0 P0;
    public zf0.f Q0;
    public GestaltToolbarImpl R0;
    public AppBarLayout S0;
    public GestaltText T0;
    public GestaltIconButton U0;
    public FloatingToolbarView V0;
    public FloatingToolbarView W0;
    public BoardSelectPinsHeaderView X0;
    public wm0.h Y0;
    public um0.a Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final xk2.k f76979a1;

    /* renamed from: b1, reason: collision with root package name */
    public final xk2.k f76980b1;

    /* renamed from: c1, reason: collision with root package name */
    public final xk2.k f76981c1;

    /* renamed from: d1, reason: collision with root package name */
    public final xk2.v f76982d1;

    /* renamed from: e1, reason: collision with root package name */
    public final xk2.v f76983e1;

    /* renamed from: f1, reason: collision with root package name */
    public final m1 f76984f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f76985g1;

    /* renamed from: h1, reason: collision with root package name */
    public zy.a0 f76986h1;

    /* renamed from: i1, reason: collision with root package name */
    public final d4 f76987i1;

    /* renamed from: j1, reason: collision with root package name */
    public final a4 f76988j1;

    public j() {
        xk2.n nVar = xk2.n.NONE;
        this.f76979a1 = xk2.m.a(nVar, new b(this, 0));
        int i13 = 1;
        this.f76980b1 = xk2.m.a(nVar, new b(this, i13));
        int i14 = 2;
        this.f76981c1 = xk2.m.a(nVar, new b(this, i14));
        this.f76982d1 = xk2.m.b(new b(this, 3));
        this.f76983e1 = xk2.m.b(new b(this, 4));
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(10, new kl0.w(this, i14)));
        this.f76984f1 = a1.s(this, k0.f80436a.b(a0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.f76985g1 = 2;
        this.f76986h1 = new zy.a0();
        this.f76987i1 = d4.BOARD;
        this.f76988j1 = a4.BOARD_SELF;
    }

    public static final EmptyStateBannerView k9(j jVar, Context context) {
        jVar.getClass();
        EmptyStateBannerView emptyStateBannerView = new EmptyStateBannerView(6, context, (AttributeSet) null);
        int W = bs1.c.W(emptyStateBannerView, eo1.c.space_600);
        emptyStateBannerView.setPaddingRelative(W, bs1.c.W(emptyStateBannerView, y60.a.board_empty_state_top_spacing), W, emptyStateBannerView.getPaddingBottom());
        return emptyStateBannerView;
    }

    @Override // o82.v2, yq0.t, yk1.k, nl1.d
    public final void L7() {
        n9(lm0.m.f83881a);
        super.L7();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(m9().a(), 19);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(m9().c(), 14);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.H(1000, new b(this, 10));
        int i13 = 0;
        g gVar = new g(this, i13);
        f fVar = new f(this, i13);
        h hVar = h.f76968j;
        b bVar = new b(this, 8);
        b bVar2 = new b(this, 5);
        dc0.q qVar = dc0.q.Default;
        adapter.E(70, bVar2, new ni0.f(qVar, gVar, fVar), hVar);
        b bVar3 = new b(this, 6);
        dc0.q qVar2 = dc0.q.Compact;
        adapter.E(71, bVar3, new ni0.f(qVar2, gVar, fVar), hVar);
        b bVar4 = new b(this, 7);
        dc0.q qVar3 = dc0.q.List;
        adapter.E(72, bVar4, new ni0.f(qVar3, gVar, fVar), hVar);
        adapter.E(86753091, bVar, new h90.m(qVar), hVar);
        adapter.E(86753092, bVar, new h90.m(qVar2), hVar);
        adapter.E(86753093, bVar, new h90.m(qVar3), hVar);
        int i14 = 2;
        adapter.J(1001, new b(this, 11), new p90.m(i14), new p90.n(this, i14), new f(this, 1));
        adapter.E(1002, dl2.b.m2(s7(), new qa2.e((wa2.m) this.f76983e1.getValue()).a(), new b(this, 12)), new h90.m(this, 5), h.f76969k);
        adapter.H(1003, new b(this, 9));
        adapter.A(true);
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        return this.f76986h1.e();
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns, reason: from getter */
    public final int getT0() {
        return this.f76985g1;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f76986h1.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.f76988j1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF50136o() {
        return this.f76987i1;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(m9().c(), 15);
    }

    public final String l9() {
        String uid;
        v7 P1;
        Navigation navigation = this.I;
        if (navigation == null || (uid = navigation.getF49940b()) == null) {
            Navigation navigation2 = this.I;
            uid = (navigation2 == null || (P1 = navigation2.P1()) == null) ? null : P1.getUid();
            if (uid == null) {
                uid = "";
            }
        }
        if (!kotlin.text.z.j(uid)) {
            return uid;
        }
        throw new IllegalArgumentException("Board ID is required".toString());
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(y60.d.fragment_all_saves, y60.c.all_saves_recycler_view);
        eVar.c(y60.c.all_saves_swipe_to_refresh_container);
        eVar.f979c = y60.c.all_saves_empty_state_container;
        return eVar;
    }

    public final a0 m9() {
        return (a0) this.f76984f1.getValue();
    }

    @Override // o82.v2, yq0.t
    public final v0 n8() {
        n3 n3Var = this.L0;
        if (n3Var == null) {
            Intrinsics.r("staggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), this.f76985g1);
        f13.f1(2);
        f13.f19176t = false;
        return new v0(f13);
    }

    public final void n9(lm0.y yVar) {
        kh2.j.x2(m9(), yVar);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a0 m93 = m9();
        String l93 = l9();
        String uuid = UUID.randomUUID().toString();
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "");
        wa2.m mVar = (wa2.m) this.f76983e1.getValue();
        tk0.c.Companion.getClass();
        List a13 = tk0.b.a();
        i0 i0Var = (i0) this.f76982d1.getValue();
        String f13 = this.f76986h1.f();
        Intrinsics.f(uuid);
        m93.h(l93, uuid, mVar, Z, a13, i0Var, f13);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayout = this.S0;
        if (appBarLayout == null) {
            Intrinsics.r("headerContainer");
            throw null;
        }
        appBarLayout.l((com.google.android.material.appbar.h) this.f76981c1.getValue());
        wm0.h hVar = this.Y0;
        if (hVar != null) {
            hVar.a();
        }
        n9(lm0.u.f83901a);
        super.onDestroyView();
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        final int i13 = 1;
        O8((EmptyStateBannerView) this.f76979a1.getValue(), 1);
        View findViewById = v13.findViewById(y60.c.toolbar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) findViewById;
        gestaltToolbarImpl.N(1);
        gestaltToolbarImpl.M(eo1.b.color_themed_background_default);
        gestaltToolbarImpl.H();
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gestaltToolbarImpl.S(bs1.c.l2(gestaltToolbarImpl, qVar.drawableRes(context, dl2.b.f1(context2)), eo1.b.color_themed_icon_default));
        final int i14 = 0;
        gestaltToolbarImpl.w().setOnClickListener(new View.OnClickListener(this) { // from class: jm0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f76945b;

            {
                this.f76945b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                j this$0 = this.f76945b;
                switch (i15) {
                    case 0:
                        int i16 = j.f76978k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.n9(lm0.f.f83861a);
                        break;
                    default:
                        int i17 = j.f76978k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.E8(0, false);
                        break;
                }
            }
        });
        gestaltToolbarImpl.z().setOnClickListener(new View.OnClickListener(this) { // from class: jm0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f76945b;

            {
                this.f76945b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                j this$0 = this.f76945b;
                switch (i15) {
                    case 0:
                        int i16 = j.f76978k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.n9(lm0.f.f83861a);
                        break;
                    default:
                        int i17 = j.f76978k1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.E8(0, false);
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.R0 = gestaltToolbarImpl;
        View findViewById2 = v13.findViewById(y60.c.all_saves_header_container);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById2;
        appBarLayout.b((com.google.android.material.appbar.h) this.f76981c1.getValue());
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.S0 = appBarLayout;
        View findViewById3 = v13.findViewById(y60.c.all_saves_board_metadata);
        GestaltText gestaltText = (GestaltText) findViewById3;
        Intrinsics.f(gestaltText);
        pp2.a.k(gestaltText, h.f76971m);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.T0 = gestaltText;
        View findViewById4 = v13.findViewById(y60.c.all_saves_filter_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById4;
        Intrinsics.f(gestaltIconButton);
        g3.y(gestaltIconButton, h.f76970l);
        gestaltIconButton.u(new yb0.b(this, 24));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.U0 = gestaltIconButton;
        g9(bs1.c.X(this, d70.b.floating_toolbar_recycler_padding));
        View findViewById5 = v13.findViewById(y60.c.all_saves_board_tools_bar);
        FloatingToolbarView floatingToolbarView = (FloatingToolbarView) findViewById5;
        floatingToolbarView.setTranslationY(400.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.V0 = floatingToolbarView;
        View findViewById6 = v13.findViewById(y60.c.all_saves_organize_tools_bar);
        FloatingToolbarView floatingToolbarView2 = (FloatingToolbarView) findViewById6;
        floatingToolbarView2.setTranslationY(400.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.W0 = floatingToolbarView2;
        View findViewById7 = v13.findViewById(y60.c.all_saves_organize_header);
        BoardSelectPinsHeaderView boardSelectPinsHeaderView = (BoardSelectPinsHeaderView) findViewById7;
        boardSelectPinsHeaderView.setTranslationY(-400.0f);
        boardSelectPinsHeaderView.T(new b(this, 13), new b(this, 14));
        Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
        this.X0 = boardSelectPinsHeaderView;
        RecyclerView g83 = g8();
        if (g83 != null) {
            FloatingToolbarView floatingToolbarView3 = this.V0;
            if (floatingToolbarView3 == null) {
                Intrinsics.r("boardTools");
                throw null;
            }
            GestaltToolbarImpl gestaltToolbarImpl2 = this.R0;
            if (gestaltToolbarImpl2 == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            FloatingToolbarView floatingToolbarView4 = this.W0;
            if (floatingToolbarView4 == null) {
                Intrinsics.r("organizeTools");
                throw null;
            }
            BoardSelectPinsHeaderView boardSelectPinsHeaderView2 = this.X0;
            if (boardSelectPinsHeaderView2 == null) {
                Intrinsics.r("organizeHeader");
                throw null;
            }
            this.Y0 = new wm0.h(floatingToolbarView3, gestaltToolbarImpl2, floatingToolbarView4, boardSelectPinsHeaderView2, g83);
            int i15 = 2;
            this.Z0 = new um0.a(new y92.f(new f(this, i15), new g(this, i13), new g(this, i15)), new i(g83, i14));
        }
        a1.l(this, new e(this, null));
        n9(lm0.t.f83898a);
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f76986h1.e().f67083c;
        return (x3Var == null || (str = x3Var.f67402f) == null) ? l9() : str;
    }
}
