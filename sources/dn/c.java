package dn;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.foundation.lazy.layout.v;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import ao2.m0;
import b3.s0;
import b3.w;
import com.google.zxing.WriterException;
import com.pinterest.activity.SendShareActivity;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e3;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.m3;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import g70.h;
import gi.m;
import ho0.k;
import i2.f2;
import i2.o;
import i2.q1;
import i2.s;
import i2.z1;
import java.util.Map;
import kh2.c3;
import kh2.g0;
import kh2.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import m60.f0;
import n00.i0;
import ol0.f;
import p1.a0;
import p1.g;
import p1.l;
import p1.x;
import p1.y;
import p1.z;
import pb0.d;
import q3.p0;
import r1.q0;
import s3.i;
import so.m2;
import so.o5;
import sw0.n;
import u2.q;
import u50.k0;
import uc0.e0;
import uk1.e;
import vo.u;
import w90.p;
import x02.i2;
import x02.u2;
import x02.x0;
import yk1.j;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f55594a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f55595b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f55596c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f55597d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, -1, -1}, new int[]{6, 28, 54, 80, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, -1, -1}, new int[]{6, 32, 58, 84, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, -1, -1}, new int[]{6, 30, 58, 86, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, -1, -1}, new int[]{6, 34, 62, 90, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, -1, -1}, new int[]{6, 26, 50, 74, 98, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, -1}, new int[]{6, 30, 54, 78, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, -1}, new int[]{6, 26, 52, 78, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN, -1}, new int[]{6, 30, 56, 82, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL, -1}, new int[]{6, 34, 60, 86, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL, -1}, new int[]{6, 30, 58, 86, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL, -1}, new int[]{6, 34, 62, 90, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO, -1}, new int[]{6, 30, 54, 78, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY}, new int[]{6, 24, 50, 76, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER}, new int[]{6, 28, 54, 80, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE, RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN}, new int[]{6, 32, 58, 84, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER}, new int[]{6, 26, 54, 82, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE}, new int[]{6, 30, 58, 86, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE}};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f55598e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void A(f fVar, oc.c cVar) {
        fVar.f96381u0 = cVar;
    }

    public static void B(f fVar, o5 o5Var) {
        fVar.f96370j0 = o5Var;
    }

    public static void C(f fVar, m mVar) {
        fVar.f96379s0 = mVar;
    }

    public static void D(k kVar, h hVar) {
        kVar.f69722x1 = hVar;
    }

    public static void E(k kVar, g11.a aVar) {
        kVar.f69721w1 = aVar;
    }

    public static void F(f fVar, x0 x0Var) {
        fVar.f96375o0 = x0Var;
    }

    public static void G(k kVar, f0 f0Var) {
        kVar.f69719u1 = f0Var;
    }

    public static void H(f fVar, f0 f0Var) {
        fVar.f96372l0 = f0Var;
    }

    public static void I(k kVar) {
        kVar.getClass();
    }

    public static void J(p pVar) {
        pVar.getClass();
    }

    public static void K(f fVar, d dVar) {
        fVar.f96377q0 = dVar;
    }

    public static void L(f fVar, x92.b bVar) {
        fVar.f96382v0 = bVar;
    }

    public static void M(n nVar, bf2.d dVar) {
        nVar.A0 = dVar;
    }

    public static void N(k kVar, m2 m2Var) {
        kVar.f69718t1 = m2Var;
    }

    public static void O(f fVar, j jVar) {
        fVar.f96374n0 = jVar;
    }

    public static void P(p pVar, a82.b bVar) {
        pVar.K0 = bVar;
    }

    public static void Q(k kVar, i2 i2Var) {
        kVar.f69716r1 = i2Var;
    }

    public static void R(f fVar, nx.f0 f0Var) {
        fVar.f96380t0 = f0Var;
    }

    public static void S(p pVar, r rVar) {
        pVar.L0 = rVar;
    }

    public static void T(fu0.d dVar, e eVar) {
        dVar.f62967e0 = eVar;
    }

    public static void U(k kVar, e eVar) {
        kVar.f69717s1 = eVar;
    }

    public static void V(f fVar, e eVar) {
        fVar.f96373m0 = eVar;
    }

    public static void W(n nVar, e eVar) {
        nVar.f115526z0 = eVar;
    }

    public static void X(SendShareActivity sendShareActivity, c2 c2Var) {
        sendShareActivity.f34836d = c2Var;
    }

    public static void Y(f fVar, c2 c2Var) {
        fVar.f96383w0 = c2Var;
    }

    public static void Z(SendShareActivity sendShareActivity, u uVar) {
        sendShareActivity.f34835c = uVar;
    }

    public static final void a(rm0.a state, q qVar, om0.k kVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(-1881389738);
        q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        om0.k kVar2 = (i14 & 4) != 0 ? om0.k.f96527d : kVar;
        g gVar = l.f98543a;
        y a13 = x.a(l.g(com.bumptech.glide.d.A(eo1.c.space_200, sVar)), u2.b.f120025m, sVar, 0);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        q X = m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        dl2.b.c(new rn1.a(state.f108682a, null, null, null, vn1.g.HEADING_600, 3, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096974), null, null, null, sVar, 8, 14);
        om0.q.d(state.f108683b, null, kVar2, sVar, (i13 & 896) | 8, 2);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 26, state, qVar2, kVar2);
        }
    }

    public static void a0(k kVar, i92.k kVar2) {
        kVar.f69720v1 = kVar2;
    }

    public static final void b(uc0.f0 f0Var, o oVar, int i13, int i14) {
        int i15;
        s sVar = (s) oVar;
        sVar.Y(1869040267);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(f0Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(uc0.f0.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                f0Var = (uc0.f0) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(f0Var.f121825e, sVar);
            f0Var.i(new uc0.i(new oc0.a(q2.i.c(1341214035, new v(16, z13, f0Var), sVar))));
            gh0.b.d(((e0) z13.getValue()).f121774b, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(f0Var, i13, i14, 10);
        }
    }

    public static void b0(f fVar, i92.k kVar) {
        fVar.f96371k0 = kVar;
    }

    public static final void c(yy0.d displayState, q qVar, Function1 function1, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        s sVar = (s) oVar;
        sVar.Y(-1370356261);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        if (i15 != 0) {
            qVar = nVar;
        }
        if ((i14 & 4) != 0) {
            function1 = yy0.u.f140473i;
        }
        q j13 = qVar.j(androidx.compose.foundation.layout.e.f17184c);
        y a13 = x.a(l.f98545c, u2.b.f120026n, sVar, 48);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        q X = m0.X(sVar, j13);
        s3.k.Qo.getClass();
        i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        g(displayState, z.a(a0.f98480a, nVar, 1.0f), function1, sVar, (i13 & 896) | 8, 0);
        f(displayState, function1, sVar, ((i13 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yy0.v(displayState, qVar, function1, i13, i14, 0);
        }
    }

    public static void c0(vs.u uVar, i92.k kVar) {
        uVar.f126517c0 = kVar;
    }

    public static final void d(p1.u uVar, yy0.f0 f0Var, q qVar, o oVar, int i13, int i14) {
        s sVar = (s) oVar;
        sVar.Y(-2138046192);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        q qVar2 = qVar;
        if (f0Var.f140454e && f0Var.f140455f) {
            p1.q.a(androidx.compose.foundation.a.b(uVar.b(qVar2), w.b(g0.h(eo1.b.color_black_900, sVar), 0.4f), s0.f21349a), sVar, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 27, qVar2, (Object) uVar, (Object) f0Var);
        }
    }

    public static void d0(SendShareActivity sendShareActivity) {
        sendShareActivity.getClass();
    }

    public static final void e(p1.u uVar, yy0.f0 f0Var, o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-76269246);
        q i03 = i0(sVar);
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i14 = sVar.P;
        z1 o13 = sVar.o();
        q X = m0.X(sVar, i03);
        s3.k.Qo.getClass();
        i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i14))) {
            ep.b.y(i14, sVar, i14, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        String str = f0Var.f140451b;
        u2.n nVar = u2.n.f120041b;
        dl2.b.f(str, cVar.b(nVar), null, null, sVar, 0, 12);
        d(cVar, f0Var, null, sVar, 70, 2);
        sVar.r(true);
        if (f0Var.f140454e) {
            ig1.b.b(new om1.c(rm1.q.CHECK, om1.e.MD, om1.f.WASH_WHITE, null, null, false, 0, 1000), androidx.compose.foundation.layout.b.n(uVar.a(nVar, u2.b.f120021i), com.bumptech.glide.d.A(eo1.c.space_200, sVar)), null, sVar, 8, 4);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(uVar, f0Var, i13, 13);
        }
    }

    public static void e0(f fVar, ap.o oVar) {
        fVar.f96376p0 = oVar;
    }

    public static final void f(yy0.d dVar, Function1 function1, o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-1583274456);
        rl2.g0.b(dVar.f140432b, androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f), com.bumptech.glide.d.A(eo1.c.space_400, sVar), com.bumptech.glide.d.A(eo1.c.space_200, sVar)), new yy0.w(function1, dVar), sVar, 8, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(dVar, function1, i13, 14);
        }
    }

    public static void f0(f fVar, u2 u2Var) {
        fVar.f96378r0 = u2Var;
    }

    public static final void g(yy0.d dVar, q qVar, Function1 function1, o oVar, int i13, int i14) {
        s sVar = (s) oVar;
        sVar.Y(462579179);
        q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        r1.p0 a13 = q0.a(sVar);
        sVar.W(1918792837);
        boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function1)) || (i13 & 384) == 256;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new t90.n(13, function1);
            sVar.g0(J2);
        }
        Function1 onSwipe = (Function1) J2;
        sVar.r(false);
        Intrinsics.checkNotNullParameter(a13, "<this>");
        Intrinsics.checkNotNullParameter(onSwipe, "onSwipe");
        sVar.W(-1925816043);
        i2.u.e(Unit.f80348a, new wb2.b(a13, onSwipe, null), sVar);
        sVar.r(false);
        r1.b bVar = new r1.b(3);
        q r13 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.p(qVar2, com.bumptech.glide.d.A(eo1.c.space_200, sVar), 0.0f, 2), 0.0f, com.bumptech.glide.d.A(eo1.c.space_400, sVar), 0.0f, 0.0f, 13);
        g gVar = l.f98543a;
        bp1.h.c(0, 400, null, l.g(com.bumptech.glide.d.A(eo1.c.space_200, sVar)), l.g(com.bumptech.glide.d.A(eo1.c.space_400, sVar)), androidx.compose.foundation.layout.b.c(0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_200, sVar), 7), bVar, a13, sVar, r13, new yy0.w(dVar, function1), false, false);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yy0.v(dVar, qVar2, function1, i13, i14, 1);
        }
    }

    public static boolean g0(int i13) {
        return i13 == -1;
    }

    public static final void h(yy0.f0 f0Var, o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-1385231604);
        androidx.compose.foundation.layout.b.a(null, null, false, q2.i.c(1517217634, new i1.h(f0Var, 16), sVar), sVar, 3072, 7);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(f0Var, i13, 10);
        }
    }

    public static final Object h0(Map map, String str, gb2.k kVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(str);
        if (obj == null) {
            map.put(str, kVar);
            return kVar;
        }
        if (Intrinsics.d(kVar, obj)) {
            return null;
        }
        map.put(str, kVar);
        return kVar;
    }

    public static final void i(yy0.d dVar, o oVar, int i13) {
        s sVar = (s) oVar;
        sVar.Y(-1104737051);
        u2.n nVar = u2.n.f120041b;
        y a13 = x.a(l.f98545c, u2.b.f120025m, sVar, 0);
        int i14 = sVar.P;
        z1 o13 = sVar.o();
        q X = m0.X(sVar, nVar);
        s3.k.Qo.getClass();
        i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i14))) {
            ep.b.y(i14, sVar, i14, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        k0 j23 = bs1.c.j2(new String[0], jv1.h.use_case_picker_title);
        vn1.g gVar = vn1.g.UI_400;
        vn1.b bVar = vn1.b.CENTER;
        dl2.b.c(new rn1.a(j23, null, kotlin.collections.e0.b(bVar), null, gVar, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(eo1.c.space_500, sVar), 0.0f, 2), 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_200, sVar), 7), null, null, sVar, 8, 12);
        dl2.b.c(new rn1.a(dVar.f140433c, null, kotlin.collections.e0.b(bVar), null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(eo1.c.space_500, sVar), 0.0f, 2), 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(eo1.c.space_600, sVar), 7), null, null, sVar, 8, 12);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(dVar, i13, 9);
        }
    }

    public static final q i0(o oVar) {
        s sVar = (s) oVar;
        sVar.W(354221429);
        q b13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f), 1.0f), v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_400, sVar)));
        sVar.r(false);
        return b13;
    }

    public static final void j(yy0.f0 f0Var, q qVar, Function1 function1, o oVar, int i13, int i14) {
        s sVar = (s) oVar;
        sVar.Y(1725067940);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        q qVar2 = i15 != 0 ? nVar : qVar;
        String obj = dl2.b.u2(f0Var.f140452c, sVar).toString();
        String obj2 = dl2.b.u2(f0Var.f140456g, sVar).toString();
        g gVar = l.f98543a;
        p1.i g13 = l.g(com.bumptech.glide.d.A(eo1.c.space_100, sVar));
        q b13 = androidx.compose.foundation.selection.b.b(qVar2, f0Var.f140454e, null, true, null, new yy0.y(function1, f0Var, 1));
        sVar.W(1378400011);
        boolean h10 = sVar.h(obj) | sVar.h(obj2);
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            J2 = new uq.j(obj, obj2, 4);
            sVar.g0(J2);
        }
        sVar.r(false);
        q a13 = z3.l.a(b13, true, (Function1) J2);
        y a14 = x.a(g13, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        q X = m0.X(sVar, a13);
        s3.k.Qo.getClass();
        i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, a14, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i17 = sVar.P;
        z1 o14 = sVar.o();
        q X2 = m0.X(sVar, nVar);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        h(f0Var, sVar, 8);
        e(cVar, f0Var, sVar, 70);
        sVar.r(true);
        dl2.b.c(new rn1.a(f0Var.f140452c, null, null, null, vn1.g.UI_200, 0, null, null, null, null, false, 0, null, null, null, false, vn1.d.FULL, null, 1834990), androidx.compose.foundation.layout.b.p(nVar, com.bumptech.glide.d.A(eo1.c.space_100, sVar), 0.0f, 2), null, null, sVar, 8, 12);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 28, f0Var, qVar2, function1);
        }
    }

    public static void k(x92.b bVar) {
        pk.a0.b(bVar);
        com.bumptech.glide.d.e(bVar);
        n00.d.f88768a.b(bVar);
        bVar.e("user.image_medium_url");
        bVar.e("user.image_large_url");
        bVar.h("user.recent_pin_images", "345x");
        bVar.h("pin.images", "236x");
        bVar.h("pin.images", "736x");
        bVar.h("board.images", "150x150");
        i0.a(bVar);
        bVar.e("board.followed_by_me");
        n60.o.w(bVar, "board.owner()", "pin.id", "user.follower_count", "user.pins_done_count");
        n60.o.w(bVar, "user.website_url", "user.type", "user.explicitly_followed_by_me", "pin.image_signature");
        n60.o.w(bVar, "pin.board()", "pin.source_interest()", "pin.is_promoted", "pin.promoted_android_deep_link");
        n60.o.w(bVar, "pin.dominant_color", "pin.rich_summary()", "pin.pinner()", "pin.repin_count");
        j1.g(bVar);
        kh2.j1.D(bVar);
        bVar.e("userdiditdata.type");
        bVar.e("userdiditdata.reaction_by_me");
        bVar.e("userdiditdata.reaction_counts");
        bVar.e("userdiditdata.comment_count");
        bVar.h("userdiditdata.images", "1080x");
        bVar.e("pin.tracking_params");
        bVar.e("pin.virtual_try_on_type");
    }

    public static void l(x92.b bVar) {
        n60.o.w(bVar, "interest.name", "interest.type", "interest.url_name", "interest.id");
        n60.o.w(bVar, "interest.is_followed", "interest.key", "interest.follower_count", "user.image_large_url");
        bVar.e("user.type");
        bVar.e("user.explicitly_followed_by_me");
        bVar.h("user.recent_pin_images", "345x");
        n60.o.w(bVar, "user.pin_count", "board.type", "board.followed_by_me", "board.collaborated_by_me");
        n60.o.w(bVar, "board.pin_count", "board.owner()", "board.board_order_modified_at", "user.is_verified_merchant");
        bVar.e("user.verified_identity");
        bVar.h("board.images", "90x90");
        bVar.h("board.images", "236x");
        bVar.e("board.image_cover_hd_url");
        bVar.h("interest.images", "70x70");
        bVar.h("interest.images", "236x");
        bVar.h("pin.images", "136x136");
        n00.d.f88768a.b(bVar);
        bVar.e("userdiditdata.id");
        bVar.e("userdiditdata.details");
        bVar.e("userdiditdata.done_at");
        n60.o.w(bVar, "userdiditdata.pin()", "userdiditdata.reaction_counts", "userdiditdata.reaction_by_me", "userdiditdata.user()");
        bVar.e("board.privacy");
        pk.a0.b(bVar);
        bVar.h("userdiditdata.images", "1080x");
        bVar.e("userdiditdata.type");
    }

    public static int m(he.b bVar, boolean z13) {
        int i13 = bVar.f68936b;
        int i14 = z13 ? bVar.f68937c : i13;
        if (!z13) {
            i13 = bVar.f68937c;
        }
        byte[][] bArr = (byte[][]) bVar.f68938d;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            byte b13 = -1;
            int i17 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                byte b14 = z13 ? bArr[i16][i18] : bArr[i18][i16];
                if (b14 == b13) {
                    i17++;
                } else {
                    if (i17 >= 5) {
                        i15 += i17 - 2;
                    }
                    i17 = 1;
                    b13 = b14;
                }
            }
            if (i17 >= 5) {
                i15 = (i17 - 2) + i15;
            }
        }
        return i15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.f142975c != zx.e.VIDEO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean n(zx.l r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            zx.d r0 = r3.f142974b
            zx.d r1 = zx.d.ORGANIC
            if (r0 != r1) goto L11
            zx.e r1 = zx.e.VIDEO
            zx.e r2 = r3.f142975c
            if (r2 == r1) goto L1b
        L11:
            zx.d r1 = zx.d.PAID_AND_EARNED
            if (r0 != r1) goto L1d
            zx.c r0 = zx.c.VIDEO
            zx.c r3 = r3.f142976d
            if (r3 != r0) goto L1d
        L1b:
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.c.n(zx.l):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(xm.a r23, cn.a r24, cn.c r25, int r26, he.b r27) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.c.o(xm.a, cn.a, cn.c, int, he.b):void");
    }

    public static int p(int i13, int i14) {
        if (i14 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i14);
        int i15 = 32 - numberOfLeadingZeros;
        int i16 = i13 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i16) >= i15) {
            i16 ^= i14 << ((32 - Integer.numberOfLeadingZeros(i16)) - i15);
        }
        return i16;
    }

    public static void q(int i13, int i14, he.b bVar) {
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i13 + i15;
            if (!g0(bVar.b(i16, i14))) {
                throw new WriterException();
            }
            bVar.d(i16, i14, 0);
        }
    }

    public static void r(int i13, int i14, he.b bVar) {
        for (int i15 = 0; i15 < 7; i15++) {
            int[] iArr = f55595b[i15];
            for (int i16 = 0; i16 < 7; i16++) {
                bVar.d(i13 + i16, i14 + i15, iArr[i16]);
            }
        }
    }

    public static void s(int i13, int i14, he.b bVar) {
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = i14 + i15;
            if (!g0(bVar.b(i13, i16))) {
                throw new WriterException();
            }
            bVar.d(i13, i16, 0);
        }
    }

    public static void t(View view) {
        if (view.getAlpha() == 1.0f) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.start();
    }

    public static void u(View view) {
        if (view.getAlpha() == 0.0f) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.start();
    }

    public static final int v(f3 f3Var) {
        e3 H = f3Var.H();
        Integer e13 = H != null ? H.e() : null;
        if (e13 == null) {
            return 0;
        }
        return e13.intValue();
    }

    public static ObjectAnimator w(View view) {
        if (view.getAlpha() == 0.0f) {
            return null;
        }
        return ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(300L);
    }

    public static final rm1.q x(z32.f2 iconType) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        int i13 = tj0.g0.f117872a[iconType.ordinal()];
        if (i13 == 1) {
            return rm1.q.ANGLED_PIN;
        }
        if (i13 != 2) {
            return null;
        }
        return rm1.q.ADD;
    }

    public static final int y(f3 f3Var) {
        m3 C = f3Var.C();
        int intValue = (C != null ? C.c() : 1).intValue();
        if (intValue <= 0) {
            return 1;
        }
        return intValue;
    }

    public static final String z(f30 f30Var) {
        String F3;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oc0 d63 = f30Var.d6();
        if (d63 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oc0 d64 = f30Var.d6();
        String j13 = d64 != null ? d64.j() : null;
        if (j13 == null) {
            j13 = "";
        }
        int i13 = ls0.h.f84652a[b40.Q(j13).ordinal()];
        if ((i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) && d63.i() != null) {
            f30 i14 = d63.i();
            if (i14 != null) {
                return i14.F3();
            }
            return null;
        }
        v7 g13 = d63.g();
        if (g13 == null || (F3 = g13.getUid()) == null) {
            f30 i15 = d63.i();
            F3 = i15 != null ? i15.F3() : null;
            if (F3 == null) {
                zs h10 = d63.h();
                if (h10 != null) {
                    return h10.getUid();
                }
                return null;
            }
        }
        return F3;
    }
}
