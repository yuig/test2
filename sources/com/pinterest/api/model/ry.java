package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ry {

    /* renamed from: a, reason: collision with root package name */
    @om.b("link")
    private String f41719a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("text")
    private String f41720b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41721c;

    public /* synthetic */ ry(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ry ryVar = (ry) obj;
        return Objects.equals(this.f41719a, ryVar.f41719a) && Objects.equals(this.f41720b, ryVar.f41720b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41719a, this.f41720b);
    }

    private ry(String str, String str2, boolean[] zArr) {
        this.f41719a = str;
        this.f41720b = str2;
        this.f41721c = zArr;
    }
}
