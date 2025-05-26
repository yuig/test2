package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ph0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40986a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40987b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("reason")
    private String f40988c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("show_warning")
    private Boolean f40989d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40990e;

    public /* synthetic */ ph0(String str, String str2, String str3, Boolean bool, boolean[] zArr, int i13) {
        this(str, str2, str3, bool, zArr);
    }

    public final String e() {
        return this.f40988c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        return Objects.equals(this.f40989d, ph0Var.f40989d) && Objects.equals(this.f40986a, ph0Var.f40986a) && Objects.equals(this.f40987b, ph0Var.f40987b) && Objects.equals(this.f40988c, ph0Var.f40988c);
    }

    public final Boolean f() {
        Boolean bool = this.f40989d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final int hashCode() {
        return Objects.hash(this.f40986a, this.f40987b, this.f40988c, this.f40989d);
    }

    public ph0() {
        this.f40990e = new boolean[4];
    }

    private ph0(@NonNull String str, String str2, String str3, Boolean bool, boolean[] zArr) {
        this.f40986a = str;
        this.f40987b = str2;
        this.f40988c = str3;
        this.f40989d = bool;
        this.f40990e = zArr;
    }
}
