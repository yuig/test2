package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class rv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41683a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41684b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("object_fill_color")
    private jv0 f41685c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("object_graphic")
    private nv0 f41686d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("object_text")
    private vv0 f41687e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("object_type")
    private Integer f41688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41689g;

    public /* synthetic */ rv0(String str, String str2, jv0 jv0Var, nv0 nv0Var, vv0 vv0Var, Integer num, boolean[] zArr, int i13) {
        this(str, str2, jv0Var, nv0Var, vv0Var, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        return Objects.equals(this.f41688f, rv0Var.f41688f) && Objects.equals(this.f41683a, rv0Var.f41683a) && Objects.equals(this.f41684b, rv0Var.f41684b) && Objects.equals(this.f41685c, rv0Var.f41685c) && Objects.equals(this.f41686d, rv0Var.f41686d) && Objects.equals(this.f41687e, rv0Var.f41687e);
    }

    public final jv0 g() {
        return this.f41685c;
    }

    public final nv0 h() {
        return this.f41686d;
    }

    public final int hashCode() {
        return Objects.hash(this.f41683a, this.f41684b, this.f41685c, this.f41686d, this.f41687e, this.f41688f);
    }

    public final vv0 i() {
        return this.f41687e;
    }

    public rv0() {
        this.f41689g = new boolean[6];
    }

    private rv0(@NonNull String str, String str2, jv0 jv0Var, nv0 nv0Var, vv0 vv0Var, Integer num, boolean[] zArr) {
        this.f41683a = str;
        this.f41684b = str2;
        this.f41685c = jv0Var;
        this.f41686d = nv0Var;
        this.f41687e = vv0Var;
        this.f41688f = num;
        this.f41689g = zArr;
    }
}
