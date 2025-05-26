package v72;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final List f124444a;

    public m(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124444a = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f124444a, ((m) obj).f124444a);
    }

    public final int hashCode() {
        return this.f124444a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("LoadShuffleDataCompleted(items="), this.f124444a, ")");
    }
}
