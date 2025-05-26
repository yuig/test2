package zd1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141701a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141702b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f141703c;

    public d(t32.f fVar, q filterType, ArrayList colorFilterItems) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(colorFilterItems, "colorFilterItems");
        this.f141701a = fVar;
        this.f141702b = filterType;
        this.f141703c = colorFilterItems;
    }

    @Override // zd1.h
    public final h a() {
        ArrayList arrayList = this.f141703c;
        ArrayList colorFilterItems = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            boolean z13 = bVar.f141686e;
            colorFilterItems.add(new b(bVar.f141682a, bVar.f141683b, bVar.f141684c, bVar.f141685d, z13, bVar.f141687f));
        }
        Unit unit = Unit.f80348a;
        q filterType = this.f141702b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(colorFilterItems, "colorFilterItems");
        return new d(this.f141701a, filterType, colorFilterItems);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141702b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141701a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141701a == dVar.f141701a && this.f141702b == dVar.f141702b && Intrinsics.d(this.f141703c, dVar.f141703c);
    }

    public final int hashCode() {
        t32.f fVar = this.f141701a;
        return this.f141703c.hashCode() + ((this.f141702b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ColorsCarouselFilter(thriftProductFilterType=" + this.f141701a + ", filterType=" + this.f141702b + ", colorFilterItems=" + this.f141703c + ")";
    }
}
