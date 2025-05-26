package nm1;

import com.pinterest.gestalt.tabs.GestaltTabLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTabLayout f91462a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f91463b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f91464c;

    public p(GestaltTabLayout tabLayout, LinkedHashMap tabToIndex, LinkedHashMap indexToTab) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(tabToIndex, "tabToIndex");
        Intrinsics.checkNotNullParameter(indexToTab, "indexToTab");
        this.f91462a = tabLayout;
        this.f91463b = tabToIndex;
        this.f91464c = indexToTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f91462a, pVar.f91462a) && Intrinsics.d(this.f91463b, pVar.f91463b) && Intrinsics.d(this.f91464c, pVar.f91464c);
    }

    public final int hashCode() {
        return this.f91464c.hashCode() + a.c.e(this.f91463b, this.f91462a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ScrollingTabs(tabLayout=" + this.f91462a + ", tabToIndex=" + this.f91463b + ", indexToTab=" + this.f91464c + ")";
    }
}
