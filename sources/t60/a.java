package t60;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f116455a;

    public a(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f116455a = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f116455a, ((a) obj).f116455a);
    }

    public final int hashCode() {
        return this.f116455a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("BoardBulkActionStatusResponse(actions="), this.f116455a, ")");
    }
}
