package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("done")
    private Integer f39988a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("saves")
    private Integer f39989b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39990c;

    public /* synthetic */ m3(Integer num, Integer num2, boolean[] zArr, int i13) {
        this(num, num2, zArr);
    }

    public final Integer c() {
        Integer num = this.f39989b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return Objects.equals(this.f39989b, m3Var.f39989b) && Objects.equals(this.f39988a, m3Var.f39988a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39988a, this.f39989b);
    }

    public m3() {
        this.f39990c = new boolean[2];
    }

    private m3(Integer num, Integer num2, boolean[] zArr) {
        this.f39988a = num;
        this.f39989b = num2;
        this.f39990c = zArr;
    }
}
