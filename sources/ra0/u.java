package ra0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f107006a;

    /* renamed from: b, reason: collision with root package name */
    public final y f107007b;

    public u(List cells, y selectedColor) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        this.f107006a = cells;
        this.f107007b = selectedColor;
    }

    public static u e(u uVar, y selectedColor) {
        List cells = uVar.f107006a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        return new u(cells, selectedColor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f107006a, uVar.f107006a) && Intrinsics.d(this.f107007b, uVar.f107007b);
    }

    public final int hashCode() {
        return this.f107007b.hashCode() + (this.f107006a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorPickerCarouselState(cells=" + this.f107006a + ", selectedColor=" + this.f107007b + ")";
    }
}
