package com.pinterest.api.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class fs {

    /* renamed from: a, reason: collision with root package name */
    @om.b("age_distribution")
    private List<bs> f37770a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("audience_size")
    private Integer f37771b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("audience_size_is_upper_bound")
    private Boolean f37772c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("country_distribution")
    private List<bs> f37773d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("device_distribution")
    private List<bs> f37774e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("end_date")
    private String f37775f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("gender_distribution")
    private List<bs> f37776g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("interests_distribution")
    private Map<String, Object> f37777h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("l1_interest_distribution")
    private List<bs> f37778i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("metro_distribution")
    private List<bs> f37779j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("top_categories")
    private List<bs> f37780k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("type")
    private String f37781l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f37782m;

    public /* synthetic */ fs(List list, Integer num, Boolean bool, List list2, List list3, String str, List list4, Map map, List list5, List list6, List list7, String str2, boolean[] zArr, int i13) {
        this(list, num, bool, list2, list3, str, list4, map, list5, list6, list7, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fs fsVar = (fs) obj;
        return Objects.equals(this.f37772c, fsVar.f37772c) && Objects.equals(this.f37771b, fsVar.f37771b) && Objects.equals(this.f37770a, fsVar.f37770a) && Objects.equals(this.f37773d, fsVar.f37773d) && Objects.equals(this.f37774e, fsVar.f37774e) && Objects.equals(this.f37775f, fsVar.f37775f) && Objects.equals(this.f37776g, fsVar.f37776g) && Objects.equals(this.f37777h, fsVar.f37777h) && Objects.equals(this.f37778i, fsVar.f37778i) && Objects.equals(this.f37779j, fsVar.f37779j) && Objects.equals(this.f37780k, fsVar.f37780k) && Objects.equals(this.f37781l, fsVar.f37781l);
    }

    public final int hashCode() {
        return Objects.hash(this.f37770a, this.f37771b, this.f37772c, this.f37773d, this.f37774e, this.f37775f, this.f37776g, this.f37777h, this.f37778i, this.f37779j, this.f37780k, this.f37781l);
    }

    public final List m() {
        return this.f37770a;
    }

    public final Integer n() {
        Integer num = this.f37771b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean o() {
        Boolean bool = this.f37772c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List p() {
        return this.f37773d;
    }

    public final List q() {
        return this.f37774e;
    }

    public final String r() {
        return this.f37775f;
    }

    public final List s() {
        return this.f37776g;
    }

    public final List t() {
        return this.f37778i;
    }

    public final List u() {
        return this.f37779j;
    }

    public fs() {
        this.f37782m = new boolean[12];
    }

    private fs(List<bs> list, Integer num, Boolean bool, List<bs> list2, List<bs> list3, String str, List<bs> list4, Map<String, Object> map, List<bs> list5, List<bs> list6, List<bs> list7, String str2, boolean[] zArr) {
        this.f37770a = list;
        this.f37771b = num;
        this.f37772c = bool;
        this.f37773d = list2;
        this.f37774e = list3;
        this.f37775f = str;
        this.f37776g = list4;
        this.f37777h = map;
        this.f37778i = list5;
        this.f37779j = list6;
        this.f37780k = list7;
        this.f37781l = str2;
        this.f37782m = zArr;
    }
}
