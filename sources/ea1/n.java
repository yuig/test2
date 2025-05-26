package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f58085a;

    public n(mr1.b activityProvider) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f58085a = activityProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f58085a, ((n) obj).f58085a);
    }

    public final int hashCode() {
        return this.f58085a.hashCode();
    }

    public final String toString() {
        return "ClaimButtonClick(activityProvider=" + this.f58085a + ")";
    }
}
