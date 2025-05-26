package f31;

import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final h f61012a;

    /* renamed from: b, reason: collision with root package name */
    public final kh2.n f61013b;

    /* renamed from: c, reason: collision with root package name */
    public final k51.o f61014c;

    public i(h hVar, k51.o oVar, int i13) {
        this((i13 & 1) != 0 ? new h(x0.search_your_pins, q0.f80391a) : hVar, d.f60996b, oVar);
    }

    public static i e(i iVar, h innerSearchBarDisplayState, kh2.n contentCreate, k51.o viewOptionsDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            innerSearchBarDisplayState = iVar.f61012a;
        }
        if ((i13 & 2) != 0) {
            contentCreate = iVar.f61013b;
        }
        if ((i13 & 4) != 0) {
            viewOptionsDisplayState = iVar.f61014c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(innerSearchBarDisplayState, "innerSearchBarDisplayState");
        Intrinsics.checkNotNullParameter(contentCreate, "contentCreate");
        Intrinsics.checkNotNullParameter(viewOptionsDisplayState, "viewOptionsDisplayState");
        return new i(innerSearchBarDisplayState, contentCreate, viewOptionsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f61012a, iVar.f61012a) && Intrinsics.d(this.f61013b, iVar.f61013b) && Intrinsics.d(this.f61014c, iVar.f61014c);
    }

    public final int hashCode() {
        return this.f61014c.hashCode() + ((this.f61013b.hashCode() + (this.f61012a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shown(innerSearchBarDisplayState=" + this.f61012a + ", contentCreate=" + this.f61013b + ", viewOptionsDisplayState=" + this.f61014c + ")";
    }

    public i(h innerSearchBarDisplayState, kh2.n contentCreate, k51.o viewOptionsDisplayState) {
        Intrinsics.checkNotNullParameter(innerSearchBarDisplayState, "innerSearchBarDisplayState");
        Intrinsics.checkNotNullParameter(contentCreate, "contentCreate");
        Intrinsics.checkNotNullParameter(viewOptionsDisplayState, "viewOptionsDisplayState");
        this.f61012a = innerSearchBarDisplayState;
        this.f61013b = contentCreate;
        this.f61014c = viewOptionsDisplayState;
    }
}
