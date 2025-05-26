package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c92.n f136861a;

    public y(c92.n media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f136861a = media;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f136861a, ((y) obj).f136861a);
    }

    public final int hashCode() {
        return this.f136861a.hashCode();
    }

    public final String toString() {
        return "UpdateCoverMedia(media=" + this.f136861a + ")";
    }
}
