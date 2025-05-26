package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f98874a;

    public l(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98874a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f98874a, ((l) obj).f98874a);
    }

    public final int hashCode() {
        return this.f98874a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AndroidWidgetGetHomefeedPinsQuery(__typename="), this.f98874a, ")");
    }
}
