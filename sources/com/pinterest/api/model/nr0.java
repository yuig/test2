package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class nr0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("operator")
    private String f40469a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("values")
    private List<Double> f40470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40471c;

    public /* synthetic */ nr0(String str, List list, boolean[] zArr, int i13) {
        this(str, list, zArr);
    }

    public final String c() {
        return this.f40469a;
    }

    public final List d() {
        return this.f40470b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nr0 nr0Var = (nr0) obj;
        return Objects.equals(this.f40469a, nr0Var.f40469a) && Objects.equals(this.f40470b, nr0Var.f40470b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40469a, this.f40470b);
    }

    public nr0() {
        this.f40471c = new boolean[2];
    }

    private nr0(String str, List<Double> list, boolean[] zArr) {
        this.f40469a = str;
        this.f40470b = list;
        this.f40471c = zArr;
    }
}
