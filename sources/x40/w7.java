package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133596a;

    public w7(List list) {
        this.f133596a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7) && Intrinsics.d(this.f133596a, ((w7) obj).f133596a);
    }

    public final int hashCode() {
        List list = this.f133596a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f133596a, ")");
    }
}
