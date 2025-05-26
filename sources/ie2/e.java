package ie2;

import android.util.Size;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final Surface f72217b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f72218c;

    public e(Surface surface, Size size) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f72217b = surface;
        this.f72218c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f72217b, eVar.f72217b) && Intrinsics.d(this.f72218c, eVar.f72218c);
    }

    public final int hashCode() {
        return this.f72218c.hashCode() + (this.f72217b.hashCode() * 31);
    }

    public final String toString() {
        return "SurfaceTarget(surface=" + this.f72217b + ", size=" + this.f72218c + ')';
    }
}
