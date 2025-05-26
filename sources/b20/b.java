package b20;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21277b;

    public b(String str, String str2) {
        this.f21276a = str;
        this.f21277b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f21276a, bVar.f21276a) && Intrinsics.d(this.f21277b, bVar.f21277b);
    }

    public final int hashCode() {
        String str = this.f21276a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21277b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RefreshAccessTokenResponse(newAccessToken=");
        sb3.append(this.f21276a);
        sb3.append(", oldSessionId=");
        return a.a.p(sb3, this.f21277b, ")");
    }
}
