package cz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f53447a;

    /* renamed from: b, reason: collision with root package name */
    public final List f53448b;

    public b(List list, List list2, int i13) {
        list = (i13 & 1) != 0 ? null : list;
        list2 = (i13 & 2) != 0 ? null : list2;
        this.f53447a = list;
        this.f53448b = list2;
    }

    public final List a() {
        List list = this.f53447a;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            List list3 = this.f53448b;
            List list4 = list3;
            return (list4 == null || list4.isEmpty()) ? q0.f80391a : list3;
        }
        if (list == null) {
            return null;
        }
        List list5 = list;
        ArrayList arrayList = new ArrayList(g0.q(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public final List b() {
        return this.f53447a;
    }

    public final List c() {
        return this.f53448b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f53447a, bVar.f53447a) && Intrinsics.d(this.f53448b, bVar.f53448b);
    }

    public final int hashCode() {
        List list = this.f53447a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f53448b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "AnswerValues(answersIntList=" + this.f53447a + ", answersStringList=" + this.f53448b + ")";
    }
}
