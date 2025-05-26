package x71;

import kotlin.jvm.internal.Intrinsics;
import z71.i;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f134114a;

    /* renamed from: b, reason: collision with root package name */
    public final i f134115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134116c;

    public b(i overlayItem, String id3, String pageId) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(overlayItem, "overlayItem");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f134114a = id3;
        this.f134115b = overlayItem;
        this.f134116c = pageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f134114a, bVar.f134114a) && Intrinsics.d(this.f134115b, bVar.f134115b) && Intrinsics.d(this.f134116c, bVar.f134116c);
    }

    public final int hashCode() {
        return this.f134116c.hashCode() + ((this.f134115b.hashCode() + (this.f134114a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageItemEntity(id=");
        sb3.append(this.f134114a);
        sb3.append(", overlayItem=");
        sb3.append(this.f134115b);
        sb3.append(", pageId=");
        return a.a.p(sb3, this.f134116c, ")");
    }
}
