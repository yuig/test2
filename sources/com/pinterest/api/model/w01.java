package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class w01 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("cookies")
    private e11 f43132a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("visit_response")
    private m11 f43133b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f43134c;

    public /* synthetic */ w01(e11 e11Var, m11 m11Var, boolean[] zArr, int i13) {
        this(e11Var, m11Var, zArr);
    }

    public final e11 c() {
        return this.f43132a;
    }

    public final m11 d() {
        return this.f43133b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return Objects.equals(this.f43132a, w01Var.f43132a) && Objects.equals(this.f43133b, w01Var.f43133b);
    }

    public final int hashCode() {
        return Objects.hash(this.f43132a, this.f43133b);
    }

    public w01() {
        this.f43134c = new boolean[2];
    }

    private w01(e11 e11Var, m11 m11Var, boolean[] zArr) {
        this.f43132a = e11Var;
        this.f43133b = m11Var;
        this.f43134c = zArr;
    }
}
