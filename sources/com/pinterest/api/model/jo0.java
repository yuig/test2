package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class jo0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("basics")
    private qk0 f39103a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("canvas_aspect_ratio")
    private Double f39104b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("compatible_version")
    private String f39105c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("diy_data")
    private ql0 f39106d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_compatible")
    private Boolean f39107e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pin_image_signature")
    private String f39108f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("pin_title")
    private String f39109g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("recipe_data")
    private sp0 f39110h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("template_type")
    private Integer f39111i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("version")
    private String f39112j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f39113k;

    public /* synthetic */ jo0(qk0 qk0Var, Double d2, String str, ql0 ql0Var, Boolean bool, String str2, String str3, sp0 sp0Var, Integer num, String str4, boolean[] zArr, int i13) {
        this(qk0Var, d2, str, ql0Var, bool, str2, str3, sp0Var, num, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jo0 jo0Var = (jo0) obj;
        return Objects.equals(this.f39111i, jo0Var.f39111i) && Objects.equals(this.f39107e, jo0Var.f39107e) && Objects.equals(this.f39104b, jo0Var.f39104b) && Objects.equals(this.f39103a, jo0Var.f39103a) && Objects.equals(this.f39105c, jo0Var.f39105c) && Objects.equals(this.f39106d, jo0Var.f39106d) && Objects.equals(this.f39108f, jo0Var.f39108f) && Objects.equals(this.f39109g, jo0Var.f39109g) && Objects.equals(this.f39110h, jo0Var.f39110h) && Objects.equals(this.f39112j, jo0Var.f39112j);
    }

    public final int hashCode() {
        return Objects.hash(this.f39103a, this.f39104b, this.f39105c, this.f39106d, this.f39107e, this.f39108f, this.f39109g, this.f39110h, this.f39111i, this.f39112j);
    }

    public final qk0 k() {
        return this.f39103a;
    }

    public final Double l() {
        Double d2 = this.f39104b;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String m() {
        return this.f39105c;
    }

    public final ql0 n() {
        return this.f39106d;
    }

    public final Boolean o() {
        Boolean bool = this.f39107e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String p() {
        return this.f39108f;
    }

    public final String q() {
        return this.f39109g;
    }

    public final sp0 r() {
        return this.f39110h;
    }

    public final Integer s() {
        Integer num = this.f39111i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final go0 t() {
        return new go0(this, 0);
    }

    public jo0() {
        this.f39113k = new boolean[10];
    }

    private jo0(qk0 qk0Var, Double d2, @NonNull String str, ql0 ql0Var, Boolean bool, String str2, String str3, sp0 sp0Var, Integer num, @NonNull String str4, boolean[] zArr) {
        this.f39103a = qk0Var;
        this.f39104b = d2;
        this.f39105c = str;
        this.f39106d = ql0Var;
        this.f39107e = bool;
        this.f39108f = str2;
        this.f39109g = str3;
        this.f39110h = sp0Var;
        this.f39111i = num;
        this.f39112j = str4;
        this.f39113k = zArr;
    }
}
