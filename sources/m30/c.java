package m30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f85747d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f85747d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f85747d, ((c) obj).f85747d);
    }

    public final int hashCode() {
        return this.f85747d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetPinQuery(__typename="), this.f85747d, ")");
    }
}
