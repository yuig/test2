package qt;

import android.os.Bundle;
import ck2.i;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.wy0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.text.GestaltText;
import cp.t;
import cu.m;
import es.h;
import es.v;
import h32.c1;
import h32.e4;
import h32.f1;
import h32.h2;
import h32.h4;
import h32.k0;
import h32.v0;
import h32.w0;
import h32.w1;
import h32.y1;
import java.util.HashMap;
import java.util.List;
import jk2.j1;
import jk2.x;
import kh2.m2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.w;
import n60.o;
import nx.b0;
import nx.d0;
import nx.d1;
import pk.v2;
import pk.x0;
import ps.l;
import rr.n0;
import uj2.q;
import x02.i2;
import yk1.p;
import yk1.r;

/* loaded from: classes3.dex */
public abstract class g extends p implements at.a {

    /* renamed from: a, reason: collision with root package name */
    public String f105111a;

    /* renamed from: b, reason: collision with root package name */
    public final w f105112b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f105113c;

    /* renamed from: d, reason: collision with root package name */
    public final j80.b f105114d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f105115e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0.g f105116f;

    /* renamed from: g, reason: collision with root package name */
    public final xr.a f105117g;

    /* renamed from: h, reason: collision with root package name */
    public final sg0.f f105118h;

    /* renamed from: i, reason: collision with root package name */
    public final es.a f105119i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f105120j;

    /* renamed from: k, reason: collision with root package name */
    public final ur.a f105121k;

    /* renamed from: l, reason: collision with root package name */
    public final h f105122l;

    /* renamed from: m, reason: collision with root package name */
    public long f105123m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f105124n;

    /* renamed from: o, reason: collision with root package name */
    public int f105125o;

    /* renamed from: p, reason: collision with root package name */
    public String f105126p;

    /* renamed from: q, reason: collision with root package name */
    public f30 f105127q;

    /* renamed from: r, reason: collision with root package name */
    public List f105128r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f105129s;

    /* renamed from: t, reason: collision with root package name */
    public qs.f f105130t;

    /* renamed from: u, reason: collision with root package name */
    public nq.b f105131u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f105132v;

    /* renamed from: w, reason: collision with root package name */
    public xj2.b f105133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ur.a adsDependencies, xr.a attributionReporting, es.a adFormats, h adsCommonDisplay, l pinAnalytics, b0 pinAuxHelper, d1 trackingParamAttacher, w eventManager, j80.b carouselUtil, sg0.f afterActionPlacementManager, lh0.g adsExperiments, ro1.c deepLinkAdUtil, i2 pinRepository, q networkStateStream, String str) {
        super(pinAnalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(afterActionPlacementManager, "afterActionPlacementManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f105111a = str;
        this.f105112b = eventManager;
        this.f105113c = pinRepository;
        this.f105114d = carouselUtil;
        this.f105115e = trackingParamAttacher;
        this.f105116f = adsExperiments;
        this.f105117g = attributionReporting;
        this.f105118h = afterActionPlacementManager;
        this.f105119i = adFormats;
        this.f105120j = pinAuxHelper;
        this.f105121k = adsDependencies;
        this.f105122l = adsCommonDisplay;
        this.f105124n = true;
        this.f105131u = nq.b.CLICK;
        this.f105133w = new xj2.b();
    }

    public final void B3() {
        y1 y1Var;
        qs.f s33 = s3();
        v2 i13 = s33.f105079i.i();
        s33.f105079i = new x0(4);
        if (i13.isEmpty() || (y1Var = s33.f105081k) == null) {
            return;
        }
        y1Var.f67459q = i13;
        y1Var.f67439e = ep.b.f(1000000L);
        s33.f105080j.e(y1Var.a());
        s33.f105081k = null;
        v2 i14 = s33.f105080j.i();
        s33.f105080j = new x0(4);
        if (i14.isEmpty()) {
            return;
        }
        HashMap a13 = s33.a();
        v0 v0Var = new v0();
        f30 f30Var = s33.f105078h;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        v0Var.A = f30Var.d5();
        v0Var.G = s33.f105072b;
        f30 f30Var2 = s33.f105078h;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (o.B(f30Var2, "getIsPromoted(...)")) {
            a13.put("debug_code_path", "4");
        }
        for (f1 f1Var : s33.f105075e) {
            f30 f30Var3 = s33.f105078h;
            if (f30Var3 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            s33.f105071a.C(f1Var, f30Var3.getUid(), CollectionsKt.H0(i14), a13, null, v0Var, s33.f105074d);
        }
    }

    public final void D3(nq.b closeupNavigationType) {
        Intrinsics.checkNotNullParameter(closeupNavigationType, "closeupNavigationType");
        this.f105131u = closeupNavigationType;
    }

    public void F3() {
        f30 t33 = t3();
        lh0.g gVar = this.f105116f;
        gVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) gVar.f83348a;
        List W0 = m2.W0(t33, this.f105122l, g1Var.o("android_video_in_carousel", "enabled", z3Var) || g1Var.l("android_video_in_carousel"));
        Intrinsics.checkNotNullParameter(W0, "<set-?>");
        this.f105128r = W0;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        at.b view = (at.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        m mVar = (m) view;
        getPresenterPinalytics().d(mVar.f53238r0, mVar.f53239s0, null, mVar.f53240t0, null);
    }

    @Override // at.a
    public void e0(String str, boolean z13) {
        if (this.f105129s) {
            return;
        }
        f30 t33 = t3();
        es.c cVar = (es.c) this.f105119i;
        boolean l03 = cVar.l0(t33);
        xr.a aVar = this.f105117g;
        if (l03) {
            aVar.a(t3(), true);
        }
        d0 pinalytics = getPinalytics();
        String uid = t3().getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        HashMap f13 = z0.f(new Pair("click_type", "clickthrough"), new Pair("closeup_navigation_type", this.f105131u.getType()), new Pair("is_cct_enabled", String.valueOf(z13)));
        if (cVar.K(t3())) {
            String f03 = com.bumptech.glide.d.f0(t3());
            if (f03 == null) {
                f03 = "";
            }
            f13.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
            f13.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        ((vr.b) ((ur.b) this.f105121k).f123059b).c(t3(), f13);
        this.f105120j.a(t3(), aVar, p3());
        f13.put("is_third_party_ad", String.valueOf(t3().i5().booleanValue()));
        Unit unit = Unit.f80348a;
        pinalytics.n(uid, f13, this.f105115e.b(t3()), null, w3(str), null);
        pinalytics.u(f1.TAP, t3().getUid(), r3(this.f105125o), p3(), false);
        if (this.f105124n) {
            this.f105124n = false;
            f1 f1Var = f1.VIEW_WEBSITE_100;
            String uid2 = t3().getUid();
            c1 r33 = r3(this.f105125o);
            HashMap p33 = p3();
            p33.put("closeup_navigation_type", this.f105131u.getType());
            p33.put("pin_is_promoted", "true");
            pinalytics.u(f1Var, uid2, r33, p33, false);
            f1 f1Var2 = f1.DESTINATION_VIEW;
            String str2 = this.f105111a;
            c1 r34 = r3(this.f105125o);
            HashMap p34 = p3();
            p34.put("click_type", "clickthrough");
            pinalytics.u(f1Var2, str2, r34, p34, false);
            pinalytics.u(f1.VIEW_WEBSITE_ONE_PIXEL, this.f105111a, r3(this.f105125o), p3(), false);
        }
    }

    public void loadData() {
        String str = this.f105111a;
        if (str != null) {
            q L = this.f105113c.L(str);
            hk2.b bVar = new hk2.b(new n0(23, new c(this, 0)), new n0(24, d.f105103j), i.f27923c);
            try {
                L.d(new jk2.d0(bVar, 0L));
                addDisposable(bVar);
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Throwable th3) {
                throw o.g(th3, "subscribeActual failed", th3);
            }
        }
    }

    @Override // yk1.b
    public final void onActivate() {
        c cVar = new c(this, 1);
        if (this.f105127q != null) {
            cVar.invoke(t3());
            return;
        }
        String str = this.f105111a;
        if (str != null) {
            q L = this.f105113c.L(str);
            hk2.b bVar = new hk2.b(new n0(21, new i1.f1(7, cVar)), new n0(22, d.f105104k), i.f27923c);
            try {
                L.d(new jk2.d0(bVar, 0L));
                addDisposable(bVar);
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Throwable th3) {
                throw o.g(th3, "subscribeActual failed", th3);
            }
        }
    }

    @Override // yk1.b
    public void onDeactivate() {
        this.f105133w.dispose();
        this.f105133w = new xj2.b();
    }

    @Override // yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        this.f105111a = bundle != null ? bundle.getString("pin_id") : null;
    }

    @Override // yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("pin_id", this.f105111a);
        }
    }

    @Override // yk1.p, yk1.b
    public void onUnbind() {
        if (!this.f105132v) {
            HashMap hashMap = new HashMap();
            c1 c1Var = null;
            if (this.f105127q != null) {
                hashMap = this.f105120j.m(t3());
                f30 t33 = t3();
                es.c cVar = (es.c) this.f105119i;
                if (cVar.r(t33)) {
                    if (hashMap != null) {
                    }
                    if (hashMap != null) {
                    }
                    if (hashMap != null) {
                    }
                }
                Boolean bool = Boolean.FALSE;
                c1Var = new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cVar.j0(t3()) ? new h32.f() : null, null, null, null, null, null, ((vr.b) ((ur.b) this.f105121k).f123059b).b(null, t3(), null, null), null);
            }
            HashMap hashMap2 = hashMap;
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.PIN_CLICKTHROUGH_END;
            String str = this.f105111a;
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf((System.currentTimeMillis() * 1000000) - this.f105123m);
            pinalytics.H(f1Var, str, c1Var, hashMap2, v0Var, false);
        }
        super.onUnbind();
    }

    public final HashMap p3() {
        HashMap hashMap = new HashMap();
        bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(t3()), hashMap);
        if (((es.c) this.f105119i).K(t3())) {
            String f03 = com.bumptech.glide.d.f0(t3());
            if (f03 == null) {
                f03 = "";
            }
            hashMap.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
            hashMap.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        ((vr.b) ((ur.b) this.f105121k).f123059b).c(t3(), hashMap);
        this.f105120j.a(t3(), this.f105117g, hashMap);
        return hashMap;
    }

    public final List q3() {
        List list = this.f105128r;
        if (list != null) {
            return list;
        }
        Intrinsics.r("carouselData");
        throw null;
    }

    public final c1 r3(int i13) {
        cc J3 = t3().J3();
        List d2 = J3 != null ? J3.d() : null;
        if (J3 == null || d2 == null) {
            return null;
        }
        l30 l30Var = (l30) d2.get(this.f105125o);
        String f13 = J3.f();
        Long valueOf = Long.valueOf(f13 != null ? Long.parseLong(f13) : 0L);
        String y13 = l30Var.y();
        Long valueOf2 = Long.valueOf(y13 != null ? Long.parseLong(y13) : 0L);
        String r13 = l30Var.r();
        Short valueOf3 = Short.valueOf((short) this.f105125o);
        Short valueOf4 = Short.valueOf((short) i13);
        String t13 = l30Var.t();
        w1 w1Var = new w1(valueOf, valueOf2, valueOf4, r13, valueOf3, t13 != null ? StringsKt.h0(t13) : null);
        Boolean bool = Boolean.FALSE;
        return new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, w1Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final synchronized qs.f s3() {
        qs.f fVar;
        fVar = this.f105130t;
        if (fVar == null) {
            w0 e13 = getPresenterPinalytics().e();
            fVar = new qs.f(getPinalytics(), e13 != null ? e13.G : null, this.f105131u, f0.d(f1.PIN_CLOSEUP_IMPRESSION_ONE_PIXEL, f1.PIN_IMPRESSION_ONE_PIXEL), this.f105120j, this.f105121k);
            this.f105130t = fVar;
        }
        return fVar;
    }

    public final f30 t3() {
        f30 f30Var = this.f105127q;
        if (f30Var != null) {
            return f30Var;
        }
        Intrinsics.r("pin");
        throw null;
    }

    public boolean u3() {
        return q3().size() > 1;
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }

    public void v3(f30 pin) {
        com.pinterest.api.model.g t33;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "<set-?>");
        this.f105127q = pin;
        F3();
        String l13 = b40.l(pin);
        if (l13 == null) {
            l13 = "black";
        }
        int a13 = this.f105114d.a(pin);
        this.f105126p = ((m21.a) q3().get(this.f105125o)).d();
        if (!u3()) {
            a13 = 0;
        }
        this.f105125o = a13;
        m21.a aVar = (m21.a) q3().get(this.f105125o);
        at.b bVar = (at.b) getView();
        m mVar = (m) bVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(this, "presenter");
        mVar.f53232l0 = this;
        if (mVar.f53234n0) {
            this.f105132v = true;
        }
        bVar.updatePin(pin);
        es.c cVar = (es.c) this.f105119i;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (cVar.Y(pin)) {
            Boolean p63 = pin.p6();
            Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
            boolean booleanValue = p63.booleanValue();
            AdsToolbarModule adsToolbarModule = ((m) bVar).f53230j0;
            if (adsToolbarModule == null) {
                Intrinsics.r("toolbarModule");
                throw null;
            }
            t tVar = new t(booleanValue, 9);
            GestaltText gestaltText = adsToolbarModule.f35306c;
            gestaltText.i(tVar);
            gestaltText.setSelected(booleanValue);
        }
        m mVar2 = (m) bVar;
        mVar2.d8().f35328o0 = m2.Q0(mVar2.f8(), l13);
        mVar2.d8().t1(q3());
        String Y = (!cVar.L(pin) || (t33 = pin.t3()) == null) ? null : t33.Y();
        boolean v13 = cVar.v(pin);
        String title = aVar.getTitle();
        wy0 a63 = pin.a6();
        bVar.a4(title, a63 != null ? a63.Z2() : null, Y, v13, b40.w0(pin));
    }

    public final c1 w3(String str) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        ((vr.b) ((ur.b) this.f105121k).f123059b).b(null, t3(), Integer.valueOf(h32.n0.WEB.getValue()), str);
        return new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // yk1.p
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public void r3(at.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        loadData();
        int i13 = 0;
        this.f105112b.d(new r70.h(false, false));
        this.f105123m = System.currentTimeMillis() * 1000000;
        uk2.d dVar = gb2.f.f64748b;
        a aVar = new a(0, d.f105105l);
        dVar.getClass();
        int i14 = 2;
        int i15 = 3;
        xj2.c F = new x(new j1(pk2.f.j(new j1(dVar, aVar, i13), new b(0, d.f105106m), 2, "filter(...)"), new ep.a(13, d.f105107n), i13), new com.pinterest.framework.multisection.datasource.pagedlist.h(i15, new c(this, i14)), i14).F(new n0(19, new c(this, i15)), new n0(20, d.f105108o), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void z3(int i13, int i14) {
        qs.f s33 = s3();
        f30 pin = t3();
        Intrinsics.checkNotNullParameter(pin, "pin");
        s33.f105078h = pin;
        qs.f s34 = s3();
        s34.f105082l = i13;
        s34.f105083m = i14;
        if (s34.f105081k == null) {
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            e4 e4Var = new e4(h4.V_TOP, Boolean.TRUE, Long.valueOf(currentTimeMillis));
            y1 y1Var = new y1();
            y1Var.f67449j = h2.CLOSEUP_IMPRESSION;
            y1Var.f67433b = Long.valueOf(currentTimeMillis);
            f30 f30Var = s34.f105078h;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            int i15 = s34.f105082l;
            int i16 = s34.f105083m;
            ur.b bVar = (ur.b) s34.f105077g;
            k0 c13 = h.c(bVar.f123060c, f30Var);
            f30 f30Var2 = s34.f105078h;
            if (f30Var2 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            h32.f fVar = ((es.c) bVar.f123058a).j0(f30Var2) ? new h32.f() : null;
            f30 f30Var3 = s34.f105078h;
            if (f30Var3 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String g13 = ((vr.b) bVar.f123059b).g(f30Var3);
            f30 f30Var4 = s34.f105078h;
            if (f30Var4 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            bs1.c.Q1(y1Var, f30Var, null, 0L, i15, i16, -1, s34.f105072b, null, false, false, false, null, c13, fVar, null, g13, ((v) bVar.f123060c).o(f30Var4), null, null, 827136);
            y1Var.f67459q = e0.b(e4Var);
            s34.f105081k = y1Var;
            s34.f105079i.e(e4Var);
        }
    }
}
