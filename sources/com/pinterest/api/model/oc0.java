package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class oc0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("board")
    private v7 f40673a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("interest")
    private zs f40674b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("pin")
    private f30 f40675c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("reason")
    private String f40676d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("reason_id")
    private String f40677e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("through_properties")
    private Map<String, Object> f40678f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40679g;

    public /* synthetic */ oc0(v7 v7Var, zs zsVar, f30 f30Var, String str, String str2, Map map, boolean[] zArr, int i13) {
        this(v7Var, zsVar, f30Var, str, str2, map, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oc0 oc0Var = (oc0) obj;
        return Objects.equals(this.f40673a, oc0Var.f40673a) && Objects.equals(this.f40674b, oc0Var.f40674b) && Objects.equals(this.f40675c, oc0Var.f40675c) && Objects.equals(this.f40676d, oc0Var.f40676d) && Objects.equals(this.f40677e, oc0Var.f40677e) && Objects.equals(this.f40678f, oc0Var.f40678f);
    }

    public final v7 g() {
        return this.f40673a;
    }

    public final zs h() {
        return this.f40674b;
    }

    public final int hashCode() {
        return Objects.hash(this.f40673a, this.f40674b, this.f40675c, this.f40676d, this.f40677e, this.f40678f);
    }

    public final f30 i() {
        return this.f40675c;
    }

    public final String j() {
        return this.f40676d;
    }

    public final String k() {
        return this.f40677e;
    }

    public final Map l() {
        return this.f40678f;
    }

    public oc0() {
        this.f40679g = new boolean[6];
    }

    private oc0(v7 v7Var, zs zsVar, f30 f30Var, String str, String str2, Map<String, Object> map, boolean[] zArr) {
        this.f40673a = v7Var;
        this.f40674b = zsVar;
        this.f40675c = f30Var;
        this.f40676d = str;
        this.f40677e = str2;
        this.f40678f = map;
        this.f40679g = zArr;
    }
}
