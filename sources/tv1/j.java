package tv1;

import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import m60.w;
import wt1.e0;

/* loaded from: classes4.dex */
public final class j extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public String f119598h;

    public j(g00 parentStructuredGuide, List list, ov1.a oneBarInternalListener, z61.b searchPWTManager, Function0 provider, uk1.d presenterPinalytics, w eventManager, ov1.e oneBarContainerSelectionMode, String str, k2 oneBarLibraryExperiments) {
        Intrinsics.checkNotNullParameter(parentStructuredGuide, "parentStructuredGuide");
        Intrinsics.checkNotNullParameter(oneBarInternalListener, "oneBarInternalListener");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(provider, "searchParametersProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        this.f119598h = str;
        xv1.h hVar = new xv1.h(parentStructuredGuide, new i(oneBarContainerSelectionMode, this, parentStructuredGuide, oneBarInternalListener), searchPWTManager, presenterPinalytics, eventManager, -1, true, oneBarLibraryExperiments);
        Intrinsics.checkNotNullParameter(provider, "provider");
        hVar.f136060h = provider;
        Unit unit = Unit.f80348a;
        o(0, hVar);
        if (list != null) {
            k(list);
        }
    }

    public static final void u(j jVar, g00 g00Var, g00 g00Var2) {
        k00 q13;
        List p13;
        jVar.getClass();
        k00 q14 = g00Var.q();
        List p14 = q14 != null ? q14.p() : null;
        int i13 = -1;
        if (p14 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : p14) {
                if (obj instanceof g00) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.d(((g00) it.next()).getUid(), g00Var2.getUid())) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
        }
        if (i13 < 0 || (q13 = g00Var.q()) == null || (p13 = q13.p()) == null) {
            return;
        }
    }

    public static final void v(j jVar, g00 g00Var) {
        jVar.getClass();
        String uid = g00Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Iterator it = jVar.d().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.d(((g00) it.next()).getUid(), uid)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0 || i13 >= jVar.d().size()) {
            return;
        }
        jVar.u1(i13, g00Var);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }
}
