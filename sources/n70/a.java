package n70;

import com.pinterest.api.model.f30;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f89595a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.a0 f89596b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f89597c;

    /* renamed from: d, reason: collision with root package name */
    public final List f89598d;

    /* renamed from: e, reason: collision with root package name */
    public final f30 f89599e;

    public a(Map pinIdToSavedPinMap, o82.a0 multiSectionDisplayState, zy.a0 pinalyticsDisplayState, List oneBarModuleDisplayState, f30 f30Var) {
        Intrinsics.checkNotNullParameter(pinIdToSavedPinMap, "pinIdToSavedPinMap");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(oneBarModuleDisplayState, "oneBarModuleDisplayState");
        this.f89595a = pinIdToSavedPinMap;
        this.f89596b = multiSectionDisplayState;
        this.f89597c = pinalyticsDisplayState;
        this.f89598d = oneBarModuleDisplayState;
        this.f89599e = f30Var;
    }

    public static a e(a aVar, Map map, o82.a0 a0Var, zy.a0 a0Var2, List list, f30 f30Var, int i13) {
        if ((i13 & 1) != 0) {
            map = aVar.f89595a;
        }
        Map pinIdToSavedPinMap = map;
        if ((i13 & 2) != 0) {
            a0Var = aVar.f89596b;
        }
        o82.a0 multiSectionDisplayState = a0Var;
        if ((i13 & 4) != 0) {
            a0Var2 = aVar.f89597c;
        }
        zy.a0 pinalyticsDisplayState = a0Var2;
        if ((i13 & 8) != 0) {
            list = aVar.f89598d;
        }
        List oneBarModuleDisplayState = list;
        if ((i13 & 16) != 0) {
            f30Var = aVar.f89599e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pinIdToSavedPinMap, "pinIdToSavedPinMap");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(oneBarModuleDisplayState, "oneBarModuleDisplayState");
        return new a(pinIdToSavedPinMap, multiSectionDisplayState, pinalyticsDisplayState, oneBarModuleDisplayState, f30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f89595a, aVar.f89595a) && Intrinsics.d(this.f89596b, aVar.f89596b) && Intrinsics.d(this.f89597c, aVar.f89597c) && Intrinsics.d(this.f89598d, aVar.f89598d) && Intrinsics.d(this.f89599e, aVar.f89599e);
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f89598d, (this.f89597c.hashCode() + ep.b.c(this.f89596b.f93524a, this.f89595a.hashCode() * 31, 31)) * 31, 31);
        f30 f30Var = this.f89599e;
        return c13 + (f30Var == null ? 0 : f30Var.hashCode());
    }

    public final String toString() {
        return "BoardShopToolDisplayState(pinIdToSavedPinMap=" + this.f89595a + ", multiSectionDisplayState=" + this.f89596b + ", pinalyticsDisplayState=" + this.f89597c + ", oneBarModuleDisplayState=" + this.f89598d + ", pinInTransaction=" + this.f89599e + ")";
    }
}
