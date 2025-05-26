package l01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81297a;

    public a(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f81297a = pinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f81297a, ((a) obj).f81297a);
    }

    public final int hashCode() {
        return this.f81297a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OverflowIconTappedEvent(pinUid="), this.f81297a, ")");
    }
}
