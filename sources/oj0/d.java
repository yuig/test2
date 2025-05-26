package oj0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import com.pinterest.feature.pin.t;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import h32.f1;
import h32.u0;
import h32.v0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import qa2.h0;
import sv.y;
import tb0.p;
import u60.l;
import x02.b2;
import x02.c2;
import x02.i2;

/* loaded from: classes5.dex */
public abstract class d implements mj0.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f95364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95365b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f95366c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f95367d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f95368e;

    /* renamed from: f, reason: collision with root package name */
    public final r f95369f;

    /* renamed from: g, reason: collision with root package name */
    public final w f95370g;

    /* renamed from: h, reason: collision with root package name */
    public final j f95371h;

    /* renamed from: i, reason: collision with root package name */
    public final b f95372i;

    /* renamed from: j, reason: collision with root package name */
    public final a f95373j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f95374k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f95375l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f95376m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f95377n;

    /* renamed from: o, reason: collision with root package name */
    public final xj2.b f95378o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95379p;

    public d(String str, String str2, uk1.d presenterPinalytics, d1 trackingParamAttacher, i2 pinRepository, r repinAnimationUtil, w eventManager, j pinAction, b saveActionLoggingData, a delegate, boolean z13, b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(saveActionLoggingData, "saveActionLoggingData");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f95364a = str;
        this.f95365b = str2;
        this.f95366c = presenterPinalytics;
        this.f95367d = trackingParamAttacher;
        this.f95368e = pinRepository;
        this.f95369f = repinAnimationUtil;
        this.f95370g = eventManager;
        this.f95371h = pinAction;
        this.f95372i = saveActionLoggingData;
        this.f95373j = delegate;
        this.f95374k = z13;
        this.f95375l = pinAuxHelper;
        this.f95376m = new LinkedHashMap();
        this.f95377n = new LinkedHashSet();
        this.f95378o = new xj2.b();
    }

    public static final void a(d dVar, f30 f30Var, String str) {
        v0 v0Var;
        String i03;
        HashMap o13 = dVar.f95375l.o(f30Var, str);
        if (o13 == null) {
            o13 = new HashMap();
        }
        HashMap hashMap = o13;
        if (b40.X0(f30Var) && (i03 = b40.i0(f30Var)) != null) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
        }
        b bVar = dVar.f95372i;
        HashMap hashMap2 = bVar.f95360c;
        if (hashMap2 != null) {
            hashMap.putAll(z0.n(hashMap2));
        }
        String b13 = dVar.f95367d.b(f30Var);
        if (b13 == null || b13.length() == 0) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(new Throwable("Builder was null in logRepin"), "Builder was null in logRepin", p.REPIN);
            v0Var = null;
        } else {
            v0 v0Var2 = new v0();
            v0Var2.G = b13;
            v0Var = v0Var2;
        }
        if (v0Var != null) {
            d0 d0Var = dVar.f95366c.f122379a;
            f1 f1Var = f1.PIN_REPIN;
            String uid = f30Var.getUid();
            Intrinsics.f(d0Var);
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : bVar.f95359b, (r18 & 4) != 0 ? null : bVar.f95358a, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // mj0.g
    public final boolean a6(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return this.f95376m.containsKey(pin.getUid()) || this.f95377n.contains(pin) || j1.U0(pin.B5()) || (this.f95374k && pin.G5() != null);
    }

    public final void b(f30 originalSavedPin, f30 pin) {
        Intrinsics.checkNotNullParameter(originalSavedPin, "originalSavedPin");
        Intrinsics.checkNotNullParameter(pin, "pin");
        LinkedHashMap linkedHashMap = this.f95376m;
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        linkedHashMap.put(uid, originalSavedPin);
        ((l) this.f95373j).h(pin);
    }

    public final void c() {
        this.f95378o.d();
        this.f95376m.clear();
        this.f95377n.clear();
        this.f95379p = false;
    }

    public c2 d(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        c2 c2Var = new c2(uid);
        c2Var.f131300e = this.f95364a;
        String str = this.f95365b;
        if (str != null) {
            c2Var.f131301f = str;
        }
        c2Var.f131304i = false;
        c2Var.f131305j = pin.z4();
        c2Var.f131306k = this.f95367d.b(pin);
        return c2Var;
    }

    public void e(f30 pin, f30 newPin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
    }

    public void f(f30 shownPin, f30 repinnedPin) {
        Intrinsics.checkNotNullParameter(shownPin, "shownPin");
        Intrinsics.checkNotNullParameter(repinnedPin, "repinnedPin");
    }

    public final void g(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f95376m.remove(pin.getUid());
        if (j1.U0(pin.B5())) {
            e30 R6 = pin.R6();
            R6.x1(null);
            f30 a13 = R6.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            this.f95368e.W(a13);
        }
        ((l) this.f95373j).h(pin);
    }

    @Override // mj0.g
    public void l2(f30 pin, h0 h0Var) {
        v7 v7Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean a63 = a6(pin);
        d0 d0Var = this.f95366c.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        b bVar = this.f95372i;
        u0 u0Var = bVar.f95359b;
        String uid = pin.getUid();
        String str = a63 ? "PIN_DELETE" : "PIN_REPIN";
        HashMap hashMap = bVar.f95360c;
        hashMap.put("reason", str);
        hashMap.put("is_undo", String.valueOf(a63));
        d0Var.f0(u0Var, bVar.f95358a, uid, hashMap, false);
        xj2.b bVar2 = this.f95378o;
        a aVar = this.f95373j;
        if (a63) {
            String uid2 = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            f30 a13 = ((l) aVar).a(uid2);
            if (a13 == null) {
                return;
            }
            f30 f30Var = (f30) this.f95376m.get(uid2);
            i2 i2Var = this.f95368e;
            if (f30Var == null) {
                String B5 = a13.B5();
                if (B5 == null) {
                    B5 = "";
                }
                f30Var = (f30) gh0.b.C(i2Var.M(B5));
            }
            g(a13);
            if (f30Var != null) {
                String b13 = this.f95367d.b(f30Var);
                String uid3 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                bVar2.a(i2Var.m(new b2(uid3, b13), f30Var).i(new xo.c(this, f30Var, a13, 5), new dh0.a(25, new y(this, f30Var, a13, 21))));
                return;
            }
            return;
        }
        String pinUid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(pinUid, "getUid(...)");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        l lVar = (l) aVar;
        f30 a14 = lVar.a(pinUid);
        if (a14 == null) {
            return;
        }
        this.f95377n.add(a14);
        lVar.h(a14);
        this.f95369f.getClass();
        int i13 = 0;
        if (r.b()) {
            String str2 = this.f95364a;
            if (str2 != null) {
                u7 x03 = v7.x0();
                x03.P(str2);
                v7Var = x03.a();
            } else {
                v7Var = null;
            }
            e30 R6 = a14.R6();
            R6.C1(v7Var);
            f30 a15 = R6.a();
            Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
            this.f95370g.d(new t(a15, r.a(h0Var), false));
        }
        bVar2.a(this.f95371h.a(a14, d(a14), new dh0.a(23, new c(this, a14, i13)), new dh0.a(24, new c(this, a14, 1))));
    }
}
