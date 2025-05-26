package k01;

import j01.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f77789a;

    /* renamed from: b, reason: collision with root package name */
    public final ps.c f77790b;

    public b(c modelFactory, ps.c adsPinCloseupModelAllowList) {
        Intrinsics.checkNotNullParameter(modelFactory, "modelFactory");
        Intrinsics.checkNotNullParameter(adsPinCloseupModelAllowList, "adsPinCloseupModelAllowList");
        this.f77789a = modelFactory;
        this.f77790b = adsPinCloseupModelAllowList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f77789a, bVar.f77789a) && Intrinsics.d(this.f77790b, bVar.f77790b);
    }

    public final int hashCode() {
        return this.f77790b.hashCode() + (this.f77789a.hashCode() * 31);
    }

    public final String toString() {
        return "StandaloneItem(modelFactory=" + this.f77789a + ", adsPinCloseupModelAllowList=" + this.f77790b + ")";
    }
}
