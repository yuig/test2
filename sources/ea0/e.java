package ea0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.c f57950a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57951b;

    public e(ra0.c ids, List pendingSideEffects) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(pendingSideEffects, "pendingSideEffects");
        this.f57950a = ids;
        this.f57951b = pendingSideEffects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f57950a, eVar.f57950a) && Intrinsics.d(this.f57951b, eVar.f57951b);
    }

    public final int hashCode() {
        return this.f57951b.hashCode() + (this.f57950a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadSourceCollage(ids=" + this.f57950a + ", pendingSideEffects=" + this.f57951b + ")";
    }
}
