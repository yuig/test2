package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f107045a;

    public z(f0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f107045a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f107045a, ((z) obj).f107045a);
    }

    public final int hashCode() {
        return this.f107045a.hashCode();
    }

    public final String toString() {
        return "ColorPickerCellState(type=" + this.f107045a + ")";
    }
}
