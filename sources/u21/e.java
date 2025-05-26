package u21;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120086a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f120087b;

    public e(Context context, Bitmap bitMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitMap, "bitMap");
        this.f120086a = context;
        this.f120087b = bitMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f120086a, eVar.f120086a) && Intrinsics.d(this.f120087b, eVar.f120087b);
    }

    public final int hashCode() {
        return this.f120087b.hashCode() + (this.f120086a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareClicked(context=" + this.f120086a + ", bitMap=" + this.f120087b + ")";
    }
}
