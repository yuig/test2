package f31;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f61009a;

    /* renamed from: b, reason: collision with root package name */
    public final List f61010b;

    public h(int i13, List icons) {
        t searchBarClickedEvent = t.f61029a;
        Intrinsics.checkNotNullParameter(searchBarClickedEvent, "searchBarClickedEvent");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f61009a = i13;
        this.f61010b = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f61009a != hVar.f61009a) {
            return false;
        }
        t tVar = t.f61029a;
        return Intrinsics.d(tVar, tVar) && Intrinsics.d(this.f61010b, hVar.f61010b);
    }

    public final int hashCode() {
        return this.f61010b.hashCode() + ((t.f61029a.hashCode() + (Integer.hashCode(this.f61009a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InnerSearchBarDisplayState(searchBarTextRes=");
        sb3.append(this.f61009a);
        sb3.append(", searchBarClickedEvent=");
        sb3.append(t.f61029a);
        sb3.append(", icons=");
        return a.c.j(sb3, this.f61010b, ")");
    }
}
