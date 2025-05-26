package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class xh0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("free_shipping_price")
    private String f43688a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("free_shipping_value")
    private Integer f43689b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("shipping_localized_text")
    private String f43690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43691d;

    public /* synthetic */ xh0(String str, Integer num, String str2, boolean[] zArr, int i13) {
        this(str, num, str2, zArr);
    }

    public final String d() {
        return this.f43688a;
    }

    public final Integer e() {
        Integer num = this.f43689b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        return Objects.equals(this.f43689b, xh0Var.f43689b) && Objects.equals(this.f43688a, xh0Var.f43688a) && Objects.equals(this.f43690c, xh0Var.f43690c);
    }

    public final boolean f() {
        boolean[] zArr = this.f43691d;
        return zArr.length > 1 && zArr[1];
    }

    public final String g() {
        return this.f43690c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43688a, this.f43689b, this.f43690c);
    }

    public xh0() {
        this.f43691d = new boolean[3];
    }

    private xh0(String str, Integer num, String str2, boolean[] zArr) {
        this.f43688a = str;
        this.f43689b = num;
        this.f43690c = str2;
        this.f43691d = zArr;
    }
}
