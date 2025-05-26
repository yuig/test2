package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class gz {

    /* renamed from: a, reason: collision with root package name */
    @om.b("link")
    private String f38185a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("text")
    private String f38186b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38187c;

    public /* synthetic */ gz(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f38185a;
    }

    public final String d() {
        return this.f38186b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gz gzVar = (gz) obj;
        return Objects.equals(this.f38185a, gzVar.f38185a) && Objects.equals(this.f38186b, gzVar.f38186b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38185a, this.f38186b);
    }

    public gz() {
        this.f38187c = new boolean[2];
    }

    private gz(String str, String str2, boolean[] zArr) {
        this.f38185a = str;
        this.f38186b = str2;
        this.f38187c = zArr;
    }
}
