package nm0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lm0.c0;
import o82.z;

/* loaded from: classes5.dex */
public final class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91370a;

    public c(boolean z13) {
        this.f91370a = z13;
    }

    @Override // o82.z
    public final ArrayList a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.b((c0) it.next(), null, 0, this.f91370a, 15));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f91370a == this.f91370a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91370a);
    }
}
