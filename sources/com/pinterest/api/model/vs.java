package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class vs {

    /* renamed from: a, reason: collision with root package name */
    @om.b("has_invalid_instagram_auth")
    private Boolean f42970a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("is_new_api")
    private Boolean f42971b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("url")
    private String f42972c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("username")
    private String f42973d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42974e;

    public /* synthetic */ vs(Boolean bool, Boolean bool2, String str, String str2, boolean[] zArr, int i13) {
        this(bool, bool2, str, str2, zArr);
    }

    public final Boolean e() {
        Boolean bool = this.f42971b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vs vsVar = (vs) obj;
        return Objects.equals(this.f42971b, vsVar.f42971b) && Objects.equals(this.f42970a, vsVar.f42970a) && Objects.equals(this.f42972c, vsVar.f42972c) && Objects.equals(this.f42973d, vsVar.f42973d);
    }

    public final String f() {
        return this.f42972c;
    }

    public final String g() {
        return this.f42973d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42970a, this.f42971b, this.f42972c, this.f42973d);
    }

    public vs() {
        this.f42974e = new boolean[4];
    }

    private vs(Boolean bool, Boolean bool2, String str, String str2, boolean[] zArr) {
        this.f42970a = bool;
        this.f42971b = bool2;
        this.f42972c = str;
        this.f42973d = str2;
        this.f42974e = zArr;
    }
}
