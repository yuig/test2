package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class tc0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42157a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42158b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("aux")
    private Map<String, String> f42159c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f42160d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("position")
    private Integer f42161e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("query_pin_id")
    private String f42162f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("tab_options")
    private List<xc0> f42163g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("tab_type")
    private Integer f42164h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42165i;

    public /* synthetic */ tc0(String str, String str2, Map map, String str3, Integer num, String str4, List list, Integer num2, boolean[] zArr, int i13) {
        this(str, str2, map, str3, num, str4, list, num2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tc0 tc0Var = (tc0) obj;
        return Objects.equals(this.f42164h, tc0Var.f42164h) && Objects.equals(this.f42161e, tc0Var.f42161e) && Objects.equals(this.f42157a, tc0Var.f42157a) && Objects.equals(this.f42158b, tc0Var.f42158b) && Objects.equals(this.f42159c, tc0Var.f42159c) && Objects.equals(this.f42160d, tc0Var.f42160d) && Objects.equals(this.f42162f, tc0Var.f42162f) && Objects.equals(this.f42163g, tc0Var.f42163g);
    }

    public final int hashCode() {
        return Objects.hash(this.f42157a, this.f42158b, this.f42159c, this.f42160d, this.f42161e, this.f42162f, this.f42163g, this.f42164h);
    }

    public final String n() {
        return this.f42160d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f42158b;
    }

    public final String q() {
        return this.f42162f;
    }

    public final List s() {
        return this.f42163g;
    }

    public final Integer u() {
        Integer num = this.f42164h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public tc0() {
        this.f42165i = new boolean[8];
    }

    private tc0(@NonNull String str, String str2, Map<String, String> map, @NonNull String str3, Integer num, String str4, List<xc0> list, Integer num2, boolean[] zArr) {
        this.f42157a = str;
        this.f42158b = str2;
        this.f42159c = map;
        this.f42160d = str3;
        this.f42161e = num;
        this.f42162f = str4;
        this.f42163g = list;
        this.f42164h = num2;
        this.f42165i = zArr;
    }
}
