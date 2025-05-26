package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133524a;

    public v1(List list) {
        this.f133524a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && Intrinsics.d(this.f133524a, ((v1) obj).f133524a);
    }

    public final int hashCode() {
        List list = this.f133524a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f133524a, ")");
    }
}
