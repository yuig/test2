package ee1;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f58799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58800b;

    /* renamed from: c, reason: collision with root package name */
    public final List f58801c;

    public h(t32.f fVar, String label, ArrayList selectedFilterOptions) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(selectedFilterOptions, "selectedFilterOptions");
        this.f58799a = fVar;
        this.f58800b = label;
        this.f58801c = selectedFilterOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58799a == hVar.f58799a && Intrinsics.d(this.f58800b, hVar.f58800b) && Intrinsics.d(this.f58801c, hVar.f58801c);
    }

    public final int hashCode() {
        t32.f fVar = this.f58799a;
        return this.f58801c.hashCode() + cb.d(this.f58800b, (fVar == null ? 0 : fVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingFilterEmptyStateButtonModel(productFilterType=");
        sb3.append(this.f58799a);
        sb3.append(", label=");
        sb3.append(this.f58800b);
        sb3.append(", selectedFilterOptions=");
        return a.c.j(sb3, this.f58801c, ")");
    }
}
