package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class lf0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39738a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39739b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("font_size")
    private Integer f39740c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("font_weight")
    private Integer f39741d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("spacing_after")
    private Integer f39742e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("spacing_before")
    private Integer f39743f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("text")
    private String f39744g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39745h;

    public /* synthetic */ lf0(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, boolean[] zArr, int i13) {
        this(str, str2, num, num2, num3, num4, str3, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39738a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return Objects.equals(this.f39743f, lf0Var.f39743f) && Objects.equals(this.f39742e, lf0Var.f39742e) && Objects.equals(this.f39741d, lf0Var.f39741d) && Objects.equals(this.f39740c, lf0Var.f39740c) && Objects.equals(this.f39738a, lf0Var.f39738a) && Objects.equals(this.f39739b, lf0Var.f39739b) && Objects.equals(this.f39744g, lf0Var.f39744g);
    }

    public final int hashCode() {
        return Objects.hash(this.f39738a, this.f39739b, this.f39740c, this.f39741d, this.f39742e, this.f39743f, this.f39744g);
    }

    public final Integer l() {
        Integer num = this.f39740c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer n() {
        Integer num = this.f39742e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    @Override // dl1.s
    public final String o() {
        return this.f39739b;
    }

    public final Integer q() {
        Integer num = this.f39743f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String s() {
        return this.f39744g;
    }

    public lf0() {
        this.f39745h = new boolean[7];
    }

    private lf0(@NonNull String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, String str3, boolean[] zArr) {
        this.f39738a = str;
        this.f39739b = str2;
        this.f39740c = num;
        this.f39741d = num2;
        this.f39742e = num3;
        this.f39743f = num4;
        this.f39744g = str3;
        this.f39745h = zArr;
    }
}
