package l51;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v2;
import com.pinterest.feature.qcm.analytics.AdsQcmAnalytics$QcmItemImpressionPayload;
import hf0.b;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.z3;
import nx.b0;
import wr.c;
import wr.d;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final es.a f81584a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f81585b;

    /* renamed from: c, reason: collision with root package name */
    public final vr.a f81586c;

    /* renamed from: d, reason: collision with root package name */
    public final c f81587d;

    /* renamed from: e, reason: collision with root package name */
    public final j f81588e;

    public a(vr.a adsCommonAnalytics, d jsonLogger, xr.a attributionReporting, es.a adFormats, b0 pinAuxHelper, j experiments) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f81584a = adFormats;
        this.f81585b = pinAuxHelper;
        this.f81586c = adsCommonAnalytics;
        this.f81587d = jsonLogger;
        this.f81588e = experiments;
    }

    public final HashMap a(int i13, f30 pin) {
        v2 s13;
        v2 s14;
        String h10;
        ln e03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        HashMap m13 = this.f81585b.m(pin);
        if (m13 != null) {
            m13.put("is_third_party_ad", String.valueOf(pin.i5().booleanValue()));
            g t33 = pin.t3();
            if (t33 != null && (e03 = t33.e0()) != null) {
                m13.put("promo_ad_type", String.valueOf(e03.i().intValue()));
            }
            es.c cVar = (es.c) this.f81584a;
            String k13 = cVar.k(pin);
            String j13 = k13 != null ? cVar.j(pin) : null;
            if (k13 == null) {
                k13 = b40.J(pin);
            }
            if (k13 != null) {
                m13.put("dynamic_ad_price", k13);
            }
            if (j13 != null) {
                m13.put("dynamic_ad_strikethrough_price", j13);
            }
            se0 g63 = pin.g6();
            if (g63 != null && (s14 = g63.s()) != null && (h10 = s14.h()) != null) {
                m13.put("dynamic_ad_ratings", h10);
            }
            se0 g64 = pin.g6();
            if (g64 != null && (s13 = g64.s()) != null) {
                m13.put("dynamic_ad_rating_count", String.valueOf(s13.g().intValue()));
            }
            c(i13, pin, m13);
        } else {
            m13 = null;
        }
        return m13 == null ? new HashMap() : m13;
    }

    public final void b(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (d()) {
            c.a(this.f81587d, new AdsQcmAnalytics$QcmItemImpressionPayload(eventName), null, null, 14);
        }
    }

    public final void c(int i13, f30 f30Var, HashMap hashMap) {
        hashMap.put("index", String.valueOf(i13));
        hashMap.put("story_type", "related_pins_3p_ads_module_qcm");
        hashMap.put("grid_index", "0");
        hashMap.put("number_of_columns", String.valueOf(b.f69004d));
        boolean l03 = ((es.c) this.f81584a).l0(f30Var);
        this.f81585b.getClass();
        b0.b(f30Var, l03, hashMap);
    }

    public final boolean d() {
        j jVar = this.f81588e;
        jVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) jVar.f83394a;
        return g1Var.o("android_ad_qcm_logging", "enabled", z3Var) || g1Var.l("android_ad_qcm_logging");
    }
}
