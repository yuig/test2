package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ve implements we {

    /* renamed from: d, reason: collision with root package name */
    public final String f133555d;

    public ve(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133555d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve) && Intrinsics.d(this.f133555d, ((ve) obj).f133555d);
    }

    public final int hashCode() {
        return this.f133555d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3LogPushNotificationMutation(__typename="), this.f133555d, ")");
    }
}
