package ac2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1982a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1983b;

    public j1(String mediaUid, long j13) {
        Intrinsics.checkNotNullParameter(mediaUid, "mediaUid");
        this.f1982a = mediaUid;
        this.f1983b = j13;
    }

    public final String a() {
        return this.f1982a;
    }

    public final long b() {
        return this.f1983b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.f1982a, j1Var.f1982a) && this.f1983b == j1Var.f1983b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1983b) + (this.f1982a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GridItemClickTimestamp(mediaUid=");
        sb3.append(this.f1982a);
        sb3.append(", timestamp=");
        return a.a.o(sb3, this.f1983b, ")");
    }
}
