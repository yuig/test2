package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class kf {

    /* renamed from: a, reason: collision with root package name */
    @om.b("cook")
    private gf f39423a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("prep")
    private gf f39424b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("total")
    private gf f39425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39426d;

    public /* synthetic */ kf(gf gfVar, gf gfVar2, gf gfVar3, boolean[] zArr, int i13) {
        this(gfVar, gfVar2, gfVar3, zArr);
    }

    public final gf d() {
        return this.f39423a;
    }

    public final gf e() {
        return this.f39424b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kf kfVar = (kf) obj;
        return Objects.equals(this.f39423a, kfVar.f39423a) && Objects.equals(this.f39424b, kfVar.f39424b) && Objects.equals(this.f39425c, kfVar.f39425c);
    }

    public final gf f() {
        return this.f39425c;
    }

    public final int hashCode() {
        return Objects.hash(this.f39423a, this.f39424b, this.f39425c);
    }

    public kf() {
        this.f39426d = new boolean[3];
    }

    private kf(gf gfVar, gf gfVar2, gf gfVar3, boolean[] zArr) {
        this.f39423a = gfVar;
        this.f39424b = gfVar2;
        this.f39425c = gfVar3;
        this.f39426d = zArr;
    }
}
