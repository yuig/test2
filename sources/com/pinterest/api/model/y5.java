package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class y5 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43949a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43950b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("args")
    private List<Map<String, Object>> f43951c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("format")
    private String f43952d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43953e;

    public /* synthetic */ y5(String str, String str2, List list, String str3, boolean[] zArr, int i13) {
        this(str, str2, list, str3, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return Objects.equals(this.f43949a, y5Var.f43949a) && Objects.equals(this.f43950b, y5Var.f43950b) && Objects.equals(this.f43951c, y5Var.f43951c) && Objects.equals(this.f43952d, y5Var.f43952d);
    }

    public final List h() {
        return this.f43951c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43949a, this.f43950b, this.f43951c, this.f43952d);
    }

    public final String j() {
        return this.f43952d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f43950b;
    }

    public y5() {
        this.f43953e = new boolean[4];
    }

    private y5(@NonNull String str, String str2, List<Map<String, Object>> list, String str3, boolean[] zArr) {
        this.f43949a = str;
        this.f43950b = str2;
        this.f43951c = list;
        this.f43952d = str3;
        this.f43953e = zArr;
    }
}
