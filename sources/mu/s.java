package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f88240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88241b;

    public s(String pinUid, int i13) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f88240a = pinUid;
        this.f88241b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f88240a, sVar.f88240a) && this.f88241b == sVar.f88241b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88241b) + (this.f88240a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetLastCarouselIndexForPin(pinUid=");
        sb3.append(this.f88240a);
        sb3.append(", index=");
        return a.a.n(sb3, this.f88241b, ")");
    }
}
