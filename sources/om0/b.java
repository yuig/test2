package om0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f96466a;

    public b(ArrayList actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f96466a = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f96466a, ((b) obj).f96466a);
    }

    public final int hashCode() {
        return this.f96466a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BoardActionsDisplayState(actions="), this.f96466a, ")");
    }
}
