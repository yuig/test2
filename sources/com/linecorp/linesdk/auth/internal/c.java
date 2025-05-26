package com.linecorp.linesdk.auth.internal;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f34097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34098b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34099c;

    public c(int i13, int i14, int i15) {
        this.f34097a = i13;
        this.f34098b = i14;
        this.f34099c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f34097a == cVar.f34097a && this.f34098b == cVar.f34098b && this.f34099c == cVar.f34099c;
    }

    public final int hashCode() {
        return (((this.f34097a * 31) + this.f34098b) * 31) + this.f34099c;
    }
}
