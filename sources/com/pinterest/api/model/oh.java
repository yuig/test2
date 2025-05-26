package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class oh {

    /* renamed from: a, reason: collision with root package name */
    @om.b("alignment")
    private Integer f40728a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("rep_style")
    private Integer f40729b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40730c;

    public /* synthetic */ oh(Integer num, Integer num2, boolean[] zArr, int i13) {
        this(num, num2, zArr);
    }

    public final Integer c() {
        Integer num = this.f40728a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oh ohVar = (oh) obj;
        return Objects.equals(this.f40729b, ohVar.f40729b) && Objects.equals(this.f40728a, ohVar.f40728a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40728a, this.f40729b);
    }

    public oh() {
        this.f40730c = new boolean[2];
    }

    private oh(Integer num, Integer num2, boolean[] zArr) {
        this.f40728a = num;
        this.f40729b = num2;
        this.f40730c = zArr;
    }
}
