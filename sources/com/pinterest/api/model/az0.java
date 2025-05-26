package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class az0 implements dl1.s {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f35907a;

    /* renamed from: b */
    @om.b("node_id")
    private String f35908b;

    /* renamed from: c */
    @om.b("comment_count")
    private Integer f35909c;

    /* renamed from: d */
    @om.b("details")
    private String f35910d;

    /* renamed from: e */
    @om.b("did_it_type")
    private a f35911e;

    /* renamed from: f */
    @om.b("dominant_color")
    private String f35912f;

    /* renamed from: g */
    @om.b("done_at")
    private Date f35913g;

    /* renamed from: h */
    @om.b("helpful_count")
    private Integer f35914h;

    /* renamed from: i */
    @om.b("highlighted_by_pin_owner")
    private Boolean f35915i;

    /* renamed from: j */
    @om.b("image_signatures")
    private List<String> f35916j;

    /* renamed from: k */
    @om.b("images")
    private List<Map<String, sr>> f35917k;

    /* renamed from: l */
    @om.b("marked_helpful_by_me")
    private Boolean f35918l;

    /* renamed from: m */
    @om.b("paragraph_blocks")
    private List<kp0> f35919m;

    /* renamed from: n */
    @om.b("pin")
    private f30 f35920n;

    /* renamed from: o */
    @om.b("privacy")
    private b f35921o;

    /* renamed from: p */
    @om.b("reaction_by_me")
    private Integer f35922p;

    /* renamed from: q */
    @om.b("reaction_counts")
    private Map<String, Object> f35923q;

    /* renamed from: r */
    @om.b("recommend_score")
    private Double f35924r;

    /* renamed from: s */
    @om.b("recommendation_reason")
    private Map<String, Object> f35925s;

    /* renamed from: t */
    @om.b("text_tags")
    private List<ts0> f35926t;

    /* renamed from: u */
    @om.b("type")
    private String f35927u;

    /* renamed from: v */
    @om.b("user")
    private wy0 f35928v;

    /* renamed from: w */
    @om.b("videos")
    private List<b01> f35929w;

    /* renamed from: x */
    public final boolean[] f35930x;

    /* loaded from: classes3.dex */
    public enum a {
        DEFAULT(0),
        RESPONSE(1);

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
        UNSET,
        PUBLIC,
        SECRET
    }

    public /* synthetic */ az0(String str, String str2, Integer num, String str3, a aVar, String str4, Date date, Integer num2, Boolean bool, List list, List list2, Boolean bool2, List list3, f30 f30Var, b bVar, Integer num3, Map map, Double d2, Map map2, List list4, String str5, wy0 wy0Var, List list5, boolean[] zArr, int i13) {
        this(str, str2, num, str3, aVar, str4, date, num2, bool, list, list2, bool2, list3, f30Var, bVar, num3, map, d2, map2, list4, str5, wy0Var, list5, zArr);
    }

    public final Integer G() {
        Integer num = this.f35909c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String H() {
        return this.f35910d;
    }

    public final Date I() {
        return this.f35913g;
    }

    public final Integer J() {
        Integer num = this.f35914h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean K() {
        Boolean bool = this.f35915i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List L() {
        return this.f35916j;
    }

    public final List M() {
        return this.f35917k;
    }

    public final Boolean N() {
        Boolean bool = this.f35918l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final f30 O() {
        return this.f35920n;
    }

    public final Integer P() {
        Integer num = this.f35922p;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map Q() {
        return this.f35923q;
    }

    public final Double R() {
        Double d2 = this.f35924r;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final List S() {
        return this.f35926t;
    }

    public final String T() {
        return this.f35927u;
    }

    public final wy0 U() {
        return this.f35928v;
    }

    public final zy0 V() {
        return new zy0(this, 0);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f35907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        az0 az0Var = (az0) obj;
        return Objects.equals(this.f35924r, az0Var.f35924r) && Objects.equals(this.f35922p, az0Var.f35922p) && Objects.equals(this.f35921o, az0Var.f35921o) && Objects.equals(this.f35918l, az0Var.f35918l) && Objects.equals(this.f35915i, az0Var.f35915i) && Objects.equals(this.f35914h, az0Var.f35914h) && Objects.equals(this.f35911e, az0Var.f35911e) && Objects.equals(this.f35909c, az0Var.f35909c) && Objects.equals(this.f35907a, az0Var.f35907a) && Objects.equals(this.f35908b, az0Var.f35908b) && Objects.equals(this.f35910d, az0Var.f35910d) && Objects.equals(this.f35912f, az0Var.f35912f) && Objects.equals(this.f35913g, az0Var.f35913g) && Objects.equals(this.f35916j, az0Var.f35916j) && Objects.equals(this.f35917k, az0Var.f35917k) && Objects.equals(this.f35919m, az0Var.f35919m) && Objects.equals(this.f35920n, az0Var.f35920n) && Objects.equals(this.f35923q, az0Var.f35923q) && Objects.equals(this.f35925s, az0Var.f35925s) && Objects.equals(this.f35926t, az0Var.f35926t) && Objects.equals(this.f35927u, az0Var.f35927u) && Objects.equals(this.f35928v, az0Var.f35928v) && Objects.equals(this.f35929w, az0Var.f35929w);
    }

    public final int hashCode() {
        return Objects.hash(this.f35907a, this.f35908b, this.f35909c, this.f35910d, this.f35911e, this.f35912f, this.f35913g, this.f35914h, this.f35915i, this.f35916j, this.f35917k, this.f35918l, this.f35919m, this.f35920n, this.f35921o, this.f35922p, this.f35923q, this.f35924r, this.f35925s, this.f35926t, this.f35927u, this.f35928v, this.f35929w);
    }

    @Override // dl1.s
    public final String o() {
        return this.f35908b;
    }

    public az0() {
        this.f35930x = new boolean[23];
    }

    private az0(@NonNull String str, String str2, Integer num, String str3, a aVar, String str4, Date date, Integer num2, Boolean bool, List<String> list, List<Map<String, sr>> list2, Boolean bool2, List<kp0> list3, f30 f30Var, b bVar, Integer num3, Map<String, Object> map, Double d2, Map<String, Object> map2, List<ts0> list4, String str5, wy0 wy0Var, List<b01> list5, boolean[] zArr) {
        this.f35907a = str;
        this.f35908b = str2;
        this.f35909c = num;
        this.f35910d = str3;
        this.f35911e = aVar;
        this.f35912f = str4;
        this.f35913g = date;
        this.f35914h = num2;
        this.f35915i = bool;
        this.f35916j = list;
        this.f35917k = list2;
        this.f35918l = bool2;
        this.f35919m = list3;
        this.f35920n = f30Var;
        this.f35921o = bVar;
        this.f35922p = num3;
        this.f35923q = map;
        this.f35924r = d2;
        this.f35925s = map2;
        this.f35926t = list4;
        this.f35927u = str5;
        this.f35928v = wy0Var;
        this.f35929w = list5;
        this.f35930x = zArr;
    }
}
