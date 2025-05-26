package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final zo.c f83906a;

    public x(zo.c viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f83906a = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f83906a == ((x) obj).f83906a;
    }

    public final int hashCode() {
        return this.f83906a.hashCode();
    }

    public final String toString() {
        return "ViewTypeSelected(viewType=" + this.f83906a + ")";
    }
}
