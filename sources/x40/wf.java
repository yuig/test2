package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wf {

    /* renamed from: a, reason: collision with root package name */
    public final List f133627a;

    public wf(List list) {
        this.f133627a = list;
    }

    public final List a() {
        return this.f133627a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf) && Intrinsics.d(this.f133627a, ((wf) obj).f133627a);
    }

    public final int hashCode() {
        List list = this.f133627a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RichMetadata(products="), this.f133627a, ")");
    }
}
