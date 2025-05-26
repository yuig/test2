package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30835b;

    public j(Object obj, String str) {
        this.f30834a = obj;
        this.f30835b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f30834a == jVar.f30834a && this.f30835b.equals(jVar.f30835b);
    }

    public final int hashCode() {
        return this.f30835b.hashCode() + (System.identityHashCode(this.f30834a) * 31);
    }
}
