package c4;

import a.cb;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f25645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25646b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25647c;

    public m(int i13, int i14, boolean z13) {
        this.f25645a = i13;
        this.f25646b = i14;
        this.f25647c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f25645a == mVar.f25645a && this.f25646b == mVar.f25646b && this.f25647c == mVar.f25647c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25647c) + ep.b.b(this.f25646b, Integer.hashCode(this.f25645a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BidiRun(start=");
        sb3.append(this.f25645a);
        sb3.append(", end=");
        sb3.append(this.f25646b);
        sb3.append(", isRtl=");
        return cb.m(sb3, this.f25647c, ')');
    }
}
