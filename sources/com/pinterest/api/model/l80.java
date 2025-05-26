package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class l80 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("daily_metrics")
    private List<u3> f39667a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("date_availability")
    private w30 f39668b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("summary_metrics")
    private k4 f39669c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39670d;

    public /* synthetic */ l80(List list, w30 w30Var, k4 k4Var, boolean[] zArr, int i13) {
        this(list, w30Var, k4Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return Objects.equals(this.f39667a, l80Var.f39667a) && Objects.equals(this.f39668b, l80Var.f39668b) && Objects.equals(this.f39669c, l80Var.f39669c);
    }

    public final int hashCode() {
        return Objects.hash(this.f39667a, this.f39668b, this.f39669c);
    }

    public l80() {
        this.f39670d = new boolean[3];
    }

    private l80(List<u3> list, w30 w30Var, k4 k4Var, boolean[] zArr) {
        this.f39667a = list;
        this.f39668b = w30Var;
        this.f39669c = k4Var;
        this.f39670d = zArr;
    }
}
