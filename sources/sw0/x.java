package sw0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f115587a;

    /* renamed from: b, reason: collision with root package name */
    public final List f115588b;

    public x(int i13, ArrayList mediaItems) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        this.f115587a = i13;
        this.f115588b = mediaItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f115587a == xVar.f115587a && Intrinsics.d(this.f115588b, xVar.f115588b);
    }

    public final int hashCode() {
        return this.f115588b.hashCode() + (Integer.hashCode(this.f115587a) * 31);
    }

    public final String toString() {
        return "MediaResponse(size=" + this.f115587a + ", mediaItems=" + this.f115588b + ")";
    }
}
