package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class a70 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("currency")
    private String f35657a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("duration_days")
    private Integer f35658b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("lowest_price")
    private String f35659c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("lowest_price_val")
    private Integer f35660d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("typical_price")
    private String f35661e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("typical_price_val")
    private Integer f35662f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35663g;

    public /* synthetic */ a70(String str, Integer num, String str2, Integer num2, String str3, Integer num3, boolean[] zArr, int i13) {
        this(str, num, str2, num2, str3, num3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return Objects.equals(this.f35662f, a70Var.f35662f) && Objects.equals(this.f35660d, a70Var.f35660d) && Objects.equals(this.f35658b, a70Var.f35658b) && Objects.equals(this.f35657a, a70Var.f35657a) && Objects.equals(this.f35659c, a70Var.f35659c) && Objects.equals(this.f35661e, a70Var.f35661e);
    }

    public final int hashCode() {
        return Objects.hash(this.f35657a, this.f35658b, this.f35659c, this.f35660d, this.f35661e, this.f35662f);
    }

    public a70() {
        this.f35663g = new boolean[6];
    }

    private a70(String str, Integer num, String str2, Integer num2, String str3, Integer num3, boolean[] zArr) {
        this.f35657a = str;
        this.f35658b = num;
        this.f35659c = str2;
        this.f35660d = num2;
        this.f35661e = str3;
        this.f35662f = num3;
        this.f35663g = zArr;
    }
}
