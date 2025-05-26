package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ll {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39812a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39813b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("label")
    private String f39814c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("swatch_hex_colors")
    private List<String> f39815d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39816e;

    public /* synthetic */ ll(String str, String str2, String str3, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, list, zArr);
    }

    public final String e() {
        return this.f39814c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ll llVar = (ll) obj;
        return Objects.equals(this.f39812a, llVar.f39812a) && Objects.equals(this.f39813b, llVar.f39813b) && Objects.equals(this.f39814c, llVar.f39814c) && Objects.equals(this.f39815d, llVar.f39815d);
    }

    public final List f() {
        return this.f39815d;
    }

    public final int hashCode() {
        return Objects.hash(this.f39812a, this.f39813b, this.f39814c, this.f39815d);
    }

    public ll() {
        this.f39816e = new boolean[4];
    }

    private ll(@NonNull String str, String str2, String str3, List<String> list, boolean[] zArr) {
        this.f39812a = str;
        this.f39813b = str2;
        this.f39814c = str3;
        this.f39815d = list;
        this.f39816e = zArr;
    }
}
