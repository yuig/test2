package pg0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f100070a;

    public i0(List userIds) {
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.f100070a = userIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f100070a, ((i0) obj).f100070a);
    }

    public final int hashCode() {
        return this.f100070a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ShareCompletedEvent(userIds="), this.f100070a, ")");
    }
}
