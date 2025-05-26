package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class r10 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41467a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41468b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("amt")
    private String f41469c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f41470d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41471e;

    public /* synthetic */ r10(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f41469c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return Objects.equals(this.f41467a, r10Var.f41467a) && Objects.equals(this.f41468b, r10Var.f41468b) && Objects.equals(this.f41469c, r10Var.f41469c) && Objects.equals(this.f41470d, r10Var.f41470d);
    }

    public final String f() {
        return this.f41470d;
    }

    public final int hashCode() {
        return Objects.hash(this.f41467a, this.f41468b, this.f41469c, this.f41470d);
    }

    public r10() {
        this.f41471e = new boolean[4];
    }

    private r10(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f41467a = str;
        this.f41468b = str2;
        this.f41469c = str3;
        this.f41470d = str4;
        this.f41471e = zArr;
    }
}
