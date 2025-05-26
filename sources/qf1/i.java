package qf1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f103688a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f103689b;

    public i(ArrayList arrayList, boolean z13) {
        this.f103688a = arrayList;
        this.f103689b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f103688a, iVar.f103688a) && this.f103689b == iVar.f103689b;
    }

    public final int hashCode() {
        List list = this.f103688a;
        return Boolean.hashCode(this.f103689b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "MusicAttributionList(tracks=" + this.f103688a + ", shouldMute=" + this.f103689b + ")";
    }
}
