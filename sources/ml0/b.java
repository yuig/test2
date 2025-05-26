package ml0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f87439a;

    /* renamed from: b, reason: collision with root package name */
    public final a f87440b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f87441c;

    public b(o82.a0 listDisplayState, a imageDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(imageDisplayState, "imageDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f87439a = listDisplayState;
        this.f87440b = imageDisplayState;
        this.f87441c = pinalyticsState;
    }

    public static b e(b bVar, o82.a0 listDisplayState, a imageDisplayState, zy.a0 pinalyticsState, int i13) {
        if ((i13 & 1) != 0) {
            listDisplayState = bVar.f87439a;
        }
        if ((i13 & 2) != 0) {
            imageDisplayState = bVar.f87440b;
        }
        if ((i13 & 4) != 0) {
            pinalyticsState = bVar.f87441c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(imageDisplayState, "imageDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new b(listDisplayState, imageDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f87439a, bVar.f87439a) && Intrinsics.d(this.f87440b, bVar.f87440b) && Intrinsics.d(this.f87441c, bVar.f87441c);
    }

    public final int hashCode() {
        return this.f87441c.hashCode() + ((this.f87440b.hashCode() + (this.f87439a.f93524a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BoardHeaderImageSelectorDisplayState(listDisplayState=" + this.f87439a + ", imageDisplayState=" + this.f87440b + ", pinalyticsState=" + this.f87441c + ")";
    }
}
