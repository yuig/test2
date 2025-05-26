package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("advertiser_id")
    private String f36589a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("email")
    private String f36590b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("full_name")
    private String f36591c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("lead_id")
    private String f36592d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("phone_number")
    private String f36593e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("zip_code")
    private String f36594f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36595g;

    public /* synthetic */ d0(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Objects.equals(this.f36589a, d0Var.f36589a) && Objects.equals(this.f36590b, d0Var.f36590b) && Objects.equals(this.f36591c, d0Var.f36591c) && Objects.equals(this.f36592d, d0Var.f36592d) && Objects.equals(this.f36593e, d0Var.f36593e) && Objects.equals(this.f36594f, d0Var.f36594f);
    }

    public final int hashCode() {
        return Objects.hash(this.f36589a, this.f36590b, this.f36591c, this.f36592d, this.f36593e, this.f36594f);
    }

    public d0() {
        this.f36595g = new boolean[6];
    }

    private d0(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, String str5, String str6, boolean[] zArr) {
        this.f36589a = str;
        this.f36590b = str2;
        this.f36591c = str3;
        this.f36592d = str4;
        this.f36593e = str5;
        this.f36594f = str6;
        this.f36595g = zArr;
    }
}
