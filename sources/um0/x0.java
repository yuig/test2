package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final xm0.d f122780a;

    public x0(xm0.d headerState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f122780a = headerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f122780a, ((x0) obj).f122780a);
    }

    public final int hashCode() {
        return this.f122780a.hashCode();
    }

    public final String toString() {
        return "PinSelectionDisplayState(headerState=" + this.f122780a + ")";
    }
}
