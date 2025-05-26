package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class a10 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35609a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35610b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("customer_service_email")
    private String f35611c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("discount_price")
    private String f35612d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image")
    private e10 f35613e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("merchant_user")
    private wy0 f35614f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("order_status_url")
    private String f35615g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("price")
    private String f35616h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("shipping_price")
    private String f35617i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("title")
    private String f35618j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f35619k;

    public /* synthetic */ a10(String str, String str2, String str3, String str4, e10 e10Var, wy0 wy0Var, String str5, String str6, String str7, String str8, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, e10Var, wy0Var, str5, str6, str7, str8, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return Objects.equals(this.f35609a, a10Var.f35609a) && Objects.equals(this.f35610b, a10Var.f35610b) && Objects.equals(this.f35611c, a10Var.f35611c) && Objects.equals(this.f35612d, a10Var.f35612d) && Objects.equals(this.f35613e, a10Var.f35613e) && Objects.equals(this.f35614f, a10Var.f35614f) && Objects.equals(this.f35615g, a10Var.f35615g) && Objects.equals(this.f35616h, a10Var.f35616h) && Objects.equals(this.f35617i, a10Var.f35617i) && Objects.equals(this.f35618j, a10Var.f35618j);
    }

    public final int hashCode() {
        return Objects.hash(this.f35609a, this.f35610b, this.f35611c, this.f35612d, this.f35613e, this.f35614f, this.f35615g, this.f35616h, this.f35617i, this.f35618j);
    }

    public a10() {
        this.f35619k = new boolean[10];
    }

    private a10(@NonNull String str, String str2, String str3, String str4, e10 e10Var, wy0 wy0Var, String str5, String str6, String str7, String str8, boolean[] zArr) {
        this.f35609a = str;
        this.f35610b = str2;
        this.f35611c = str3;
        this.f35612d = str4;
        this.f35613e = e10Var;
        this.f35614f = wy0Var;
        this.f35615g = str5;
        this.f35616h = str6;
        this.f35617i = str7;
        this.f35618j = str8;
        this.f35619k = zArr;
    }
}
