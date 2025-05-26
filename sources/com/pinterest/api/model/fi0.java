package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class fi0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37674a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37675b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("canonical_pin")
    private f30 f37676c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("comments_count")
    private Integer f37677d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("created_at")
    private Date f37678e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("effect_data")
    private Map<String, Object> f37679f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f37680g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("is_animated")
    private Boolean f37681h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("is_auto_created")
    private Boolean f37682i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_draft")
    private Boolean f37683j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("is_local_draft")
    private Boolean f37684k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("is_pinterest_source")
    private Boolean f37685l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("is_promoted")
    private Boolean f37686m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("is_remixable")
    private Boolean f37687n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("items")
    private List<pi0> f37688o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("parent")
    private fi0 f37689p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("posted_at")
    private Date f37690q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("root")
    private fi0 f37691r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("source_app_type_detailed")
    private Integer f37692s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("tracking_params")
    private String f37693t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("updated_at")
    private Date f37694u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("user")
    private wy0 f37695v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f37696w;

    public /* synthetic */ fi0(String str, String str2, f30 f30Var, Integer num, Date date, Map map, Map map2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, List list, fi0 fi0Var, Date date2, fi0 fi0Var2, Integer num2, String str3, Date date3, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, f30Var, num, date, map, map2, bool, bool2, bool3, bool4, bool5, bool6, bool7, list, fi0Var, date2, fi0Var2, num2, str3, date3, wy0Var, zArr);
    }

    public final f30 F() {
        return this.f37676c;
    }

    public final Map G() {
        return this.f37679f;
    }

    public final Map H() {
        return this.f37680g;
    }

    public final Boolean I() {
        Boolean bool = this.f37681h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean J() {
        Boolean bool = this.f37682i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean K() {
        Boolean bool = this.f37686m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean L() {
        Boolean bool = this.f37687n;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List M() {
        return this.f37688o;
    }

    public final fi0 N() {
        return this.f37689p;
    }

    public final fi0 O() {
        return this.f37691r;
    }

    public final Integer P() {
        Integer num = this.f37692s;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String Q() {
        return this.f37693t;
    }

    public final Date R() {
        return this.f37694u;
    }

    public final wy0 S() {
        return this.f37695v;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f37674a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fi0 fi0Var = (fi0) obj;
        return Objects.equals(this.f37692s, fi0Var.f37692s) && Objects.equals(this.f37687n, fi0Var.f37687n) && Objects.equals(this.f37686m, fi0Var.f37686m) && Objects.equals(this.f37685l, fi0Var.f37685l) && Objects.equals(this.f37684k, fi0Var.f37684k) && Objects.equals(this.f37683j, fi0Var.f37683j) && Objects.equals(this.f37682i, fi0Var.f37682i) && Objects.equals(this.f37681h, fi0Var.f37681h) && Objects.equals(this.f37677d, fi0Var.f37677d) && Objects.equals(this.f37674a, fi0Var.f37674a) && Objects.equals(this.f37675b, fi0Var.f37675b) && Objects.equals(this.f37676c, fi0Var.f37676c) && Objects.equals(this.f37678e, fi0Var.f37678e) && Objects.equals(this.f37679f, fi0Var.f37679f) && Objects.equals(this.f37680g, fi0Var.f37680g) && Objects.equals(this.f37688o, fi0Var.f37688o) && Objects.equals(this.f37689p, fi0Var.f37689p) && Objects.equals(this.f37690q, fi0Var.f37690q) && Objects.equals(this.f37691r, fi0Var.f37691r) && Objects.equals(this.f37693t, fi0Var.f37693t) && Objects.equals(this.f37694u, fi0Var.f37694u) && Objects.equals(this.f37695v, fi0Var.f37695v);
    }

    public final int hashCode() {
        return Objects.hash(this.f37674a, this.f37675b, this.f37676c, this.f37677d, this.f37678e, this.f37679f, this.f37680g, this.f37681h, this.f37682i, this.f37683j, this.f37684k, this.f37685l, this.f37686m, this.f37687n, this.f37688o, this.f37689p, this.f37690q, this.f37691r, this.f37692s, this.f37693t, this.f37694u, this.f37695v);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37675b;
    }

    public fi0() {
        this.f37696w = new boolean[22];
    }

    private fi0(@NonNull String str, String str2, f30 f30Var, Integer num, Date date, Map<String, Object> map, Map<String, sr> map2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, List<pi0> list, fi0 fi0Var, Date date2, fi0 fi0Var2, Integer num2, String str3, Date date3, wy0 wy0Var, boolean[] zArr) {
        this.f37674a = str;
        this.f37675b = str2;
        this.f37676c = f30Var;
        this.f37677d = num;
        this.f37678e = date;
        this.f37679f = map;
        this.f37680g = map2;
        this.f37681h = bool;
        this.f37682i = bool2;
        this.f37683j = bool3;
        this.f37684k = bool4;
        this.f37685l = bool5;
        this.f37686m = bool6;
        this.f37687n = bool7;
        this.f37688o = list;
        this.f37689p = fi0Var;
        this.f37690q = date2;
        this.f37691r = fi0Var2;
        this.f37692s = num2;
        this.f37693t = str3;
        this.f37694u = date3;
        this.f37695v = wy0Var;
        this.f37696w = zArr;
    }
}
