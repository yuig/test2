package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class tz0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("name")
    private String f42367a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("verified")
    private Boolean f42368b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f42369c;

    public /* synthetic */ tz0(String str, Boolean bool, boolean[] zArr, int i13) {
        this(str, bool, zArr);
    }

    public static qz0 c() {
        return new qz0(0);
    }

    public final String d() {
        return this.f42367a;
    }

    public final Boolean e() {
        Boolean bool = this.f42368b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return Objects.equals(this.f42368b, tz0Var.f42368b) && Objects.equals(this.f42367a, tz0Var.f42367a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42367a, this.f42368b);
    }

    public tz0() {
        this.f42369c = new boolean[2];
    }

    private tz0(String str, Boolean bool, boolean[] zArr) {
        this.f42367a = str;
        this.f42368b = bool;
        this.f42369c = zArr;
    }
}
