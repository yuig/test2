package zd1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141760a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141761b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f141762c;

    /* renamed from: d, reason: collision with root package name */
    public u f141763d;

    public s(t32.f fVar, q filterType, ArrayList sortFilterItems, u selectedSortType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(sortFilterItems, "sortFilterItems");
        Intrinsics.checkNotNullParameter(selectedSortType, "selectedSortType");
        this.f141760a = fVar;
        this.f141761b = filterType;
        this.f141762c = sortFilterItems;
        this.f141763d = selectedSortType;
    }

    @Override // zd1.h
    public final h a() {
        ArrayList arrayList = this.f141762c;
        ArrayList sortFilterItems = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            String label = tVar.f141764a;
            Intrinsics.checkNotNullParameter(label, "label");
            u sortType = tVar.f141765b;
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            sortFilterItems.add(new t(label, sortType));
        }
        Unit unit = Unit.f80348a;
        u selectedSortType = this.f141763d;
        q filterType = this.f141761b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(sortFilterItems, "sortFilterItems");
        Intrinsics.checkNotNullParameter(selectedSortType, "selectedSortType");
        return new s(this.f141760a, filterType, sortFilterItems, selectedSortType);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141761b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141760a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f141760a == sVar.f141760a && this.f141761b == sVar.f141761b && Intrinsics.d(this.f141762c, sVar.f141762c) && this.f141763d == sVar.f141763d;
    }

    public final int hashCode() {
        t32.f fVar = this.f141760a;
        return this.f141763d.hashCode() + ((this.f141762c.hashCode() + ((this.f141761b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SortFilter(thriftProductFilterType=" + this.f141760a + ", filterType=" + this.f141761b + ", sortFilterItems=" + this.f141762c + ", selectedSortType=" + this.f141763d + ")";
    }
}
