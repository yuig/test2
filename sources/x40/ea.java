package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    public final List f132322a;

    public ea(List list) {
        this.f132322a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea) && Intrinsics.d(this.f132322a, ((ea) obj).f132322a);
    }

    public final int hashCode() {
        List list = this.f132322a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f132322a, ")");
    }
}
