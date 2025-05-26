package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f26633a;

    public p(String currentTimeStampString) {
        Intrinsics.checkNotNullParameter(currentTimeStampString, "currentTimeStampString");
        this.f26633a = currentTimeStampString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f26633a, ((p) obj).f26633a);
    }

    public final int hashCode() {
        return this.f26633a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchLandingPageRenderingStarted(currentTimeStampString="), this.f26633a, ")");
    }
}
