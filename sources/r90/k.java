package r90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f106880a;

    public k(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f106880a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f106880a, ((k) obj).f106880a);
    }

    public final int hashCode() {
        return this.f106880a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RelatedContentRequestArgs(id="), this.f106880a, ")");
    }
}
