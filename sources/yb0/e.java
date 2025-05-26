package yb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final q f138476a;

    public e(q alertView) {
        Intrinsics.checkNotNullParameter(alertView, "alertView");
        this.f138476a = alertView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f138476a, ((e) obj).f138476a);
    }

    public final int hashCode() {
        return this.f138476a.hashCode();
    }

    public final String toString() {
        return "ShowEvent(alertView=" + this.f138476a + ")";
    }
}
