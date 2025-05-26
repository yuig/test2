package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class z2 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44177a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44178b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("attached_pin")
    private f30 f44179c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("comment_count")
    private Integer f44180d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("comment_response_pin")
    private f30 f44181e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("comment_tag")
    private Integer f44182f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("created_at")
    private Date f44183g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("helpful_count")
    private Integer f44184h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("highlighted_by_pin_owner")
    private Boolean f44185i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_edited")
    private Boolean f44186j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("is_translatable")
    private Boolean f44187k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("is_tried_it_proxy_comment")
    private Boolean f44188l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("marked_helpful_by_me")
    private Boolean f44189m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("media")
    private sd f44190n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("pin")
    private f30 f44191o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("pin_id")
    private String f44192p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("reacted_by_creator")
    private Boolean f44193q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("reaction_by_me")
    private Integer f44194r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("reaction_counts")
    private Map<String, Object> f44195s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("reply_preview_ids")
    private List<String> f44196t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("tagged_users")
    private List<wy0> f44197u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("tags")
    private List<ts0> f44198v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("text")
    private String f44199w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("type")
    private String f44200x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("user")
    private wy0 f44201y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f44202z;

    public /* synthetic */ z2(String str, String str2, f30 f30Var, Integer num, f30 f30Var2, Integer num2, Date date, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, sd sdVar, f30 f30Var3, String str3, Boolean bool6, Integer num4, Map map, List list, List list2, List list3, String str4, String str5, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, f30Var, num, f30Var2, num2, date, num3, bool, bool2, bool3, bool4, bool5, sdVar, f30Var3, str3, bool6, num4, map, list, list2, list3, str4, str5, wy0Var, zArr);
    }

    public final f30 I() {
        return this.f44179c;
    }

    public final Integer J() {
        Integer num = this.f44180d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final f30 K() {
        return this.f44181e;
    }

    public final Integer L() {
        Integer num = this.f44182f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Date M() {
        return this.f44183g;
    }

    public final Integer N() {
        Integer num = this.f44184h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean O() {
        Boolean bool = this.f44185i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean P() {
        Boolean bool = this.f44187k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean Q() {
        Boolean bool = this.f44189m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final sd R() {
        return this.f44190n;
    }

    public final f30 S() {
        return this.f44191o;
    }

    public final String T() {
        return this.f44192p;
    }

    public final Boolean U() {
        Boolean bool = this.f44193q;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer V() {
        Integer num = this.f44194r;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map W() {
        return this.f44195s;
    }

    public final List X() {
        return this.f44196t;
    }

    public final List Y() {
        return this.f44198v;
    }

    public final String Z() {
        return this.f44199w;
    }

    public final String a0() {
        return this.f44200x;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f44177a;
    }

    public final wy0 b0() {
        return this.f44201y;
    }

    public final y2 c0() {
        return new y2(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return Objects.equals(this.f44194r, z2Var.f44194r) && Objects.equals(this.f44193q, z2Var.f44193q) && Objects.equals(this.f44189m, z2Var.f44189m) && Objects.equals(this.f44188l, z2Var.f44188l) && Objects.equals(this.f44187k, z2Var.f44187k) && Objects.equals(this.f44186j, z2Var.f44186j) && Objects.equals(this.f44185i, z2Var.f44185i) && Objects.equals(this.f44184h, z2Var.f44184h) && Objects.equals(this.f44182f, z2Var.f44182f) && Objects.equals(this.f44180d, z2Var.f44180d) && Objects.equals(this.f44177a, z2Var.f44177a) && Objects.equals(this.f44178b, z2Var.f44178b) && Objects.equals(this.f44179c, z2Var.f44179c) && Objects.equals(this.f44181e, z2Var.f44181e) && Objects.equals(this.f44183g, z2Var.f44183g) && Objects.equals(this.f44190n, z2Var.f44190n) && Objects.equals(this.f44191o, z2Var.f44191o) && Objects.equals(this.f44192p, z2Var.f44192p) && Objects.equals(this.f44195s, z2Var.f44195s) && Objects.equals(this.f44196t, z2Var.f44196t) && Objects.equals(this.f44197u, z2Var.f44197u) && Objects.equals(this.f44198v, z2Var.f44198v) && Objects.equals(this.f44199w, z2Var.f44199w) && Objects.equals(this.f44200x, z2Var.f44200x) && Objects.equals(this.f44201y, z2Var.f44201y);
    }

    public final int hashCode() {
        return Objects.hash(this.f44177a, this.f44178b, this.f44179c, this.f44180d, this.f44181e, this.f44182f, this.f44183g, this.f44184h, this.f44185i, this.f44186j, this.f44187k, this.f44188l, this.f44189m, this.f44190n, this.f44191o, this.f44192p, this.f44193q, this.f44194r, this.f44195s, this.f44196t, this.f44197u, this.f44198v, this.f44199w, this.f44200x, this.f44201y);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44178b;
    }

    public z2() {
        this.f44202z = new boolean[25];
    }

    private z2(@NonNull String str, String str2, f30 f30Var, Integer num, f30 f30Var2, Integer num2, Date date, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, sd sdVar, f30 f30Var3, String str3, Boolean bool6, Integer num4, Map<String, Object> map, List<String> list, List<wy0> list2, List<ts0> list3, String str4, String str5, wy0 wy0Var, boolean[] zArr) {
        this.f44177a = str;
        this.f44178b = str2;
        this.f44179c = f30Var;
        this.f44180d = num;
        this.f44181e = f30Var2;
        this.f44182f = num2;
        this.f44183g = date;
        this.f44184h = num3;
        this.f44185i = bool;
        this.f44186j = bool2;
        this.f44187k = bool3;
        this.f44188l = bool4;
        this.f44189m = bool5;
        this.f44190n = sdVar;
        this.f44191o = f30Var3;
        this.f44192p = str3;
        this.f44193q = bool6;
        this.f44194r = num4;
        this.f44195s = map;
        this.f44196t = list;
        this.f44197u = list2;
        this.f44198v = list3;
        this.f44199w = str4;
        this.f44200x = str5;
        this.f44201y = wy0Var;
        this.f44202z = zArr;
    }
}
