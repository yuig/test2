package p01;

import com.pinterest.api.model.tc0;
import com.pinterest.api.model.xc0;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFilterRepView;
import i01.a1;
import i01.b1;
import i01.y0;
import i01.z0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import yk1.v;

/* loaded from: classes5.dex */
public final class h extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final j f98371a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f98372b;

    /* renamed from: c, reason: collision with root package name */
    public final v f98373c;

    /* renamed from: d, reason: collision with root package name */
    public final String f98374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98375e;

    public h(j filterSelectionStateManager, y0 itemClickListener, yk1.a viewResources, String storyId, int i13) {
        Intrinsics.checkNotNullParameter(filterSelectionStateManager, "filterSelectionStateManager");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        this.f98371a = filterSelectionStateManager;
        this.f98372b = itemClickListener;
        this.f98373c = viewResources;
        this.f98374d = storyId;
        this.f98375e = i13;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        String n13;
        a1 view = (a1) nVar;
        tc0 filter = (tc0) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(filter, "filter");
        n nVar2 = (n) this.f98371a;
        nVar2.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashMap linkedHashMap = nVar2.f98392h;
        xc0 xc0Var = (xc0) linkedHashMap.get(filter);
        Integer u13 = filter.u();
        m32.c cVar = m32.c.ALL;
        if (u13.intValue() == cVar.getValue()) {
            n13 = linkedHashMap.size() == 0 ? filter.n() : ((yk1.a) this.f98373c).f139224a.getString(x0.reset);
            Intrinsics.f(n13);
        } else {
            if (xc0Var == null || (n13 = xc0Var.j()) == null) {
                n13 = filter.n();
            }
            Intrinsics.f(n13);
        }
        z0 z0Var = new z0(filter.u().intValue(), n13, xc0Var != null ? xc0Var.h() : null, filter.u().intValue() == cVar.getValue() ? linkedHashMap.isEmpty() : xc0Var != null, false);
        String uid = filter.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Integer u14 = filter.u();
        Intrinsics.checkNotNullExpressionValue(u14, "getTabType(...)");
        int intValue = u14.intValue();
        String n14 = filter.n();
        Intrinsics.checkNotNullExpressionValue(n14, "getName(...)");
        String q13 = filter.q();
        if (q13 == null) {
            q13 = "";
        }
        ((RelatedPinsFilterRepView) view).a(z0Var, this.f98372b, new b1(uid, null, intValue, n14, i13, this.f98375e, q13, this.f98374d, xc0Var != null ? xc0Var.j() : null));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        tc0 model = (tc0) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return model.n();
    }
}
