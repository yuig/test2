package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class fr0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("final_prompt")
    private zr0 f37763a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("is_sponsored")
    private Boolean f37764b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("prompt")
    private zr0 f37765c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("questions")
    private List<ds0> f37766d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("subtitle")
    private String f37767e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f37768f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37769g;

    public /* synthetic */ fr0(zr0 zr0Var, Boolean bool, zr0 zr0Var2, List list, String str, String str2, boolean[] zArr, int i13) {
        this(zr0Var, bool, zr0Var2, list, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fr0 fr0Var = (fr0) obj;
        return Objects.equals(this.f37764b, fr0Var.f37764b) && Objects.equals(this.f37763a, fr0Var.f37763a) && Objects.equals(this.f37765c, fr0Var.f37765c) && Objects.equals(this.f37766d, fr0Var.f37766d) && Objects.equals(this.f37767e, fr0Var.f37767e) && Objects.equals(this.f37768f, fr0Var.f37768f);
    }

    public final zr0 g() {
        return this.f37763a;
    }

    public final Boolean h() {
        Boolean bool = this.f37764b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final int hashCode() {
        return Objects.hash(this.f37763a, this.f37764b, this.f37765c, this.f37766d, this.f37767e, this.f37768f);
    }

    public final zr0 i() {
        return this.f37765c;
    }

    public final List j() {
        return this.f37766d;
    }

    public final String k() {
        return this.f37767e;
    }

    public final String l() {
        return this.f37768f;
    }

    public fr0() {
        this.f37769g = new boolean[6];
    }

    private fr0(zr0 zr0Var, Boolean bool, zr0 zr0Var2, List<ds0> list, String str, String str2, boolean[] zArr) {
        this.f37763a = zr0Var;
        this.f37764b = bool;
        this.f37765c = zr0Var2;
        this.f37766d = list;
        this.f37767e = str;
        this.f37768f = str2;
        this.f37769g = zArr;
    }
}
