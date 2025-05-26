package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class an0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f35808a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("canonical_url")
    private String f35809b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image")
    private om0 f35810c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_signature")
    private String f35811d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("normalized_url")
    private String f35812e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("src_url")
    private String f35813f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("text")
    private String f35814g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("type")
    private String f35815h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35816i;

    public /* synthetic */ an0(Integer num, String str, om0 om0Var, String str2, String str3, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(num, str, om0Var, str2, str3, str4, str5, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        an0 an0Var = (an0) obj;
        return Objects.equals(this.f35808a, an0Var.f35808a) && Objects.equals(this.f35809b, an0Var.f35809b) && Objects.equals(this.f35810c, an0Var.f35810c) && Objects.equals(this.f35811d, an0Var.f35811d) && Objects.equals(this.f35812e, an0Var.f35812e) && Objects.equals(this.f35813f, an0Var.f35813f) && Objects.equals(this.f35814g, an0Var.f35814g) && Objects.equals(this.f35815h, an0Var.f35815h);
    }

    public final int hashCode() {
        return Objects.hash(this.f35808a, this.f35809b, this.f35810c, this.f35811d, this.f35812e, this.f35813f, this.f35814g, this.f35815h);
    }

    public an0() {
        this.f35816i = new boolean[8];
    }

    private an0(Integer num, String str, om0 om0Var, String str2, String str3, @NonNull String str4, String str5, String str6, boolean[] zArr) {
        this.f35808a = num;
        this.f35809b = str;
        this.f35810c = om0Var;
        this.f35811d = str2;
        this.f35812e = str3;
        this.f35813f = str4;
        this.f35814g = str5;
        this.f35815h = str6;
        this.f35816i = zArr;
    }
}
