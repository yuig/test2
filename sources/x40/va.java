package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    public final List f133550a;

    public va(List list) {
        this.f133550a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va) && Intrinsics.d(this.f133550a, ((va) obj).f133550a);
    }

    public final int hashCode() {
        List list = this.f133550a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f133550a, ")");
    }
}
