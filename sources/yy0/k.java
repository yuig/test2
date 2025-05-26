package yy0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final List f140461a;

    public k(List useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        this.f140461a = useCases;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f140461a, ((k) obj).f140461a);
    }

    public final int hashCode() {
        return this.f140461a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("UseCasesLoaded(useCases="), this.f140461a, ")");
    }
}
