package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104809b;

    /* renamed from: c, reason: collision with root package name */
    public final long f104810c;

    public m(long j13, String pinId, String str) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f104808a = pinId;
        this.f104809b = str;
        this.f104810c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f104808a, mVar.f104808a) && Intrinsics.d(this.f104809b, mVar.f104809b) && this.f104810c == mVar.f104810c;
    }

    public final int hashCode() {
        int hashCode = this.f104808a.hashCode() * 31;
        String str = this.f104809b;
        return Long.hashCode(this.f104810c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Initialize(pinId=");
        sb3.append(this.f104808a);
        sb3.append(", adDestinationURL=");
        sb3.append(this.f104809b);
        sb3.append(", startTimeNs=");
        return a.a.o(sb3, this.f104810c, ")");
    }
}
