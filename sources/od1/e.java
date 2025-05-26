package od1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final List f94121a;

    public e(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f94121a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f94121a, ((e) obj).f94121a);
    }

    public final int hashCode() {
        return this.f94121a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("OneBarModuleUpdateList(list="), this.f94121a, ")");
    }
}
