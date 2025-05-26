package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class qd0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("eligible")
    private Boolean f41274a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("label")
    private String f41275b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("req_type")
    private Integer f41276c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41277d;

    public /* synthetic */ qd0(Boolean bool, String str, Integer num, boolean[] zArr, int i13) {
        this(bool, str, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return Objects.equals(this.f41276c, qd0Var.f41276c) && Objects.equals(this.f41274a, qd0Var.f41274a) && Objects.equals(this.f41275b, qd0Var.f41275b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41274a, this.f41275b, this.f41276c);
    }

    public qd0() {
        this.f41277d = new boolean[3];
    }

    private qd0(Boolean bool, String str, Integer num, boolean[] zArr) {
        this.f41274a = bool;
        this.f41275b = str;
        this.f41276c = num;
        this.f41277d = zArr;
    }
}
