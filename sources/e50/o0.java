package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f57401a;

    public o0(List list) {
        this.f57401a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f57401a, ((o0) obj).f57401a);
    }

    public final int hashCode() {
        List list = this.f57401a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SearchfeedTabs(tabs="), this.f57401a, ")");
    }
}
