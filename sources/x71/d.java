package x71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f134120a;

    /* renamed from: b, reason: collision with root package name */
    public final e f134121b;

    public d(a draft, e pageWithItems) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(pageWithItems, "pageWithItems");
        this.f134120a = draft;
        this.f134121b = pageWithItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f134120a, dVar.f134120a) && Intrinsics.d(this.f134121b, dVar.f134121b);
    }

    public final int hashCode() {
        return this.f134121b.hashCode() + (this.f134120a.hashCode() * 31);
    }

    public final String toString() {
        return "DraftWithPageAndItems(draft=" + this.f134120a + ", pageWithItems=" + this.f134121b + ")";
    }
}
