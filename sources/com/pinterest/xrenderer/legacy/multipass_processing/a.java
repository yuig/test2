package com.pinterest.xrenderer.legacy.multipass_processing;

import d7.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final td2.a f52865a;

    /* renamed from: b, reason: collision with root package name */
    public final List f52866b;

    public a(td2.a filter, List passes) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(passes, "passes");
        this.f52865a = filter;
        this.f52866b = passes;
        List list = passes;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((e) it.next()).f52879d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((c) next).f52871a.f16503b) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((c) it3.next()).f52872b);
            }
            arrayList.add(CollectionsKt.J0(arrayList4));
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next2 = it4.next();
        while (it4.hasNext()) {
            next2 = CollectionsKt.K0((Set) next2, (Set) it4.next());
        }
        Set set = (Set) next2;
        for (String str : this.f52865a.f117474c.a()) {
            if (!set.contains(str)) {
                throw new IllegalStateException(a.a.p(a.a.w("\n                    Can't find uniform for parameter `", str, "` in shader code. \n                    Seems like `", str, "` parameter is not used in any of the shaders,\n                    and thus the `"), this.f52865a.f117472a, "` effect won't react to this parameter value change.\n                    This is an unexpected behavior.\n                ").toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f52865a, aVar.f52865a) && Intrinsics.d(this.f52866b, aVar.f52866b);
    }

    public final int hashCode() {
        return this.f52866b.hashCode() + (this.f52865a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterPipeline(filter=");
        sb3.append(this.f52865a);
        sb3.append(", passes=");
        return g.k(sb3, this.f52866b, ')');
    }
}
