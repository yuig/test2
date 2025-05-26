package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ue implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42524a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42525b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cached_email_list")
    private List<String> f42526c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cached_users")
    private List<wy0> f42527d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("created_at")
    private Date f42528e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("emails")
    private List<String> f42529f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("is_eligible_for_threads")
    private Boolean f42530g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("last_message")
    private mv f42531h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("name")
    private String f42532i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("pinsub_topic_id")
    private String f42533j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("read_times")
    private Map<String, Date> f42534k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("read_times_ms")
    private Map<String, Double> f42535l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("snooze_time")
    private Integer f42536m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("unread")
    private Integer f42537n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("unread_pins")
    private Integer f42538o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("users")
    private List<wy0> f42539p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f42540q;

    public /* synthetic */ ue(String str, String str2, List list, List list2, Date date, List list3, Boolean bool, mv mvVar, String str3, String str4, Map map, Map map2, Integer num, Integer num2, Integer num3, List list4, boolean[] zArr, int i13) {
        this(str, str2, list, list2, date, list3, bool, mvVar, str3, str4, map, map2, num, num2, num3, list4, zArr);
    }

    public final List A() {
        return this.f42529f;
    }

    public final Boolean B() {
        Boolean bool = this.f42530g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final mv C() {
        return this.f42531h;
    }

    public final String D() {
        return this.f42533j;
    }

    public final Map E() {
        return this.f42535l;
    }

    public final Integer F() {
        Integer num = this.f42537n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List G() {
        return this.f42539p;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f42524a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ue ueVar = (ue) obj;
        return Objects.equals(this.f42538o, ueVar.f42538o) && Objects.equals(this.f42537n, ueVar.f42537n) && Objects.equals(this.f42536m, ueVar.f42536m) && Objects.equals(this.f42530g, ueVar.f42530g) && Objects.equals(this.f42524a, ueVar.f42524a) && Objects.equals(this.f42525b, ueVar.f42525b) && Objects.equals(this.f42526c, ueVar.f42526c) && Objects.equals(this.f42527d, ueVar.f42527d) && Objects.equals(this.f42528e, ueVar.f42528e) && Objects.equals(this.f42529f, ueVar.f42529f) && Objects.equals(this.f42531h, ueVar.f42531h) && Objects.equals(this.f42532i, ueVar.f42532i) && Objects.equals(this.f42533j, ueVar.f42533j) && Objects.equals(this.f42534k, ueVar.f42534k) && Objects.equals(this.f42535l, ueVar.f42535l) && Objects.equals(this.f42539p, ueVar.f42539p);
    }

    public final int hashCode() {
        return Objects.hash(this.f42524a, this.f42525b, this.f42526c, this.f42527d, this.f42528e, this.f42529f, this.f42530g, this.f42531h, this.f42532i, this.f42533j, this.f42534k, this.f42535l, this.f42536m, this.f42537n, this.f42538o, this.f42539p);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42525b;
    }

    public final List z() {
        return this.f42527d;
    }

    public ue() {
        this.f42540q = new boolean[16];
    }

    private ue(@NonNull String str, String str2, List<String> list, List<wy0> list2, Date date, List<String> list3, Boolean bool, mv mvVar, String str3, String str4, Map<String, Date> map, Map<String, Double> map2, Integer num, Integer num2, Integer num3, List<wy0> list4, boolean[] zArr) {
        this.f42524a = str;
        this.f42525b = str2;
        this.f42526c = list;
        this.f42527d = list2;
        this.f42528e = date;
        this.f42529f = list3;
        this.f42530g = bool;
        this.f42531h = mvVar;
        this.f42532i = str3;
        this.f42533j = str4;
        this.f42534k = map;
        this.f42535l = map2;
        this.f42536m = num;
        this.f42537n = num2;
        this.f42538o = num3;
        this.f42539p = list4;
        this.f42540q = zArr;
    }
}
