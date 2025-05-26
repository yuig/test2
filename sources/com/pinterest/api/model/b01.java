package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class b01 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("duration")
    private String f35931a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f35932b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("signature")
    private String f35933c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("video_list")
    private Map<String, h01> f35934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f35935e;

    public /* synthetic */ b01(String str, String str2, String str3, Map map, boolean[] zArr, int i13) {
        this(str, str2, str3, map, zArr);
    }

    public final String e() {
        return this.f35931a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        return Objects.equals(this.f35931a, b01Var.f35931a) && Objects.equals(this.f35932b, b01Var.f35932b) && Objects.equals(this.f35933c, b01Var.f35933c) && Objects.equals(this.f35934d, b01Var.f35934d);
    }

    public final String f() {
        return this.f35932b;
    }

    public final Map g() {
        return this.f35934d;
    }

    public final int hashCode() {
        return Objects.hash(this.f35931a, this.f35932b, this.f35933c, this.f35934d);
    }

    public b01() {
        this.f35935e = new boolean[4];
    }

    private b01(String str, String str2, String str3, Map<String, h01> map, boolean[] zArr) {
        this.f35931a = str;
        this.f35932b = str2;
        this.f35933c = str3;
        this.f35934d = map;
        this.f35935e = zArr;
    }
}
