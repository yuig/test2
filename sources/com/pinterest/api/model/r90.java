package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class r90 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("label")
    private String f41521a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("link")
    private String f41522b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41523c;

    public /* synthetic */ r90(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f41521a;
    }

    public final String d() {
        return this.f41522b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return Objects.equals(this.f41521a, r90Var.f41521a) && Objects.equals(this.f41522b, r90Var.f41522b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41521a, this.f41522b);
    }

    public r90() {
        this.f41523c = new boolean[2];
    }

    private r90(String str, String str2, boolean[] zArr) {
        this.f41521a = str;
        this.f41522b = str2;
        this.f41523c = zArr;
    }
}
