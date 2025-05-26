package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class g {

    @om.b("is_webview_ad")
    private Boolean A;

    @om.b("is_weight_loss_ad")
    private Boolean B;

    @om.b("link_info")
    private gu C;

    @om.b("media_type")
    private Integer D;

    @om.b("pinner_geolocation")
    private g60 E;

    @om.b("shopping_integration_type")
    private Integer F;

    @om.b("show_price")
    private Boolean G;

    @om.b("show_rating")
    private Boolean H;

    @om.b("third_party")
    private r I;

    /* renamed from: J, reason: collision with root package name */
    @om.b("third_party_v2")
    private fu0 f37860J;
    public final boolean[] K;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37861a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37862b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("ad_format_modularization_experiment_platform")
    private Integer f37863c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("adapter")
    private k f37864d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("attribution_style")
    private Integer f37865e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("badge_content_items")
    private List<bu0> f37866f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("badge_item")
    private e7 f37867g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("campaign_objective_type")
    private a f37868h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("carousel_scroll_animation")
    private Integer f37869i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("ce_alt_image_signature")
    private String f37870j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("closeup_type")
    private Integer f37871k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("collection_grid_click_type")
    private Integer f37872l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("contextual_params")
    private pe f37873m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("creative_type")
    private Integer f37874n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("custom_grid_configuration")
    private Map<String, Object> f37875o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("description_header")
    private String f37876p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("destination_type")
    private Integer f37877q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("disclosure_label")
    private String f37878r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("disclosure_url")
    private String f37879s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("dl_ad_closeup_ingress_variant")
    private b f37880t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("dpa_variant_id")
    private String f37881u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("exclude_from_grid_rep_tests")
    private Boolean f37882v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("grid_click_type")
    private Integer f37883w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("grid_cta_data")
    private ln f37884x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("is_collage_single_destination")
    private Boolean f37885y;

    /* renamed from: z, reason: collision with root package name */
    @om.b("is_native_browser_eligible")
    private Boolean f37886z;

    public enum a {
        AWARENESS(1),
        TRAFFIC(2),
        ENGAGEMENT(3),
        CHECKOUT(4),
        APP_INSTALL(5),
        VIDEO_VIEW(6),
        BOARD_ENGAGEMENT(7),
        AWARENESS_RESERVED(8),
        ONSITE_RETARGETING(9),
        AWARENESS_PREMIUM_RESERVED(10),
        WEB_CONVERSION(11),
        CONVERSIONS(12),
        CATALOG_SALES(13),
        WEB_SESSIONS(14),
        LEAD_GENERATION(15),
        VIDEO_COMPLETION(16);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum b {
        INELIGIBLE(0),
        CONTROL(1),
        ENABLED_FLICKER(2),
        ENABLED_OVERLAY(3),
        CONTROL_EXPANSION(4),
        ENABLED_EXPANSION_OVERLAY(5),
        ENABLED_EXPANSION_ICON(6);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ g(String str, String str2, Integer num, k kVar, Integer num2, List list, e7 e7Var, a aVar, Integer num3, String str3, Integer num4, Integer num5, pe peVar, Integer num6, Map map, String str4, Integer num7, String str5, String str6, b bVar, String str7, Boolean bool, Integer num8, ln lnVar, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, gu guVar, Integer num9, g60 g60Var, Integer num10, Boolean bool6, Boolean bool7, r rVar, fu0 fu0Var, boolean[] zArr, int i13) {
        this(str, str2, num, kVar, num2, list, e7Var, aVar, num3, str3, num4, num5, peVar, num6, map, str4, num7, str5, str6, bVar, str7, bool, num8, lnVar, bool2, bool3, bool4, bool5, guVar, num9, g60Var, num10, bool6, bool7, rVar, fu0Var, zArr);
    }

    public final Integer K() {
        Integer num = this.f37863c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final k L() {
        return this.f37864d;
    }

    public final Integer M() {
        Integer num = this.f37865e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List N() {
        return this.f37866f;
    }

    public final e7 O() {
        return this.f37867g;
    }

    public final a P() {
        return this.f37868h;
    }

    public final Integer Q() {
        Integer num = this.f37869i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String R() {
        return this.f37870j;
    }

    public final Integer S() {
        Integer num = this.f37871k;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer T() {
        Integer num = this.f37872l;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final pe U() {
        return this.f37873m;
    }

    public final Integer V() {
        Integer num = this.f37874n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map W() {
        return this.f37875o;
    }

    public final Integer X() {
        Integer num = this.f37877q;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String Y() {
        return this.f37878r;
    }

    public final String Z() {
        return this.f37879s;
    }

    public final b a0() {
        return this.f37880t;
    }

    public final String b0() {
        return this.f37881u;
    }

    public final Boolean c0() {
        Boolean bool = this.f37882v;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer d0() {
        Integer num = this.f37883w;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final ln e0() {
        return this.f37884x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.H, gVar.H) && Objects.equals(this.G, gVar.G) && Objects.equals(this.F, gVar.F) && Objects.equals(this.D, gVar.D) && Objects.equals(this.B, gVar.B) && Objects.equals(this.A, gVar.A) && Objects.equals(this.f37886z, gVar.f37886z) && Objects.equals(this.f37885y, gVar.f37885y) && Objects.equals(this.f37883w, gVar.f37883w) && Objects.equals(this.f37882v, gVar.f37882v) && Objects.equals(this.f37880t, gVar.f37880t) && Objects.equals(this.f37877q, gVar.f37877q) && Objects.equals(this.f37874n, gVar.f37874n) && Objects.equals(this.f37872l, gVar.f37872l) && Objects.equals(this.f37871k, gVar.f37871k) && Objects.equals(this.f37869i, gVar.f37869i) && Objects.equals(this.f37868h, gVar.f37868h) && Objects.equals(this.f37865e, gVar.f37865e) && Objects.equals(this.f37863c, gVar.f37863c) && Objects.equals(this.f37861a, gVar.f37861a) && Objects.equals(this.f37862b, gVar.f37862b) && Objects.equals(this.f37864d, gVar.f37864d) && Objects.equals(this.f37866f, gVar.f37866f) && Objects.equals(this.f37867g, gVar.f37867g) && Objects.equals(this.f37870j, gVar.f37870j) && Objects.equals(this.f37873m, gVar.f37873m) && Objects.equals(this.f37875o, gVar.f37875o) && Objects.equals(this.f37876p, gVar.f37876p) && Objects.equals(this.f37878r, gVar.f37878r) && Objects.equals(this.f37879s, gVar.f37879s) && Objects.equals(this.f37881u, gVar.f37881u) && Objects.equals(this.f37884x, gVar.f37884x) && Objects.equals(this.C, gVar.C) && Objects.equals(this.E, gVar.E) && Objects.equals(this.I, gVar.I) && Objects.equals(this.f37860J, gVar.f37860J);
    }

    public final Boolean f0() {
        Boolean bool = this.f37885y;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean g0() {
        Boolean bool = this.f37886z;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean h0() {
        Boolean bool = this.A;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final int hashCode() {
        return Objects.hash(this.f37861a, this.f37862b, this.f37863c, this.f37864d, this.f37865e, this.f37866f, this.f37867g, this.f37868h, this.f37869i, this.f37870j, this.f37871k, this.f37872l, this.f37873m, this.f37874n, this.f37875o, this.f37876p, this.f37877q, this.f37878r, this.f37879s, this.f37880t, this.f37881u, this.f37882v, this.f37883w, this.f37884x, this.f37885y, this.f37886z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f37860J);
    }

    public final Boolean i0() {
        Boolean bool = this.B;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final g60 j0() {
        return this.E;
    }

    public final Integer k0() {
        Integer num = this.F;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean l0() {
        Boolean bool = this.G;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean m0() {
        Boolean bool = this.H;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final r n0() {
        return this.I;
    }

    public final fu0 o0() {
        return this.f37860J;
    }

    public g() {
        this.K = new boolean[36];
    }

    private g(@NonNull String str, String str2, Integer num, k kVar, Integer num2, List<bu0> list, e7 e7Var, a aVar, Integer num3, String str3, Integer num4, Integer num5, pe peVar, Integer num6, Map<String, Object> map, String str4, Integer num7, String str5, String str6, b bVar, String str7, Boolean bool, Integer num8, ln lnVar, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, gu guVar, Integer num9, g60 g60Var, Integer num10, Boolean bool6, Boolean bool7, r rVar, fu0 fu0Var, boolean[] zArr) {
        this.f37861a = str;
        this.f37862b = str2;
        this.f37863c = num;
        this.f37864d = kVar;
        this.f37865e = num2;
        this.f37866f = list;
        this.f37867g = e7Var;
        this.f37868h = aVar;
        this.f37869i = num3;
        this.f37870j = str3;
        this.f37871k = num4;
        this.f37872l = num5;
        this.f37873m = peVar;
        this.f37874n = num6;
        this.f37875o = map;
        this.f37876p = str4;
        this.f37877q = num7;
        this.f37878r = str5;
        this.f37879s = str6;
        this.f37880t = bVar;
        this.f37881u = str7;
        this.f37882v = bool;
        this.f37883w = num8;
        this.f37884x = lnVar;
        this.f37885y = bool2;
        this.f37886z = bool3;
        this.A = bool4;
        this.B = bool5;
        this.C = guVar;
        this.D = num9;
        this.E = g60Var;
        this.F = num10;
        this.G = bool6;
        this.H = bool7;
        this.I = rVar;
        this.f37860J = fu0Var;
        this.K = zArr;
    }
}
