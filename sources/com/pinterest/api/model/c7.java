package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class c7 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("covers_background")
    private String f36314a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("is_viewed")
    private Boolean f36315b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("type_text")
    private String f36316c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("upcoming_update_date_text")
    private String f36317d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36318e;

    public /* synthetic */ c7(String str, Boolean bool, String str2, String str3, boolean[] zArr, int i13) {
        this(str, bool, str2, str3, zArr);
    }

    public final String e() {
        return this.f36314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return Objects.equals(this.f36315b, c7Var.f36315b) && Objects.equals(this.f36314a, c7Var.f36314a) && Objects.equals(this.f36316c, c7Var.f36316c) && Objects.equals(this.f36317d, c7Var.f36317d);
    }

    public final Boolean f() {
        Boolean bool = this.f36315b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String g() {
        return this.f36316c;
    }

    public final String h() {
        return this.f36317d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36314a, this.f36315b, this.f36316c, this.f36317d);
    }

    public c7() {
        this.f36318e = new boolean[4];
    }

    private c7(String str, Boolean bool, String str2, String str3, boolean[] zArr) {
        this.f36314a = str;
        this.f36315b = bool;
        this.f36316c = str2;
        this.f36317d = str3;
        this.f36318e = zArr;
    }
}
