package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class sr0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("conditions")
    private List<nr0> f41976a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("go_to")
    private String f41977b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41978c;

    public /* synthetic */ sr0(List list, String str, boolean[] zArr, int i13) {
        this(list, str, zArr);
    }

    public final List c() {
        return this.f41976a;
    }

    public final String d() {
        return this.f41977b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sr0 sr0Var = (sr0) obj;
        return Objects.equals(this.f41976a, sr0Var.f41976a) && Objects.equals(this.f41977b, sr0Var.f41977b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41976a, this.f41977b);
    }

    public sr0() {
        this.f41978c = new boolean[2];
    }

    private sr0(List<nr0> list, String str, boolean[] zArr) {
        this.f41976a = list;
        this.f41977b = str;
        this.f41978c = zArr;
    }
}
