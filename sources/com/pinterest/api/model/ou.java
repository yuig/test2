package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ou {

    /* renamed from: a, reason: collision with root package name */
    @om.b("author")
    private String f40813a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("author_url")
    private String f40814b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("link")
    private String f40815c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("provider_name")
    private String f40816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40817e;

    public /* synthetic */ ou(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f40813a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ou ouVar = (ou) obj;
        return Objects.equals(this.f40813a, ouVar.f40813a) && Objects.equals(this.f40814b, ouVar.f40814b) && Objects.equals(this.f40815c, ouVar.f40815c) && Objects.equals(this.f40816d, ouVar.f40816d);
    }

    public final String f() {
        return this.f40814b;
    }

    public final String g() {
        return this.f40815c;
    }

    public final String h() {
        return this.f40816d;
    }

    public final int hashCode() {
        return Objects.hash(this.f40813a, this.f40814b, this.f40815c, this.f40816d);
    }

    public ou() {
        this.f40817e = new boolean[4];
    }

    private ou(String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f40813a = str;
        this.f40814b = str2;
        this.f40815c = str3;
        this.f40816d = str4;
        this.f40817e = zArr;
    }
}
