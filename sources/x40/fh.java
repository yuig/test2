package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fh {

    /* renamed from: a, reason: collision with root package name */
    public final List f132418a;

    public fh(List list) {
        this.f132418a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh) && Intrinsics.d(this.f132418a, ((fh) obj).f132418a);
    }

    public final int hashCode() {
        List list = this.f132418a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f132418a, ")");
    }
}
