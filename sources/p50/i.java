package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f98867a;

    /* renamed from: b, reason: collision with root package name */
    public final c f98868b;

    public i(String __typename, c cVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98867a = __typename;
        this.f98868b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f98867a, iVar.f98867a) && Intrinsics.d(this.f98868b, iVar.f98868b);
    }

    public final int hashCode() {
        int hashCode = this.f98867a.hashCode() * 31;
        c cVar = this.f98868b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "V3AndroidWidgetGetBoardPinsV3AndroidWidgetGetBoardPinsQuery(__typename=" + this.f98867a + ", data=" + this.f98868b + ")";
    }
}
