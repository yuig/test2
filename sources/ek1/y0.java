package ek1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f59398a;

    public y0(List pinChips) {
        Intrinsics.checkNotNullParameter(pinChips, "pinChips");
        this.f59398a = pinChips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f59398a, ((y0) obj).f59398a);
    }

    public final int hashCode() {
        return this.f59398a.hashCode();
    }

    public final List j() {
        return this.f59398a;
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PreloadChipImages(pinChips="), this.f59398a, ")");
    }
}
