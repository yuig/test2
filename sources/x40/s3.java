package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133226a;

    public s3(List list) {
        this.f133226a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && Intrinsics.d(this.f133226a, ((s3) obj).f133226a);
    }

    public final int hashCode() {
        List list = this.f133226a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f133226a, ")");
    }
}
