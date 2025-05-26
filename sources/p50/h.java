package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f98865a;

    /* renamed from: b, reason: collision with root package name */
    public final g f98866b;

    public h(String __typename, g gVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98865a = __typename;
        this.f98866b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f98865a, hVar.f98865a) && Intrinsics.d(this.f98866b, hVar.f98866b);
    }

    public final int hashCode() {
        int hashCode = this.f98865a.hashCode() * 31;
        g gVar = this.f98866b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "V3AndroidWidgetGetBoardPinsDataConnectionContainerData(__typename=" + this.f98865a + ", connection=" + this.f98866b + ")";
    }
}
