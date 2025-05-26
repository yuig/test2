package n21;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.zb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import h32.c1;
import h32.f1;
import h32.i0;
import h32.o2;
import h32.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh2.r;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p2;
import lh0.z3;
import m60.w;
import nx.d0;
import pk.a0;
import rg0.s;
import sq0.e0;
import uj2.q;
import xk2.m;
import xk2.v;
import yk1.n;

/* loaded from: classes2.dex */
public final class i extends vq0.b implements l21.d, l21.b {

    /* renamed from: c, reason: collision with root package name */
    public f30 f89010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89011d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f89012e;

    /* renamed from: f, reason: collision with root package name */
    public final w f89013f;

    /* renamed from: g, reason: collision with root package name */
    public final s f89014g;

    /* renamed from: h, reason: collision with root package name */
    public final j80.b f89015h;

    /* renamed from: i, reason: collision with root package name */
    public final p2 f89016i;

    /* renamed from: j, reason: collision with root package name */
    public final lh0.d f89017j;

    /* renamed from: k, reason: collision with root package name */
    public final es.a f89018k;

    /* renamed from: l, reason: collision with root package name */
    public final es.h f89019l;

    /* renamed from: m, reason: collision with root package name */
    public int f89020m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f89021n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f89023p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f89024q;

    /* renamed from: r, reason: collision with root package name */
    public final v f89025r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f89026s;

    /* renamed from: t, reason: collision with root package name */
    public final h f89027t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f30 pin, int i13, uk1.d presenterPinalytics, boolean z13, w eventManager, q networkStateStream, s experiences, j80.b carouselUtil, p2 experiments, lh0.d adFormatsLibraryExperiments, es.a adFormats, ur.a adsDependencies, es.h adsCommonDisplay) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f89010c = pin;
        this.f89011d = i13;
        this.f89012e = z13;
        this.f89013f = eventManager;
        this.f89014g = experiences;
        this.f89015h = carouselUtil;
        this.f89016i = experiments;
        this.f89017j = adFormatsLibraryExperiments;
        this.f89018k = adFormats;
        this.f89019l = adsCommonDisplay;
        g gVar = new g(this, 0);
        g gVar2 = new g(this, 1);
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) experiments.f83457a;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new d(this, gVar, null, gVar2, null, g1Var.o("android_load_medium_res_image_in_pdp_closeup", "enabled", z3Var) || g1Var.l("android_load_medium_res_image_in_pdp_closeup"), null, 84));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, new f(presenterPinalytics, experiments));
        this.f89025r = m.b(new g(this, 2));
        this.f89027t = new h(this);
    }

    public final boolean D3(dl1.s sVar) {
        return Intrinsics.d(sVar != null ? sVar.getUid() : null, this.f89010c.getUid());
    }

    @Override // vq0.g
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final void r3(l21.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f89013f.h(this.f89027t);
        view.setCarouselContainerInteractor(this);
        ArrayList arrayList = new ArrayList();
        boolean S = ((es.c) this.f89018k).S(this.f89010c);
        p2 p2Var = this.f89016i;
        boolean z13 = true;
        if (S) {
            this.f89026s = true;
            f30 f30Var = this.f89010c;
            es.h hVar = this.f89019l;
            List t13 = ((es.v) hVar).t(f30Var, this.f89017j);
            if (t13 == null) {
                t13 = q0.f80391a;
            }
            arrayList.addAll(a0.U(f30Var, t13, true, hVar));
        } else {
            cc J3 = this.f89010c.J3();
            boolean z14 = this.f89012e;
            if (J3 != null) {
                this.f89026s = true;
                f30 f30Var2 = this.f89010c;
                p2Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) p2Var.f83457a;
                if (!g1Var.o("android_video_in_carousel", "enabled", z3Var) && !g1Var.l("android_video_in_carousel")) {
                    z13 = false;
                }
                arrayList.addAll(a0.W(f30Var2, z14, z13));
            } else if (z14) {
                int z03 = bs1.c.z0(this.f89010c);
                int x03 = bs1.c.x0(this.f89010c);
                String y03 = bs1.c.y0(this.f89010c);
                Intrinsics.f(y03);
                String z43 = this.f89010c.z4();
                String u33 = this.f89010c.u3();
                String h43 = this.f89010c.h4();
                String r43 = this.f89010c.r4();
                String c43 = this.f89010c.c4();
                String uid = this.f89010c.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Boolean p63 = this.f89010c.p6();
                Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
                arrayList.add(new m21.b(z03, x03, y03, null, z43, u33, h43, r43, c43, uid, null, null, false, false, null, p63.booleanValue(), false, null, null, null, false, 3865600));
            } else {
                int C0 = bs1.c.C0(this.f89010c);
                int A0 = bs1.c.A0(this.f89010c);
                String B0 = bs1.c.B0(this.f89010c);
                Intrinsics.f(B0);
                String z44 = this.f89010c.z4();
                String u34 = this.f89010c.u3();
                String h44 = this.f89010c.h4();
                String r44 = this.f89010c.r4();
                String c44 = this.f89010c.c4();
                String uid2 = this.f89010c.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                Boolean p64 = this.f89010c.p6();
                Intrinsics.checkNotNullExpressionValue(p64, "getShouldMute(...)");
                arrayList.add(new m21.b(C0, A0, B0, null, z44, u34, h44, r44, c44, uid2, null, null, false, false, null, p64.booleanValue(), false, null, null, null, false, 3865600));
            }
        }
        x3(arrayList);
        this.f89020m = b40.z(this.f89010c);
        view.setCarouselItemCount(d().size());
        Boolean O5 = this.f89010c.O5();
        Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
        if (O5.booleanValue() && p2Var.e()) {
            view.setRecyclerViewToIndexCarousel();
        }
        view.jumpToCarouselItem(this.f89020m);
        view.setCarouselRatio(((m21.a) d().get(0)).i() / ((m21.a) d().get(0)).j());
        view.setBadge(this.f89020m, d().size());
        f30 f30Var3 = this.f89010c;
        Intrinsics.checkNotNullParameter(f30Var3, "<this>");
        com.pinterest.api.model.g t33 = f30Var3.t3();
        Integer Q = t33 != null ? t33.Q() : null;
        int value = mv.c.DISABLED.getValue();
        if (Q == null || Q.intValue() != value) {
            int value2 = mv.c.PAGING.getValue();
            if (Q == null || Q.intValue() != value2) {
                int value3 = mv.c.PEEK.getValue();
                if (Q != null && Q.intValue() == value3) {
                    view.startCarouselAnimation();
                }
            }
        }
        H3();
    }

    public final void G3(int i13, boolean z13) {
        h32.p2 p2Var;
        Long l13;
        Long l14;
        String uid;
        int z14 = b40.z(this.f89010c);
        if (i13 < 0 || i13 == b40.z(this.f89010c)) {
            return;
        }
        e30 R6 = this.f89010c.R6();
        cc ccVar = R6.f37158w;
        zb zbVar = ccVar != null ? new zb(ccVar, 0) : new zb(0);
        zbVar.f44272c = Integer.valueOf(i13);
        boolean[] zArr = zbVar.f44273d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
        R6.s(zbVar.a());
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.f89010c = a13;
        this.f89020m = i13;
        ((l21.e) getView()).setCarouselItemSelected(i13);
        if (this.f89026s) {
            I3(i13);
        }
        if (d().size() > 1) {
            ((l21.e) getView()).setBadge(i13, d().size());
        }
        if (z13) {
            d0 d0Var = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            v vVar = this.f89025r;
            i0 i0Var = (i0) vVar.getValue();
            f1 f1Var = f1.SWIPE;
            String uid2 = this.f89010c.getUid();
            m21.a aVar = (m21.a) d().get(this.f89020m);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            v1 v1Var = new v1();
            Long r13 = aVar.r();
            v1Var.b(Long.valueOf(r13 != null ? r13.longValue() : -1L));
            Long f13 = aVar.f();
            v1Var.d(Long.valueOf(f13 != null ? f13.longValue() : -1L));
            v1Var.g(Short.valueOf((short) this.f89020m));
            v1Var.e(Short.valueOf((short) z14));
            v1Var.c(aVar.c());
            v1Var.f(aVar.s());
            c1 c1Var = new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, v1Var.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            HashMap hashMap = new HashMap();
            hashMap.put("image_count", String.valueOf(d().size()));
            Unit unit = Unit.f80348a;
            d0Var.U(i0Var, f1Var, uid2, c1Var, hashMap, false);
            if (((es.c) this.f89018k).S(this.f89010c) && i13 != 0) {
                ArrayList t13 = ((es.v) this.f89019l).t(this.f89010c, this.f89017j);
                if (t13 == null || i13 <= t13.size()) {
                    boolean z15 = i13 > z14;
                    d0 d0Var2 = getPresenterPinalytics().f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                    i0 i0Var2 = (i0) vVar.getValue();
                    f1 f1Var2 = z15 ? f1.SHOWCASE_SUBPAGE_SWIPE_RIGHT : f1.SHOWCASE_SUBPAGE_SWIPE_LEFT;
                    String uid3 = this.f89010c.getUid();
                    f30 f30Var = this.f89010c;
                    f30 f30Var2 = t13 != null ? (f30) t13.get(i13 - 1) : null;
                    if (f30Var != null) {
                        String uid4 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                        if (TextUtils.isDigitsOnly(uid4)) {
                            String uid5 = f30Var.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                            l13 = Long.valueOf(Long.parseLong(uid5));
                        } else {
                            l13 = null;
                        }
                        if (f30Var2 == null || (uid = f30Var2.getUid()) == null || !TextUtils.isDigitsOnly(uid)) {
                            l14 = null;
                        } else {
                            String uid6 = f30Var2.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                            l14 = Long.valueOf(Long.parseLong(uid6));
                        }
                        o2 o2Var = new o2();
                        o2Var.c(l13);
                        o2Var.d(f30Var.getUid());
                        o2Var.b(f30Var2 != null ? f30Var2.z4() : null);
                        o2Var.e(l14);
                        o2Var.f();
                        p2Var = o2Var.a();
                    } else {
                        p2Var = null;
                    }
                    d0Var2.U(i0Var2, f1Var2, uid3, new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, p2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
                }
            }
        }
        ((l21.e) getView()).setVisibleCarouselIndex(this.f89020m);
        String uid7 = this.f89010c.getUid();
        Intrinsics.checkNotNullExpressionValue(uid7, "getUid(...)");
        this.f89015h.b(this.f89020m, uid7);
    }

    public final void H3() {
        if (this.f89023p) {
            ((l21.e) getView()).showImageOnly(false);
        } else {
            ((l21.e) getView()).resetImageOnly(this.f89010c);
            int z13 = this.f89026s ? b40.z(this.f89010c) : 0;
            I3(z13);
            if (d().size() > 1) {
                ((l21.e) getView()).setBadge(z13, d().size());
            }
        }
        if (this.f89024q) {
            ((l21.e) getView()).setPinStats(this.f89010c);
        }
    }

    @Override // l21.g
    public final void I1(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        if (this.f89021n || this.f89022o) {
            return;
        }
        p2 p2Var = this.f89016i;
        p2Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) p2Var.f83457a;
        boolean o13 = g1Var.o("android_ctx_long_press_cleanup_animation", "enabled", z3Var);
        w wVar = this.f89013f;
        if (!o13 && !g1Var.l("android_ctx_long_press_cleanup_animation")) {
            wVar.d(new ls1.q(targetView, this.f89010c));
            return;
        }
        ((l21.e) getView()).rotateAndScale();
        Object view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) view;
        f30 f30Var = this.f89010c;
        vn1.c cVar = vn1.c.DEFAULT;
        Object view3 = getView();
        Intrinsics.g(view3, "null cannot be cast to non-null type android.view.View");
        ViewParent parent = ((View) view3).getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        View O = r.O(parent);
        Rect rect = new Rect();
        if (O != null) {
            O.getGlobalVisibleRect(rect);
        }
        wVar.d(new ls1.q(view2, f30Var, -1, -1, cVar, false, null, true, -1, null, null, rect.top));
    }

    public final void I3(int i13) {
        if (this.f89023p) {
            return;
        }
        l21.e eVar = (l21.e) getView();
        e30 R6 = this.f89010c.R6();
        m21.a aVar = (m21.a) d().get(i13);
        String title = aVar.getTitle();
        if (title == null || title.length() == 0) {
            title = aVar.getDescription();
        }
        R6.f37103i0 = title;
        boolean[] zArr = R6.f37101h3;
        if (zArr.length > 60) {
            zArr[60] = true;
        }
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        eVar.updatePinGridTitle(a13, this.f89011d);
    }

    @Override // l21.g
    public final void U() {
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((m21.a) d().get(i13)).n() != null ? RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL : RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL;
    }

    @Override // vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        this.f89013f.j(this.f89027t);
        super.onUnbind();
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }

    @Override // l21.g
    public final void y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n view = getView();
        SingleColumnCarouselPinView singleColumnCarouselPinView = view instanceof SingleColumnCarouselPinView ? (SingleColumnCarouselPinView) view : null;
        this.f89013f.d(new ls1.d(singleColumnCarouselPinView != null ? singleColumnCarouselPinView.getCarouselRecyclerView() : null));
        ((l21.e) getView()).onPinClicked();
    }
}
