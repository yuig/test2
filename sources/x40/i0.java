package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements j0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132516d;

    public i0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132516d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f132516d, ((i0) obj).f132516d);
    }

    public final int hashCode() {
        return this.f132516d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AddThreadMessageMutation(__typename="), this.f132516d, ")");
    }
}
