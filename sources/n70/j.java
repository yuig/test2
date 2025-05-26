package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f89618a;

    public j(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f89618a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f89618a, ((j) obj).f89618a);
    }

    public final int hashCode() {
        return this.f89618a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ReportedPin(pinUid="), this.f89618a, ")");
    }
}
