package ad2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class j implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2101b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2102c;

    public j(String id3, String name, String str) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2100a = id3;
        this.f2101b = name;
        this.f2102c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f2100a, jVar.f2100a) && Intrinsics.d(this.f2101b, jVar.f2101b) && Intrinsics.d(this.f2102c, jVar.f2102c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f2101b, this.f2100a.hashCode() * 31, 31);
        String str = this.f2102c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetBoardSelectionItem(id=");
        sb3.append(this.f2100a);
        sb3.append(", name=");
        sb3.append(this.f2101b);
        sb3.append(", boardCoverImageUrl=");
        return a.a.p(sb3, this.f2102c, ")");
    }

    public /* synthetic */ j() {
        this("", "", null);
    }
}
