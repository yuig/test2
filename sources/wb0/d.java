package wb0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f128982a;

    public d(List buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f128982a = buttons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f128982a, ((d) obj).f128982a);
    }

    public final int hashCode() {
        return this.f128982a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ActionButtonGridViewModel(buttons="), this.f128982a, ")");
    }
}
