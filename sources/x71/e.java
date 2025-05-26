package x71;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f134122a;

    /* renamed from: b, reason: collision with root package name */
    public final List f134123b;

    public e(c page, ArrayList items) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f134122a = page;
        this.f134123b = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f134122a, eVar.f134122a) && Intrinsics.d(this.f134123b, eVar.f134123b);
    }

    public final int hashCode() {
        return this.f134123b.hashCode() + (this.f134122a.hashCode() * 31);
    }

    public final String toString() {
        return "PageWithItems(page=" + this.f134122a + ", items=" + this.f134123b + ")";
    }
}
