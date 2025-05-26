package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class s00 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("option_id")
    private Integer f41744a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("text")
    private String f41745b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41746c;

    public /* synthetic */ s00(Integer num, String str, boolean[] zArr, int i13) {
        this(num, str, zArr);
    }

    public final Integer c() {
        Integer num = this.f41744a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String d() {
        return this.f41745b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return Objects.equals(this.f41744a, s00Var.f41744a) && Objects.equals(this.f41745b, s00Var.f41745b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41744a, this.f41745b);
    }

    public s00() {
        this.f41746c = new boolean[2];
    }

    private s00(Integer num, String str, boolean[] zArr) {
        this.f41744a = num;
        this.f41745b = str;
        this.f41746c = zArr;
    }
}
