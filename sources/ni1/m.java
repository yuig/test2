package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f90738a;

    public m(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f90738a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f90738a, ((m) obj).f90738a);
    }

    public final int hashCode() {
        return this.f90738a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SetPinUid(pinId="), this.f90738a, ")");
    }
}
