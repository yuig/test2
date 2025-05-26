package fa0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f61480a;

    /* renamed from: b, reason: collision with root package name */
    public final List f61481b;

    public f(ra0.c ids, List pendingSideEffects) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(pendingSideEffects, "pendingSideEffects");
        this.f61480a = ids;
        this.f61481b = pendingSideEffects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f61480a, fVar.f61480a) && Intrinsics.d(this.f61481b, fVar.f61481b);
    }

    public final int hashCode() {
        return this.f61481b.hashCode() + (this.f61480a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadSourceCollage(ids=" + this.f61480a + ", pendingSideEffects=" + this.f61481b + ")";
    }
}
