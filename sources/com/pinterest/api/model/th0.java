package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class th0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42212a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42213b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("serves")
    private String f42214c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("summary")
    private String f42215d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("yields")
    private String f42216e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42217f;

    public /* synthetic */ th0(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        th0 th0Var = (th0) obj;
        return Objects.equals(this.f42212a, th0Var.f42212a) && Objects.equals(this.f42213b, th0Var.f42213b) && Objects.equals(this.f42214c, th0Var.f42214c) && Objects.equals(this.f42215d, th0Var.f42215d) && Objects.equals(this.f42216e, th0Var.f42216e);
    }

    public final String f() {
        return this.f42214c;
    }

    public final String g() {
        return this.f42215d;
    }

    public final String h() {
        return this.f42216e;
    }

    public final int hashCode() {
        return Objects.hash(this.f42212a, this.f42213b, this.f42214c, this.f42215d, this.f42216e);
    }

    public th0() {
        this.f42217f = new boolean[5];
    }

    private th0(@NonNull String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f42212a = str;
        this.f42213b = str2;
        this.f42214c = str3;
        this.f42215d = str4;
        this.f42216e = str5;
        this.f42217f = zArr;
    }
}
