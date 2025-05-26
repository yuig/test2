package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class v7 implements dl1.s {

    @om.b("has_active_ads")
    private Boolean A;

    @om.b("has_custom_cover")
    private Boolean B;

    @om.b("has_fresh_more_ideas_tab")
    private Boolean C;

    @om.b("has_new_activity")
    private Boolean D;

    @om.b("header")
    private e8 E;

    @om.b("image_cover_hd_url")
    private String F;

    @om.b("image_cover_url")
    private String G;

    @om.b("image_thumbnail_url")
    private String H;

    @om.b("image_thumbnail_urls")
    private Map<String, String> I;

    /* renamed from: J */
    @om.b("images")
    private Map<String, List<sr>> f42736J;

    @om.b("interests")
    private List<zs> K;

    @om.b("is_ads_only")
    private Boolean L;

    @om.b("is_collaborative")
    private Boolean M;

    @om.b("is_eligible_for_homefeed_tabs")
    private Boolean N;

    @om.b("is_eligible_for_seasonal_share_treatment")
    private Boolean O;

    @om.b("is_featured_for_active_campaign")
    private Boolean P;

    @om.b("layout")
    private String Q;

    @NonNull
    @om.b("name")
    private String R;

    @om.b("owner")
    private wy0 S;

    @om.b("pear_insights_count")
    private Integer T;

    @om.b("pin_count")
    private Integer U;

    @om.b("pin_thumbnail_urls")
    private List<String> V;

    @om.b("privacy")
    private String W;

    @om.b("recommendation_reason")
    private String X;

    @om.b("section_count")
    private Integer Y;

    @om.b("sectionless_pin_count")
    private Integer Z;

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f42737a;

    /* renamed from: a0 */
    @om.b("sensitivity")
    private lh0 f42738a0;

    /* renamed from: b */
    @om.b("node_id")
    private String f42739b;

    /* renamed from: b0 */
    @om.b("sensitivity_screen")
    private ph0 f42740b0;

    /* renamed from: c */
    @om.b("action")
    private dk0 f42741c;

    /* renamed from: c0 */
    @om.b("should_show_board_collaborators")
    private Boolean f42742c0;

    /* renamed from: d */
    @om.b("allow_homefeed_recommendations")
    private Boolean f42743d;

    /* renamed from: d0 */
    @om.b("should_show_more_ideas")
    private Boolean f42744d0;

    /* renamed from: e */
    @om.b("archived_by_me_at")
    private Date f42745e;

    /* renamed from: e0 */
    @om.b("should_show_shop_feed")
    private Boolean f42746e0;

    /* renamed from: f */
    @om.b("automagical_board_metadata")
    private c7 f42747f;

    /* renamed from: f0 */
    @om.b("subscribed_to_notifications")
    private Boolean f42748f0;

    /* renamed from: g */
    @om.b("blocking_actions")
    private List<lb> f42749g;

    /* renamed from: g0 */
    @om.b("suggestion_confidence")
    private Double f42750g0;

    /* renamed from: h */
    @om.b("board_note_count")
    private Integer f42751h;

    /* renamed from: h0 */
    @om.b("suggestion_title_id")
    private Double f42752h0;

    /* renamed from: i */
    @om.b("board_order_modified_at")
    private Date f42753i;

    /* renamed from: i0 */
    @om.b("suggestion_type")
    private String f42754i0;

    /* renamed from: j */
    @om.b("board_owner_has_active_ads")
    private Boolean f42755j;

    /* renamed from: j0 */
    @om.b("tracking_params")
    private String f42756j0;

    /* renamed from: k */
    @om.b("category")
    private String f42757k;

    /* renamed from: k0 */
    @om.b("url")
    private String f42758k0;

    /* renamed from: l */
    @om.b("collaborated_by_me")
    private Boolean f42759l;

    /* renamed from: l0 */
    @om.b("viewer_collaborator_join_requested")
    private Boolean f42760l0;

    /* renamed from: m */
    @om.b("collaborating_users")
    private List<wy0> f42761m;

    /* renamed from: m0 */
    @om.b("viewer_contact_request")
    private ke f42762m0;

    /* renamed from: n */
    @om.b("collaborator_count")
    private Integer f42763n;

    /* renamed from: n0 */
    public final boolean[] f42764n0;

    /* renamed from: o */
    @om.b("collaborator_invites_enabled")
    private Boolean f42765o;

    /* renamed from: p */
    @om.b("collaborator_permissions")
    private List<Integer> f42766p;

    /* renamed from: q */
    @om.b("collaborator_permissions_setting")
    private Integer f42767q;

    /* renamed from: r */
    @om.b("collaborator_requests_enabled")
    private Boolean f42768r;

    /* renamed from: s */
    @om.b("cover_images")
    private Map<String, sr> f42769s;

    /* renamed from: t */
    @om.b("created_at")
    private Date f42770t;

    /* renamed from: u */
    @om.b("description")
    private String f42771u;

    /* renamed from: v */
    @om.b("eligible_pin_type_filters")
    private List<b60> f42772v;

    /* renamed from: w */
    @om.b("featured_board_metadata")
    private cl f42773w;

    /* renamed from: x */
    @om.b("featured_in")
    private List<String> f42774x;

    /* renamed from: y */
    @om.b("followed_by_me")
    private Boolean f42775y;

    /* renamed from: z */
    @om.b("follower_count")
    private Integer f42776z;

    public /* synthetic */ v7(String str, String str2, dk0 dk0Var, Boolean bool, Date date, c7 c7Var, List list, Integer num, Date date2, Boolean bool2, String str3, Boolean bool3, List list2, Integer num2, Boolean bool4, List list3, Integer num3, Boolean bool5, Map map, Date date3, String str4, List list4, cl clVar, List list5, Boolean bool6, Integer num4, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, e8 e8Var, String str5, String str6, String str7, Map map2, Map map3, List list6, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, String str8, String str9, wy0 wy0Var, Integer num5, Integer num6, List list7, String str10, String str11, Integer num7, Integer num8, lh0 lh0Var, ph0 ph0Var, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Double d2, Double d13, String str12, String str13, String str14, Boolean bool20, ke keVar, boolean[] zArr, int i13) {
        this(str, str2, dk0Var, bool, date, c7Var, list, num, date2, bool2, str3, bool3, list2, num2, bool4, list3, num3, bool5, map, date3, str4, list4, clVar, list5, bool6, num4, bool7, bool8, bool9, bool10, e8Var, str5, str6, str7, map2, map3, list6, bool11, bool12, bool13, bool14, bool15, str8, str9, wy0Var, num5, num6, list7, str10, str11, num7, num8, lh0Var, ph0Var, bool16, bool17, bool18, bool19, d2, d13, str12, str13, str14, bool20, keVar, zArr);
    }

    public static u7 x0() {
        return new u7(0);
    }

    public final Date A0() {
        return this.f42745e;
    }

    public final String A1() {
        return this.f42754i0;
    }

    public final c7 B0() {
        return this.f42747f;
    }

    public final String B1() {
        return this.f42756j0;
    }

    public final List C0() {
        return this.f42749g;
    }

    public final String C1() {
        return this.f42758k0;
    }

    public final Date D0() {
        return this.f42753i;
    }

    public final Boolean D1() {
        Boolean bool = this.f42760l0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean E0() {
        Boolean bool = this.f42755j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final ke E1() {
        return this.f42762m0;
    }

    public final String F0() {
        return this.f42757k;
    }

    public final v7 F1(v7 v7Var) {
        if (this == v7Var) {
            return this;
        }
        u7 G1 = G1();
        boolean[] zArr = v7Var.f42764n0;
        int length = zArr.length;
        boolean[] zArr2 = G1.f42452n0;
        if (length > 0 && zArr[0]) {
            G1.f42425a = v7Var.f42737a;
            zArr2[0] = true;
        }
        boolean[] zArr3 = v7Var.f42764n0;
        if (zArr3.length > 1 && zArr3[1]) {
            G1.f42427b = v7Var.f42739b;
            zArr2[1] = true;
        }
        if (zArr3.length > 2 && zArr3[2]) {
            G1.f42429c = v7Var.f42741c;
            zArr2[2] = true;
        }
        if (zArr3.length > 3 && zArr3[3]) {
            G1.f42431d = v7Var.f42743d;
            zArr2[3] = true;
        }
        if (zArr3.length > 4 && zArr3[4]) {
            G1.f42433e = v7Var.f42745e;
            zArr2[4] = true;
        }
        if (zArr3.length > 5 && zArr3[5]) {
            G1.f42435f = v7Var.f42747f;
            zArr2[5] = true;
        }
        if (zArr3.length > 6 && zArr3[6]) {
            G1.f42437g = v7Var.f42749g;
            zArr2[6] = true;
        }
        if (zArr3.length > 7 && zArr3[7]) {
            G1.f42439h = v7Var.f42751h;
            zArr2[7] = true;
        }
        if (zArr3.length > 8 && zArr3[8]) {
            G1.f42441i = v7Var.f42753i;
            zArr2[8] = true;
        }
        if (zArr3.length > 9 && zArr3[9]) {
            G1.f42443j = v7Var.f42755j;
            zArr2[9] = true;
        }
        if (zArr3.length > 10 && zArr3[10]) {
            G1.f42445k = v7Var.f42757k;
            zArr2[10] = true;
        }
        if (zArr3.length > 11 && zArr3[11]) {
            G1.f42447l = v7Var.f42759l;
            zArr2[11] = true;
        }
        if (zArr3.length > 12 && zArr3[12]) {
            G1.f42449m = v7Var.f42761m;
            zArr2[12] = true;
        }
        if (zArr3.length > 13 && zArr3[13]) {
            G1.f42451n = v7Var.f42763n;
            zArr2[13] = true;
        }
        if (zArr3.length > 14 && zArr3[14]) {
            G1.f42453o = v7Var.f42765o;
            zArr2[14] = true;
        }
        if (zArr3.length > 15 && zArr3[15]) {
            G1.f42454p = v7Var.f42766p;
            zArr2[15] = true;
        }
        if (zArr3.length > 16 && zArr3[16]) {
            G1.f42455q = v7Var.f42767q;
            zArr2[16] = true;
        }
        if (zArr3.length > 17 && zArr3[17]) {
            G1.f42456r = v7Var.f42768r;
            zArr2[17] = true;
        }
        if (zArr3.length > 18 && zArr3[18]) {
            G1.f42457s = v7Var.f42769s;
            zArr2[18] = true;
        }
        if (zArr3.length > 19 && zArr3[19]) {
            G1.f42458t = v7Var.f42770t;
            zArr2[19] = true;
        }
        if (zArr3.length > 20 && zArr3[20]) {
            G1.f42459u = v7Var.f42771u;
            zArr2[20] = true;
        }
        if (zArr3.length > 21 && zArr3[21]) {
            G1.f42460v = v7Var.f42772v;
            zArr2[21] = true;
        }
        if (zArr3.length > 22 && zArr3[22]) {
            G1.f42461w = v7Var.f42773w;
            zArr2[22] = true;
        }
        if (zArr3.length > 23 && zArr3[23]) {
            G1.f42462x = v7Var.f42774x;
            zArr2[23] = true;
        }
        if (zArr3.length > 24 && zArr3[24]) {
            G1.f42463y = v7Var.f42775y;
            zArr2[24] = true;
        }
        if (zArr3.length > 25 && zArr3[25]) {
            G1.f42464z = v7Var.f42776z;
            zArr2[25] = true;
        }
        if (zArr3.length > 26 && zArr3[26]) {
            G1.A = v7Var.A;
            zArr2[26] = true;
        }
        if (zArr3.length > 27 && zArr3[27]) {
            G1.B = v7Var.B;
            zArr2[27] = true;
        }
        if (zArr3.length > 28 && zArr3[28]) {
            G1.C = v7Var.C;
            zArr2[28] = true;
        }
        if (zArr3.length > 29 && zArr3[29]) {
            G1.D = v7Var.D;
            zArr2[29] = true;
        }
        if (zArr3.length > 30 && zArr3[30]) {
            G1.E = v7Var.E;
            zArr2[30] = true;
        }
        if (zArr3.length > 31 && zArr3[31]) {
            G1.F = v7Var.F;
            zArr2[31] = true;
        }
        if (zArr3.length > 32 && zArr3[32]) {
            G1.G = v7Var.G;
            zArr2[32] = true;
        }
        if (zArr3.length > 33 && zArr3[33]) {
            G1.H = v7Var.H;
            zArr2[33] = true;
        }
        if (zArr3.length > 34 && zArr3[34]) {
            G1.I = v7Var.I;
            zArr2[34] = true;
        }
        if (zArr3.length > 35 && zArr3[35]) {
            G1.f42424J = v7Var.f42736J;
            zArr2[35] = true;
        }
        if (zArr3.length > 36 && zArr3[36]) {
            G1.K = v7Var.K;
            zArr2[36] = true;
        }
        if (zArr3.length > 37 && zArr3[37]) {
            G1.L = v7Var.L;
            zArr2[37] = true;
        }
        if (zArr3.length > 38 && zArr3[38]) {
            G1.M = v7Var.M;
            zArr2[38] = true;
        }
        if (zArr3.length > 39 && zArr3[39]) {
            G1.N = v7Var.N;
            zArr2[39] = true;
        }
        if (zArr3.length > 40 && zArr3[40]) {
            G1.O = v7Var.O;
            zArr2[40] = true;
        }
        if (zArr3.length > 41 && zArr3[41]) {
            G1.P = v7Var.P;
            zArr2[41] = true;
        }
        if (zArr3.length > 42 && zArr3[42]) {
            G1.Q = v7Var.Q;
            zArr2[42] = true;
        }
        if (zArr3.length > 43 && zArr3[43]) {
            G1.R = v7Var.R;
            zArr2[43] = true;
        }
        if (zArr3.length > 44 && zArr3[44]) {
            G1.S = v7Var.S;
            zArr2[44] = true;
        }
        if (zArr3.length > 45 && zArr3[45]) {
            G1.T = v7Var.T;
            zArr2[45] = true;
        }
        if (zArr3.length > 46 && zArr3[46]) {
            G1.U = v7Var.U;
            zArr2[46] = true;
        }
        if (zArr3.length > 47 && zArr3[47]) {
            G1.V = v7Var.V;
            zArr2[47] = true;
        }
        if (zArr3.length > 48 && zArr3[48]) {
            G1.W = v7Var.W;
            zArr2[48] = true;
        }
        if (zArr3.length > 49 && zArr3[49]) {
            G1.X = v7Var.X;
            zArr2[49] = true;
        }
        if (zArr3.length > 50 && zArr3[50]) {
            G1.Y = v7Var.Y;
            zArr2[50] = true;
        }
        if (zArr3.length > 51 && zArr3[51]) {
            G1.Z = v7Var.Z;
            zArr2[51] = true;
        }
        if (zArr3.length > 52 && zArr3[52]) {
            G1.f42426a0 = v7Var.f42738a0;
            zArr2[52] = true;
        }
        if (zArr3.length > 53 && zArr3[53]) {
            G1.f42428b0 = v7Var.f42740b0;
            zArr2[53] = true;
        }
        if (zArr3.length > 54 && zArr3[54]) {
            G1.f42430c0 = v7Var.f42742c0;
            zArr2[54] = true;
        }
        if (zArr3.length > 55 && zArr3[55]) {
            G1.f42432d0 = v7Var.f42744d0;
            zArr2[55] = true;
        }
        if (zArr3.length > 56 && zArr3[56]) {
            G1.f42434e0 = v7Var.f42746e0;
            zArr2[56] = true;
        }
        if (zArr3.length > 57 && zArr3[57]) {
            G1.f42436f0 = v7Var.f42748f0;
            zArr2[57] = true;
        }
        if (zArr3.length > 58 && zArr3[58]) {
            G1.f42438g0 = v7Var.f42750g0;
            zArr2[58] = true;
        }
        if (zArr3.length > 59 && zArr3[59]) {
            G1.f42440h0 = v7Var.f42752h0;
            zArr2[59] = true;
        }
        if (zArr3.length > 60 && zArr3[60]) {
            G1.f42442i0 = v7Var.f42754i0;
            zArr2[60] = true;
        }
        if (zArr3.length > 61 && zArr3[61]) {
            G1.f42444j0 = v7Var.f42756j0;
            zArr2[61] = true;
        }
        if (zArr3.length > 62 && zArr3[62]) {
            G1.f42446k0 = v7Var.f42758k0;
            zArr2[62] = true;
        }
        if (zArr3.length > 63 && zArr3[63]) {
            G1.f42448l0 = v7Var.f42760l0;
            zArr2[63] = true;
        }
        if (zArr3.length > 64 && zArr3[64]) {
            G1.f42450m0 = v7Var.f42762m0;
            zArr2[64] = true;
        }
        return G1.a();
    }

    public final Boolean G0() {
        Boolean bool = this.f42759l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final u7 G1() {
        return new u7(this, 0);
    }

    public final boolean H0() {
        boolean[] zArr = this.f42764n0;
        return zArr.length > 11 && zArr[11];
    }

    public final List I0() {
        return this.f42761m;
    }

    public final Integer J0() {
        Integer num = this.f42763n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean K0() {
        Boolean bool = this.f42765o;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List L0() {
        return this.f42766p;
    }

    public final boolean M0() {
        boolean[] zArr = this.f42764n0;
        return zArr.length > 15 && zArr[15];
    }

    public final Integer N0() {
        Integer num = this.f42767q;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean O0() {
        boolean[] zArr = this.f42764n0;
        return zArr.length > 16 && zArr[16];
    }

    public final Boolean P0() {
        Boolean bool = this.f42768r;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Map Q0() {
        return this.f42769s;
    }

    public final String R0() {
        return this.f42771u;
    }

    public final List S0() {
        return this.f42772v;
    }

    public final cl T0() {
        return this.f42773w;
    }

    public final List U0() {
        return this.f42774x;
    }

    public final Boolean V0() {
        Boolean bool = this.f42775y;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer W0() {
        Integer num = this.f42776z;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean X0() {
        Boolean bool = this.A;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean Y0() {
        Boolean bool = this.B;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final e8 Z0() {
        return this.E;
    }

    public final String a1() {
        return this.F;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f42737a;
    }

    public final String b1() {
        return this.G;
    }

    public final String c1() {
        return this.H;
    }

    public final Map d1() {
        return this.f42736J;
    }

    public final List e1() {
        return this.K;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return Objects.equals(this.f42760l0, v7Var.f42760l0) && Objects.equals(this.f42752h0, v7Var.f42752h0) && Objects.equals(this.f42750g0, v7Var.f42750g0) && Objects.equals(this.f42748f0, v7Var.f42748f0) && Objects.equals(this.f42746e0, v7Var.f42746e0) && Objects.equals(this.f42744d0, v7Var.f42744d0) && Objects.equals(this.f42742c0, v7Var.f42742c0) && Objects.equals(this.Z, v7Var.Z) && Objects.equals(this.Y, v7Var.Y) && Objects.equals(this.U, v7Var.U) && Objects.equals(this.T, v7Var.T) && Objects.equals(this.P, v7Var.P) && Objects.equals(this.O, v7Var.O) && Objects.equals(this.N, v7Var.N) && Objects.equals(this.M, v7Var.M) && Objects.equals(this.L, v7Var.L) && Objects.equals(this.D, v7Var.D) && Objects.equals(this.C, v7Var.C) && Objects.equals(this.B, v7Var.B) && Objects.equals(this.A, v7Var.A) && Objects.equals(this.f42776z, v7Var.f42776z) && Objects.equals(this.f42775y, v7Var.f42775y) && Objects.equals(this.f42768r, v7Var.f42768r) && Objects.equals(this.f42767q, v7Var.f42767q) && Objects.equals(this.f42765o, v7Var.f42765o) && Objects.equals(this.f42763n, v7Var.f42763n) && Objects.equals(this.f42759l, v7Var.f42759l) && Objects.equals(this.f42755j, v7Var.f42755j) && Objects.equals(this.f42751h, v7Var.f42751h) && Objects.equals(this.f42743d, v7Var.f42743d) && Objects.equals(this.f42737a, v7Var.f42737a) && Objects.equals(this.f42739b, v7Var.f42739b) && Objects.equals(this.f42741c, v7Var.f42741c) && Objects.equals(this.f42745e, v7Var.f42745e) && Objects.equals(this.f42747f, v7Var.f42747f) && Objects.equals(this.f42749g, v7Var.f42749g) && Objects.equals(this.f42753i, v7Var.f42753i) && Objects.equals(this.f42757k, v7Var.f42757k) && Objects.equals(this.f42761m, v7Var.f42761m) && Objects.equals(this.f42766p, v7Var.f42766p) && Objects.equals(this.f42769s, v7Var.f42769s) && Objects.equals(this.f42770t, v7Var.f42770t) && Objects.equals(this.f42771u, v7Var.f42771u) && Objects.equals(this.f42772v, v7Var.f42772v) && Objects.equals(this.f42773w, v7Var.f42773w) && Objects.equals(this.f42774x, v7Var.f42774x) && Objects.equals(this.E, v7Var.E) && Objects.equals(this.F, v7Var.F) && Objects.equals(this.G, v7Var.G) && Objects.equals(this.H, v7Var.H) && Objects.equals(this.I, v7Var.I) && Objects.equals(this.f42736J, v7Var.f42736J) && Objects.equals(this.K, v7Var.K) && Objects.equals(this.Q, v7Var.Q) && Objects.equals(this.R, v7Var.R) && Objects.equals(this.S, v7Var.S) && Objects.equals(this.V, v7Var.V) && Objects.equals(this.W, v7Var.W) && Objects.equals(this.X, v7Var.X) && Objects.equals(this.f42738a0, v7Var.f42738a0) && Objects.equals(this.f42740b0, v7Var.f42740b0) && Objects.equals(this.f42754i0, v7Var.f42754i0) && Objects.equals(this.f42756j0, v7Var.f42756j0) && Objects.equals(this.f42758k0, v7Var.f42758k0) && Objects.equals(this.f42762m0, v7Var.f42762m0);
    }

    public final Boolean f1() {
        Boolean bool = this.L;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean g1() {
        Boolean bool = this.M;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean h1() {
        Boolean bool = this.P;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final int hashCode() {
        return Objects.hash(this.f42737a, this.f42739b, this.f42741c, this.f42743d, this.f42745e, this.f42747f, this.f42749g, this.f42751h, this.f42753i, this.f42755j, this.f42757k, this.f42759l, this.f42761m, this.f42763n, this.f42765o, this.f42766p, this.f42767q, this.f42768r, this.f42769s, this.f42770t, this.f42771u, this.f42772v, this.f42773w, this.f42774x, this.f42775y, this.f42776z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f42736J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f42738a0, this.f42740b0, this.f42742c0, this.f42744d0, this.f42746e0, this.f42748f0, this.f42750g0, this.f42752h0, this.f42754i0, this.f42756j0, this.f42758k0, this.f42760l0, this.f42762m0);
    }

    public final String i1() {
        return this.Q;
    }

    public final String j1() {
        return this.R;
    }

    public final wy0 k1() {
        return this.S;
    }

    public final Integer l1() {
        Integer num = this.U;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean m1() {
        boolean[] zArr = this.f42764n0;
        return zArr.length > 46 && zArr[46];
    }

    public final List n1() {
        return this.V;
    }

    @Override // dl1.s
    public final String o() {
        return this.f42739b;
    }

    public final String o1() {
        return this.W;
    }

    public final String p1() {
        return this.X;
    }

    public final Integer q1() {
        Integer num = this.Y;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean r1() {
        boolean[] zArr = this.f42764n0;
        return zArr.length > 50 && zArr[50];
    }

    public final Integer s1() {
        Integer num = this.Z;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final lh0 t1() {
        return this.f42738a0;
    }

    public final ph0 u1() {
        return this.f42740b0;
    }

    public final Boolean v1() {
        Boolean bool = this.f42742c0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean w1() {
        Boolean bool = this.f42744d0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean x1() {
        Boolean bool = this.f42748f0;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final dk0 y0() {
        return this.f42741c;
    }

    public final Double y1() {
        Double d2 = this.f42750g0;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean z0() {
        Boolean bool = this.f42743d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Double z1() {
        Double d2 = this.f42752h0;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public v7() {
        this.f42764n0 = new boolean[65];
    }

    private v7(@NonNull String str, String str2, dk0 dk0Var, Boolean bool, Date date, c7 c7Var, List<lb> list, Integer num, Date date2, Boolean bool2, String str3, Boolean bool3, List<wy0> list2, Integer num2, Boolean bool4, List<Integer> list3, Integer num3, Boolean bool5, Map<String, sr> map, Date date3, String str4, List<b60> list4, cl clVar, List<String> list5, Boolean bool6, Integer num4, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, e8 e8Var, String str5, String str6, String str7, Map<String, String> map2, Map<String, List<sr>> map3, List<zs> list6, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, String str8, @NonNull String str9, wy0 wy0Var, Integer num5, Integer num6, List<String> list7, String str10, String str11, Integer num7, Integer num8, lh0 lh0Var, ph0 ph0Var, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Double d2, Double d13, String str12, String str13, String str14, Boolean bool20, ke keVar, boolean[] zArr) {
        this.f42737a = str;
        this.f42739b = str2;
        this.f42741c = dk0Var;
        this.f42743d = bool;
        this.f42745e = date;
        this.f42747f = c7Var;
        this.f42749g = list;
        this.f42751h = num;
        this.f42753i = date2;
        this.f42755j = bool2;
        this.f42757k = str3;
        this.f42759l = bool3;
        this.f42761m = list2;
        this.f42763n = num2;
        this.f42765o = bool4;
        this.f42766p = list3;
        this.f42767q = num3;
        this.f42768r = bool5;
        this.f42769s = map;
        this.f42770t = date3;
        this.f42771u = str4;
        this.f42772v = list4;
        this.f42773w = clVar;
        this.f42774x = list5;
        this.f42775y = bool6;
        this.f42776z = num4;
        this.A = bool7;
        this.B = bool8;
        this.C = bool9;
        this.D = bool10;
        this.E = e8Var;
        this.F = str5;
        this.G = str6;
        this.H = str7;
        this.I = map2;
        this.f42736J = map3;
        this.K = list6;
        this.L = bool11;
        this.M = bool12;
        this.N = bool13;
        this.O = bool14;
        this.P = bool15;
        this.Q = str8;
        this.R = str9;
        this.S = wy0Var;
        this.T = num5;
        this.U = num6;
        this.V = list7;
        this.W = str10;
        this.X = str11;
        this.Y = num7;
        this.Z = num8;
        this.f42738a0 = lh0Var;
        this.f42740b0 = ph0Var;
        this.f42742c0 = bool16;
        this.f42744d0 = bool17;
        this.f42746e0 = bool18;
        this.f42748f0 = bool19;
        this.f42750g0 = d2;
        this.f42752h0 = d13;
        this.f42754i0 = str12;
        this.f42756j0 = str13;
        this.f42758k0 = str14;
        this.f42760l0 = bool20;
        this.f42762m0 = keVar;
        this.f42764n0 = zArr;
    }
}
