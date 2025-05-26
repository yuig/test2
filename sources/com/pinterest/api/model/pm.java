package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class pm implements gp0.a {

    /* renamed from: a, reason: collision with root package name */
    @om.b("content")
    private List<List<String>> f41019a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f41020b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41021c;

    public /* synthetic */ pm(List list, String str, boolean[] zArr, int i13) {
        this(list, str, zArr);
    }

    public final List c() {
        return this.f41019a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pm pmVar = (pm) obj;
        return Objects.equals(this.f41019a, pmVar.f41019a) && Objects.equals(this.f41020b, pmVar.f41020b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41019a, this.f41020b);
    }

    public pm() {
        this.f41021c = new boolean[2];
    }

    private pm(List<List<String>> list, String str, boolean[] zArr) {
        this.f41019a = list;
        this.f41020b = str;
        this.f41021c = zArr;
    }
}
