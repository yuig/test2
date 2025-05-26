package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f98886a;

    public s(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98886a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f98886a, ((s) obj).f98886a);
    }

    public final int hashCode() {
        return this.f98886a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3WidgetTapsMutation(__typename="), this.f98886a, ")");
    }
}
