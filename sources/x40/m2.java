package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132802a;

    public m2(List list) {
        this.f132802a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && Intrinsics.d(this.f132802a, ((m2) obj).f132802a);
    }

    public final int hashCode() {
        List list = this.f132802a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f132802a, ")");
    }
}
