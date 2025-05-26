package u21;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f120128a;

    public x(Bitmap bitMap) {
        Intrinsics.checkNotNullParameter(bitMap, "bitMap");
        this.f120128a = bitMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f120128a, ((x) obj).f120128a);
    }

    public final int hashCode() {
        return this.f120128a.hashCode();
    }

    public final String toString() {
        return "SaveImage(bitMap=" + this.f120128a + ")";
    }
}
