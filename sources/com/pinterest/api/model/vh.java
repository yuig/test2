package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class vh implements dl1.s {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public i32.g0 G;
    public i32.q1 H;
    public i32.h1 I;

    /* renamed from: J */
    public i32.k1 f42842J;
    public i32.n1 K;
    public Map L;
    public List M;
    public Boolean N;
    public Map O;
    public i32.d0 P;
    public Boolean Q;
    public kj R;
    public HashMap S;
    public List T;
    public ya U;

    /* renamed from: a */
    public final Long f42843a;

    /* renamed from: b */
    @om.b("type")
    private String f42844b;

    /* renamed from: c */
    @om.b("id")
    private String f42845c;

    /* renamed from: d */
    @om.b("story_type")
    private String f42846d;

    /* renamed from: e */
    @om.b("is_promoted")
    private Boolean f42847e;

    /* renamed from: f */
    @om.b("aux_fields")
    private Map<String, Object> f42848f;

    /* renamed from: g */
    @om.b("custom_properties")
    private Map<String, Object> f42849g;

    /* renamed from: h */
    @om.b("shop_source")
    private String f42850h;

    /* renamed from: i */
    @om.b("tracking_params")
    private String f42851i;

    /* renamed from: j */
    public String f42852j;

    /* renamed from: k */
    public String f42853k;

    /* renamed from: l */
    public hh0.e f42854l;

    /* renamed from: m */
    public kj f42855m;

    /* renamed from: n */
    public kj f42856n;

    /* renamed from: o */
    public ih f42857o;

    /* renamed from: p */
    public kh f42858p;

    /* renamed from: q */
    public HashMap f42859q;

    /* renamed from: r */
    public wy0 f42860r;

    /* renamed from: s */
    public String f42861s;

    /* renamed from: t */
    public String f42862t;

    /* renamed from: u */
    public Map f42863u;

    /* renamed from: v */
    public boolean f42864v = false;

    /* renamed from: w */
    public List f42865w = new ArrayList();

    /* renamed from: x */
    public boolean f42866x;

    /* renamed from: y */
    public boolean f42867y;

    /* renamed from: z */
    public z32.m0 f42868z;

    public vh(String str) {
        this.f42845c = str;
    }

    public final boolean A() {
        return pk.a0.O(this.f42846d, "homefeed_branded_module") || K();
    }

    public final void A0(i32.d0 d0Var) {
        this.P = d0Var;
    }

    public final boolean B() {
        return pk.a0.O(this.f42846d, "search_3p_ad_only_module");
    }

    public final void B0(kj kjVar) {
        this.R = kjVar;
    }

    public final boolean C() {
        return pk.a0.O(this.f42846d, "related_pins_3p_ads_module_qcm");
    }

    public final void C0(String str) {
        this.f42853k = str;
    }

    public final boolean D() {
        String lowerCase = this.f42846d.toLowerCase();
        String lowerCase2 = "closeup_stl_3p_ads_only_module".toLowerCase();
        if (lowerCase == null || lowerCase2 == null) {
            return lowerCase == null && lowerCase2 == null;
        }
        if (lowerCase2.length() > lowerCase.length()) {
            return false;
        }
        return pk.a0.a1(0, lowerCase2.length(), lowerCase, lowerCase2, false);
    }

    public final void D0(hh0.e eVar) {
        this.f42854l = eVar;
    }

    public final boolean E() {
        return pk.a0.O(this.f42846d, "closeup_stl_3p_ads_only_module");
    }

    public final void E0(boolean z13) {
        this.f42866x = z13;
    }

    public final boolean F() {
        return pk.a0.O(this.f42846d, "search_1p_ad_only_module") || B() || pk.a0.O(this.f42846d, "search_branded_ads_only_module");
    }

    public final void F0(Boolean bool) {
        this.Q = bool;
    }

    public final boolean G() {
        return pk.a0.O(this.f42846d, "anket_inline_survey");
    }

    public final void G0(i32.q1 q1Var) {
        this.H = q1Var;
    }

    public final boolean H() {
        return pk.a0.O(this.f42846d, "search_articles_story");
    }

    public final void H0(String str) {
        this.D = str;
    }

    public final boolean I() {
        return pk.a0.O(this.f42846d, "automagical_boards");
    }

    public final void I0(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ni niVar = (ni) it.next();
            hashMap.put(niVar.a(), niVar);
        }
        this.S = hashMap;
    }

    public final boolean J() {
        return y() || pk.a0.O(this.f42846d, "homefeed_3p_boards_module");
    }

    public final void J0(Map map) {
        this.L = map;
    }

    public final boolean K() {
        return pk.a0.O(this.f42846d, "homefeed_branded_module_standard");
    }

    public final void K0(Boolean bool) {
        this.N = bool;
    }

    public final boolean L() {
        kh khVar;
        String str = this.f42846d;
        if (pk.a0.O(str, "bubble_one_col") || pk.a0.O(str, "q2pc_bubbles")) {
            return true;
        }
        if (this.f42868z == z32.m0.ITEM_GRID && (khVar = this.f42858p) != null) {
            if (khVar.l() != null && this.f42858p.l().intValue() == 1) {
                return true;
            }
            if (this.f42858p.q() != null && this.f42858p.q().getColumns() != null && this.f42858p.q().getColumns().intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void L0(String str) {
        this.f42861s = str;
    }

    public final boolean M() {
        return pk.a0.O(this.f42846d, "homefeed_deal_module");
    }

    public final void M0(String str) {
        this.f42846d = str;
    }

    public final boolean N() {
        return pk.a0.O(this.f42846d, "gold_standard");
    }

    public final void N0(i32.g0 g0Var) {
        this.G = g0Var;
    }

    public final boolean O() {
        return pk.a0.O(this.f42846d, "HAIR_PATTERN_FILTER_QUERIES");
    }

    public final void O0(i32.h1 h1Var) {
        this.I = h1Var;
    }

    public final boolean P() {
        return pk.a0.O(this.f42846d, "merchant_discovery");
    }

    public final void P0(i32.k1 k1Var) {
        this.f42842J = k1Var;
    }

    public final boolean Q() {
        return pk.a0.O(this.f42846d, "hashtag_pins_story");
    }

    public final void Q0(i32.n1 n1Var) {
        this.K = n1Var;
    }

    public final boolean R() {
        return pk.a0.O(this.f42846d, "grouped_pin_carousel_story");
    }

    public final void R0(String str) {
        this.f42851i = str;
    }

    public final boolean S() {
        return pk.a0.O(this.f42846d, "search_pinner_authority_hero");
    }

    public final void S0(String str) {
        this.f42844b = "story";
    }

    public final boolean T() {
        return pk.a0.O(this.f42846d, "pinner_authority");
    }

    public final void T0(String str) {
        this.f42845c = str;
    }

    public final boolean U() {
        return pk.a0.O(this.f42846d, "pinner_authority_unified");
    }

    public final void U0(wy0 wy0Var) {
        this.f42860r = wy0Var;
    }

    public final boolean V() {
        return pk.a0.O(this.f42846d, "homefeed_price_drop_module");
    }

    public final void V0(String str) {
        this.F = str;
    }

    public final boolean W() {
        return pk.a0.O(this.f42846d, "product_tagged_shopping_module_upsell");
    }

    public final void W0(String str) {
        this.E = str;
    }

    public final boolean X() {
        return pk.a0.O(this.f42846d, "related_searches");
    }

    public final boolean Y() {
        return pk.a0.O(this.f42846d, "related_searches_organic");
    }

    public final boolean Z() {
        return pk.a0.O(this.f42846d, "search_article_landing_page_header");
    }

    public final Map a() {
        return this.f42848f;
    }

    public final boolean a0() {
        return pk.a0.O(this.f42846d, "search_article_landing_page_more_ideas_header");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f42845c;
    }

    public final boolean b0() {
        return pk.a0.O(this.f42846d, "search_product_collage_story");
    }

    public final Map c() {
        return this.f42849g;
    }

    public final boolean c0() {
        return pk.a0.O(this.f42846d, "search_story_landing_page_header");
    }

    public final boolean d0() {
        return pk.a0.O(this.f42846d, "shopping_spotlight");
    }

    public final kh e() {
        return this.f42858p;
    }

    public final boolean e0() {
        return pk.a0.O(this.f42846d, "related_query_shop_upsell_search") || pk.a0.O(this.f42846d, "related_query_shop_upsell_closeup");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f42845c.equals(((vh) obj).f42845c);
    }

    public final boolean f0() {
        return pk.a0.O(this.f42846d, "SKIN_TONE_FILTER_QUERIES");
    }

    public final Map g() {
        return this.O;
    }

    public final boolean g0() {
        return pk.a0.O(this.f42846d, "slp_immersive_header");
    }

    public final String h() {
        return this.D;
    }

    public final boolean h0() {
        return pk.a0.O(this.f42846d, "slp_search_recommendation");
    }

    public final int hashCode() {
        return this.f42845c.hashCode();
    }

    public final boolean i0() {
        return pk.a0.O(this.f42846d, "story_pins_search_upsell");
    }

    public final List j() {
        return this.M;
    }

    public final boolean j0() {
        return pk.a0.O(this.f42846d, "structured_search_bubble");
    }

    public final Boolean k() {
        Boolean bool = this.f42847e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean k0() {
        return pk.a0.O(this.f42846d, "structured_search_section");
    }

    public final Map l() {
        return this.L;
    }

    public final boolean l0() {
        return pk.a0.O(this.f42846d, "style_pivot");
    }

    public final boolean m0() {
        return pk.a0.O(this.f42846d, "today_article_board_section_header");
    }

    public final String n() {
        return this.f42850h;
    }

    public final boolean n0() {
        return pk.a0.O(this.f42846d, "today_tab_search_upsell");
    }

    public final boolean o0() {
        return pk.a0.O(this.f42846d, "unified_visual_feed_product_upsell") || pk.a0.O(this.f42846d, "unified_visual_feed_organic_header") || pk.a0.O(this.f42846d, "unified_entry_point_flashlight_header") || pk.a0.O(this.f42846d, "stela_shop");
    }

    public final boolean p0() {
        return pk.a0.O(this.f42846d, "user_style_story_v2");
    }

    public final String q() {
        return this.f42846d;
    }

    public final boolean q0() {
        return pk.a0.O(this.f42846d, "virtual_try_on_explore");
    }

    public final boolean r0() {
        return pk.a0.O(this.f42846d, "virtual_try_on_shop");
    }

    public final b42.c s() {
        Map<String, Object> map = this.f42848f;
        if (map == null || !map.containsKey("pattern") || this.f42848f.get("pattern") == null) {
            return null;
        }
        Object obj = this.f42848f.get("pattern");
        return b42.c.findByValue(obj instanceof Double ? ((Double) obj).intValue() : -1);
    }

    public final boolean s0() {
        return pk.a0.O(this.f42846d, "video_pins_story");
    }

    public final boolean t0() {
        return pk.a0.O(this.f42846d, "virtual_try_on_upsell_story");
    }

    public final String u() {
        return this.f42851i;
    }

    public final boolean u0() {
        return pk.a0.O(this.f42846d, "virtual_try_on_upsell_video_story");
    }

    public final String v() {
        return this.f42844b;
    }

    public final boolean v0() {
        return pk.a0.O(this.f42846d, "wishlist_category_bubbles");
    }

    public final String w() {
        return this.F;
    }

    public final void w0(ih ihVar) {
        this.f42857o = ihVar;
    }

    public final boolean x() {
        return pk.a0.O(this.f42846d, "related_pins_1p_ads_module");
    }

    public final void x0(String str) {
        this.B = str;
    }

    public final boolean y() {
        return pk.a0.O(this.f42846d, "homefeed_1p_boards_module");
    }

    public final void y0(String str) {
        this.C = str;
    }

    public final boolean z() {
        return pk.a0.O(this.f42846d, "related_pins_3p_ads_module");
    }

    public final void z0(ya yaVar) {
        this.U = yaVar;
    }

    public vh(Long l13) {
        this.f42843a = l13;
    }

    public vh() {
    }
}
