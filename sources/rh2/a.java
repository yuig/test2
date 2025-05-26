package rh2;

import a.cb;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f108335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108336b;

    public a(int i13, int i14) {
        this.f108335a = i13;
        this.f108336b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f108335a == aVar.f108335a && this.f108336b == aVar.f108336b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108336b) + (Integer.hashCode(this.f108335a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DomainCount(requestCount=");
        sb3.append(this.f108335a);
        sb3.append(", captureLimit=");
        return cb.l(sb3, this.f108336b, ')');
    }
}
