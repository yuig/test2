package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class wm0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("category_type")
    private Integer f43291a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f43292b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("value")
    private String f43293c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43294d;

    public /* synthetic */ wm0(Integer num, String str, String str2, boolean[] zArr, int i13) {
        this(num, str, str2, zArr);
    }

    public final Integer d() {
        Integer num = this.f43291a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String e() {
        return this.f43292b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wm0 wm0Var = (wm0) obj;
        return Objects.equals(this.f43291a, wm0Var.f43291a) && Objects.equals(this.f43292b, wm0Var.f43292b) && Objects.equals(this.f43293c, wm0Var.f43293c);
    }

    public final String f() {
        return this.f43293c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43291a, this.f43292b, this.f43293c);
    }

    public wm0() {
        this.f43294d = new boolean[3];
    }

    private wm0(Integer num, @NonNull String str, @NonNull String str2, boolean[] zArr) {
        this.f43291a = num;
        this.f43292b = str;
        this.f43293c = str2;
        this.f43294d = zArr;
    }
}
