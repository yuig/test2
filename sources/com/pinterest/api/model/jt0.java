package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class jt0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39147a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39148b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("homefeed")
    private List<ft0> f39149c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("related_pins")
    private List<ft0> f39150d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("search")
    private List<ft0> f39151e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39152f;

    public /* synthetic */ jt0(String str, String str2, List list, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, list2, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jt0 jt0Var = (jt0) obj;
        return Objects.equals(this.f39147a, jt0Var.f39147a) && Objects.equals(this.f39148b, jt0Var.f39148b) && Objects.equals(this.f39149c, jt0Var.f39149c) && Objects.equals(this.f39150d, jt0Var.f39150d) && Objects.equals(this.f39151e, jt0Var.f39151e);
    }

    public final List f() {
        return this.f39149c;
    }

    public final List g() {
        return this.f39150d;
    }

    public final List h() {
        return this.f39151e;
    }

    public final int hashCode() {
        return Objects.hash(this.f39147a, this.f39148b, this.f39149c, this.f39150d, this.f39151e);
    }

    public jt0() {
        this.f39152f = new boolean[5];
    }

    private jt0(@NonNull String str, String str2, List<ft0> list, List<ft0> list2, List<ft0> list3, boolean[] zArr) {
        this.f39147a = str;
        this.f39148b = str2;
        this.f39149c = list;
        this.f39150d = list2;
        this.f39151e = list3;
        this.f39152f = zArr;
    }
}
