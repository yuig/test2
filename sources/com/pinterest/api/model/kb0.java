package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kb0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39372a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39373b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("description")
    private String f39374c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("output_data")
    private rb0 f39375d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("section_type")
    private String f39376e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f39377f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("topics")
    private List<t20> f39378g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39379h;

    public /* synthetic */ kb0(String str, String str2, String str3, rb0 rb0Var, String str4, String str5, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, rb0Var, str4, str5, list, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39372a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        return Objects.equals(this.f39372a, kb0Var.f39372a) && Objects.equals(this.f39373b, kb0Var.f39373b) && Objects.equals(this.f39374c, kb0Var.f39374c) && Objects.equals(this.f39375d, kb0Var.f39375d) && Objects.equals(this.f39376e, kb0Var.f39376e) && Objects.equals(this.f39377f, kb0Var.f39377f) && Objects.equals(this.f39378g, kb0Var.f39378g);
    }

    public final int hashCode() {
        return Objects.hash(this.f39372a, this.f39373b, this.f39374c, this.f39375d, this.f39376e, this.f39377f, this.f39378g);
    }

    public final String l() {
        return this.f39374c;
    }

    public final rb0 n() {
        return this.f39375d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f39373b;
    }

    public final String q() {
        return this.f39377f;
    }

    public kb0() {
        this.f39379h = new boolean[7];
    }

    private kb0(@NonNull String str, String str2, String str3, rb0 rb0Var, String str4, String str5, List<t20> list, boolean[] zArr) {
        this.f39372a = str;
        this.f39373b = str2;
        this.f39374c = str3;
        this.f39375d = rb0Var;
        this.f39376e = str4;
        this.f39377f = str5;
        this.f39378g = list;
        this.f39379h = zArr;
    }
}
