package n90;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f89996a;

    public c(List cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.f89996a = cards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f89996a, ((c) obj).f89996a);
    }

    public final int hashCode() {
        return this.f89996a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("CarouselDisplayState(cards="), this.f89996a, ")");
    }

    public c() {
        this(q0.f80391a);
    }
}
