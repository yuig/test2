package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class hj0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38464a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38465b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("bbox")
    private lj0 f38466c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_base64")
    private String f38467d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_size")
    private pj0 f38468e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pin")
    private f30 f38469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38470g;

    public /* synthetic */ hj0(String str, String str2, lj0 lj0Var, String str3, pj0 pj0Var, f30 f30Var, boolean[] zArr, int i13) {
        this(str, str2, lj0Var, str3, pj0Var, f30Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f38464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        return Objects.equals(this.f38464a, hj0Var.f38464a) && Objects.equals(this.f38465b, hj0Var.f38465b) && Objects.equals(this.f38466c, hj0Var.f38466c) && Objects.equals(this.f38467d, hj0Var.f38467d) && Objects.equals(this.f38468e, hj0Var.f38468e) && Objects.equals(this.f38469f, hj0Var.f38469f);
    }

    public final int hashCode() {
        return Objects.hash(this.f38464a, this.f38465b, this.f38466c, this.f38467d, this.f38468e, this.f38469f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f38465b;
    }

    public hj0() {
        this.f38470g = new boolean[6];
    }

    private hj0(@NonNull String str, String str2, lj0 lj0Var, String str3, pj0 pj0Var, f30 f30Var, boolean[] zArr) {
        this.f38464a = str;
        this.f38465b = str2;
        this.f38466c = lj0Var;
        this.f38467d = str3;
        this.f38468e = pj0Var;
        this.f38469f = f30Var;
        this.f38470g = zArr;
    }
}
