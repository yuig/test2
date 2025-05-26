package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132879a;

    public n8(List list) {
        this.f132879a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8) && Intrinsics.d(this.f132879a, ((n8) obj).f132879a);
    }

    public final int hashCode() {
        List list = this.f132879a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f132879a, ")");
    }
}
