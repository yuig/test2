package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class jv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39156a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39157b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("prefilled_value")
    private String f39158c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39159d;

    public /* synthetic */ jv0(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    public final String d() {
        return this.f39158c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jv0 jv0Var = (jv0) obj;
        return Objects.equals(this.f39156a, jv0Var.f39156a) && Objects.equals(this.f39157b, jv0Var.f39157b) && Objects.equals(this.f39158c, jv0Var.f39158c);
    }

    public final int hashCode() {
        return Objects.hash(this.f39156a, this.f39157b, this.f39158c);
    }

    public jv0() {
        this.f39159d = new boolean[3];
    }

    private jv0(@NonNull String str, String str2, String str3, boolean[] zArr) {
        this.f39156a = str;
        this.f39157b = str2;
        this.f39158c = str3;
        this.f39159d = zArr;
    }
}
