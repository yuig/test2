package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40841a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40842b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("site_name")
    private String f40843c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("url")
    private String f40844d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40845e;

    public /* synthetic */ p0(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.f40841a, p0Var.f40841a) && Objects.equals(this.f40842b, p0Var.f40842b) && Objects.equals(this.f40843c, p0Var.f40843c) && Objects.equals(this.f40844d, p0Var.f40844d);
    }

    public final int hashCode() {
        return Objects.hash(this.f40841a, this.f40842b, this.f40843c, this.f40844d);
    }

    public p0() {
        this.f40845e = new boolean[4];
    }

    private p0(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f40841a = str;
        this.f40842b = str2;
        this.f40843c = str3;
        this.f40844d = str4;
        this.f40845e = zArr;
    }
}
