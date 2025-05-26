package nm0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lm0.c0;
import o82.z;

/* loaded from: classes5.dex */
public final class d implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f91371a;

    public d(int i13) {
        this.f91371a = i13;
    }

    @Override // o82.z
    public final ArrayList a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.b((c0) it.next(), null, this.f91371a, false, 27));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f91371a == this.f91371a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91371a);
    }
}
