package yd2;

import a.cb;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f138809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138810b;

    public k(int i13, int i14) {
        this.f138809a = i13;
        this.f138810b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f138809a == kVar.f138809a && this.f138810b == kVar.f138810b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f138810b) + (Integer.hashCode(this.f138809a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GLFrameBufferBindings(read=");
        sb3.append(this.f138809a);
        sb3.append(", draw=");
        return cb.l(sb3, this.f138810b, ')');
    }
}
