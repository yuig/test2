package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class mj {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40113a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40114b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_id")
    private String f40115c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("aggregated_comment")
    private z2 f40116d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("appeal_attachments_enabled")
    private Boolean f40117e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("appeal_status_enum")
    private a f40118f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("board")
    private v7 f40119g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("content_visibility")
    private b f40120h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("date_of_enforcement")
    private Double f40121i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("did_it")
    private az0 f40122j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("enforcement")
    private String f40123k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("image_url")
    private String f40124l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("is_blocked_from_appealing")
    private Boolean f40125m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("legal_takedown_request_id")
    private String f40126n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("object_id")
    private String f40127o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("object_type_enum")
    private c f40128p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("pin")
    private f30 f40129q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("policy_url")
    private String f40130r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("reason")
    private String f40131s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("reason_enum")
    private d f40132t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("review_status")
    private String f40133u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("show_preview_image")
    private Boolean f40134v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("shuffle_comment")
    private ni0 f40135w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("sor_available")
    private Boolean f40136x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("user")
    private wy0 f40137y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f40138z;

    /* loaded from: classes3.dex */
    public enum a {
        ACCEPTED(0),
        DENIED(1),
        IN_PROGRESS(2),
        CAN_APPEAL(3),
        CANNOT_APPEAL(4);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        ACCESSIBLE(0),
        INACCESSIBLE(1),
        GEOBLOCKED(2);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        NONE(0),
        USER(1),
        PIN(2),
        BOARD(3),
        DOMAIN(4),
        COMMENT(7),
        CONVERSATION(8),
        CONVERSATION_MESSAGE(9),
        CSR(10),
        DID_IT(11),
        AGGREGATED_COMMENT(12),
        CSE_REPORT(13),
        LEGAL_REQUEST(14),
        COMMUNITY(15),
        COMMUNITY_COMMENT(16),
        COMMUNITY_POST(17),
        MERCHANT(18),
        SEARCH_AUTOCOMPLETE(19),
        SCHEDULED_PIN(20),
        IMAGE(21),
        ADVERTISER(22),
        SEARCH_GUIDE(23),
        SEARCH_TRENDING_TEXT(24),
        PIN_SIGNAL(25),
        SEARCH_IDEAS_FOR_YOU(26),
        PIN_PROMOTION(27),
        CONSUMER(28),
        LIVESTREAM_CHAT_MESSAGE(29),
        VIDEO(30),
        CREATOR_CLASS_INSTANCE(31),
        SHUFFLE(32),
        SHUFFLE_COMMENT(33),
        SHUFFLE_GROUP(34),
        SHUFFLE_GROUP_COMMENT(35),
        SHUFFLE_ASSET(36),
        THIRD_PARTY_AD(37),
        DSA_APPEAL(38);

        private final int value;

        c(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        ADS_TARGETING(0),
        ADULT_AND_NUDITY_CONTENT_ADS(1),
        ADULT_CONTENT(2),
        ADVERTISING_GUIDELINES(3),
        CHILD_SAFETY(4),
        CIVIC_PARTICIPATION_MISINFORMATION(5),
        CLAIMED_CONTENT(6),
        CLIMATE_MISINFORMATION(7),
        COPYRIGHT_INFRINGEMENT(8),
        DANGEROUS_GOODS_AND_ACTIVITIES(9),
        EXPLOITATION(10),
        GRAPHIC_VIOLENCE(11),
        HARASSMENT(12),
        HATEFUL_ACTIVITIES(13),
        HEALTHCARE_PRODUCTS_AND_SERVICES(14),
        IMPERSONATION(15),
        IRRELEVANT_COMMENTARY(16),
        LOCAL_LAW(17),
        LOW_QUALITY_EDITORIAL_ADS(18),
        MEDICAL_MISINFORMATION(19),
        MERCHANT_GUIDELINES(20),
        MISINFORMATION(21),
        PRIVATE_INFORMATION(22),
        PROHIBITED_PRODUCTS(23),
        SAFE(24),
        SELF_INJURY_AND_HARMFUL_BEHAVIOR(25),
        SENSITIVE_CONTENT_ADS(26),
        SPAM(27),
        TRADEMARK_INFRINGEMENT(28),
        UNSAFE(29),
        VIOLENT_ACTORS(30),
        WEAPONS_AND_EXPLOSIVES_ADS(31),
        MULTIPLE_VIOLATIONS(32);

        private final int value;

        d(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ mj(String str, String str2, String str3, z2 z2Var, Boolean bool, a aVar, v7 v7Var, b bVar, Double d2, az0 az0Var, String str4, String str5, Boolean bool2, String str6, String str7, c cVar, f30 f30Var, String str8, String str9, d dVar, String str10, Boolean bool3, ni0 ni0Var, Boolean bool4, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, str3, z2Var, bool, aVar, v7Var, bVar, d2, az0Var, str4, str5, bool2, str6, str7, cVar, f30Var, str8, str9, dVar, str10, bool3, ni0Var, bool4, wy0Var, zArr);
    }

    public final z2 A() {
        return this.f40116d;
    }

    public final Boolean B() {
        Boolean bool = this.f40117e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final a C() {
        return this.f40118f;
    }

    public final v7 D() {
        return this.f40119g;
    }

    public final b E() {
        return this.f40120h;
    }

    public final Double F() {
        Double d2 = this.f40121i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final az0 G() {
        return this.f40122j;
    }

    public final String H() {
        return this.f40123k;
    }

    public final String I() {
        return this.f40124l;
    }

    public final Boolean J() {
        Boolean bool = this.f40125m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String K() {
        return this.f40126n;
    }

    public final String L() {
        return this.f40127o;
    }

    public final c M() {
        return this.f40128p;
    }

    public final f30 N() {
        return this.f40129q;
    }

    public final String O() {
        return this.f40130r;
    }

    public final String P() {
        return this.f40131s;
    }

    public final d Q() {
        return this.f40132t;
    }

    public final String R() {
        return this.f40133u;
    }

    public final Boolean S() {
        Boolean bool = this.f40134v;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final ni0 T() {
        return this.f40135w;
    }

    public final Boolean U() {
        Boolean bool = this.f40136x;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final wy0 V() {
        return this.f40137y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mj mjVar = (mj) obj;
        return Objects.equals(this.f40136x, mjVar.f40136x) && Objects.equals(this.f40134v, mjVar.f40134v) && Objects.equals(this.f40132t, mjVar.f40132t) && Objects.equals(this.f40128p, mjVar.f40128p) && Objects.equals(this.f40125m, mjVar.f40125m) && Objects.equals(this.f40121i, mjVar.f40121i) && Objects.equals(this.f40120h, mjVar.f40120h) && Objects.equals(this.f40118f, mjVar.f40118f) && Objects.equals(this.f40117e, mjVar.f40117e) && Objects.equals(this.f40113a, mjVar.f40113a) && Objects.equals(this.f40114b, mjVar.f40114b) && Objects.equals(this.f40115c, mjVar.f40115c) && Objects.equals(this.f40116d, mjVar.f40116d) && Objects.equals(this.f40119g, mjVar.f40119g) && Objects.equals(this.f40122j, mjVar.f40122j) && Objects.equals(this.f40123k, mjVar.f40123k) && Objects.equals(this.f40124l, mjVar.f40124l) && Objects.equals(this.f40126n, mjVar.f40126n) && Objects.equals(this.f40127o, mjVar.f40127o) && Objects.equals(this.f40129q, mjVar.f40129q) && Objects.equals(this.f40130r, mjVar.f40130r) && Objects.equals(this.f40131s, mjVar.f40131s) && Objects.equals(this.f40133u, mjVar.f40133u) && Objects.equals(this.f40135w, mjVar.f40135w) && Objects.equals(this.f40137y, mjVar.f40137y);
    }

    public final int hashCode() {
        return Objects.hash(this.f40113a, this.f40114b, this.f40115c, this.f40116d, this.f40117e, this.f40118f, this.f40119g, this.f40120h, this.f40121i, this.f40122j, this.f40123k, this.f40124l, this.f40125m, this.f40126n, this.f40127o, this.f40128p, this.f40129q, this.f40130r, this.f40131s, this.f40132t, this.f40133u, this.f40134v, this.f40135w, this.f40136x, this.f40137y);
    }

    public final String z() {
        return this.f40115c;
    }

    public mj() {
        this.f40138z = new boolean[25];
    }

    private mj(@NonNull String str, String str2, String str3, z2 z2Var, Boolean bool, a aVar, v7 v7Var, b bVar, Double d2, az0 az0Var, String str4, String str5, Boolean bool2, String str6, String str7, c cVar, f30 f30Var, String str8, String str9, d dVar, String str10, Boolean bool3, ni0 ni0Var, Boolean bool4, wy0 wy0Var, boolean[] zArr) {
        this.f40113a = str;
        this.f40114b = str2;
        this.f40115c = str3;
        this.f40116d = z2Var;
        this.f40117e = bool;
        this.f40118f = aVar;
        this.f40119g = v7Var;
        this.f40120h = bVar;
        this.f40121i = d2;
        this.f40122j = az0Var;
        this.f40123k = str4;
        this.f40124l = str5;
        this.f40125m = bool2;
        this.f40126n = str6;
        this.f40127o = str7;
        this.f40128p = cVar;
        this.f40129q = f30Var;
        this.f40130r = str8;
        this.f40131s = str9;
        this.f40132t = dVar;
        this.f40133u = str10;
        this.f40134v = bool3;
        this.f40135w = ni0Var;
        this.f40136x = bool4;
        this.f40137y = wy0Var;
        this.f40138z = zArr;
    }
}
