package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f122709a;

    public g(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f122709a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f122709a, ((g) obj).f122709a);
    }

    public final int hashCode() {
        return this.f122709a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinReorderCompleted(id="), this.f122709a, ")");
    }
}
