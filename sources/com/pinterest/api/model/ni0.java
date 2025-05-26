package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ni0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40405a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40406b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("content")
    private ee f40407c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("shuffle")
    private fi0 f40408d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("user")
    private wy0 f40409e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40410f;

    public /* synthetic */ ni0(String str, String str2, ee eeVar, fi0 fi0Var, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, eeVar, fi0Var, wy0Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f40405a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ni0 ni0Var = (ni0) obj;
        return Objects.equals(this.f40405a, ni0Var.f40405a) && Objects.equals(this.f40406b, ni0Var.f40406b) && Objects.equals(this.f40407c, ni0Var.f40407c) && Objects.equals(this.f40408d, ni0Var.f40408d) && Objects.equals(this.f40409e, ni0Var.f40409e);
    }

    public final int hashCode() {
        return Objects.hash(this.f40405a, this.f40406b, this.f40407c, this.f40408d, this.f40409e);
    }

    public final fi0 j() {
        return this.f40408d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f40406b;
    }

    public ni0() {
        this.f40410f = new boolean[5];
    }

    private ni0(@NonNull String str, String str2, ee eeVar, fi0 fi0Var, wy0 wy0Var, boolean[] zArr) {
        this.f40405a = str;
        this.f40406b = str2;
        this.f40407c = eeVar;
        this.f40408d = fi0Var;
        this.f40409e = wy0Var;
        this.f40410f = zArr;
    }
}
