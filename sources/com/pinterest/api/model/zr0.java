package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class zr0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("accept")
    private String f44424a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("decline")
    private String f44425b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("subtitle")
    private String f44426c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f44427d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44428e;

    public /* synthetic */ zr0(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f44424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zr0 zr0Var = (zr0) obj;
        return Objects.equals(this.f44424a, zr0Var.f44424a) && Objects.equals(this.f44425b, zr0Var.f44425b) && Objects.equals(this.f44426c, zr0Var.f44426c) && Objects.equals(this.f44427d, zr0Var.f44427d);
    }

    public final String f() {
        return this.f44425b;
    }

    public final String g() {
        return this.f44427d;
    }

    public final int hashCode() {
        return Objects.hash(this.f44424a, this.f44425b, this.f44426c, this.f44427d);
    }

    public zr0() {
        this.f44428e = new boolean[4];
    }

    private zr0(String str, String str2, String str3, @NonNull String str4, boolean[] zArr) {
        this.f44424a = str;
        this.f44425b = str2;
        this.f44426c = str3;
        this.f44427d = str4;
        this.f44428e = zArr;
    }
}
