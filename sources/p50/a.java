package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f98859a;

    public a(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98859a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f98859a, ((a) obj).f98859a);
    }

    public final int hashCode() {
        return this.f98859a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AndroidWidgetGetBoardPinsQuery(__typename="), this.f98859a, ")");
    }
}
