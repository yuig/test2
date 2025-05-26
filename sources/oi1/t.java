package oi1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.e7;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v2;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import es.v;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f95320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95321b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95322c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f95323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95324e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f95325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95327h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.q f95328i;

    /* renamed from: j, reason: collision with root package name */
    public final int f95329j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f95330k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f95331l;

    /* renamed from: m, reason: collision with root package name */
    public final String f95332m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f95333n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f95334o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f95335p;

    /* renamed from: q, reason: collision with root package name */
    public final int f95336q;

    /* renamed from: r, reason: collision with root package name */
    public final es.a f95337r;

    /* renamed from: s, reason: collision with root package name */
    public final b0 f95338s;

    /* renamed from: t, reason: collision with root package name */
    public final ur.a f95339t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f95340u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f95341v;

    public t(f30 pin, int i13, boolean z13, boolean z14, int i14, Integer num, int i15, boolean z15, nx.q commerceData, int i16, boolean z16, boolean z17, String str, Boolean bool, HashMap hashMap, boolean z18, int i17, es.a adFormats, b0 pinAuxHelper, ur.a adsDependencies, boolean z19, boolean z23) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        this.f95320a = pin;
        this.f95321b = i13;
        this.f95322c = z13;
        this.f95323d = z14;
        this.f95324e = i14;
        this.f95325f = num;
        this.f95326g = i15;
        this.f95327h = z15;
        this.f95328i = commerceData;
        this.f95329j = i16;
        this.f95330k = z16;
        this.f95331l = z17;
        this.f95332m = str;
        this.f95333n = bool;
        this.f95334o = hashMap;
        this.f95335p = z18;
        this.f95336q = i17;
        this.f95337r = adFormats;
        this.f95338s = pinAuxHelper;
        this.f95339t = adsDependencies;
        this.f95340u = z19;
        this.f95341v = z23;
    }

    public final HashMap a() {
        v2 s13;
        v2 s14;
        String h10;
        e7 O;
        e7 O2;
        e7.a g13;
        e7 O3;
        e7.a g14;
        ln e03;
        HashMap contents = new HashMap();
        HashMap hashMap = this.f95334o;
        if (hashMap != null) {
            contents.putAll(hashMap);
        }
        b0 b0Var = this.f95338s;
        b0Var.getClass();
        f30 pin = this.f95320a;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(contents, "auxData");
        nx.q commerceData = this.f95328i;
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        HashMap n13 = b0Var.n(pin, this.f95321b, null, contents, commerceData);
        if (n13 != null) {
            contents.putAll(n13);
        }
        if (this.f95322c) {
            contents.put("has_pin_chips", "true");
        }
        if (this.f95323d) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            contents.put("pin_id", uid);
        }
        if (this.f95335p) {
            contents.put("collection_pin_click_position", String.valueOf(this.f95324e));
        }
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null && (e03 = t33.e0()) != null) {
            contents.put("promo_ad_type", String.valueOf(e03.i().intValue()));
        }
        ur.b bVar = (ur.b) this.f95339t;
        Integer num = null;
        if (((v) bVar.f123060c).d0(pin, false, s.f95319i)) {
            com.pinterest.api.model.g t34 = pin.t3();
            contents.put(SbaPinRep.AUX_DATA_BADGE_LABEL_ENUM, String.valueOf((t34 == null || (O3 = t34.O()) == null || (g14 = O3.g()) == null) ? null : Integer.valueOf(g14.getValue())));
        }
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            boolean z13 = this.f95341v;
            boolean z14 = this.f95340u;
            if (z14 || z13) {
                es.c cVar = (es.c) this.f95337r;
                String k13 = cVar.k(pin);
                String j13 = k13 != null ? cVar.j(pin) : null;
                if (z14) {
                    if (k13 == null) {
                        k13 = b40.J(pin);
                    }
                    if (k13 != null) {
                        contents.put("dynamic_ad_price", k13);
                    }
                    if (j13 != null) {
                        contents.put("dynamic_ad_strikethrough_price", j13);
                    }
                }
                if (z13) {
                    se0 g63 = pin.g6();
                    if (g63 != null && (s14 = g63.s()) != null && (h10 = s14.h()) != null) {
                        contents.put("dynamic_ad_ratings", h10);
                    }
                    se0 g64 = pin.g6();
                    if (g64 != null && (s13 = g64.s()) != null) {
                        contents.put("dynamic_ad_rating_count", String.valueOf(s13.g().intValue()));
                    }
                }
            }
            com.pinterest.api.model.g t35 = pin.t3();
            if (t35 != null && (O = t35.O()) != null && O.g() != null) {
                com.pinterest.api.model.g t36 = pin.t3();
                if (t36 != null && (O2 = t36.O()) != null && (g13 = O2.g()) != null) {
                    num = Integer.valueOf(g13.getValue());
                }
                contents.put(SbaPinRep.AUX_DATA_BADGE_LABEL_ENUM, String.valueOf(num));
            }
        }
        Short o13 = ((v) bVar.f123060c).o(pin);
        if (o13 != null) {
            contents.put("dl_ad_closeup_ingress_variant", String.valueOf((int) o13.shortValue()));
        }
        kg.a.a(contents, this.f95320a, this.f95330k, this.f95331l, this.f95325f, this.f95332m, this.f95333n, this.f95327h, this.f95326g, this.f95329j, this.f95336q, this.f95337r, this.f95338s);
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new HashMap(contents);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f95320a, tVar.f95320a) && this.f95321b == tVar.f95321b && this.f95322c == tVar.f95322c && this.f95323d == tVar.f95323d && this.f95324e == tVar.f95324e && Intrinsics.d(this.f95325f, tVar.f95325f) && this.f95326g == tVar.f95326g && this.f95327h == tVar.f95327h && Intrinsics.d(this.f95328i, tVar.f95328i) && this.f95329j == tVar.f95329j && this.f95330k == tVar.f95330k && this.f95331l == tVar.f95331l && Intrinsics.d(this.f95332m, tVar.f95332m) && Intrinsics.d(this.f95333n, tVar.f95333n) && Intrinsics.d(this.f95334o, tVar.f95334o) && this.f95335p == tVar.f95335p && this.f95336q == tVar.f95336q && Intrinsics.d(this.f95337r, tVar.f95337r) && Intrinsics.d(this.f95338s, tVar.f95338s) && Intrinsics.d(this.f95339t, tVar.f95339t) && this.f95340u == tVar.f95340u && this.f95341v == tVar.f95341v;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f95324e, ep.b.e(this.f95323d, ep.b.e(this.f95322c, ep.b.b(this.f95321b, this.f95320a.hashCode() * 31, 31), 31), 31), 31);
        Integer num = this.f95325f;
        int e13 = ep.b.e(this.f95331l, ep.b.e(this.f95330k, ep.b.b(this.f95329j, a.c.e(this.f95328i.f92450a, ep.b.e(this.f95327h, ep.b.b(this.f95326g, (b13 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.f95332m;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f95333n;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        HashMap hashMap = this.f95334o;
        return Boolean.hashCode(this.f95341v) + ep.b.e(this.f95340u, (this.f95339t.hashCode() + ((this.f95338s.hashCode() + ((this.f95337r.hashCode() + ep.b.b(this.f95336q, ep.b.e(this.f95335p, (hashCode2 + (hashMap != null ? hashMap.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinRepAuxData(pin=");
        sb3.append(this.f95320a);
        sb3.append(", pinPosition=");
        sb3.append(this.f95321b);
        sb3.append(", hasPinChips=");
        sb3.append(this.f95322c);
        sb3.append(", usePinIdForTapAuxData=");
        sb3.append(this.f95323d);
        sb3.append(", collectionSelectedPosition=");
        sb3.append(this.f95324e);
        sb3.append(", indexWithinAOM=");
        sb3.append(this.f95325f);
        sb3.append(", columnIndex=");
        sb3.append(this.f95326g);
        sb3.append(", shouldRegisterAttributionSourceEvent=");
        sb3.append(this.f95327h);
        sb3.append(", commerceData=");
        sb3.append(this.f95328i);
        sb3.append(", gridCount=");
        sb3.append(this.f95329j);
        sb3.append(", isInAdsOnlyModule=");
        sb3.append(this.f95330k);
        sb3.append(", isInStlModule=");
        sb3.append(this.f95331l);
        sb3.append(", storyType=");
        sb3.append(this.f95332m);
        sb3.append(", isMultipleAdvertiser=");
        sb3.append(this.f95333n);
        sb3.append(", viewAuxDataSeed=");
        sb3.append(this.f95334o);
        sb3.append(", isDLCollectionEnabled=");
        sb3.append(this.f95335p);
        sb3.append(", lastIndexForPin=");
        sb3.append(this.f95336q);
        sb3.append(", adFormats=");
        sb3.append(this.f95337r);
        sb3.append(", pinAuxHelper=");
        sb3.append(this.f95338s);
        sb3.append(", adsDependencies=");
        sb3.append(this.f95339t);
        sb3.append(", shouldLogPrice=");
        sb3.append(this.f95340u);
        sb3.append(", shouldLogRating=");
        return a.a.r(sb3, this.f95341v, ")");
    }
}
