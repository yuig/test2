package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class pn0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("category_type")
    private Integer f41032a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private Integer f41033b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("value")
    private String f41034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41035d;

    public /* synthetic */ pn0(Integer num, Integer num2, String str, boolean[] zArr, int i13) {
        this(num, num2, str, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pn0 pn0Var = (pn0) obj;
        return Objects.equals(this.f41033b, pn0Var.f41033b) && Objects.equals(this.f41032a, pn0Var.f41032a) && Objects.equals(this.f41034c, pn0Var.f41034c);
    }

    public final int hashCode() {
        return Objects.hash(this.f41032a, this.f41033b, this.f41034c);
    }

    public pn0() {
        this.f41035d = new boolean[3];
    }

    private pn0(Integer num, Integer num2, String str, boolean[] zArr) {
        this.f41032a = num;
        this.f41033b = num2;
        this.f41034c = str;
        this.f41035d = zArr;
    }
}
