package o70;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f93226a;

    public b(List oneBarModuleFilters) {
        Intrinsics.checkNotNullParameter(oneBarModuleFilters, "oneBarModuleFilters");
        this.f93226a = oneBarModuleFilters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f93226a, ((b) obj).f93226a);
    }

    public final int hashCode() {
        return this.f93226a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("OneBarModuleVMState(oneBarModuleFilters="), this.f93226a, ")");
    }
}
