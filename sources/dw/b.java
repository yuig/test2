package dw;

import a11.e;
import a11.n;
import bj.f;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.r;
import com.pinterest.api.model.sr;
import es.c;
import es.h;
import es.v;
import fw.d;
import h32.c1;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.v0;
import h32.x2;
import h32.y1;
import h32.z1;
import java.util.HashMap;
import java.util.Map;
import kh2.u2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import nx.b0;
import nx.c0;
import nx.d0;
import nx.d1;
import nx.o0;
import nx.q;
import wi.p;
import xk2.s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f56400a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f56401b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f56402c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.a f56403d;

    /* renamed from: e, reason: collision with root package name */
    public final e f56404e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f56405f;

    /* renamed from: g, reason: collision with root package name */
    public final ur.a f56406g;

    /* renamed from: h, reason: collision with root package name */
    public final es.a f56407h;

    /* renamed from: i, reason: collision with root package name */
    public final d f56408i;

    public b(d0 pinalytics, d1 trackingParamAttacher, o0 pinalyticsManager, pb0.a clock, n clickthroughHelper, b0 pinAuxHelper, ur.a adsCoreDependencies, es.a adFormats, d adsGmaLogger) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsGmaLogger, "adsGmaLogger");
        this.f56400a = pinalytics;
        this.f56401b = trackingParamAttacher;
        this.f56402c = pinalyticsManager;
        this.f56403d = clock;
        this.f56404e = clickthroughHelper;
        this.f56405f = pinAuxHelper;
        this.f56406g = adsCoreDependencies;
        this.f56407h = adFormats;
        this.f56408i = adsGmaLogger;
    }

    public final HashMap a(f30 f30Var, int i13, int i14, String str, String str2, f fVar) {
        Float valueOf;
        r n03;
        String p13;
        bj.b mediaContent;
        p icon;
        bj.b mediaContent2;
        bj.b mediaContent3;
        HashMap b13 = b(i13, i14, f30Var);
        g t33 = f30Var.t3();
        int intValue = (t33 != null ? t33.V() : -1).intValue();
        boolean hasVideoContent = (fVar == null || (mediaContent3 = fVar.getMediaContent()) == null) ? false : mediaContent3.getHasVideoContent();
        boolean z13 = ((fVar == null || (mediaContent2 = fVar.getMediaContent()) == null) ? null : mediaContent2.getMainImage()) != null;
        boolean z14 = (fVar != null ? fVar.getImage() : null) != null;
        boolean z15 = ((fVar == null || (icon = fVar.getIcon()) == null) ? null : icon.f129977a) != null;
        String advertiser = fVar != null ? fVar.getAdvertiser() : null;
        String headline = fVar != null ? fVar.getHeadline() : null;
        if (fVar == null) {
            Map A4 = f30Var.A4();
            if (A4 != null) {
                String str3 = (String) CollectionsKt.c0(A4.keySet());
                sr srVar = (sr) A4.get(str3);
                Double k13 = srVar != null ? srVar.k() : null;
                sr srVar2 = (sr) A4.get(str3);
                Double h10 = srVar2 != null ? srVar2.h() : null;
                if (k13 != null && h10 != null) {
                    valueOf = Float.valueOf((float) (k13.doubleValue() / h10.doubleValue()));
                }
            }
            valueOf = null;
        } else {
            bj.b mediaContent4 = fVar.getMediaContent();
            if (mediaContent4 != null) {
                valueOf = Float.valueOf(mediaContent4.getAspectRatio());
            }
            valueOf = null;
        }
        Long valueOf2 = (fVar == null || (mediaContent = fVar.getMediaContent()) == null) ? null : Long.valueOf((long) mediaContent.getDuration());
        g t34 = f30Var.t3();
        if (t34 != null && (n03 = t34.n0()) != null && (p13 = u2.p(n03)) != null) {
        }
        String str4 = ((c) this.f56407h).u(f30Var) ? "video" : null;
        if (str4 == null) {
            str4 = "image";
        }
        b13.put("media_type", str4);
        b13.put("ad_creative_type", String.valueOf(intValue));
        b13.put("has_video_content", String.valueOf(hasVideoContent));
        b13.put("has_image_content", String.valueOf(z13));
        b13.put("has_native_ad_images", String.valueOf(z14));
        if (str2 != null) {
        }
        Boolean valueOf3 = Boolean.valueOf(z15);
        u uVar = new u();
        if (valueOf != null) {
            uVar.s(Float.valueOf(valueOf.floatValue()), "aspect_ratio_from_native_ad");
        }
        if (str != null) {
            uVar.u("step", str);
        }
        if (valueOf2 != null) {
            uVar.s(Long.valueOf(valueOf2.longValue()), "video_duration");
        }
        uVar.t("has_icon_image", valueOf3);
        if (advertiser != null) {
            uVar.u("advertiser_name", advertiser);
        }
        if (headline != null) {
            uVar.u("headline", headline);
        }
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        b13.put("3p_additional_data", sVar);
        return b13;
    }

    public final HashMap b(int i13, int i14, f30 f30Var) {
        HashMap o13 = ep.b.o("is_third_party_ad", "true");
        o13.put("number_of_columns", String.valueOf(hf0.b.f69004d));
        o13.put("grid_index", String.valueOf(i13));
        o13.put("pin_column_index", String.valueOf(i14));
        this.f56405f.c(f30Var, o13);
        return o13;
    }

    public final c0 c(c0 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        ((pb0.g) this.f56403d).getClass();
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        z1 source = impression.f92383a;
        Intrinsics.checkNotNullParameter(source, "source");
        return new c0(new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, Long.valueOf(currentTimeMillis), source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), impression.f92384b);
    }

    public final c0 d(f30 pin, int i13, int i14, int i15, int i16) {
        xk2.r m13;
        Object m14;
        Intrinsics.checkNotNullParameter(pin, "pin");
        ((pb0.g) this.f56403d).getClass();
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        Integer valueOf = Integer.valueOf(i16);
        y1 y1Var = new y1();
        y1Var.f67433b = Long.valueOf(currentTimeMillis);
        String y43 = pin.y4();
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String c13 = this.f56401b.c(uid);
        ur.b bVar = (ur.b) this.f56406g;
        bs1.c.Q1(y1Var, pin, y43, -1L, i13, i14, i15, c13, valueOf, false, false, false, null, h.c(bVar.f123060c, pin), ((c) this.f56407h).j0(pin) ? new h32.f() : null, null, ((vr.b) bVar.f123059b).g(pin), ((v) bVar.f123060c).o(pin), null, null, 819712);
        g t33 = pin.t3();
        y1Var.f67434b0 = Short.valueOf((short) (t33 != null ? t33.V() : 0).intValue());
        z1 a13 = y1Var.a();
        HashMap o13 = ep.b.o("is_third_party_ad", "true");
        o13.put("pin_column_index", String.valueOf(i16));
        o13.put("number_of_columns", String.valueOf(hf0.b.f69004d));
        q o23 = bs1.c.o2(o13);
        g0 g0Var = g0.FLOWED_PIN;
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        try {
            xk2.q qVar = s.f135225b;
            m13 = null;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        Long l13 = (Long) m13;
        try {
            m14 = Long.valueOf(Long.parseLong(uid2));
        } catch (Throwable th4) {
            xk2.q qVar3 = s.f135225b;
            m14 = ue.c.m(th4);
        }
        if (m14 instanceof xk2.r) {
            m14 = null;
        }
        Boolean bool = Boolean.FALSE;
        return new c0(a13, new nx.c(g0Var, o23, new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new x2(l13, uid2, (Long) m14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, 8));
    }

    public final void e(i0 i0Var, f1 f1Var, f30 f30Var, long j13, int i13, int i14, String str, f fVar, String str2, boolean z13) {
        i0 i0Var2;
        d0 d0Var = this.f56400a;
        if (i0Var == null) {
            i0 p13 = d0Var.p();
            if (p13 == null) {
                p13 = new i0(null, null, null, null, null, null);
            }
            i0Var2 = p13;
        } else {
            i0Var2 = i0Var;
        }
        String uid = f30Var.getUid();
        HashMap a13 = a(f30Var, i13, i14, str, str2, fVar);
        v0 v0Var = new v0();
        v0Var.C = Long.valueOf(1000000 * j13);
        d0Var.t(i0Var2, v0Var, null, f1Var, uid, a13, false);
        if (z13) {
            this.f56408i.b(f1Var.name(), Long.valueOf(j13), str2, a(f30Var, i13, i14, str, str2, fVar));
        }
    }

    public final void g(long j13, String pinId, String adUnitId, int i13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        f1 f1Var = f1.GMA_IMP_DATA_RECEIVED;
        Boolean bool = Boolean.FALSE;
        c1 c1Var = new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new n32.a(Short.valueOf((short) i13), Long.valueOf(j13)), null, null, null, null, null, null, null, null, null);
        HashMap x13 = a.a.x("ad_unit_ids", adUnitId, "is_third_party_ad", "true");
        Unit unit = Unit.f80348a;
        this.f56400a.u(f1Var, pinId, c1Var, x13, false);
    }

    public final void h(int i13, int i14, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        HashMap b13 = b(i13, i14, pin);
        b13.put("click_type", "clickthrough");
        b13.put("closeup_navigation_type", nq.b.CLICK.getType());
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        this.f56400a.m(uid, b13, this.f56401b.c(uid2), g0.FLOWED_PIN, null);
    }

    public final void i(int i13, int i14, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        String D = com.bumptech.glide.c.D(pin);
        if (D == null) {
            D = "";
        }
        String str = D;
        HashMap b13 = b(i13, i14, pin);
        nx.a d2 = this.f56402c.d();
        i0 generateLoggingContext = d2 != null ? d2.generateLoggingContext() : null;
        e.b(this.f56404e, pin, str, true, 0, null, generateLoggingContext != null ? com.bumptech.glide.d.z0(generateLoggingContext, a.f56399i) : null, b13, null, null, 408);
    }
}
