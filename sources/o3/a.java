package o3;

import d7.g;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f92847a;

    /* renamed from: b, reason: collision with root package name */
    public float f92848b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f92847a == aVar.f92847a && Float.compare(this.f92848b, aVar.f92848b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f92848b) + (Long.hashCode(this.f92847a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DataPointAtTime(time=");
        sb3.append(this.f92847a);
        sb3.append(", dataPoint=");
        return g.h(sb3, this.f92848b, ')');
    }
}
