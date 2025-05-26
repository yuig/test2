package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class sp0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("cooking_time")
    private Integer f41963a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("prep_time")
    private Integer f41964b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("serving_size")
    private Integer f41965c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41966d;

    public /* synthetic */ sp0(Integer num, Integer num2, Integer num3, boolean[] zArr, int i13) {
        this(num, num2, num3, zArr);
    }

    public final Integer d() {
        Integer num = this.f41963a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer e() {
        Integer num = this.f41965c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sp0 sp0Var = (sp0) obj;
        return Objects.equals(this.f41965c, sp0Var.f41965c) && Objects.equals(this.f41964b, sp0Var.f41964b) && Objects.equals(this.f41963a, sp0Var.f41963a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41963a, this.f41964b, this.f41965c);
    }

    public sp0() {
        this.f41966d = new boolean[3];
    }

    private sp0(Integer num, Integer num2, Integer num3, boolean[] zArr) {
        this.f41963a = num;
        this.f41964b = num2;
        this.f41965c = num3;
        this.f41966d = zArr;
    }
}
