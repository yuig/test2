package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class vq0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("bitrates")
    private Map<String, String> f42955a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("video_list")
    private Map<String, h01> f42956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f42957c;

    public /* synthetic */ vq0(Map map, Map map2, boolean[] zArr, int i13) {
        this(map, map2, zArr);
    }

    public final Map c() {
        return this.f42956b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vq0 vq0Var = (vq0) obj;
        return Objects.equals(this.f42955a, vq0Var.f42955a) && Objects.equals(this.f42956b, vq0Var.f42956b);
    }

    public final int hashCode() {
        return Objects.hash(this.f42955a, this.f42956b);
    }

    public vq0() {
        this.f42957c = new boolean[2];
    }

    private vq0(Map<String, String> map, Map<String, h01> map2, boolean[] zArr) {
        this.f42955a = map;
        this.f42956b = map2;
        this.f42957c = zArr;
    }
}
