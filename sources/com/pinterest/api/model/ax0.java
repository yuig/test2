package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ax0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35887a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("font_size")
    private Integer f35888b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("font_weight")
    private Integer f35889c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("spacing_after")
    private Integer f35890d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("spacing_before")
    private Integer f35891e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("text")
    private String f35892f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("type")
    private String f35893g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35894h;

    public /* synthetic */ ax0(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, boolean[] zArr, int i13) {
        this(str, num, num2, num3, num4, str2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ax0 ax0Var = (ax0) obj;
        return Objects.equals(this.f35891e, ax0Var.f35891e) && Objects.equals(this.f35890d, ax0Var.f35890d) && Objects.equals(this.f35889c, ax0Var.f35889c) && Objects.equals(this.f35888b, ax0Var.f35888b) && Objects.equals(this.f35887a, ax0Var.f35887a) && Objects.equals(this.f35892f, ax0Var.f35892f) && Objects.equals(this.f35893g, ax0Var.f35893g);
    }

    public final int hashCode() {
        return Objects.hash(this.f35887a, this.f35888b, this.f35889c, this.f35890d, this.f35891e, this.f35892f, this.f35893g);
    }

    public ax0() {
        this.f35894h = new boolean[7];
    }

    private ax0(@NonNull String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, boolean[] zArr) {
        this.f35887a = str;
        this.f35888b = num;
        this.f35889c = num2;
        this.f35890d = num3;
        this.f35891e = num4;
        this.f35892f = str2;
        this.f35893g = str3;
        this.f35894h = zArr;
    }
}
