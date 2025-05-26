package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f71541d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71541d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f71541d, ((c) obj).f71541d);
    }

    public final int hashCode() {
        return this.f71541d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3DownloadIdeaPinQuery(__typename="), this.f71541d, ")");
    }
}
