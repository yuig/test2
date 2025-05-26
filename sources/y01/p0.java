package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f136470a;

    public p0(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter("Error in screenshotPin", "detailedMessage");
        this.f136470a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return Intrinsics.d(this.f136470a, ((p0) obj).f136470a) && Intrinsics.d("Error in screenshotPin", "Error in screenshotPin");
        }
        return false;
    }

    public final int hashCode() {
        return (this.f136470a.hashCode() * 31) - 1770407476;
    }

    public final String toString() {
        return "OnLogSafeHandledException(exception=" + this.f136470a + ", detailedMessage=Error in screenshotPin)";
    }
}
