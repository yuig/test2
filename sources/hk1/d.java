package hk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f69343a;

    public d(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f69343a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f69343a, ((d) obj).f69343a);
    }

    public final int hashCode() {
        return this.f69343a.hashCode();
    }

    public final String j() {
        return this.f69343a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MarkPinUnfavorited(pinUid="), this.f69343a, ")");
    }
}
