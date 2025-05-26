package uc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final List f121883a;

    public y(List components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f121883a = components;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f121883a, ((y) obj).f121883a);
    }

    public final int hashCode() {
        return this.f121883a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ComponentPageDisplayState(components="), this.f121883a, ")");
    }
}
