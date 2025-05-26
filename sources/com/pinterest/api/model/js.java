package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class js {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("description")
    private String f39134a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f39135b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("label")
    private String f39136c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39137d;

    public /* synthetic */ js(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    public final String d() {
        return this.f39134a;
    }

    public final String e() {
        return this.f39136c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        js jsVar = (js) obj;
        return Objects.equals(this.f39134a, jsVar.f39134a) && Objects.equals(this.f39135b, jsVar.f39135b) && Objects.equals(this.f39136c, jsVar.f39136c);
    }

    public final String f() {
        return this.f39135b;
    }

    public final int hashCode() {
        return Objects.hash(this.f39134a, this.f39135b, this.f39136c);
    }

    public js() {
        this.f39137d = new boolean[3];
    }

    private js(@NonNull String str, String str2, @NonNull String str3, boolean[] zArr) {
        this.f39134a = str;
        this.f39135b = str2;
        this.f39136c = str3;
        this.f39137d = zArr;
    }
}
