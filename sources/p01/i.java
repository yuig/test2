package p01;

import com.pinterest.api.model.tc0;
import com.pinterest.api.model.xc0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import sq0.c0;
import wk1.q;

/* loaded from: classes5.dex */
public final class i extends q {

    /* renamed from: a, reason: collision with root package name */
    public final m01.a f98376a;

    /* renamed from: b, reason: collision with root package name */
    public xc0 f98377b;

    /* renamed from: c, reason: collision with root package name */
    public final n01.b f98378c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uk1.d presenterPinalytics, uj2.q networkStateStream, m01.a optionsSheetModel) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(optionsSheetModel, "optionsSheetModel");
        this.f98376a = optionsSheetModel;
        this.f98377b = optionsSheetModel.f85273d;
        this.f98378c = new n01.b(optionsSheetModel.f85271b, optionsSheetModel.f85272c, this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f98378c);
    }

    public final void t3(boolean z13, xc0 xc0Var) {
        m01.a aVar = this.f98376a;
        tc0 tc0Var = aVar.f85272c;
        d0 pinalytics = getPinalytics();
        f1 f1Var = z13 ? f1.SELECT : f1.UNSELECT;
        u0 u0Var = u0.RELATED_PINS_FILTER_OPTION_REP;
        String uid = xc0Var.getUid();
        HashMap hashMap = new HashMap();
        hashMap.put("story_id", aVar.f85271b);
        hashMap.put("filter_name", tc0Var.n());
        hashMap.put("filter_type", String.valueOf(tc0Var.u().intValue()));
        hashMap.put("filter_option_name", xc0Var.j());
        hashMap.put("index", String.valueOf(this.f98378c.d().indexOf(xc0Var)));
        String q13 = tc0Var.q();
        if (q13 == null) {
            q13 = "";
        }
        hashMap.put("pin_id", q13);
        Unit unit = Unit.f80348a;
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(m01.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((q01.p) view).C0 = this;
        m01.a aVar = this.f98376a;
        tc0 tc0Var = aVar.f85272c;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.VIEW;
        String uid = tc0Var.getUid();
        HashMap hashMap = new HashMap();
        hashMap.put("story_id", aVar.f85271b);
        xc0 xc0Var = aVar.f85273d;
        if (xc0Var != null) {
            hashMap.put("filter_option_name", xc0Var.j());
        }
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, null, uid, hashMap, 18);
    }

    public final void v3() {
        m01.a aVar = this.f98376a;
        tc0 tc0Var = aVar.f85272c;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.DISMISS;
        String uid = tc0Var.getUid();
        HashMap hashMap = new HashMap();
        hashMap.put("story_id", aVar.f85271b);
        hashMap.put("filter_name", tc0Var.n());
        hashMap.put("filter_type", String.valueOf(tc0Var.u().intValue()));
        hashMap.put("did_user_perform_any_action", String.valueOf(this.f98379d));
        String q13 = tc0Var.q();
        if (q13 == null) {
            q13 = "";
        }
        hashMap.put("pin_id", q13);
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, f1Var, null, uid, hashMap, 18);
    }

    public final void w3(xc0 xc0Var) {
        n01.b bVar = this.f98378c;
        int indexOf = bVar.d().indexOf(xc0Var);
        if (indexOf < 0 || indexOf >= bVar.d().size()) {
            return;
        }
        bVar.u1(indexOf, xc0Var);
    }
}
