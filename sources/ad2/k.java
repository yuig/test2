package ad2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2103a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2105c;

    public k(String id3, String name, String str) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2103a = id3;
        this.f2104b = name;
        this.f2105c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f2103a, kVar.f2103a) && Intrinsics.d(this.f2104b, kVar.f2104b) && Intrinsics.d(this.f2105c, kVar.f2105c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f2104b, this.f2103a.hashCode() * 31, 31);
        String str = this.f2105c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetBoardSelectionItemDisplayState(id=");
        sb3.append(this.f2103a);
        sb3.append(", name=");
        sb3.append(this.f2104b);
        sb3.append(", boardCoverImageUrl=");
        return a.a.p(sb3, this.f2105c, ")");
    }
}
