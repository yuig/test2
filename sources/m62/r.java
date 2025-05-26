package m62;

import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public final List f86043d;

    public r(List tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.f86043d = tools;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f86043d, ((r) obj).f86043d);
    }

    public final int hashCode() {
        return this.f86043d.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Tools(tools="), this.f86043d, ")");
    }
}
