package gx;

import com.pinterest.api.model.vh;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final vh f66241a;

    /* renamed from: b, reason: collision with root package name */
    public final List f66242b;

    public a(vh vhVar, List categoryList) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        this.f66241a = vhVar;
        this.f66242b = categoryList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f66241a, aVar.f66241a) && Intrinsics.d(this.f66242b, aVar.f66242b);
    }

    public final int hashCode() {
        vh vhVar = this.f66241a;
        return this.f66242b.hashCode() + ((vhVar == null ? 0 : vhVar.hashCode()) * 31);
    }

    public final String toString() {
        return "AdsStlShoppingModuleDisplayState(dynamicStory=" + this.f66241a + ", categoryList=" + this.f66242b + ")";
    }
}
