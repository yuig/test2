package u21;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f120080a;

    public d(Bitmap bitMap) {
        Intrinsics.checkNotNullParameter(bitMap, "bitMap");
        this.f120080a = bitMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f120080a, ((d) obj).f120080a);
    }

    public final int hashCode() {
        return this.f120080a.hashCode();
    }

    public final String toString() {
        return "SaveClicked(bitMap=" + this.f120080a + ")";
    }
}
