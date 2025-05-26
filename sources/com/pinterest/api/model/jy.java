package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class jy {

    /* renamed from: a, reason: collision with root package name */
    @om.b("aux_data")
    private ny f39168a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("contact_type")
    private Integer f39169b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("link")
    private String f39170c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("text")
    private String f39171d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39172e;

    public /* synthetic */ jy(ny nyVar, Integer num, String str, String str2, boolean[] zArr, int i13) {
        this(nyVar, num, str, str2, zArr);
    }

    public final ny e() {
        return this.f39168a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jy jyVar = (jy) obj;
        return Objects.equals(this.f39169b, jyVar.f39169b) && Objects.equals(this.f39168a, jyVar.f39168a) && Objects.equals(this.f39170c, jyVar.f39170c) && Objects.equals(this.f39171d, jyVar.f39171d);
    }

    public final Integer f() {
        Integer num = this.f39169b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String g() {
        return this.f39170c;
    }

    public final String h() {
        return this.f39171d;
    }

    public final int hashCode() {
        return Objects.hash(this.f39168a, this.f39169b, this.f39170c, this.f39171d);
    }

    public jy() {
        this.f39172e = new boolean[4];
    }

    private jy(ny nyVar, Integer num, String str, String str2, boolean[] zArr) {
        this.f39168a = nyVar;
        this.f39169b = num;
        this.f39170c = str;
        this.f39171d = str2;
        this.f39172e = zArr;
    }
}
