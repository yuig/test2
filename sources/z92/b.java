package z92;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f141422a;

    public b(ArrayList actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f141422a = actions;
    }

    public final List a() {
        return this.f141422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f141422a, ((b) obj).f141422a);
    }

    public final int hashCode() {
        return this.f141422a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("NewActionBarState(actions="), this.f141422a, ")");
    }
}
