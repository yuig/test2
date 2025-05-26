package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    public final ah.b f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7871b;

    public ll(ah.b bVar, long j13) {
        this.f7870a = bVar;
        this.f7871b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return Intrinsics.d(this.f7870a, llVar.f7870a) && zn2.b.d(this.f7871b, llVar.f7871b);
    }

    public final int hashCode() {
        ah.b bVar = this.f7870a;
        int hashCode = bVar == null ? 0 : bVar.hashCode();
        long j13 = this.f7871b;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(j13) + (hashCode * 31);
    }

    public final String toString() {
        return "CachedAppSetIdInfo(appSetIdInfo=" + this.f7870a + ", timestamp=" + zn2.b.o(this.f7871b) + ")";
    }
}
