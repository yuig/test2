package t80;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f116683a;

    public d(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f116683a = cards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f116683a, ((d) obj).f116683a);
    }

    public final int hashCode() {
        return this.f116683a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("EmptyCollageCarouselDisplayState(cards="), this.f116683a, ")");
    }

    public d() {
        this(q0.f80391a);
    }
}
