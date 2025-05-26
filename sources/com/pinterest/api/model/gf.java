package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class gf {

    /* renamed from: a, reason: collision with root package name */
    @om.b("h")
    private Integer f38056a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("m")
    private Integer f38057b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38058c;

    public /* synthetic */ gf(Integer num, Integer num2, boolean[] zArr, int i13) {
        this(num, num2, zArr);
    }

    public final Integer c() {
        Integer num = this.f38056a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer d() {
        Integer num = this.f38057b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gf gfVar = (gf) obj;
        return Objects.equals(this.f38057b, gfVar.f38057b) && Objects.equals(this.f38056a, gfVar.f38056a);
    }

    public final int hashCode() {
        return Objects.hash(this.f38056a, this.f38057b);
    }

    public gf() {
        this.f38058c = new boolean[2];
    }

    private gf(Integer num, Integer num2, boolean[] zArr) {
        this.f38056a = num;
        this.f38057b = num2;
        this.f38058c = zArr;
    }
}
