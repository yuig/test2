package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f58168a;

    public x(mr1.b activityProvider) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f58168a = activityProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f58168a, ((x) obj).f58168a);
    }

    public final int hashCode() {
        return this.f58168a.hashCode();
    }

    public final String toString() {
        return "ReclaimButtonClick(activityProvider=" + this.f58168a + ")";
    }
}
