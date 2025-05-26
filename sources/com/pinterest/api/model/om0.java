package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class om0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("dominant_color")
    private String f40756a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f40757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40758c;

    public /* synthetic */ om0(String str, Map map, boolean[] zArr, int i13) {
        this(str, map, zArr);
    }

    public final String c() {
        return this.f40756a;
    }

    public final Map d() {
        return this.f40757b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        om0 om0Var = (om0) obj;
        return Objects.equals(this.f40756a, om0Var.f40756a) && Objects.equals(this.f40757b, om0Var.f40757b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40756a, this.f40757b);
    }

    public om0() {
        this.f40758c = new boolean[2];
    }

    private om0(String str, Map<String, sr> map, boolean[] zArr) {
        this.f40756a = str;
        this.f40757b = map;
        this.f40758c = zArr;
    }
}
