package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.p f82409a;

    public i(ta0.p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82409a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f82409a, ((i) obj).f82409a);
    }

    public final int hashCode() {
        return this.f82409a.hashCode();
    }

    public final String toString() {
        return "DraftDownloadEvent(event=" + this.f82409a + ")";
    }
}
