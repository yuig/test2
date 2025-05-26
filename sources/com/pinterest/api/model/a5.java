package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("daily_metrics")
    private List<u3> f35651a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("hourly_metrics")
    private List<c4> f35652b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("organic")
    private w4 f35653c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("paid")
    private w4 f35654d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("summary_metrics")
    private i5 f35655e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35656f;

    public /* synthetic */ a5(List list, List list2, w4 w4Var, w4 w4Var2, i5 i5Var, boolean[] zArr, int i13) {
        this(list, list2, w4Var, w4Var2, i5Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return Objects.equals(this.f35651a, a5Var.f35651a) && Objects.equals(this.f35652b, a5Var.f35652b) && Objects.equals(this.f35653c, a5Var.f35653c) && Objects.equals(this.f35654d, a5Var.f35654d) && Objects.equals(this.f35655e, a5Var.f35655e);
    }

    public final List f() {
        return this.f35651a;
    }

    public final boolean g() {
        boolean[] zArr = this.f35656f;
        return zArr.length > 0 && zArr[0];
    }

    public final List h() {
        return this.f35652b;
    }

    public final int hashCode() {
        return Objects.hash(this.f35651a, this.f35652b, this.f35653c, this.f35654d, this.f35655e);
    }

    public final boolean i() {
        boolean[] zArr = this.f35656f;
        return zArr.length > 1 && zArr[1];
    }

    public final i5 j() {
        return this.f35655e;
    }

    public a5() {
        this.f35656f = new boolean[5];
    }

    private a5(List<u3> list, List<c4> list2, w4 w4Var, w4 w4Var2, i5 i5Var, boolean[] zArr) {
        this.f35651a = list;
        this.f35652b = list2;
        this.f35653c = w4Var;
        this.f35654d = w4Var2;
        this.f35655e = i5Var;
        this.f35656f = zArr;
    }
}
