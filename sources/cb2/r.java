package cb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f27359a;

    public r(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f27359a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f27359a, ((r) obj).f27359a);
    }

    public final int hashCode() {
        return this.f27359a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnReactContextMenuOptionClickEvent(pinUid="), this.f27359a, ")");
    }
}
