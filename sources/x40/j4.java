package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132587a;

    public j4(List list) {
        this.f132587a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4) && Intrinsics.d(this.f132587a, ((j4) obj).f132587a);
    }

    public final int hashCode() {
        List list = this.f132587a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f132587a, ")");
    }
}
