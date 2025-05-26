package bi1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22887a;

    public z(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f22887a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f22887a, ((z) obj).f22887a);
    }

    public final int hashCode() {
        return this.f22887a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SbaVideoFullScreenVMState(pinId="), this.f22887a, ")");
    }
}
