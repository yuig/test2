package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class jy0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f39173a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("key_signature")
    private String f39174b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("upload_bucket")
    private String f39175c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("upload_id")
    private String f39176d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("upload_region")
    private String f39177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39178f;

    public /* synthetic */ jy0(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return Objects.equals(this.f39173a, jy0Var.f39173a) && Objects.equals(this.f39174b, jy0Var.f39174b) && Objects.equals(this.f39175c, jy0Var.f39175c) && Objects.equals(this.f39176d, jy0Var.f39176d) && Objects.equals(this.f39177e, jy0Var.f39177e);
    }

    public final String f() {
        return this.f39173a;
    }

    public final String g() {
        return this.f39174b;
    }

    public final String h() {
        return this.f39175c;
    }

    public final int hashCode() {
        return Objects.hash(this.f39173a, this.f39174b, this.f39175c, this.f39176d, this.f39177e);
    }

    public final String i() {
        return this.f39176d;
    }

    public final String j() {
        return this.f39177e;
    }

    public jy0() {
        this.f39178f = new boolean[5];
    }

    private jy0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, String str5, boolean[] zArr) {
        this.f39173a = str;
        this.f39174b = str2;
        this.f39175c = str3;
        this.f39176d = str4;
        this.f39177e = str5;
        this.f39178f = zArr;
    }
}
