package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.p f111683a;

    public n0(ta0.p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111683a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f111683a, ((n0) obj).f111683a);
    }

    public final int hashCode() {
        return this.f111683a.hashCode();
    }

    public final String toString() {
        return "DraftDownloadEvent(event=" + this.f111683a + ")";
    }
}
