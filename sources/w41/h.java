package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f128009a;

    public h(String metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f128009a = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f128009a, ((h) obj).f128009a);
    }

    public final int hashCode() {
        return this.f128009a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MetadataDisplayState(metadata="), this.f128009a, ")");
    }
}
