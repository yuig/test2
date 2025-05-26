package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class jg implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39031a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39032b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("interest")
    private zs f39033c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pins")
    private List<f30> f39034d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("subtitle")
    private String f39035e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f39036f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("user")
    private wy0 f39037g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("user_recommendation_reason")
    private kz0 f39038h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f39039i;

    public /* synthetic */ jg(String str, String str2, zs zsVar, List list, String str3, String str4, wy0 wy0Var, kz0 kz0Var, boolean[] zArr, int i13) {
        this(str, str2, zsVar, list, str3, str4, wy0Var, kz0Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f39031a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jg jgVar = (jg) obj;
        return Objects.equals(this.f39031a, jgVar.f39031a) && Objects.equals(this.f39032b, jgVar.f39032b) && Objects.equals(this.f39033c, jgVar.f39033c) && Objects.equals(this.f39034d, jgVar.f39034d) && Objects.equals(this.f39035e, jgVar.f39035e) && Objects.equals(this.f39036f, jgVar.f39036f) && Objects.equals(this.f39037g, jgVar.f39037g) && Objects.equals(this.f39038h, jgVar.f39038h);
    }

    public final int hashCode() {
        return Objects.hash(this.f39031a, this.f39032b, this.f39033c, this.f39034d, this.f39035e, this.f39036f, this.f39037g, this.f39038h);
    }

    public final zs n() {
        return this.f39033c;
    }

    @Override // dl1.s
    public final String o() {
        return this.f39032b;
    }

    public final wy0 q() {
        return this.f39037g;
    }

    public jg() {
        this.f39039i = new boolean[8];
    }

    private jg(@NonNull String str, String str2, zs zsVar, List<f30> list, String str3, String str4, wy0 wy0Var, kz0 kz0Var, boolean[] zArr) {
        this.f39031a = str;
        this.f39032b = str2;
        this.f39033c = zsVar;
        this.f39034d = list;
        this.f39035e = str3;
        this.f39036f = str4;
        this.f39037g = wy0Var;
        this.f39038h = kz0Var;
        this.f39039i = zArr;
    }
}
