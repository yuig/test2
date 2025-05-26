package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class tn0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("blocks")
    private List<ao0> f42247a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("heading")
    private String f42248b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("type")
    private Integer f42249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42250d;

    public /* synthetic */ tn0(List list, String str, Integer num, boolean[] zArr, int i13) {
        this(list, str, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        return Objects.equals(this.f42249c, tn0Var.f42249c) && Objects.equals(this.f42247a, tn0Var.f42247a) && Objects.equals(this.f42248b, tn0Var.f42248b);
    }

    public final int hashCode() {
        return Objects.hash(this.f42247a, this.f42248b, this.f42249c);
    }

    public tn0() {
        this.f42250d = new boolean[3];
    }

    private tn0(List<ao0> list, String str, Integer num, boolean[] zArr) {
        this.f42247a = list;
        this.f42248b = str;
        this.f42249c = num;
        this.f42250d = zArr;
    }
}
