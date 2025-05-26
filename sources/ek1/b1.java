package ek1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f59216a;

    public b1(List chips) {
        Intrinsics.checkNotNullParameter(chips, "chips");
        this.f59216a = chips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f59216a, ((b1) obj).f59216a);
    }

    public final int hashCode() {
        return this.f59216a.hashCode();
    }

    public final List j() {
        return this.f59216a;
    }

    public final String toString() {
        return a.c.j(new StringBuilder("StartLoopingChipsIfNecessary(chips="), this.f59216a, ")");
    }
}
