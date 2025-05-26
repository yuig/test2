package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class mm implements gp0.a {

    /* renamed from: a, reason: collision with root package name */
    @om.b("content")
    private Map<String, String> f40161a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f40162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40163c;

    public /* synthetic */ mm(Map map, String str, boolean[] zArr, int i13) {
        this(map, str, zArr);
    }

    public final Map c() {
        return this.f40161a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mm mmVar = (mm) obj;
        return Objects.equals(this.f40161a, mmVar.f40161a) && Objects.equals(this.f40162b, mmVar.f40162b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40161a, this.f40162b);
    }

    public mm() {
        this.f40163c = new boolean[2];
    }

    private mm(Map<String, String> map, String str, boolean[] zArr) {
        this.f40161a = map;
        this.f40162b = str;
        this.f40163c = zArr;
    }
}
