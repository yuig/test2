package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f83896a;

    public s(c1 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f83896a = filter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f83896a == ((s) obj).f83896a;
    }

    public final int hashCode() {
        return this.f83896a.hashCode();
    }

    public final String toString() {
        return "PinsFilterSelected(filter=" + this.f83896a + ")";
    }
}
