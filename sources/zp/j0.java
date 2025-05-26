package zp;

import android.content.Context;
import android.graphics.Color;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.um;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;
import oy.z1;
import rq.f2;
import rq.j4;
import rq.q3;
import rq.r3;
import rr.p2;
import so.oa;
import x02.x2;
import x40.kh;
import x40.nf;
import x40.qf;
import x40.tg;
import x40.wg;
import x40.y2;
import x40.zg;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142433i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f142434j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f142435k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, Object obj, Object obj2) {
        super(0);
        this.f142433i = i13;
        this.f142434j = obj;
        this.f142435k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        int i13 = this.f142433i;
        int i14 = 0;
        Object obj = this.f142435k;
        Object obj2 = this.f142434j;
        switch (i13) {
            case 0:
                m302invoke();
                break;
            case 1:
                oq.c0 c0Var = (oq.c0) obj2;
                m60.w d2 = c0Var.d();
                h32.g0 g0Var = h32.g0.PIN_CLOSEUP_IMAGE;
                boolean z14 = c0Var.m() || c0Var.n();
                boolean b13 = c0Var.e().b();
                lh0.b0 e13 = c0Var.e();
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) e13.f83300a;
                if (!g1Var.o("android_visual_search_unified_entry_point", "enabled", z3Var) && !g1Var.l("android_visual_search_unified_entry_point")) {
                    lh0.g1 g1Var2 = (lh0.g1) c0Var.e().f83300a;
                    if (!g1Var2.o("android_visual_search_unified_entry_point_row", "enabled", z3Var) && !g1Var2.l("android_visual_search_unified_entry_point_row")) {
                        z13 = false;
                        pq.d dVar = new pq.d(d2, c0Var.E, g0Var, z14, b13, z13, c0Var.L, (Context) obj, 768);
                        c0Var.addView(dVar);
                        break;
                    }
                }
                z13 = true;
                pq.d dVar2 = new pq.d(d2, c0Var.E, g0Var, z14, b13, z13, c0Var.L, (Context) obj, 768);
                c0Var.addView(dVar2);
                break;
            case 2:
                m302invoke();
                break;
            case 3:
                m302invoke();
                break;
            case 4:
                m302invoke();
                break;
            case 5:
                break;
            case 6:
                m302invoke();
                break;
            case 7:
                m302invoke();
                break;
            case 8:
                m302invoke();
                break;
            case 9:
                m302invoke();
                break;
            case 10:
                m302invoke();
                break;
            case 11:
                m302invoke();
                break;
            case 12:
                m302invoke();
                break;
            case 13:
                ns.r rVar = (ns.r) obj2;
                Context requireContext = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                wg1.j jVar = new wg1.j(requireContext, (uk1.d) ((xk2.k) obj).getValue(), new ns.n(rVar, i14), new i1.j(rVar, 9));
                if (rVar.V0) {
                    jVar.i();
                    break;
                }
                break;
            case 14:
                m302invoke();
                break;
            case 15:
                break;
            case 16:
                m302invoke();
                break;
            case 17:
                m302invoke();
                break;
            case 18:
                Context context = ((zu.c) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                break;
            case 19:
                m302invoke();
                break;
            case 20:
                m302invoke();
                break;
            case 21:
                m302invoke();
                break;
            case 22:
                m302invoke();
                break;
            case 23:
                m302invoke();
                break;
            case 24:
                m302invoke();
                break;
            case 25:
                m302invoke();
                break;
            case 26:
                m302invoke();
                break;
            case 27:
                m302invoke();
                break;
            case 28:
                m302invoke();
                break;
            default:
                m302invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m302invoke() {
        String f39332b;
        int i13 = this.f142433i;
        int i14 = 1;
        Object obj = this.f142435k;
        Object obj2 = this.f142434j;
        switch (i13) {
            case 0:
                k0 k0Var = (k0) obj2;
                c cVar = k0Var.f142445g;
                Intrinsics.f(cVar);
                if (cVar.g0()) {
                    aq.j jVar = (aq.j) ((kotlin.jvm.internal.j0) obj).f80434a;
                    if ((jVar != null ? jVar.N() : null) != null) {
                        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        Long N = jVar.N();
                        Intrinsics.f(N);
                        calendar2.setTimeInMillis(timeUnit.toMillis(N.longValue()));
                        if (calendar2.getTime().compareTo(calendar.getTime()) > 0) {
                            c cVar2 = k0Var.f142445g;
                            Intrinsics.f(cVar2);
                            cVar2.d0();
                            k0Var.f142441c.d(new jc0.s(true));
                            return;
                        }
                    }
                    c cVar3 = k0Var.f142445g;
                    Intrinsics.f(cVar3);
                    cVar3.L();
                    return;
                }
                c cVar4 = k0Var.f142445g;
                Intrinsics.f(cVar4);
                cVar4.T();
                return;
            case 1:
            case 5:
            case 13:
            case 15:
            case 18:
            default:
                ((qz0) obj2).c(((y2) obj).f133721b);
                return;
            case 2:
                pq.d dVar = (pq.d) obj2;
                nx.d0 d0Var = dVar.f100971d;
                if (d0Var != null) {
                    h32.u0 u0Var = h32.u0.VISUAL_SEARCH_BUTTON;
                    HashMap hashMap = new HashMap();
                    bs1.c.G1("image_signature", ((f30) obj).z4(), hashMap);
                    d0Var.h(dVar.f100972e, u0Var, hashMap);
                }
                dg0.c cVar5 = new dg0.c(dg0.b.DISMISS_UI);
                m60.w wVar = dVar.f100970c;
                wVar.d(cVar5);
                wVar.d(new oq.c((f30) obj));
                return;
            case 3:
                rq.v0 v0Var = (rq.v0) obj2;
                f30 F = ((fi0) obj).F();
                int i15 = rq.v0.f109582x;
                v0Var.getClass();
                if (F == null || (f39332b = F.getF39332b()) == null) {
                    return;
                }
                m60.w wVar2 = v0Var.f109589i;
                if (wVar2 != null) {
                    wVar2.d(Navigation.z0((ScreenLocation) com.pinterest.screens.i0.f50929g.getValue(), f39332b));
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 4:
                rq.h1 h1Var = (rq.h1) obj2;
                oq.c0 c0Var = h1Var.f109238t;
                ArrayList arrayList = h1Var.f109239u;
                if (c0Var != null) {
                    c0Var.setBackgroundColor(Color.parseColor(((um) arrayList.get(((ps.k) obj).f101240c)).f42584a.i4()));
                }
                oq.c0 c0Var2 = h1Var.f109238t;
                if (c0Var2 != null) {
                    oq.c0.x(c0Var2, (um) arrayList.get(((ps.k) obj).f101240c), false, ((es.c) h1Var.getAdFormats()).q(h1Var.getPin(), new rq.g1(h1Var, i14)), false, 26);
                    return;
                }
                return;
            case 6:
                r3 r3Var = (r3) obj2;
                CreatorFollowButton creatorFollowButton = r3Var.f109517j;
                wy0 wy0Var = creatorFollowButton != null ? creatorFollowButton.f49057n : null;
                if (wy0Var != null && Intrinsics.d(wy0Var.s2(), Boolean.TRUE)) {
                    r60.h hVar = (r60.h) r3Var.f109526s.getValue();
                    int i16 = r60.h.f106328e;
                    hVar.a(wy0Var, null, null).F(new rq.d1(16, new q3(r3Var, i14)), new rq.d1(17, f2.B), ck2.i.f27923c, ck2.i.f27924d);
                    return;
                }
                String f39332b2 = ((wy0) obj).getF39332b();
                Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                x2 x2Var = r3Var.f109511d;
                if (x2Var != null) {
                    wy0 wy0Var2 = (wy0) x2Var.O(f39332b2);
                    if (wy0Var2 != null && c0.d.d2(wy0Var2)) {
                        ig1.b.L0(r3Var.getContext(), r3Var, true, true);
                    }
                    zf0.f fVar = r3Var.f109510c;
                    if (fVar != null) {
                        fVar.l(i32.y0.ANDROID_PIN_CLOSEUP_TAKEOVER, i32.l.ANDROID_FOLLOW_EDUCATION);
                        return;
                    } else {
                        Intrinsics.r("educationHelper");
                        throw null;
                    }
                }
                Intrinsics.r("userRepository");
                throw null;
            case 7:
                int i17 = j4.f109300w;
                ((j4) obj2).l((f30) obj);
                return;
            case 8:
                rp0.d dVar2 = (rp0.d) obj2;
                if (dVar2.i()) {
                    ((CommentPreviewView) obj).f35105n.invoke(dVar2, rh1.x.Unlike);
                }
                if (dVar2.j()) {
                    ((CommentPreviewView) obj).f35105n.invoke(dVar2, rh1.x.NotHelpful);
                }
                if (dVar2.i() || dVar2.j()) {
                    return;
                }
                ((CommentPreviewView) obj).f35105n.invoke(dVar2, rh1.x.Like);
                return;
            case 9:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullExpressionValue(pin, "$pin");
                bk.f fVar2 = MainActivity.N0;
                ((MainActivity) obj2).getEventManager().d(Navigation.z0(com.pinterest.screens.b.c(), pin.getF39332b()));
                return;
            case 10:
                lr.p pVar = (lr.p) obj2;
                ok1.f.a((ok1.f) pVar.f84538f.getValue(), pVar.f84536d, null, null, 6).o(new ir.h(4, new lr.n(pVar, (GestaltToast) obj)), new ir.h(5, lr.e.f84494l));
                return;
            case 11:
                Context context = kb0.a.f79058b;
                v7 v7Var = (v7) obj2;
                qr.d dVar3 = (qr.d) obj;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new up.c(v7Var, dVar3.f104900f));
                String f39332b3 = v7Var.getF39332b();
                dVar3.f104898d.getClass();
                gw.a(f39332b3);
                return;
            case 12:
                qr.h hVar2 = ((p2) obj2).f109723a;
                Navigation navigation = (Navigation) obj;
                Intrinsics.f(navigation);
                hVar2.m(navigation);
                return;
            case 14:
                ((fu.h) obj2).q8((String) obj);
                return;
            case 16:
                ((pu.j0) obj2).f8().a(new pu.q(new tu.i((String) obj)));
                return;
            case 17:
                NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.f.f50744f.getValue());
                w13.z(f42.i.CLOSEUP.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
                w13.m0("com.pinterest.EXTRA_PIN_ID", (String) obj);
                w13.Y1("com.pinterest.EXTRA_IS_PROMOTED", true);
                ((vu.i) obj2).M1(w13);
                return;
            case 19:
                ((uv.f) obj2).f123150d.invoke(((sv.h) obj).f115295c);
                return;
            case 20:
                z1 z1Var = (z1) obj2;
                oy.b bVar = (oy.b) obj;
                oy.s0 s0Var = bVar.f98004e;
                String str = s0Var.f98186a;
                long j13 = bVar.f60583a;
                s92.l lVar = z1.f98252q;
                z1Var.getClass();
                oy.z0 z0Var = new oy.z0(s0Var.f98195j, str);
                z0Var.f60583a = j13;
                z1Var.o(z0Var);
                return;
            case 21:
                u7 u7Var = (u7) obj2;
                u7Var.f42427b = ((x40.c1) obj).f132071b;
                boolean[] zArr = u7Var.f42452n0;
                if (zArr.length > 1) {
                    zArr[1] = true;
                    return;
                }
                return;
            case 22:
                aa aaVar = (aa) obj2;
                aaVar.f35672b = ((x40.h1) obj).f132463b;
                boolean[] zArr2 = aaVar.f35681k;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                    return;
                }
                return;
            case 23:
                ((qz0) obj2).c(((tg) obj).f133386b);
                return;
            case 24:
                ((qz0) obj2).c(((nf) obj).f132898b);
                return;
            case 25:
                ((qz0) obj2).c(((qf) obj).f133123b);
                return;
            case 26:
                ((qz0) obj2).c(((wg) obj).f133629b);
                return;
            case 27:
                ((qz0) obj2).c(((zg) obj).f133829b);
                return;
            case 28:
                ((qz0) obj2).c(((kh) obj).f132682b);
                return;
        }
    }
}
