package iw;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f73746a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73747b;

    public b(String queryInfo, long j13) {
        Intrinsics.checkNotNullParameter(queryInfo, "queryInfo");
        this.f73746a = queryInfo;
        this.f73747b = j13;
    }

    public final String a() {
        return this.f73746a;
    }

    public final long b() {
        return this.f73747b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f73746a, bVar.f73746a) && this.f73747b == bVar.f73747b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73747b) + (this.f73746a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QueryInfoWithExpiry(queryInfo=");
        sb3.append(this.f73746a);
        sb3.append(", systemTimeExpiry=");
        return a.a.o(sb3, this.f73747b, ")");
    }
}
