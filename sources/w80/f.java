package w80;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f128282a;

    public f(ArrayList actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f128282a = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f128282a, ((f) obj).f128282a);
    }

    public final int hashCode() {
        return this.f128282a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("CollageComposerBottomBarState(actions="), this.f128282a, ")");
    }
}
