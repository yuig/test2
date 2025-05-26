package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ul0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("feedback")
    private String f42580a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("feedback_types")
    private List<Integer> f42581b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("satisfaction")
    private Integer f42582c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42583d;

    public /* synthetic */ ul0(String str, List list, Integer num, boolean[] zArr, int i13) {
        this(str, list, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ul0 ul0Var = (ul0) obj;
        return Objects.equals(this.f42582c, ul0Var.f42582c) && Objects.equals(this.f42580a, ul0Var.f42580a) && Objects.equals(this.f42581b, ul0Var.f42581b);
    }

    public final int hashCode() {
        return Objects.hash(this.f42580a, this.f42581b, this.f42582c);
    }

    public ul0() {
        this.f42583d = new boolean[3];
    }

    private ul0(String str, List<Integer> list, Integer num, boolean[] zArr) {
        this.f42580a = str;
        this.f42581b = list;
        this.f42582c = num;
        this.f42583d = zArr;
    }
}
