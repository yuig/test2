package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f122724a;

    public k(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f122724a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f122724a, ((k) obj).f122724a);
    }

    public final int hashCode() {
        return this.f122724a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SectionReorderCompleted(id="), this.f122724a, ")");
    }
}
