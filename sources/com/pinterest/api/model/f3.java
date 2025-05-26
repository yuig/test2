package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class f3 implements fl1.d, dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f37427a;

    /* renamed from: b */
    @om.b("node_id")
    private String f37428b;

    /* renamed from: c */
    @om.b("aggregated_stats")
    private m3 f37429c;

    /* renamed from: d */
    @om.b("catalog_collection_type")
    private Integer f37430d;

    /* renamed from: e */
    @om.b("collections_header_text")
    private String f37431e;

    /* renamed from: f */
    @om.b("comment_count")
    private Integer f37432f;

    /* renamed from: g */
    @om.b("creator_analytics")
    private Map<String, bg> f37433g;

    /* renamed from: h */
    @om.b("did_it_data")
    private e3 f37434h;

    /* renamed from: i */
    @om.b("dpa_layout_type")
    private a f37435i;

    /* renamed from: j */
    @om.b("has_xy_tags")
    private Boolean f37436j;

    /* renamed from: k */
    @om.b("image_signature")
    private String f37437k;

    /* renamed from: l */
    @om.b("is_dynamic_collections")
    private Boolean f37438l;

    /* renamed from: m */
    @om.b("is_shop_the_look")
    private Boolean f37439m;

    /* renamed from: n */
    @om.b("is_stela")
    private Boolean f37440n;

    /* renamed from: o */
    @om.b("pin_tags")
    private List<s50> f37441o;

    /* renamed from: p */
    @om.b("pin_tags_chips")
    private List<f30> f37442p;

    /* renamed from: q */
    @om.b("quick_replies_templates")
    private List<String> f37443q;

    /* renamed from: r */
    @om.b("slideshow_collections_aspect_ratio")
    private Double f37444r;

    /* renamed from: s */
    public final boolean[] f37445s;

    public enum a {
        COLLECTION_HERO_AND_CHIPS(0),
        COLLECTION_TWO_BY_TWO(1),
        COLLECTION_TWO_BY_ONE(2),
        COLLECTION_TWO_BY_THREE(3);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ f3(String str, String str2, m3 m3Var, Integer num, String str3, Integer num2, Map map, e3 e3Var, a aVar, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, List list, List list2, List list3, Double d2, boolean[] zArr, int i13) {
        this(str, str2, m3Var, num, str3, num2, map, e3Var, aVar, bool, str4, bool2, bool3, bool4, list, list2, list3, d2, zArr);
    }

    public final m3 C() {
        return this.f37429c;
    }

    public final Integer D() {
        Integer num = this.f37430d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String E() {
        return this.f37431e;
    }

    public final Integer F() {
        Integer num = this.f37432f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map G() {
        return this.f37433g;
    }

    public final e3 H() {
        return this.f37434h;
    }

    public final a I() {
        return this.f37435i;
    }

    public final Boolean J() {
        Boolean bool = this.f37436j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean K() {
        Boolean bool = this.f37438l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean L() {
        Boolean bool = this.f37439m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean M() {
        Boolean bool = this.f37440n;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List N() {
        return this.f37442p;
    }

    public final Double O() {
        Double d2 = this.f37444r;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final i3 P() {
        return new i3(this, 0);
    }

    @Override // fl1.d
    public final dl1.s a(dl1.s sVar) {
        f3 f3Var = (f3) sVar;
        if (this == f3Var) {
            return this;
        }
        i3 P = P();
        P.b(f3Var);
        return P.a();
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f37427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Objects.equals(this.f37444r, f3Var.f37444r) && Objects.equals(this.f37440n, f3Var.f37440n) && Objects.equals(this.f37439m, f3Var.f37439m) && Objects.equals(this.f37438l, f3Var.f37438l) && Objects.equals(this.f37436j, f3Var.f37436j) && Objects.equals(this.f37435i, f3Var.f37435i) && Objects.equals(this.f37432f, f3Var.f37432f) && Objects.equals(this.f37430d, f3Var.f37430d) && Objects.equals(this.f37427a, f3Var.f37427a) && Objects.equals(this.f37428b, f3Var.f37428b) && Objects.equals(this.f37429c, f3Var.f37429c) && Objects.equals(this.f37431e, f3Var.f37431e) && Objects.equals(this.f37433g, f3Var.f37433g) && Objects.equals(this.f37434h, f3Var.f37434h) && Objects.equals(this.f37437k, f3Var.f37437k) && Objects.equals(this.f37441o, f3Var.f37441o) && Objects.equals(this.f37442p, f3Var.f37442p) && Objects.equals(this.f37443q, f3Var.f37443q);
    }

    public final int hashCode() {
        return Objects.hash(this.f37427a, this.f37428b, this.f37429c, this.f37430d, this.f37431e, this.f37432f, this.f37433g, this.f37434h, this.f37435i, this.f37436j, this.f37437k, this.f37438l, this.f37439m, this.f37440n, this.f37441o, this.f37442p, this.f37443q, this.f37444r);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37428b;
    }

    public f3() {
        this.f37445s = new boolean[18];
    }

    private f3(@NonNull String str, String str2, m3 m3Var, Integer num, String str3, Integer num2, Map<String, bg> map, e3 e3Var, a aVar, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, List<s50> list, List<f30> list2, List<String> list3, Double d2, boolean[] zArr) {
        this.f37427a = str;
        this.f37428b = str2;
        this.f37429c = m3Var;
        this.f37430d = num;
        this.f37431e = str3;
        this.f37432f = num2;
        this.f37433g = map;
        this.f37434h = e3Var;
        this.f37435i = aVar;
        this.f37436j = bool;
        this.f37437k = str4;
        this.f37438l = bool2;
        this.f37439m = bool3;
        this.f37440n = bool4;
        this.f37441o = list;
        this.f37442p = list2;
        this.f37443q = list3;
        this.f37444r = d2;
        this.f37445s = zArr;
    }
}
