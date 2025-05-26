package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class xr {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private fs f43772a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43773b;

    public /* synthetic */ xr(fs fsVar, boolean[] zArr, int i13) {
        this(fsVar, zArr);
    }

    public final fs b() {
        return this.f43772a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f43772a, ((xr) obj).f43772a);
    }

    public final int hashCode() {
        return Objects.hash(this.f43772a);
    }

    public xr() {
        this.f43773b = new boolean[1];
    }

    private xr(fs fsVar, boolean[] zArr) {
        this.f43772a = fsVar;
        this.f43773b = zArr;
    }
}
