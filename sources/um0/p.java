package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements x {

    /* renamed from: a, reason: collision with root package name */
    public final k92.h f122751a;

    public p(k92.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f122751a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f122751a, ((p) obj).f122751a);
    }

    public final int hashCode() {
        return this.f122751a.hashCode();
    }

    public final String toString() {
        return "OrganizeToastEvent(event=" + this.f122751a + ")";
    }
}
