package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class fy {

    /* renamed from: a, reason: collision with root package name */
    @om.b("button")
    private jy f37850a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("description")
    private tm f37851b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("title")
    private tm f37852c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f37853d;

    public /* synthetic */ fy(jy jyVar, tm tmVar, tm tmVar2, boolean[] zArr, int i13) {
        this(jyVar, tmVar, tmVar2, zArr);
    }

    public final jy d() {
        return this.f37850a;
    }

    public final tm e() {
        return this.f37851b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fy fyVar = (fy) obj;
        return Objects.equals(this.f37850a, fyVar.f37850a) && Objects.equals(this.f37851b, fyVar.f37851b) && Objects.equals(this.f37852c, fyVar.f37852c);
    }

    public final tm f() {
        return this.f37852c;
    }

    public final int hashCode() {
        return Objects.hash(this.f37850a, this.f37851b, this.f37852c);
    }

    public fy() {
        this.f37853d = new boolean[3];
    }

    private fy(jy jyVar, tm tmVar, tm tmVar2, boolean[] zArr) {
        this.f37850a = jyVar;
        this.f37851b = tmVar;
        this.f37852c = tmVar2;
        this.f37853d = zArr;
    }
}
