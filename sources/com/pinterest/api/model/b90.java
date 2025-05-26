package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class b90 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f36019a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("source")
    private String f36020b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("source_id")
    private String f36021c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("video")
    private b01 f36022d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36023e;

    public /* synthetic */ b90(Map map, String str, String str2, b01 b01Var, boolean[] zArr, int i13) {
        this(map, str, str2, b01Var, zArr);
    }

    public final Map e() {
        return this.f36019a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b90 b90Var = (b90) obj;
        return Objects.equals(this.f36019a, b90Var.f36019a) && Objects.equals(this.f36020b, b90Var.f36020b) && Objects.equals(this.f36021c, b90Var.f36021c) && Objects.equals(this.f36022d, b90Var.f36022d);
    }

    public final String f() {
        return this.f36020b;
    }

    public final b01 g() {
        return this.f36022d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36019a, this.f36020b, this.f36021c, this.f36022d);
    }

    public b90() {
        this.f36023e = new boolean[4];
    }

    private b90(Map<String, sr> map, String str, String str2, b01 b01Var, boolean[] zArr) {
        this.f36019a = map;
        this.f36020b = str;
        this.f36021c = str2;
        this.f36022d = b01Var;
        this.f36023e = zArr;
    }
}
