package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class oc {

    /* renamed from: a, reason: collision with root package name */
    @om.b("cluster_id")
    private String f40668a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("cluster_title")
    private String f40669b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("interest")
    private String f40670c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_count")
    private Integer f40671d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40672e;

    public /* synthetic */ oc(String str, String str2, String str3, Integer num, boolean[] zArr, int i13) {
        this(str, str2, str3, num, zArr);
    }

    public final String e() {
        return this.f40668a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Objects.equals(this.f40671d, ocVar.f40671d) && Objects.equals(this.f40668a, ocVar.f40668a) && Objects.equals(this.f40669b, ocVar.f40669b) && Objects.equals(this.f40670c, ocVar.f40670c);
    }

    public final String f() {
        return this.f40669b;
    }

    public final String g() {
        return this.f40670c;
    }

    public final Integer h() {
        Integer num = this.f40671d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f40668a, this.f40669b, this.f40670c, this.f40671d);
    }

    public oc() {
        this.f40672e = new boolean[4];
    }

    private oc(String str, String str2, String str3, Integer num, boolean[] zArr) {
        this.f40668a = str;
        this.f40669b = str2;
        this.f40670c = str3;
        this.f40671d = num;
        this.f40672e = zArr;
    }
}
