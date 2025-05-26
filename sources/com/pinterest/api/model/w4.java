package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("daily_metrics")
    private List<u3> f43166a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("hourly_metrics")
    private List<u3> f43167b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("summary_metrics")
    private i5 f43168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43169d;

    public /* synthetic */ w4(List list, List list2, i5 i5Var, boolean[] zArr, int i13) {
        this(list, list2, i5Var, zArr);
    }

    public final i5 d() {
        return this.f43168c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return Objects.equals(this.f43166a, w4Var.f43166a) && Objects.equals(this.f43167b, w4Var.f43167b) && Objects.equals(this.f43168c, w4Var.f43168c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43166a, this.f43167b, this.f43168c);
    }

    public w4() {
        this.f43169d = new boolean[3];
    }

    private w4(List<u3> list, List<u3> list2, i5 i5Var, boolean[] zArr) {
        this.f43166a = list;
        this.f43167b = list2;
        this.f43168c = i5Var;
        this.f43169d = zArr;
    }
}
