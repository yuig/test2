package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ge0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("android_deep_link")
    private String f38050a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("destination_url")
    private String f38051b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("iOS_deep_link")
    private String f38052c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("organic_pin_id")
    private String f38053d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("result_id")
    private Integer f38054e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38055f;

    public /* synthetic */ ge0(String str, String str2, String str3, String str4, Integer num, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return Objects.equals(this.f38054e, ge0Var.f38054e) && Objects.equals(this.f38050a, ge0Var.f38050a) && Objects.equals(this.f38051b, ge0Var.f38051b) && Objects.equals(this.f38052c, ge0Var.f38052c) && Objects.equals(this.f38053d, ge0Var.f38053d);
    }

    public final String f() {
        return this.f38051b;
    }

    public final String g() {
        return this.f38053d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38050a, this.f38051b, this.f38052c, this.f38053d, this.f38054e);
    }

    public ge0() {
        this.f38055f = new boolean[5];
    }

    private ge0(String str, String str2, String str3, String str4, Integer num, boolean[] zArr) {
        this.f38050a = str;
        this.f38051b = str2;
        this.f38052c = str3;
        this.f38053d = str4;
        this.f38054e = num;
        this.f38055f = zArr;
    }
}
