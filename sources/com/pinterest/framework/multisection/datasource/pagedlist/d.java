package com.pinterest.framework.multisection.datasource.pagedlist;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49090a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49091b = true;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49092c = true;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49093d = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f49090a == dVar.f49090a && this.f49091b == dVar.f49091b && this.f49092c == dVar.f49092c && this.f49093d == dVar.f49093d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49093d) + ep.b.e(this.f49092c, ep.b.e(this.f49091b, Boolean.hashCode(this.f49090a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeaderFooterSpacing(shouldAddLeftSpacing=");
        sb3.append(this.f49090a);
        sb3.append(", shouldAddTopSpacing=");
        sb3.append(this.f49091b);
        sb3.append(", shouldAddRightSpacing=");
        sb3.append(this.f49092c);
        sb3.append(", shouldAddBottomSpacing=");
        return a.a.r(sb3, this.f49093d, ")");
    }
}
