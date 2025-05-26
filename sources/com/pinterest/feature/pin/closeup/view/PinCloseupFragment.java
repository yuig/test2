package com.pinterest.feature.pin.closeup.view;

import a.cb;
import a.z0;
import ac2.o;
import ac2.o1;
import ac2.p1;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;
import b11.f;
import b11.i;
import b11.o0;
import b11.p;
import b11.q;
import b11.u;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.closeup.view.PinCloseupFloatingActionBarBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.feature.pin.closeup.view.behavior.PinCloseupBackToTopButtonVisibilityBehavior;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import dl1.s;
import e11.a;
import e11.b;
import e11.c;
import e11.d;
import e11.e;
import e11.h;
import ey.p4;
import ey.s1;
import gg0.l0;
import h32.d4;
import h32.e4;
import h32.f1;
import h32.h4;
import i01.a0;
import i01.f0;
import i01.l;
import i01.m;
import i01.n;
import i01.t;
import i01.y;
import i01.z;
import i32.y0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import jk2.x;
import kh2.r;
import kh2.s0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.j;
import lh0.k2;
import lh0.l1;
import lh0.n1;
import lh0.w0;
import lh0.z3;
import m60.g0;
import m60.r0;
import m60.t0;
import m60.w;
import mq.j0;
import nx.b0;
import nx.d0;
import nx.d1;
import oq.x0;
import q5.m0;
import q5.v0;
import rq.j4;
import rq.r1;
import rq.w4;
import rq.y2;
import rq.y4;
import so.l6;
import so.o6;
import so.oa;
import so.y5;
import sq0.i0;
import sw0.q0;
import v.c1;
import x02.i2;
import xk2.k;
import xk2.v;
import y70.g;
import yn2.c0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u0017:\u0002\u001a\u001bB\t\b\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/pinterest/feature/pin/closeup/view/PinCloseupFragment;", "Lwk1/k;", "Ldl1/s;", "Li01/t;", "Lnr0/j;", "Le11/h;", "Lmq/j0;", "Le11/f;", "Le11/e;", "Le11/b;", "Le11/c;", "Le11/d;", "Lml1/q;", "Lac2/o;", "Lgg0/l0;", "Lcb2/e;", "", "Lb11/h;", "Lb11/e;", "Lb11/o0;", "Li01/z;", "Le11/a;", "Lwk1/d;", "Li01/m;", "<init>", "()V", "bp1/h", "LayoutManagerException", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinCloseupFragment extends f<s> implements t, h, j0, e11.f, e, b, c, d, o, l0, cb2.e, b11.h, b11.e, o0, z, a, wk1.d, m {

    /* renamed from: m3, reason: collision with root package name */
    public static final /* synthetic */ int f46972m3 = 0;
    public ps.c A1;
    public FrameLayout A2;
    public es.h B1;
    public GestaltIconButton B2;
    public hs.d C1;
    public c1 C2;
    public kv.a D1;
    public boolean D2;
    public kv.c E1;
    public j4 E2;
    public r01.d F1;
    public RelativeLayout F2;
    public c82.d G1;
    public PinterestRecyclerView G2;
    public ur.a H1;
    public y H2;
    public c2 I1;
    public i01.o I2;
    public rg0.s J1;
    public final androidx.media3.ui.h J2;
    public final k K2;
    public a0 L1;
    public az0.b L2;
    public final n.e M2;
    public final xj2.b N2;
    public f0 O1;
    public final k O2;
    public final uk2.d P1;
    public final k P2;
    public final uk2.d Q1;
    public final k Q2;
    public se2.a R0;
    public final xj2.b R1;
    public final k R2;
    public g0 S0;
    public final Handler S1;
    public final k S2;
    public y5 T0;
    public ur0.e T1;
    public PinCloseupFloatingActionBarBehavior T2;
    public l6 U0;
    public l U1;
    public np0.m U2;
    public o6 V0;
    public i01.a V1;
    public final i0 V2;
    public yk1.a W0;
    public final p W1;
    public final k W2;
    public i2 X0;
    public n X1;
    public final v X2;
    public nx.f0 Y0;
    public MediaPlayer Y1;
    public final v Y2;
    public se2.a Z0;
    public q01.y Z1;
    public final v Z2;

    /* renamed from: a1, reason: collision with root package name */
    public lh0.a0 f46973a1;

    /* renamed from: a2, reason: collision with root package name */
    public q01.l f46974a2;

    /* renamed from: a3, reason: collision with root package name */
    public final b11.v f46975a3;

    /* renamed from: b1, reason: collision with root package name */
    public l1 f46976b1;

    /* renamed from: b2, reason: collision with root package name */
    public q01.b f46977b2;

    /* renamed from: b3, reason: collision with root package name */
    public boolean f46978b3;

    /* renamed from: c1, reason: collision with root package name */
    public j f46979c1;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f46980c2;

    /* renamed from: c3, reason: collision with root package name */
    public boolean f46981c3;

    /* renamed from: d1, reason: collision with root package name */
    public k2 f46982d1;
    public boolean d2;

    /* renamed from: d3, reason: collision with root package name */
    public final k f46983d3;

    /* renamed from: e1, reason: collision with root package name */
    public wk2.a f46984e1;

    /* renamed from: e2, reason: collision with root package name */
    public long f46985e2;

    /* renamed from: e3, reason: collision with root package name */
    public GestaltButton f46986e3;

    /* renamed from: f1, reason: collision with root package name */
    public c91.e f46987f1;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f46988f2;

    /* renamed from: f3, reason: collision with root package name */
    public Integer f46989f3;

    /* renamed from: g1, reason: collision with root package name */
    public se2.a f46990g1;

    /* renamed from: g2, reason: collision with root package name */
    public x0 f46991g2;

    /* renamed from: g3, reason: collision with root package name */
    public w01.f f46992g3;

    /* renamed from: h1, reason: collision with root package name */
    public wk2.a f46993h1;

    /* renamed from: h2, reason: collision with root package name */
    public tq.y f46994h2;

    /* renamed from: h3, reason: collision with root package name */
    public p01.j f46995h3;

    /* renamed from: i1, reason: collision with root package name */
    public wk2.a f46996i1;

    /* renamed from: i2, reason: collision with root package name */
    public x0 f46997i2;

    /* renamed from: i3, reason: collision with root package name */
    public final d4 f46998i3;

    /* renamed from: j1, reason: collision with root package name */
    public pb0.d f46999j1;

    /* renamed from: j2, reason: collision with root package name */
    public tq.y f47000j2;

    /* renamed from: j3, reason: collision with root package name */
    public se2.a f47001j3;

    /* renamed from: k1, reason: collision with root package name */
    public b20.c f47002k1;

    /* renamed from: k2, reason: collision with root package name */
    public int[] f47003k2;

    /* renamed from: k3, reason: collision with root package name */
    public se2.a f47004k3;

    /* renamed from: l1, reason: collision with root package name */
    public se2.a f47005l1;

    /* renamed from: l2, reason: collision with root package name */
    public final int[] f47006l2;

    /* renamed from: l3, reason: collision with root package name */
    public final v f47007l3;

    /* renamed from: m1, reason: collision with root package name */
    public se2.a f47008m1;

    /* renamed from: m2, reason: collision with root package name */
    public final int[] f47009m2;

    /* renamed from: n1, reason: collision with root package name */
    public yk1.j f47010n1;

    /* renamed from: n2, reason: collision with root package name */
    public i01.b f47011n2;

    /* renamed from: o1, reason: collision with root package name */
    public se2.a f47012o1;

    /* renamed from: o2, reason: collision with root package name */
    public FrameLayout f47013o2;

    /* renamed from: p1, reason: collision with root package name */
    public se2.a f47014p1;

    /* renamed from: p2, reason: collision with root package name */
    public PinCloseupLegoActionButtonModule f47015p2;

    /* renamed from: q1, reason: collision with root package name */
    public p1 f47016q1;

    /* renamed from: q2, reason: collision with root package name */
    public PinCloseupFloatingActionBarModule f47017q2;

    /* renamed from: r1, reason: collision with root package name */
    public w0 f47018r1;

    /* renamed from: r2, reason: collision with root package name */
    public PinCloseupPresenter f47019r2;

    /* renamed from: s1, reason: collision with root package name */
    public bc2.e f47020s1;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f47021s2;

    /* renamed from: t1, reason: collision with root package name */
    public es.a f47022t1;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f47023t2;

    /* renamed from: u1, reason: collision with root package name */
    public i91.z f47024u1;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f47025u2;

    /* renamed from: v1, reason: collision with root package name */
    public b0 f47026v1;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f47027v2;

    /* renamed from: w1, reason: collision with root package name */
    public is1.f f47028w1;

    /* renamed from: w2, reason: collision with root package name */
    public u01.v f47029w2;

    /* renamed from: x1, reason: collision with root package name */
    public cz.e f47030x1;

    /* renamed from: x2, reason: collision with root package name */
    public int[] f47031x2;

    /* renamed from: y1, reason: collision with root package name */
    public dz.a f47032y1;

    /* renamed from: y2, reason: collision with root package name */
    public int[] f47033y2;

    /* renamed from: z1, reason: collision with root package name */
    public ax.a f47034z1;

    /* renamed from: z2, reason: collision with root package name */
    public GestaltSpinner f47035z2;
    public final v K1 = xk2.m.b(new u(this, 20));
    public final ArrayList M1 = new ArrayList();
    public final ArrayList N1 = new ArrayList();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/feature/pin/closeup/view/PinCloseupFragment$LayoutManagerException;", "Landroidx/recyclerview/widget/LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;", "closeup_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class LayoutManagerException extends LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutManagerException(String debugTag, Exception originalException) {
            super(debugTag, originalException);
            Intrinsics.checkNotNullParameter(debugTag, "debugTag");
            Intrinsics.checkNotNullParameter(originalException, "originalException");
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [b11.p] */
    public PinCloseupFragment() {
        Boolean bool = Boolean.FALSE;
        uk2.d R = uk2.d.R(bool);
        Intrinsics.checkNotNullExpressionValue(R, "createDefault(...)");
        this.P1 = R;
        uk2.d R2 = uk2.d.R(bool);
        Intrinsics.checkNotNullExpressionValue(R2, "createDefault(...)");
        this.Q1 = R2;
        this.R1 = new xj2.b();
        this.S1 = new Handler(Looper.getMainLooper());
        this.W1 = new ar0.f() { // from class: b11.p
            @Override // ar0.f
            public final boolean b(int i13, int i14) {
                int r03;
                int i15 = PinCloseupFragment.f46972m3;
                PinCloseupFragment this$0 = PinCloseupFragment.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i01.y yVar = this$0.H2;
                int currentPageIndex = yVar != null ? yVar.getCurrentPageIndex() : Integer.MAX_VALUE;
                m60.g0 g0Var = this$0.S0;
                if (g0Var == null) {
                    Intrinsics.r("pageSizeProvider");
                    throw null;
                }
                int a13 = g0Var.a();
                i01.o oVar = this$0.I2;
                if (oVar == null || !oVar.isEligibleForLoadMoreExperiment()) {
                    r03 = j1.r0(hf0.b.q()) * 9;
                } else {
                    i01.o oVar2 = this$0.I2;
                    Intrinsics.f(oVar2);
                    r03 = oVar2.getCurrentLoadMoreThreshold();
                }
                if (currentPageIndex > 1) {
                    return i14 >= i13 - r03;
                }
                boolean z13 = i14 >= i13 - a13;
                if (z13 && currentPageIndex == 1) {
                    if (this$0.q9().y()) {
                        z13 = this$0.f46980c2;
                    }
                    if (z13 && !this$0.d2 && this$0.q9().j(a4.f83297a)) {
                        this$0.d2 = true;
                        int r93 = this$0.r9();
                        RecyclerView g83 = this$0.g8();
                        l2 l2Var = g83 != null ? g83.f19242n : null;
                        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
                        View z14 = pinterestStaggeredGridLayoutManager != null ? pinterestStaggeredGridLayoutManager.z(r93) : null;
                        int abs = z14 != null ? Math.abs(z14.getTop()) : 0;
                        nx.d0 s73 = this$0.s7();
                        f1 f1Var = f1.LOAD_URL;
                        String pinId = this$0.getPinId();
                        HashMap hashMap = new HashMap();
                        hashMap.put("scroll_offset_in_px", String.valueOf(abs));
                        hashMap.put("first_visible_view_adapter_index", String.valueOf(r93));
                        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this$0.f46985e2));
                        Unit unit = Unit.f80348a;
                        s73.g(f1Var, pinId, hashMap, false);
                    }
                }
                return z13;
            }
        };
        this.f47003k2 = new int[]{0, 0};
        this.f47006l2 = new int[2];
        this.f47009m2 = new int[2];
        this.f47021s2 = true;
        this.f47031x2 = new int[2];
        this.f47033y2 = new int[2];
        this.J2 = new androidx.media3.ui.h(this, 3);
        xk2.n nVar = xk2.n.NONE;
        this.K2 = xk2.m.a(nVar, new u(this, 0));
        this.M2 = new n.e(this, 9);
        this.N2 = new xj2.b();
        this.O2 = xk2.m.a(nVar, new u(this, 3));
        this.P2 = xk2.m.a(nVar, new u(this, 5));
        this.Q2 = xk2.m.a(nVar, new u(this, 7));
        this.R2 = xk2.m.a(nVar, new u(this, 6));
        this.S2 = xk2.m.a(nVar, new u(this, 2));
        this.V2 = new i0();
        this.W2 = xk2.m.a(nVar, new u(this, 16));
        this.X2 = xk2.m.b(new u(this, 19));
        this.Y2 = xk2.m.b(new u(this, 18));
        this.Z2 = xk2.m.b(new u(this, 17));
        this.f46975a3 = new b11.v(this);
        this.f46983d3 = xk2.m.a(nVar, b11.s.f21081i);
        this.S = false;
        this.f46998i3 = d4.PIN;
        this.f47007l3 = xk2.m.b(new u(this, 4));
    }

    public static final void j9(PinCloseupFragment pinCloseupFragment) {
        ViewStub viewStub;
        r01.d dVar = pinCloseupFragment.F1;
        if (dVar == null) {
            Intrinsics.r("userHelper");
            throw null;
        }
        if (dVar.a()) {
            pinCloseupFragment.f46989f3 = null;
            View view = pinCloseupFragment.getView();
            View inflate = (view == null || (viewStub = (ViewStub) view.findViewById(n80.c.viewstub_back_to_top_button)) == null) ? null : viewStub.inflate();
            GestaltButton gestaltButton = inflate instanceof GestaltButton ? (GestaltButton) inflate : null;
            pinCloseupFragment.f46986e3 = gestaltButton;
            ViewGroup.LayoutParams layoutParams = gestaltButton != null ? gestaltButton.getLayoutParams() : null;
            androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
            pinCloseupFragment.f46989f3 = cVar != null ? Integer.valueOf(((ViewGroup.MarginLayoutParams) cVar).bottomMargin) : null;
            int i13 = 1;
            if (cVar != null) {
                cVar.d(new PinCloseupBackToTopButtonVisibilityBehavior(pinCloseupFragment.s7(), new b11.b0(pinCloseupFragment, 0), new b11.b0(pinCloseupFragment, 1)));
            }
            GestaltButton gestaltButton2 = pinCloseupFragment.f46986e3;
            if (gestaltButton2 != null) {
                gestaltButton2.e(new q(pinCloseupFragment, i13));
            }
            xj2.c F = pinCloseupFragment.c7().d().F(new a11.f(15, new ky0.b(19, pinCloseupFragment, cVar)), new a11.f(16, i.f21007q), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            pinCloseupFragment.R6(F);
        }
    }

    public static final void k9(PinCloseupFragment pinCloseupFragment) {
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule;
        x0 x0Var;
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule2;
        if (!pinCloseupFragment.L9() && pinCloseupFragment.f47017q2 == null) {
            i01.b bVar = pinCloseupFragment.f47011n2;
            f30 pin = bVar != null ? bVar.getPin() : null;
            PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = new PinCloseupFloatingActionBarModule(0, 14, pinCloseupFragment.w9(), null);
            k kVar = pinCloseupFragment.O2;
            boolean booleanValue = ((Boolean) kVar.getValue()).booleanValue();
            d0 s73 = pinCloseupFragment.s7();
            u01.v vVar = pinCloseupFragment.f47029w2;
            if (vVar == null) {
                Intrinsics.r("pinCloseupNavigationMetadata");
                throw null;
            }
            String d2 = vVar.d();
            if (pinCloseupFragment.f47029w2 == null) {
                Intrinsics.r("pinCloseupNavigationMetadata");
                throw null;
            }
            pinCloseupFloatingActionBarModule.a(booleanValue, s73, d2, pinCloseupFragment.v9());
            pinCloseupFragment.f47017q2 = pinCloseupFloatingActionBarModule;
            View view = pinCloseupFragment.getView();
            CoordinatorLayout coordinatorLayout = view != null ? (CoordinatorLayout) view.findViewById(n80.c.lego_closeup_container) : null;
            if (coordinatorLayout != null) {
                coordinatorLayout.addView(pinCloseupFragment.f47017q2);
            }
            if (((Boolean) kVar.getValue()).booleanValue() && coordinatorLayout != null) {
                PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule3 = new PinCloseupLegoActionButtonModule(pinCloseupFragment.w9(), pinCloseupFragment.f47023t2);
                pinCloseupLegoActionButtonModule3.setPaddingRelative(0, pinCloseupLegoActionButtonModule3.getResources().getDimensionPixelSize(eo1.c.margin_half), 0, pinCloseupLegoActionButtonModule3.getResources().getDimensionPixelSize(eo1.c.margin_half));
                Context w93 = pinCloseupFragment.w9();
                int i13 = eo1.b.color_themed_background_default;
                Object obj = d5.a.f53679a;
                pinCloseupLegoActionButtonModule3.setBackgroundColor(w93.getColor(i13));
                pinCloseupLegoActionButtonModule3.updatePinalytics(pinCloseupFragment.s7());
                u01.v vVar2 = pinCloseupFragment.f47029w2;
                if (vVar2 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                pinCloseupLegoActionButtonModule3.k(vVar2.d());
                u01.v vVar3 = pinCloseupFragment.f47029w2;
                if (vVar3 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                pinCloseupLegoActionButtonModule3.l(vVar3.h());
                pinCloseupLegoActionButtonModule3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                pinCloseupFragment.f47015p2 = pinCloseupLegoActionButtonModule3;
                PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule2 = pinCloseupFragment.f47017q2;
                if (pinCloseupFloatingActionBarModule2 != null) {
                    pinCloseupFloatingActionBarModule2.addView(pinCloseupLegoActionButtonModule3);
                }
            }
            if (pin != null) {
                pinCloseupFragment.O9(pin);
                if (b40.Q0(pin) && ((Boolean) kVar.getValue()).booleanValue() && (pinCloseupLegoActionButtonModule2 = pinCloseupFragment.f47015p2) != null) {
                    Context w94 = pinCloseupFragment.w9();
                    int i14 = eo1.b.color_themed_transparent;
                    Object obj2 = d5.a.f53679a;
                    pinCloseupLegoActionButtonModule2.setBackgroundColor(w94.getColor(i14));
                }
            }
            PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule3 = pinCloseupFragment.f47017q2;
            if (pinCloseupFloatingActionBarModule3 != null) {
                if (!pinCloseupFloatingActionBarModule3.isLaidOut() || pinCloseupFloatingActionBarModule3.isLayoutRequested()) {
                    pinCloseupFloatingActionBarModule3.addOnLayoutChangeListener(new n5.h(5, pinCloseupFragment, pin));
                } else {
                    x0 x0Var2 = pinCloseupFragment.f46997i2;
                    if (x0Var2 != null) {
                        x0Var2.J1(pinCloseupFragment.o9());
                    }
                    x0 x0Var3 = pinCloseupFragment.f46997i2;
                    if (x0Var3 != null) {
                        x0Var3.O1(pinCloseupFragment.o9());
                    }
                    x0 x0Var4 = pinCloseupFragment.f46997i2;
                    if (x0Var4 != null) {
                        x0Var4.H1(pinCloseupFragment.o9());
                    }
                    if (pin != null && b40.b1(pin) && (x0Var = pinCloseupFragment.f46997i2) != null) {
                        pinCloseupFragment.o9();
                        x0Var.z1();
                    }
                }
            }
        }
        pinCloseupFragment.A9();
        rg0.n e13 = ((zf0.f) ((bf2.b) pinCloseupFragment.p9()).get()).e();
        if (e13 == null || (pinCloseupLegoActionButtonModule = pinCloseupFragment.f47015p2) == null) {
            return;
        }
        Rect rect = new Rect();
        ImageView imageView = (ImageView) pinCloseupLegoActionButtonModule.findViewById(t0.pin_action_reaction);
        if (imageView != null) {
            imageView.getGlobalVisibleRect(rect);
        }
        if (rect.isEmpty()) {
            return;
        }
        w f73 = pinCloseupFragment.f7();
        m.h educationNew = e13.f108071m;
        Intrinsics.checkNotNullExpressionValue(educationNew, "educationNew");
        f73.d(new dg0.a(educationNew, rect));
    }

    public static final void l9(PinCloseupFragment pinCloseupFragment) {
        r1 k13;
        r70.a aVar;
        n1 n1Var = a11.o.f334a;
        if (a11.o.a(pinCloseupFragment.getPin()) || a11.o.b(pinCloseupFragment.getPin())) {
            FragmentActivity E4 = pinCloseupFragment.E4();
            MainActivity mainActivity = E4 instanceof MainActivity ? (MainActivity) E4 : null;
            LinearLayout view = (mainActivity == null || (aVar = mainActivity.f130611b) == null) ? null : aVar.getView();
            LinearLayout linearLayout = view instanceof View ? view : null;
            if (linearLayout == null || pinCloseupFragment.U2 != null) {
                return;
            }
            x0 x0Var = pinCloseupFragment.f46997i2;
            if (x0Var == null || (k13 = x0Var.t0()) == null) {
                tq.y yVar = pinCloseupFragment.f47000j2;
                if (yVar == null) {
                    return;
                } else {
                    k13 = yVar.k();
                }
            }
            np0.m mVar = new np0.m(linearLayout, k13);
            mVar.b(pinCloseupFragment.f91282J);
            pinCloseupFragment.U2 = mVar;
        }
    }

    public static final void m9(PinCloseupFragment pinCloseupFragment) {
        zf0.f fVar = (zf0.f) ((bf2.b) pinCloseupFragment.p9()).get();
        fVar.getClass();
        y0 y0Var = y0.ANDROID_PIN_CLOSEUP_TAKEOVER;
        if (!zf0.f.f(y0Var, new i32.l[]{i32.l.ANDROID_PINIT_BTN_TOOLTIP, i32.l.ANDROID_CLICKTHROUGH_BTN_TOOLTIP}) && !zf0.f.i() && !zf0.f.g() && !j1.D0(y0Var, i32.l.ANDROID_PINIT_BTN_TOOLTIP_RETRIGGER) && !j1.D0(y0Var, i32.l.ANDROID_NOTIFICATION_PIN_CLOSEUP_TOOLTIP) && !j1.D0(y0Var, i32.l.ANDROID_DID_IT_BTN_TOOLTIP) && !j1.D0(y0Var, i32.l.ANDROID_PIN_CLOSEUP_RETRIGGER_CLICKTHROUGH_PULSAR_LFV) && !j1.D0(y0Var, i32.l.ANDROID_TRIED_IT_REEDUCATION_CLOSEUP_PULSAR)) {
            i32.l lVar = i32.l.ANDROID_CLOSEUP_SEND_BTN_TOOLTIP_RESEND;
            if (!j1.D0(y0Var, lVar) && !j1.D0(y0Var, i32.l.ANDROID_SHARE_AFTER_SCREENSHOT) && !j1.D0(y0Var, i32.l.ANDROID_SAVE_AFTER_SCREENSHOT)) {
                y0 y0Var2 = y0.ANDROID_REPIN_DIALOG_TAKEOVER;
                if (!j1.D0(y0Var2, i32.l.ANDROID_POST_REPIN_BOARD_UPSELL) && !j1.D0(y0Var2, i32.l.ANDROID_POST_REPIN_BOARD_UPSELL_POST_CREATE) && !j1.D0(y0Var, i32.l.ANDROID_CLOSEUP_SEND_BTN_TOOLTIP) && !j1.D0(y0Var, lVar) && !j1.D0(y0Var, i32.l.ANDROID_CLICKTHROUGH_EDUCATION) && !j1.D0(y0Var, i32.l.ANDROID_CLOSEUP_BUY_BTN_TOOLTIP) && !j1.D0(y0Var, i32.l.ANDROID_CLOSEUP_REDESIGN_SAVE_EDUCATION) && !j1.D0(y0Var, i32.l.ANDROID_CLOSEUP_REDESIGN_VISIT_EDUCATION) && !j1.D0(y0Var, i32.l.ANDROID_CLOSEUP_REDESIGN_DOWNLOAD_EDUCATION) && !j1.D0(y0.ANDROID_PIN_CLOSEUP_AFTER_SHARE, i32.l.ANDROID_CLOSEUP_REDESIGN_SAVE_AFTER_SHARE_EDUCATION) && !j1.D0(y0.ANDROID_PIN_CLOSEUP_AFTER_REACT, i32.l.ANDROID_CLOSEUP_REDESIGN_SAVE_AFTER_REACTION_EDUCATION) && !j1.D0(y0.ANDROID_PIN_CLOSEUP_AFTER_DOWNLOAD, i32.l.ANDROID_CLOSEUP_REDESIGN_DOWNLOAD_AFTER_SCREENSHOT_EDUCATION) && fVar.e() == null) {
                    return;
                }
            }
        }
        pinCloseupFragment.f7().d(new gg0.i());
    }

    public final void A9() {
        PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule;
        if (L9() || (pinCloseupFloatingActionBarModule = this.f47017q2) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = pinCloseupFloatingActionBarModule.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) layoutParams;
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            I9(x0Var.T(), cVar, x0Var.B0());
            return;
        }
        tq.y yVar = this.f47000j2;
        ViewGroup j13 = yVar != null ? yVar.j() : null;
        if (j13 == null) {
            View view = getView();
            j13 = view != null ? (ConstraintLayout) view.findViewById(hy1.a.pdp_action_bar) : null;
        }
        tq.y yVar2 = this.f47000j2;
        y2 l13 = yVar2 != null ? yVar2.l() : null;
        if (j13 != null) {
            I9(j13, cVar, l13);
        }
    }

    public final void B9() {
        e4 e4Var = new e4(h4.V_BOTTOM, Boolean.FALSE, ep.b.f(1000000L));
        f0 f0Var = this.O1;
        if (f0Var != null) {
            f0Var.onNewVisibleEvent(e4Var);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            x0Var.o(e4Var);
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            yVar.a(e4Var);
        }
    }

    public final void C9(h4 threshold, boolean z13) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        e4 e4Var = new e4(threshold, Boolean.valueOf(z13), Long.valueOf(System.currentTimeMillis() * 1000000));
        f0 f0Var = this.O1;
        if (f0Var != null) {
            f0Var.onNewVisibleEvent(e4Var);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            x0Var.o(e4Var);
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            yVar.a(e4Var);
        }
    }

    public final void D9() {
        w4 g03;
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        if (b40.Q0(pin) && !b40.P0(pin)) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            new oy.g0(uid).i();
        }
        x0 x0Var = this.f46997i2;
        y4 H0 = x0Var != null ? x0Var.H0() : null;
        if (H0 != null) {
            H0.g(false);
        }
        x0 x0Var2 = this.f46997i2;
        if (x0Var2 == null || (g03 = x0Var2.g0()) == null) {
            return;
        }
        g03.g();
    }

    public final void E9() {
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        if (b40.Q0(pin) && !b40.P0(pin)) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            s92.l lVar = s92.l.STORY_PIN_NAVIGATION;
            boolean R0 = b40.R0(pin);
            b40.d0(pin);
            new oy.i0(uid, lVar, R0, null, null, RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY).i();
        }
        x0 x0Var = this.f46997i2;
        y4 H0 = x0Var != null ? x0Var.H0() : null;
        if (H0 != null) {
            H0.g(true);
        }
        np0.m mVar = this.U2;
        if (mVar != null) {
            mVar.a();
        }
    }

    public final void F9() {
        e4 e4Var = new e4(h4.V_TOP, Boolean.FALSE, ep.b.f(1000000L));
        f0 f0Var = this.O1;
        if (f0Var != null) {
            f0Var.onNewVisibleEvent(e4Var);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            x0Var.o(e4Var);
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            yVar.a(e4Var);
        }
    }

    public final void G9() {
        Context context = getContext();
        if (context == null || !ig1.b.t0(context)) {
            return;
        }
        ig1.b.T0(getView());
    }

    @Override // mq.j0
    public final void H1() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            q8().j(g83, 0, 0);
        }
    }

    @Override // mq.j0
    public final f30 H4() {
        i01.b bVar = this.f47011n2;
        if (bVar != null) {
            return bVar.getPin();
        }
        return null;
    }

    public final void H9() {
        PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = this.f47017q2;
        if (pinCloseupFloatingActionBarModule != null) {
            ViewGroup.LayoutParams layoutParams = pinCloseupFloatingActionBarModule.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((androidx.coordinatorlayout.widget.c) layoutParams).d(null);
        }
    }

    @Override // nl1.d
    public final void I7() {
        super.I7();
        u01.v vVar = this.f47029w2;
        if (vVar == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        if (Intrinsics.d(vVar.f119961n, "shop_the_look_module")) {
            d0.v(s7(), f1.COLLECTION_ITEM_CLOSEUP, getPinId(), false, 12);
        }
    }

    public final void I9(ViewGroup viewGroup, androidx.coordinatorlayout.widget.c cVar, y2 y2Var) {
        r70.a aVar;
        FragmentActivity E4 = E4();
        MainActivity mainActivity = E4 instanceof MainActivity ? (MainActivity) E4 : null;
        LinearLayout view = (mainActivity == null || (aVar = mainActivity.f130611b) == null) ? null : aVar.getView();
        LinearLayout linearLayout = view instanceof View ? view : null;
        if (linearLayout == null || this.T2 != null) {
            return;
        }
        RecyclerView g83 = g8();
        FragmentActivity E42 = E4();
        Intrinsics.g(E42, "null cannot be cast to non-null type com.pinterest.hairball.kit.activity.BaseActivity");
        PinCloseupFloatingActionBarBehavior pinCloseupFloatingActionBarBehavior = new PinCloseupFloatingActionBarBehavior(viewGroup, linearLayout, g83, y2Var, ((cp1.p) E42).getNavigationManager());
        pinCloseupFloatingActionBarBehavior.E(this.f91282J);
        cVar.d(pinCloseupFloatingActionBarBehavior);
        this.T2 = pinCloseupFloatingActionBarBehavior;
    }

    public final void J9(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state == yk1.i.LOADING) {
            FrameLayout frameLayout = this.A2;
            if (frameLayout != null) {
                bs1.c.U1(frameLayout);
            }
            GestaltSpinner gestaltSpinner = this.f47035z2;
            if (gestaltSpinner != null) {
                s0.w(gestaltSpinner, i.f21005o);
                return;
            }
            return;
        }
        if (state == yk1.i.LOADED) {
            FrameLayout frameLayout2 = this.A2;
            if (frameLayout2 != null) {
                bs1.c.X0(frameLayout2);
            }
            GestaltSpinner gestaltSpinner2 = this.f47035z2;
            if (gestaltSpinner2 != null) {
                s0.w(gestaltSpinner2, i.f21006p);
            }
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        f30 pin;
        View view;
        w4 g03;
        String h10;
        super.K7();
        int i13 = 0;
        if (t9().a() && (!hf0.b.q() || !hf0.b.m())) {
            View view2 = getView();
            View findViewById = view2 != null ? view2.findViewById(n80.c.status_bar_gradient) : null;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            FragmentActivity requireActivity = requireActivity();
            lb.l0.j1(requireActivity.getWindow(), false);
            if (requireActivity.getWindow().getStatusBarColor() != 0) {
                requireActivity.getWindow().setStatusBarColor(0);
            }
            Window window = requireActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            pk.a0.f1(window);
            View findViewById2 = requireActivity.getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            z0 z0Var = new z0(this, 7);
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(findViewById2, z0Var);
        }
        f30 pin2 = getPin();
        if (pin2 != null && (h10 = b40.h(pin2)) != null) {
            wk2.a aVar = this.f46984e1;
            if (aVar == null) {
                Intrinsics.r("customTabManagerProvider");
                throw null;
            }
            g gVar = (g) aVar.get();
            z70.e chromeSessionEvent = new z70.e(h10);
            gVar.getClass();
            Intrinsics.checkNotNullParameter(chromeSessionEvent, "chromeSessionEvent");
            gVar.f138002m.c(chromeSessionEvent);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null && (g03 = x0Var.g0()) != null) {
            g03.b();
        }
        if (!this.f46988f2) {
            ((o1) B7()).j(this);
        }
        n nVar = this.X1;
        if (nVar != null) {
            nVar.onFragmentActivated();
        }
        q01.l lVar = this.f46974a2;
        if (lVar != null) {
            lVar.d();
        }
        q01.y yVar = this.Z1;
        if (yVar != null) {
            yVar.c();
        }
        j4 j4Var = this.E2;
        int i14 = 1;
        if (j4Var == null || !j4Var.j()) {
            PinCloseupFloatingActionBarBehavior pinCloseupFloatingActionBarBehavior = this.T2;
            if (pinCloseupFloatingActionBarBehavior != null) {
                pinCloseupFloatingActionBarBehavior.E(true);
            }
        } else {
            j4 j4Var2 = this.E2;
            if (j4Var2 != null) {
                j4Var2.m();
            }
        }
        np0.m mVar = this.U2;
        if (mVar != null) {
            mVar.b(true);
        }
        int i15 = 2;
        x xVar = new x(uj2.q.h(this.P1, this.Q1, new ep.g(16, b11.w.f21089i)).o(), new d51.a(i15, i.f21004n), i15);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        this.R1.a(nl.b.m(xVar, "PinFragment.closeupRenderedSubject", new b11.t(this, i14)));
        int[] h13 = hf0.b.h(bs1.c.k0(w9()));
        Intrinsics.checkNotNullExpressionValue(h13, "getWindowHeightAndWidth(...)");
        this.f47003k2 = h13;
        x0 x0Var2 = this.f46997i2;
        if (x0Var2 != null) {
            x0Var2.Y0(true);
            if (x0Var2.d0() != null) {
                requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            }
        }
        tq.y yVar2 = this.f47000j2;
        if (yVar2 != null) {
            yVar2.s(true);
        }
        N9(true);
        this.S1.postDelayed(new b11.n(this, i13), 5000L);
        u01.v vVar = this.f47029w2;
        if (vVar == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        u01.u a13 = vVar.a();
        f30 pin3 = getPin();
        if (pin3 != null && a13.a() != null && !this.f47027v2 && (view = getView()) != null) {
            view.post(new ja.y(this, pin3, a13, 22));
        }
        u01.v vVar2 = this.f47029w2;
        if (vVar2 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        boolean b13 = vVar2.a().b();
        xj2.b bVar = this.N2;
        if (b13) {
            u01.v vVar3 = this.f47029w2;
            if (vVar3 == null) {
                Intrinsics.r("pinCloseupNavigationMetadata");
                throw null;
            }
            String c13 = vVar3.a().c();
            if (c13 != null && !kotlin.text.z.j(c13)) {
                u01.v vVar4 = this.f47029w2;
                if (vVar4 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                String d2 = vVar4.a().d();
                if (d2 != null && !this.f47025u2) {
                    this.f47025u2 = true;
                    PinCloseupPresenter pinCloseupPresenter = this.f47019r2;
                    if (pinCloseupPresenter != null) {
                        u01.v vVar5 = this.f47029w2;
                        if (vVar5 == null) {
                            Intrinsics.r("pinCloseupNavigationMetadata");
                            throw null;
                        }
                        pinCloseupPresenter.shouldShowPintItToast(d2, vVar5.a().c(), bVar);
                    }
                }
                pin = getPin();
                if (pin != null && !kh2.g0.d0(pin)) {
                    q9().c();
                }
                ArrayDeque arrayDeque = s1.f60573a;
            }
        }
        if (getPinId() != null) {
            i91.z zVar = this.f47024u1;
            if (zVar == null) {
                Intrinsics.r("preferredSharingAppTracker");
                throw null;
            }
            if (zVar.f71924c != null) {
                bVar.a(uj2.b.n(2L, TimeUnit.SECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new cp.b0(this, 28), new a11.f(12, i.f21003m)));
            }
        }
        pin = getPin();
        if (pin != null) {
            q9().c();
        }
        ArrayDeque arrayDeque2 = s1.f60573a;
    }

    public final void K9(c82.a aVar) {
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            x0Var.r1(aVar);
        }
        if (aVar != null) {
            tq.y yVar = this.f47000j2;
            if (yVar != null) {
                yVar.z(aVar);
            }
            PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = this.f47017q2;
            if (pinCloseupFloatingActionBarModule != null) {
                pinCloseupFloatingActionBarModule.c(aVar);
            }
        }
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f47015p2;
        if (pinCloseupLegoActionButtonModule != null) {
            pinCloseupLegoActionButtonModule.updatePinSpamParams(aVar);
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        ViewTreeObserver viewTreeObserver;
        w4 g03;
        if (t9().a() && (!hf0.b.q() || !hf0.b.m())) {
            FragmentActivity requireActivity = requireActivity();
            lb.l0.j1(requireActivity.getWindow(), true);
            pk.a0.d1(requireActivity);
            View findViewById = requireActivity.getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            WeakHashMap weakHashMap = v0.f102521a;
            m0.n(findViewById, null);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
        f30 pin = getPin();
        String f49940b = u9().getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        d4 d4Var = this.f46998i3;
        if (pin != null && j1.F1(pin)) {
            new jy.n(getM0(), d4Var, s92.o.ABORTED, f49940b).i();
        } else if (pin == null || !b40.P0(pin)) {
            String f49940b2 = u9().getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b2, "getId(...)");
            lf.a.j(getM0(), d4Var, f49940b2);
        } else {
            new ey.e4(f49940b).i();
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null && (g03 = x0Var.g0()) != null) {
            g03.g();
        }
        PinCloseupFloatingActionBarBehavior pinCloseupFloatingActionBarBehavior = this.T2;
        if (pinCloseupFloatingActionBarBehavior != null) {
            pinCloseupFloatingActionBarBehavior.E(false);
        }
        np0.m mVar = this.U2;
        if (mVar != null) {
            mVar.b(false);
        }
        RecyclerView g83 = g8();
        if (g83 != null && (viewTreeObserver = g83.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.M2);
        }
        x0 x0Var2 = this.f46997i2;
        if (x0Var2 != null) {
            x0Var2.Y0(false);
            if (x0Var2.d0() != null) {
                requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            }
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            yVar.s(false);
        }
        x0 x0Var3 = this.f46991g2;
        if (x0Var3 != null) {
            x0Var3.D();
        }
        tq.y yVar2 = this.f46994h2;
        if (yVar2 != null) {
            yVar2.b();
        }
        N9(false);
        this.R1.d();
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        this.S1.removeCallbacksAndMessages(null);
        q01.y yVar3 = this.Z1;
        if (yVar3 != null) {
            yVar3.d();
        }
        if (!this.f46988f2) {
            ((o1) B7()).l(this);
        }
        super.L7();
    }

    public final boolean L9() {
        n1 n1Var = a11.o.f334a;
        return a11.o.b(getPin()) || a11.o.a(getPin()) || !this.f47021s2 || gh0.b.f0(w9());
    }

    public final boolean M9(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (ig1.b.e1(requireActivity())) {
            return true;
        }
        es.a aVar = this.f47022t1;
        if (aVar != null) {
            return ((es.c) aVar).U(pin) && r.m1(pin) && !b40.P0(pin);
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        q01.y yVar;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (this.I == null) {
            return;
        }
        String string = result.getString("query_pin_id");
        String f49940b = u9().getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        if ((Intrinsics.d(code, "100") || Intrinsics.d(code, "101")) && Intrinsics.d(f49940b, string) && (yVar = this.Z1) != null) {
            yVar.e(code, result);
        }
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        RecyclerView g83;
        if ((i13 != 24 && i13 != 25) || (g83 = g8()) == null) {
            return false;
        }
        Iterator it = d7.b.O(g83).iterator();
        while (it.hasNext()) {
            ((View) it.next()).onKeyDown(i13, keyEvent);
        }
        return false;
    }

    public final void N9(boolean z13) {
        RecyclerView g83 = g8();
        yn2.i j13 = g83 != null ? c0.j(d7.b.O(g83), i.f21008r) : null;
        if (j13 != null) {
            yn2.h hVar = new yn2.h(j13);
            while (hVar.hasNext()) {
                PinCloseupBaseModule pinCloseupBaseModule = (PinCloseupBaseModule) hVar.next();
                pinCloseupBaseModule.updateActive(z13);
                if (!z13) {
                    pinCloseupBaseModule.endView();
                }
            }
        }
    }

    public final void O9(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f47021s2 = !M9(pin);
        PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = this.f47015p2;
        if (pinCloseupLegoActionButtonModule != null) {
            pinCloseupLegoActionButtonModule.updatePin(pin);
        }
        PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = this.f47017q2;
        if (pinCloseupFloatingActionBarModule != null) {
            pinCloseupFloatingActionBarModule.b(pin);
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context w93 = w9();
        int i13 = 4;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, new b11.a0(w93, this, i13));
        int i14 = 3;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, new px0.g(w93, this, adapter, i14));
        int i15 = 10;
        adapter.G(87, new b11.a0(w93, this, i15));
        int i16 = 9;
        adapter.G(901, new q0(w93, i16));
        int i17 = 11;
        adapter.G(789, new b11.a0(w93, this, i17));
        adapter.G(919191, new q0(w93, i15));
        adapter.G(RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE, new q0(w93, i17));
        int i18 = 12;
        adapter.G(92, new q0(w93, i18));
        adapter.G(93, new b11.a0(w93, this, i18));
        adapter.G(94, new b11.a0(w93, this, 0));
        int i19 = 2;
        adapter.G(95, new q0(w93, i19));
        adapter.G(96, new b11.a0(w93, this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new q0(w93, i14));
        int i23 = 8;
        adapter.G(97, new u(this, i23));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE, new u(this, i16));
        adapter.G(98, new b11.a0(w93, this, i19));
        adapter.G(99, new q0(w93, i13));
        if (Intrinsics.d(X(), "board") && q9().q()) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD, new b11.a0(this, w93, i14));
        }
        int i24 = 5;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new q0(w93, i24));
        adapter.G(100, new b11.a0(w93, this, i24));
        int i25 = 6;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new b11.a0(this, w93, i25));
        int i26 = 7;
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new b11.a0(w93, this, i26));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, new u(this, i15));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, new u(this, i17));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, new q0(w93, i25));
        adapter.G(12123189, new q0(w93, i26));
        adapter.G(12982281, new q0(w93, i23));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID, new u(this, i18));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD, new u(this, 13));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL, new u(this, 14));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new b11.a0(w93, this, i23));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new b11.a0(w93, this, i16));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        this.f47029w2 = vo.i.a(u9(), q9());
    }

    @Override // yq0.t, oc2.j
    public final Set S0() {
        x0 x0Var = this.f46997i2;
        y4 H0 = x0Var != null ? x0Var.H0() : null;
        return H0 != null ? H0.e() : this.f139742p0;
    }

    @Override // sq0.e
    public final tq0.b[] S8() {
        tq0.b[] bVarArr = new tq0.b[2];
        bVarArr[0] = new tq0.c(pb0.g.f99432a, s7());
        d0 s73 = s7();
        u01.v vVar = this.f47029w2;
        if (vVar != null) {
            bVarArr[1] = new tq0.g(s73, vVar.b());
            return bVarArr;
        }
        Intrinsics.r("pinCloseupNavigationMetadata");
        throw null;
    }

    @Override // yq0.t, androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        return getView();
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        d0 s73 = s7();
        y32.f fVar = y32.f.CLOSEUP_LONGPRESS;
        ((zf0.f) ((bf2.b) p9()).get()).getClass();
        boolean h10 = zf0.f.h();
        int i13 = eo1.b.color_themed_background_elevation_floating;
        l1 l1Var = this.f46976b1;
        if (l1Var == null) {
            Intrinsics.r("gridActionsExperiments");
            throw null;
        }
        wa2.c0 c0Var = new wa2.c0(s73, fVar, pinActionHandler, h10, i13, l1Var);
        yk1.a aVar = this.W0;
        if (aVar != null) {
            return c0Var.a(aVar);
        }
        Intrinsics.r("androidResources");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        i2 i2Var;
        Navigation u93 = u9();
        String f49940b = u93.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        vb0.j.f125466a.R(f49940b.length() > 0, "Null or empty pinUid in PinCloseupFragment", tb0.p.CLOSEUP, new Object[0]);
        ArrayList arrayList = new ArrayList();
        u01.v vVar = this.f47029w2;
        if (vVar == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        ArrayList w13 = vVar.w();
        if (w13 != null) {
            arrayList.addAll(w13);
            arrayList.remove(f49940b);
        }
        u01.v vVar2 = this.f47029w2;
        if (vVar2 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        String d2 = vVar2.d();
        u01.v vVar3 = this.f47029w2;
        if (vVar3 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        String h10 = vVar3.h();
        u01.v vVar4 = this.f47029w2;
        if (vVar4 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        String z13 = vVar4.z();
        if (Intrinsics.d(z13, "feed_holiday_finds")) {
            z13 = "shop_feed";
        }
        String str = z13;
        u01.v vVar5 = this.f47029w2;
        if (vVar5 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        i01.v0 v0Var = new i01.v0(d2, h10, arrayList, str, Integer.valueOf(vVar5.y()));
        String v03 = u93.v0("com.pinterest.CURRENT_URL");
        Context w93 = w9();
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(w93.getResources(), w93.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        u01.v vVar6 = this.f47029w2;
        if (vVar6 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        w01.e eVar = new w01.e(vVar6.b());
        nx.f0 f0Var = this.Y0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        d1 z73 = z7();
        se2.a aVar = this.f47012o1;
        if (aVar == null) {
            Intrinsics.r("repinSessionDataManager");
            throw null;
        }
        Object obj = ((bf2.b) aVar).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        k11.k kVar = (k11.k) obj;
        b0 b0Var = this.f47026v1;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        ur.a aVar2 = this.H1;
        if (aVar2 == null) {
            Intrinsics.r("ads");
            throw null;
        }
        w01.f fVar = new w01.f(f49940b, eVar, v03, f0Var, z73, kVar, b0Var, aVar2);
        this.f46992g3 = fVar;
        bVar.g(fVar);
        bVar.d(W8());
        bVar.e(new ky.a(this.f46998i3, getM0()));
        u01.v vVar7 = this.f47029w2;
        if (vVar7 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        if (vVar7.j()) {
            i2 i2Var2 = this.X0;
            if (i2Var2 == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
            i2Var = c0.d.O(i2Var2);
        } else {
            i2Var = this.X0;
            if (i2Var == null) {
                Intrinsics.r("pinRepository");
                throw null;
            }
        }
        bVar.f(i2Var);
        Context w94 = w9();
        w0 w0Var = this.f47018r1;
        if (w0Var == null) {
            Intrinsics.r("dynamicFeedLibraryExperiments");
            throw null;
        }
        bc2.e eVar2 = this.f47020s1;
        if (eVar2 == null) {
            Intrinsics.r("mp4TrackSelector");
            throw null;
        }
        ac2.m B7 = B7();
        p1 p1Var = this.f47016q1;
        if (p1Var == null) {
            Intrinsics.r("videoManagerUtil");
            throw null;
        }
        j jVar = this.f46979c1;
        if (jVar == null) {
            Intrinsics.r("adsExperiments");
            throw null;
        }
        es.a b13 = bVar.b();
        kv.a aVar3 = this.D1;
        if (aVar3 == null) {
            Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        kv.c cVar = this.E1;
        if (cVar == null) {
            Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
            throw null;
        }
        es.h hVar = this.B1;
        if (hVar == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        b20.c cVar2 = this.f47002k1;
        if (cVar2 == null) {
            Intrinsics.r("prefetchConfig");
            throw null;
        }
        bVar.h(new sq0.m(w94, w0Var, eVar2, B7, p1Var, jVar, b13, aVar3, cVar, hVar, cVar2, this.V2.f115002a, sq0.j.RELATED_PINS));
        wk1.c a13 = bVar.a();
        d4 f49944f = u93.getF49944f();
        u01.v vVar8 = this.f47029w2;
        if (vVar8 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        i01.k kVar2 = new i01.k(f49944f, vVar8.h());
        h32.a4 m03 = getM0();
        d4 d4Var = d4.PIN;
        u01.v vVar9 = this.f47029w2;
        if (vVar9 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        String d13 = vVar9.d();
        u01.v vVar10 = this.f47029w2;
        if (vVar10 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        b11.g gVar = new b11.g(m03, d4Var, d13, vVar10.b(), ig1.b.e1(requireActivity()));
        y5 y5Var = this.T0;
        if (y5Var == null) {
            Intrinsics.r("pinCloseupPresenterFactory");
            throw null;
        }
        u01.v vVar11 = this.f47029w2;
        if (vVar11 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        i01.p c13 = vVar11.c();
        lh0.a0 q93 = q9();
        b60.b activeUserManager = getActiveUserManager();
        v vVar12 = this.X2;
        boolean booleanValue = ((Boolean) vVar12.getValue()).booleanValue();
        v vVar13 = this.Y2;
        boolean booleanValue2 = ((Boolean) vVar13.getValue()).booleanValue();
        v vVar14 = this.Z2;
        boolean booleanValue3 = ((Boolean) vVar14.getValue()).booleanValue();
        ps.c cVar3 = this.A1;
        if (cVar3 == null) {
            Intrinsics.r("adsPinCloseupModelAllowList");
            throw null;
        }
        j01.b L0 = pp2.a.L0(t9(), cVar3, activeUserManager, q93, gVar, booleanValue, booleanValue2, booleanValue3);
        lh0.a0 q94 = q9();
        ps.c cVar4 = this.A1;
        if (cVar4 == null) {
            Intrinsics.r("adsPinCloseupModelAllowList");
            throw null;
        }
        j01.b M0 = pp2.a.M0(gVar, q94, cVar4);
        hs1.q qVar = this.f91287l;
        if (qVar == null) {
            Intrinsics.r("imageCache");
            throw null;
        }
        hf0.b bVar2 = new hf0.b();
        g0 g0Var = this.S0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        es.a aVar4 = this.f47022t1;
        if (aVar4 == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        es.h hVar2 = this.B1;
        if (hVar2 == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        sq0.f fVar2 = new sq0.f(qVar, bVar2, g0Var, 4, e0.b(new xq0.b(aVar4, hVar2)));
        String v93 = v9();
        boolean booleanValue4 = ((Boolean) vVar12.getValue()).booleanValue();
        boolean booleanValue5 = ((Boolean) vVar13.getValue()).booleanValue();
        boolean booleanValue6 = ((Boolean) vVar14.getValue()).booleanValue();
        cz.e eVar3 = this.f47030x1;
        if (eVar3 == null) {
            Intrinsics.r("anketManager");
            throw null;
        }
        ax.a aVar5 = this.f47034z1;
        if (aVar5 == null) {
            Intrinsics.r("adsStlCache");
            throw null;
        }
        is1.f fVar3 = this.f47028w1;
        if (fVar3 == null) {
            Intrinsics.r("closeupSessionTracker");
            throw null;
        }
        u01.v vVar15 = this.f47029w2;
        if (vVar15 == null) {
            Intrinsics.r("pinCloseupNavigationMetadata");
            throw null;
        }
        boolean j13 = vVar15.j();
        i2 i2Var3 = this.X0;
        if (i2Var3 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        PinCloseupPresenter a14 = y5Var.a(f49940b, v0Var, vVar11, c13, kVar2, L0, M0, gVar, a13, fVar2, v93, booleanValue4, booleanValue5, booleanValue6, eVar3, this, aVar5, fVar3, j13, i2Var3);
        this.f47019r2 = a14;
        return a14;
    }

    @Override // sq0.e
    public final List V8() {
        ArrayList arrayList = new ArrayList();
        f30 pin = getPin();
        if (pin != null) {
            wo2.j jVar = new wo2.j();
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            jVar.r0(uid);
            arrayList.add(new re2.g("pin.id", jVar.a1(jVar.f130711b), re2.d.STRING));
            wo2.j jVar2 = new wo2.j();
            jVar2.g0(b40.D(pin).getValue());
            arrayList.add(new re2.g("pin.native.format.type", jVar2.a1(jVar2.f130711b), re2.d.I32));
        }
        return arrayList;
    }

    @Override // i01.i0
    public final int W2() {
        return (int) (this.f47003k2[0] - (2 * getResources().getDimension(r0.pin_closeup_spacing_medium)));
    }

    @Override // cb2.e
    public final String X() {
        u01.v vVar = this.f47029w2;
        if (vVar != null) {
            return vVar.d();
        }
        Intrinsics.r("pinCloseupNavigationMetadata");
        throw null;
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e
    /* renamed from: a9 */
    public final String getE2() {
        f30 pin = getPin();
        return (pin == null || !j1.F1(pin)) ? super.getE2() : "shop_feed";
    }

    @Override // sq0.e
    public final boolean c9() {
        return true;
    }

    @Override // yq0.t, ml1.q
    public final void e3() {
        ((o1) B7()).f2019v = false;
    }

    @Override // i01.i0
    public final int e6() {
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            return x0Var.F0();
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            return yVar.m();
        }
        return 0;
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(yq0.z adapter, sq0.f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        adapter.f139766l = new b11.x(adapter.f139766l);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        H9();
        PinCloseupPresenter pinCloseupPresenter = this.f47019r2;
        if (pinCloseupPresenter != null) {
            pinCloseupPresenter.onBackPressed();
        }
        PinCloseupPresenter pinCloseupPresenter2 = this.f47019r2;
        if (pinCloseupPresenter2 == null) {
            return false;
        }
        pinCloseupPresenter2.resetPageTrackerForCurrentPin();
        return false;
    }

    @Override // cb2.e
    public final f30 getPin() {
        i01.b bVar = this.f47011n2;
        if (bVar != null) {
            return bVar.getPin();
        }
        return null;
    }

    @Override // mq.j0
    public final String getPinId() {
        i01.b bVar = this.f47011n2;
        if (bVar != null) {
            return bVar.getPinUid();
        }
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final h32.a4 getM0() {
        u01.v vVar = this.f47029w2;
        h32.a4 i13 = vVar != null ? vVar.i() : null;
        if (i13 != null) {
            return i13;
        }
        f30 pin = getPin();
        if (pin != null) {
            return b40.A(pin) instanceof t10.f ? h32.a4.PIN_RECIPE : b40.Q0(pin) ? h32.a4.PIN_STORY_PIN : j1.F1(pin) ? h32.a4.PIN_PDPPLUS : h32.a4.PIN_REGULAR;
        }
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getD0() {
        return this.f46998i3;
    }

    @Override // gg0.l0
    public final View h5() {
        return this.f47017q2;
    }

    @Override // mq.j0
    public final void i(int i13, float f13, int i14) {
        if (g8() != null) {
            ar0.n q83 = q8();
            RecyclerView g83 = g8();
            Intrinsics.f(g83);
            q83.i(g83);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            if (x0Var.o0() > 0) {
                f0 f0Var = this.O1;
                if (f0Var != null) {
                    f0Var.onPartiallyOrFullyVisible();
                }
            } else {
                f0 f0Var2 = this.O1;
                if (f0Var2 != null) {
                    f0Var2.on0PercentVisible();
                }
            }
        }
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            if (yVar.i() > 0) {
                f0 f0Var3 = this.O1;
                if (f0Var3 != null) {
                    f0Var3.onPartiallyOrFullyVisible();
                    return;
                }
                return;
            }
            f0 f0Var4 = this.O1;
            if (f0Var4 != null) {
                f0Var4.on0PercentVisible();
            }
        }
    }

    @Override // sq0.e, np0.f
    public final i01.e k0() {
        u01.v vVar = this.f47029w2;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.r("pinCloseupNavigationMetadata");
        throw null;
    }

    @Override // yq0.t, ml1.q
    public final void k5() {
        f30 pin = getPin();
        if (pin != null) {
            if (j1.F1(pin)) {
                String pinUid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                new jy.v(pinUid).i();
            } else if (b40.P0(pin)) {
                String pinUid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(pinUid2, "getUid(...)");
                Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                new p4(pinUid2).i();
            } else {
                String pinUid3 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(pinUid3, "getUid(...)");
                Intrinsics.checkNotNullParameter(pinUid3, "pinUid");
                new jy.k(pinUid3).i();
            }
        }
        H1();
        o1 o1Var = (o1) B7();
        o1Var.f2019v = true;
        o1Var.w();
        super.k5();
    }

    @Override // nl1.d
    public final View k7() {
        return this.B2;
    }

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        if (q9().U(a4.f83297a)) {
            return null;
        }
        c02.u uVar = new c02.u();
        uVar.f24460g = false;
        return uVar;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(n80.d.fragment_pin_closeup, r80.c.closeup_recycler_view);
    }

    @Override // mq.j0
    public final boolean n1() {
        return false;
    }

    public final boolean n9() {
        FragmentActivity E4 = E4();
        return !(isRemoving() || isDetached() || getHost() == null || E4 == null || E4.isFinishing() || E4.isChangingConfigurations());
    }

    @Override // yq0.t
    public final ar0.f o8() {
        return this.W1;
    }

    public final float o9() {
        PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = this.f47017q2;
        k kVar = this.f46983d3;
        if (pinCloseupFloatingActionBarModule != null) {
            pinCloseupFloatingActionBarModule.getLocationOnScreen((int[]) kVar.getValue());
        }
        return ((int[]) kVar.getValue())[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    @Override // yk1.k, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.closeup.view.PinCloseupFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // b11.f, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f46988f2) {
            ((o1) B7()).j(this);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        RecyclerView g83 = g8();
        if (g83 == null || (viewTreeObserver = g83.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.M2);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        PinCloseupFragment pinCloseupFragment;
        RecyclerView g83;
        w01.f fVar;
        RecyclerView g84;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LayoutInflater cloneInContext = inflater.cloneInContext(w9());
        Intrinsics.f(cloneInContext);
        View onCreateView = super.onCreateView(cloneInContext, viewGroup, bundle);
        if (((Boolean) this.P2.getValue()).booleanValue() && (g84 = g8()) != null) {
            uj2.q p73 = p7();
            yk1.j jVar = this.f47010n1;
            if (jVar == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            hs.d t93 = t9();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            this.Z1 = new q01.y(onCreateView, this, this, this, g84, p73, jVar, t93, requireActivity);
        }
        if (!((Boolean) this.Q2.getValue()).booleanValue() || (g83 = g8()) == null || (fVar = this.f46992g3) == null) {
            view = onCreateView;
            pinCloseupFragment = this;
        } else {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            Context w93 = w9();
            uj2.q p74 = p7();
            w f73 = f7();
            int hashCode = hashCode();
            k2 k2Var = this.f46982d1;
            if (k2Var == null) {
                Intrinsics.r("oneBarLibraryExperiments");
                throw null;
            }
            se2.a aVar = this.f46990g1;
            if (aVar == null) {
                Intrinsics.r("analyticsApi");
                throw null;
            }
            Object obj = ((bf2.b) aVar).get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            vy.m mVar = (vy.m) obj;
            b60.b activeUserManager = getActiveUserManager();
            se2.a aVar2 = this.f47014p1;
            if (aVar2 == null) {
                Intrinsics.r("prefsManagerPersisted");
                throw null;
            }
            Object obj2 = ((bf2.b) aVar2).get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            view = onCreateView;
            q01.l lVar = new q01.l(this, onCreateView, g83, this, this, requireActivity2, w93, fVar, p74, f73, hashCode, k2Var, mVar, activeUserManager, (lb0.q) obj2, t9());
            pinCloseupFragment = this;
            pinCloseupFragment.f46974a2 = lVar;
        }
        View view2 = view;
        pinCloseupFragment.f47035z2 = (GestaltSpinner) view2.findViewById(n80.c.loading_spinner);
        pinCloseupFragment.A2 = (FrameLayout) view2.findViewById(n80.c.fullscreen_opaque_loading_spinner_container);
        return view2;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.N2.d();
        ((o1) B7()).m(this);
        MediaPlayer mediaPlayer = this.Y1;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.Y1 = null;
        ig1.b.W0();
        super.onDestroy();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w4 g03;
        requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        if (this.T1 != null) {
            zf0.f fVar = (zf0.f) ((bf2.b) p9()).get();
            ur0.e eVar = this.T1;
            fVar.getClass();
            zf0.f.a(eVar);
        }
        ArrayList arrayList = this.M1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o2 o2Var = (o2) it.next();
            RecyclerView g83 = g8();
            if (g83 != null) {
                g83.w2(o2Var);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = this.N1;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C8((ar0.y) it2.next());
        }
        arrayList2.clear();
        this.f46991g2 = null;
        this.f46994h2 = null;
        x0 x0Var = this.f46997i2;
        if (x0Var != null && (g03 = x0Var.g0()) != null) {
            g03.e();
        }
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        if (this.f46988f2) {
            ((o1) B7()).l(this);
            ((o1) B7()).m(this);
        }
        super.onDetach();
    }

    @Override // e11.h
    public final void onFirstVisibleItemChanged(int i13, boolean z13) {
        a0 a0Var = this.L1;
        if (a0Var != null) {
            a0Var.onFirstVisibleItemChanged(i13, z13);
        }
    }

    @Override // e11.h
    public final void onLastVisibleItemChanged(int i13, boolean z13) {
        a0 a0Var = this.L1;
        if (a0Var != null) {
            a0Var.onLastVisibleItemChanged(i13, z13);
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        f7().j(this.f46975a3);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f7().h(this.f46975a3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        MediaPlayer mediaPlayer = this.Y1;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.Y1 = null;
        ig1.b.W0();
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.closeup.view.PinCloseupFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final se2.a p9() {
        se2.a aVar = this.R0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("educationHelper");
        throw null;
    }

    public final lh0.a0 q9() {
        lh0.a0 a0Var = this.f46973a1;
        if (a0Var != null) {
            return a0Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // yq0.t, nl1.d
    public final List r7() {
        ArrayList arrayList = new ArrayList();
        f30 pin = getPin();
        String uid = pin != null ? pin.getUid() : null;
        if (uid != null && !kotlin.text.z.j(uid)) {
            arrayList.add("Closeup Pin Id: ".concat(uid));
        }
        arrayList.addAll(super.r7());
        return arrayList;
    }

    @Override // yq0.t
    public final androidx.recyclerview.widget.t0 r8() {
        return new b11.o(this, 0);
    }

    public final int r9() {
        RecyclerView g83 = g8();
        Intrinsics.f(g83);
        l2 l2Var = g83.f19242n;
        Intrinsics.f(l2Var);
        e9();
        int d2 = eb2.j.d(l2Var);
        if (d2 != this.f47031x2.length) {
            this.f47031x2 = new int[d2];
        }
        e9();
        return eb2.j.b(l2Var, this.f47031x2);
    }

    public final int s9() {
        l2 l2Var;
        RecyclerView g83 = g8();
        if (g83 == null || (l2Var = g83.f19242n) == null) {
            return -1;
        }
        e9();
        int d2 = eb2.j.d(l2Var);
        if (d2 != this.f47033y2.length) {
            this.f47033y2 = new int[d2];
        }
        e9();
        return eb2.j.c(l2Var, this.f47033y2);
    }

    public final hs.d t9() {
        hs.d dVar = this.C1;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("moduleViewabilityHelper");
        throw null;
    }

    public final Navigation u9() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation;
        }
        throw new IllegalArgumentException("Null navigation in PinCloseupFragment");
    }

    @Override // sq0.e, np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        super.v4(pinUid, pinFeed, i13, i14, metadataProvider);
        i01.a aVar = this.V1;
        if (aVar != null) {
            aVar.onPinClicked(i14);
        }
    }

    public final String v9() {
        String Z = com.bumptech.glide.d.Z(this, "product_tag_parent_pin_id", "");
        if (Z.length() == 0) {
            return null;
        }
        return Z;
    }

    @Override // e11.a
    public final void w6(int i13) {
        tq.y yVar = this.f47000j2;
        if (yVar != null) {
            yVar.w6(i13);
        }
        x0 x0Var = this.f46997i2;
        if (x0Var != null) {
            x0Var.w6(i13);
        }
    }

    public final Context w9() {
        return (Context) this.K1.getValue();
    }

    @Override // wk1.d
    public final androidx.recyclerview.widget.y2 x(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView g83 = g8();
        if (g83 != null) {
            return g83.t1(view);
        }
        return null;
    }

    public final boolean x9() {
        RecyclerView g83 = g8();
        if (g83 == null) {
            return false;
        }
        lh0.a0 q93 = q9();
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        int X = (q9().i(z3Var) || q93.h(z3Var)) ? bs1.c.X(this, n80.a.related_pins_filters_carousel_height) : 0;
        if (t9().a()) {
            X += ((Number) this.W2.getValue()).intValue();
        }
        int childCount = g83.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = g83.getChildAt(i13);
            int r13 = RecyclerView.r1(childAt);
            a0 a0Var = this.L1;
            if (Intrinsics.d(a0Var != null ? Boolean.valueOf(a0Var.isAdapterPositionInsideRelatedPins(r13)) : null, Boolean.TRUE) && childAt.getTop() <= X) {
                return true;
            }
        }
        return false;
    }

    public final boolean y9(int i13) {
        yq0.z zVar;
        return q9().U(z3.DO_NOT_ACTIVATE_EXPERIMENT) ? (i13 == -1 || (zVar = (yq0.z) this.f139732f0) == null || zVar.f139759e.getItemViewType(i13) != 106) ? false : true : A4(i13);
    }

    public final void z9(y0 placement) {
        ur0.e g13;
        i01.b bVar;
        f30 pin;
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (b11.r.f21078a[placement.ordinal()] != 1) {
            g13 = ur0.g.g(placement, this, null);
            this.T1 = g13;
            if (g13 != null) {
                ur0.g.b(g13);
                return;
            }
            return;
        }
        rg0.s sVar = this.J1;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        rg0.n b13 = ((dh0.d) sVar).b(placement);
        if (b13 != null) {
            if (b13.f108060b != i32.l.ANDROID_PIN_SHARE_UPSELL_AFTER_REACT.getValue()) {
                ur0.g.g(y0.ANDROID_PIN_CLOSEUP_AFTER_REACT, this, null);
                return;
            }
            rg0.s sVar2 = this.J1;
            if (sVar2 == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            ((dh0.d) sVar2).k(y0.ANDROID_PIN_CLOSEUP_AFTER_REACT);
            if (!this.f91282J || b13.f108074p) {
                return;
            }
            View view = getView();
            View rootView = view != null ? view.getRootView() : null;
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null || (bVar = this.f47011n2) == null || (pin = bVar.getPin()) == null) {
                return;
            }
            Context w93 = w9();
            d0 s73 = s7();
            c2 c2Var = this.I1;
            if (c2Var == null) {
                Intrinsics.r("sharesheetUtils");
                throw null;
            }
            View h10 = new hk0.l(w93, viewGroup, b13, pin, s73, c2Var).h();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hf0.b.f69002b - (pk.a0.L(resources, 8.0f) * 2), -2);
            layoutParams.gravity = 81;
            if (h10 != null) {
                viewGroup.addView(h10, layoutParams);
            }
            se2.a aVar = this.f47014p1;
            if (aVar != null) {
                ((lb0.q) ((bf2.b) aVar).get()).c("PREF_LAST_SHARING_UPSELL_SHOWN_AT", new Date().getTime());
            } else {
                Intrinsics.r("prefsManagerPersisted");
                throw null;
            }
        }
    }
}
