package mr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f88087a;

    public g(String idToken) {
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        this.f88087a = idToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f88087a, ((g) obj).f88087a);
    }

    public final int hashCode() {
        return this.f88087a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ThirdPartyCredential(idToken="), this.f88087a, ")");
    }
}
