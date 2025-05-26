package r90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f106875a;

    public h(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f106875a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f106875a, ((h) obj).f106875a);
    }

    public final int hashCode() {
        return this.f106875a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CutoutSourceMetadataRequestArgs(id="), this.f106875a, ")");
    }
}
