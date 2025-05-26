package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class lx0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39936a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39937b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("aggregated_comment")
    private z2 f39938c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("creator_reply")
    private z2 f39939d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("display_did_its")
    private List<az0> f39940e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("user_did_it_data")
    private az0 f39941f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39942g;

    public /* synthetic */ lx0(String str, String str2, z2 z2Var, z2 z2Var2, List list, az0 az0Var, boolean[] zArr, int i13) {
        this(str, str2, z2Var, z2Var2, list, az0Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f39936a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return Objects.equals(this.f39936a, lx0Var.f39936a) && Objects.equals(this.f39937b, lx0Var.f39937b) && Objects.equals(this.f39938c, lx0Var.f39938c) && Objects.equals(this.f39939d, lx0Var.f39939d) && Objects.equals(this.f39940e, lx0Var.f39940e) && Objects.equals(this.f39941f, lx0Var.f39941f);
    }

    public final int hashCode() {
        return Objects.hash(this.f39936a, this.f39937b, this.f39938c, this.f39939d, this.f39940e, this.f39941f);
    }

    public final z2 k() {
        return this.f39938c;
    }

    public final z2 l() {
        return this.f39939d;
    }

    public final List n() {
        return this.f39940e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f39937b;
    }

    public final az0 q() {
        return this.f39941f;
    }

    public lx0() {
        this.f39942g = new boolean[6];
    }

    private lx0(@NonNull String str, String str2, z2 z2Var, z2 z2Var2, List<az0> list, az0 az0Var, boolean[] zArr) {
        this.f39936a = str;
        this.f39937b = str2;
        this.f39938c = z2Var;
        this.f39939d = z2Var2;
        this.f39940e = list;
        this.f39941f = az0Var;
        this.f39942g = zArr;
    }
}
