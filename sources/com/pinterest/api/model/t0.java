package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class t0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42027a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42028b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("email")
    private String f42029c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f42030d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("name_initials")
    private String f42031e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("type")
    private String f42032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42033g;

    public /* synthetic */ t0(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Objects.equals(this.f42027a, t0Var.f42027a) && Objects.equals(this.f42028b, t0Var.f42028b) && Objects.equals(this.f42029c, t0Var.f42029c) && Objects.equals(this.f42030d, t0Var.f42030d) && Objects.equals(this.f42031e, t0Var.f42031e) && Objects.equals(this.f42032f, t0Var.f42032f);
    }

    public final int hashCode() {
        return Objects.hash(this.f42027a, this.f42028b, this.f42029c, this.f42030d, this.f42031e, this.f42032f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42028b;
    }

    public t0() {
        this.f42033g = new boolean[6];
    }

    private t0(@NonNull String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr) {
        this.f42027a = str;
        this.f42028b = str2;
        this.f42029c = str3;
        this.f42030d = str4;
        this.f42031e = str5;
        this.f42032f = str6;
        this.f42033g = zArr;
    }
}
