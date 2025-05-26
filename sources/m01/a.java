package m01;

import a.cb;
import com.pinterest.api.model.tc0;
import com.pinterest.api.model.xc0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85271b;

    /* renamed from: c, reason: collision with root package name */
    public final tc0 f85272c;

    /* renamed from: d, reason: collision with root package name */
    public final xc0 f85273d;

    public a(String queryPinId, String relatedFilterTabsStoryId, tc0 relatedFilterTab, xc0 xc0Var) {
        Intrinsics.checkNotNullParameter(queryPinId, "queryPinId");
        Intrinsics.checkNotNullParameter(relatedFilterTabsStoryId, "relatedFilterTabsStoryId");
        Intrinsics.checkNotNullParameter(relatedFilterTab, "relatedFilterTab");
        this.f85270a = queryPinId;
        this.f85271b = relatedFilterTabsStoryId;
        this.f85272c = relatedFilterTab;
        this.f85273d = xc0Var;
    }

    public final xc0 a() {
        return this.f85273d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85270a, aVar.f85270a) && Intrinsics.d(this.f85271b, aVar.f85271b) && Intrinsics.d(this.f85272c, aVar.f85272c) && Intrinsics.d(this.f85273d, aVar.f85273d);
    }

    public final int hashCode() {
        int hashCode = (this.f85272c.hashCode() + cb.d(this.f85271b, this.f85270a.hashCode() * 31, 31)) * 31;
        xc0 xc0Var = this.f85273d;
        return hashCode + (xc0Var == null ? 0 : xc0Var.hashCode());
    }

    public final String toString() {
        return "FilterOptionsSheetModel(queryPinId=" + this.f85270a + ", relatedFilterTabsStoryId=" + this.f85271b + ", relatedFilterTab=" + this.f85272c + ", selectedOption=" + this.f85273d + ")";
    }
}
