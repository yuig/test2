package zw;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f142892a;

    public b(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f142892a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f142892a, ((b) obj).f142892a);
    }

    public final int hashCode() {
        return this.f142892a.hashCode();
    }

    public final String j() {
        return this.f142892a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AdImageLoaded(pinId="), this.f142892a, ")");
    }
}
