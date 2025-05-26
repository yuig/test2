package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xe implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final we f133689a;

    public xe(we weVar) {
        this.f133689a = weVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe) && Intrinsics.d(this.f133689a, ((xe) obj).f133689a);
    }

    public final int hashCode() {
        we weVar = this.f133689a;
        if (weVar == null) {
            return 0;
        }
        return weVar.hashCode();
    }

    public final String toString() {
        return "Data(v3LogPushNotificationMutation=" + this.f133689a + ")";
    }
}
