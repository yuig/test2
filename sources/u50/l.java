package u50;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120571a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f120572b;

    public l(List primitives) {
        h0 separator = h0.f120562a;
        Intrinsics.checkNotNullParameter(primitives, "primitives");
        Intrinsics.checkNotNullParameter(separator, "separator");
        this.f120571a = primitives;
        this.f120572b = separator;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.Z(this.f120571a, this.f120572b.a(context), null, null, 0, null, new q0.d(context, 4), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f120571a, lVar.f120571a) && Intrinsics.d(this.f120572b, lVar.f120572b);
    }

    public final int hashCode() {
        return this.f120572b.hashCode() + (this.f120571a.hashCode() * 31);
    }

    public final String toString() {
        return "CompoundStringPrimitive(primitives=" + this.f120571a + ", separator=" + this.f120572b + ")";
    }
}
