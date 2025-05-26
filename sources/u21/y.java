package u21;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120129a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f120130b;

    public y(Context context, Bitmap bitMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitMap, "bitMap");
        this.f120129a = context;
        this.f120130b = bitMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f120129a, yVar.f120129a) && Intrinsics.d(this.f120130b, yVar.f120130b);
    }

    public final int hashCode() {
        return this.f120130b.hashCode() + (this.f120129a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareImage(context=" + this.f120129a + ", bitMap=" + this.f120130b + ")";
    }
}
