package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ym {

    /* renamed from: a, reason: collision with root package name */
    @om.b("interest_id_str")
    private String f44078a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("name")
    private String f44079b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f44080c;

    public /* synthetic */ ym(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f44078a;
    }

    public final String d() {
        return this.f44079b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ym ymVar = (ym) obj;
        return Objects.equals(this.f44078a, ymVar.f44078a) && Objects.equals(this.f44079b, ymVar.f44079b);
    }

    public final int hashCode() {
        return Objects.hash(this.f44078a, this.f44079b);
    }

    public ym() {
        this.f44080c = new boolean[2];
    }

    private ym(String str, String str2, boolean[] zArr) {
        this.f44078a = str;
        this.f44079b = str2;
        this.f44080c = zArr;
    }
}
