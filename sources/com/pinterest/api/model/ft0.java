package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ft0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37800a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37801b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("ad_unit_id")
    private String f37802c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("aspect_ratio_type")
    private Integer f37803d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("format_type")
    private Integer f37804e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("header_size")
    private Integer f37805f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("qi_cache_size")
    private Integer f37806g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("qi_cool_down_seconds")
    private Integer f37807h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f37808i;

    public /* synthetic */ ft0(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean[] zArr, int i13) {
        this(str, str2, str3, num, num2, num3, num4, num5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ft0 ft0Var = (ft0) obj;
        return Objects.equals(this.f37807h, ft0Var.f37807h) && Objects.equals(this.f37806g, ft0Var.f37806g) && Objects.equals(this.f37805f, ft0Var.f37805f) && Objects.equals(this.f37804e, ft0Var.f37804e) && Objects.equals(this.f37803d, ft0Var.f37803d) && Objects.equals(this.f37800a, ft0Var.f37800a) && Objects.equals(this.f37801b, ft0Var.f37801b) && Objects.equals(this.f37802c, ft0Var.f37802c);
    }

    public final int hashCode() {
        return Objects.hash(this.f37800a, this.f37801b, this.f37802c, this.f37803d, this.f37804e, this.f37805f, this.f37806g, this.f37807h);
    }

    public final String i() {
        return this.f37802c;
    }

    public final Integer j() {
        Integer num = this.f37803d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer k() {
        Integer num = this.f37804e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer l() {
        Integer num = this.f37806g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer m() {
        Integer num = this.f37807h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public ft0() {
        this.f37808i = new boolean[8];
    }

    private ft0(@NonNull String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean[] zArr) {
        this.f37800a = str;
        this.f37801b = str2;
        this.f37802c = str3;
        this.f37803d = num;
        this.f37804e = num2;
        this.f37805f = num3;
        this.f37806g = num4;
        this.f37807h = num5;
        this.f37808i = zArr;
    }
}
