package nm0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lm0.c0;
import o82.z;
import wa2.m;

/* loaded from: classes5.dex */
public final class b implements z {

    /* renamed from: a, reason: collision with root package name */
    public final m f91369a;

    public b(m featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f91369a = featureConfig;
    }

    @Override // o82.z
    public final ArrayList a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.b((c0) it.next(), this.f91369a, 0, false, 29));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && Intrinsics.d(((b) obj).f91369a, this.f91369a);
    }

    public final int hashCode() {
        return this.f91369a.hashCode();
    }
}
