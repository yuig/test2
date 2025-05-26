package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class fy0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37854a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37855b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("business")
    private d f37856c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_link_valid")
    private Boolean f37857d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("owner")
    private d f37858e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f37859f;

    public /* synthetic */ fy0(String str, String str2, d dVar, Boolean bool, d dVar2, boolean[] zArr, int i13) {
        this(str, str2, dVar, bool, dVar2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37854a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return Objects.equals(this.f37857d, fy0Var.f37857d) && Objects.equals(this.f37854a, fy0Var.f37854a) && Objects.equals(this.f37855b, fy0Var.f37855b) && Objects.equals(this.f37856c, fy0Var.f37856c) && Objects.equals(this.f37858e, fy0Var.f37858e);
    }

    public final int hashCode() {
        return Objects.hash(this.f37854a, this.f37855b, this.f37856c, this.f37857d, this.f37858e);
    }

    public final d j() {
        return this.f37856c;
    }

    public final Boolean k() {
        Boolean bool = this.f37857d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final d l() {
        return this.f37858e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f37855b;
    }

    public fy0() {
        this.f37859f = new boolean[5];
    }

    private fy0(@NonNull String str, String str2, d dVar, Boolean bool, d dVar2, boolean[] zArr) {
        this.f37854a = str;
        this.f37855b = str2;
        this.f37856c = dVar;
        this.f37857d = bool;
        this.f37858e = dVar2;
        this.f37859f = zArr;
    }
}
