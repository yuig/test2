package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kc {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39380a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39381b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("category")
    private String f39382c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("ingredients")
    private List<r10> f39383d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39384e;

    public /* synthetic */ kc(String str, String str2, String str3, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, list, zArr);
    }

    public final String e() {
        return this.f39382c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kc kcVar = (kc) obj;
        return Objects.equals(this.f39380a, kcVar.f39380a) && Objects.equals(this.f39381b, kcVar.f39381b) && Objects.equals(this.f39382c, kcVar.f39382c) && Objects.equals(this.f39383d, kcVar.f39383d);
    }

    public final List f() {
        return this.f39383d;
    }

    public final String g() {
        return this.f39380a;
    }

    public final int hashCode() {
        return Objects.hash(this.f39380a, this.f39381b, this.f39382c, this.f39383d);
    }

    public kc() {
        this.f39384e = new boolean[4];
    }

    private kc(@NonNull String str, String str2, String str3, List<r10> list, boolean[] zArr) {
        this.f39380a = str;
        this.f39381b = str2;
        this.f39382c = str3;
        this.f39383d = list;
        this.f39384e = zArr;
    }
}
