package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.w f138177a;

    public g(sa0.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f138177a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f138177a, ((g) obj).f138177a);
    }

    public final int hashCode() {
        return this.f138177a.hashCode();
    }

    public final String toString() {
        return "CutoutRepinEvent(event=" + this.f138177a + ")";
    }
}
