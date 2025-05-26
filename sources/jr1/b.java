package jr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f77547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77548b;

    public b(String accessToken, String idToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        this.f77547a = accessToken;
        this.f77548b = idToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f77547a, bVar.f77547a) && Intrinsics.d(this.f77548b, bVar.f77548b);
    }

    public final int hashCode() {
        return this.f77548b.hashCode() + (this.f77547a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LineLoginResult(accessToken=");
        sb3.append(this.f77547a);
        sb3.append(", idToken=");
        return a.a.p(sb3, this.f77548b, ")");
    }
}
