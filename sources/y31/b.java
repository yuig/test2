package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c92.n f136774a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136775b;

    public b(c92.n media, boolean z13) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f136774a = media;
        this.f136775b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f136774a, bVar.f136774a) && this.f136775b == bVar.f136775b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136775b) + (this.f136774a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverMediaState(media=" + this.f136774a + ", isPreview=" + this.f136775b + ")";
    }
}
