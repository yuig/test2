package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class en0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("blocks")
    private List<eq0> f37312a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("heading")
    private String f37313b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f37314c;

    public /* synthetic */ en0(List list, String str, boolean[] zArr, int i13) {
        this(list, str, zArr);
    }

    public final List c() {
        return this.f37312a;
    }

    public final String d() {
        return this.f37313b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        en0 en0Var = (en0) obj;
        return Objects.equals(this.f37312a, en0Var.f37312a) && Objects.equals(this.f37313b, en0Var.f37313b);
    }

    public final int hashCode() {
        return Objects.hash(this.f37312a, this.f37313b);
    }

    public en0() {
        this.f37314c = new boolean[2];
    }

    private en0(List<eq0> list, String str, boolean[] zArr) {
        this.f37312a = list;
        this.f37313b = str;
        this.f37314c = zArr;
    }
}
