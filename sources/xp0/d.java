package xp0;

import bv0.k;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import cp.b0;
import dk2.g;
import gk2.g0;
import gk2.h0;
import gk2.k2;
import gk2.v;
import gk2.x0;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.oa;
import sq0.e0;
import uj2.h;
import uj2.q;
import wp0.e;
import yk1.i;

/* loaded from: classes5.dex */
public final class d extends vq0.b implements ar0.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f135645c;

    /* renamed from: d, reason: collision with root package name */
    public final List f135646d;

    /* renamed from: e, reason: collision with root package name */
    public final hl1.a f135647e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135648f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135649g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f135650h;

    /* renamed from: i, reason: collision with root package name */
    public String f135651i;

    /* renamed from: j, reason: collision with root package name */
    public final String f135652j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, q networkStateStream, a itemClickListener, List contextualDataSources, hl1.a viewActivity, boolean z13, Integer num, int i13) {
        super(pinalytics, networkStateStream);
        z13 = (i13 & 64) != 0 ? false : z13;
        num = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : num;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        Intrinsics.checkNotNullParameter(contextualDataSources, "contextualDataSources");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        this.f135645c = itemClickListener;
        this.f135646d = contextualDataSources;
        this.f135647e = viewActivity;
        this.f135648f = true;
        this.f135649g = z13;
        this.f135650h = num;
        this.f135651i = "";
        String uid = com.bumptech.glide.d.Q(com.bumptech.glide.d.E()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f135652j = uid;
        o(1, ((up0.b) ((oa) ((w92.a) w92.c.f128606a.getValue())).Pc.get()).getViewBinder(getPresenterPinalytics(), num));
    }

    public final void D3(e change) {
        Intrinsics.checkNotNullParameter(change, "change");
        d0 pinalytics = getPinalytics();
        f1 eventType = change.getEventType();
        HashMap hashMap = new HashMap();
        hashMap.put("tag_type", String.valueOf(change.getTagType().getValue()));
        Unit unit = Unit.f80348a;
        d0.B(pinalytics, eventType, null, null, hashMap, 22);
    }

    @Override // vq0.g
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final void r3(vp0.a aVar) {
        super.r3(aVar);
        if (this.f135648f) {
            Integer num = this.f135650h;
            if (num != null && num.intValue() == 22) {
                G3(this.f135651i);
            } else {
                G3("");
            }
        }
    }

    public final void G3(String s13) {
        Intrinsics.checkNotNullParameter(s13, "s");
        this.f135651i = s13;
        loadData();
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        br.d dVar = (br.d) getItem(i13);
        if (dVar == null) {
            return;
        }
        this.f135645c.b1(dVar, this.f135651i);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.g
    public final void loadData() {
        h iVar;
        v vVar;
        super.loadData();
        vp0.a aVar = (vp0.a) getView();
        i iVar2 = i.LOADED;
        aVar.getClass();
        ArrayList arrayList = new ArrayList(3);
        Iterator it = this.f135646d.iterator();
        while (it.hasNext()) {
            arrayList.add(((wp0.a) it.next()).a(this.f135651i, this.f135647e));
        }
        v3();
        clearDisposables();
        int i13 = h.f122339a;
        int i14 = 2;
        h0 h0Var = new h0(arrayList, 2);
        ck2.e eVar = ck2.i.f27921a;
        ck2.i.c(2, "prefetch");
        if (h0Var instanceof g) {
            Object call = ((g) h0Var).call();
            iVar = call == null ? g0.f65416b : new k2(eVar, call);
        } else {
            iVar = new gk2.i(h0Var, pk2.e.BOUNDARY);
        }
        Intrinsics.checkNotNullExpressionValue(iVar, "concat(...)");
        int i15 = 14;
        Integer num = this.f135650h;
        if (num != null && num.intValue() == 22) {
            gk2.f1 f1Var = new gk2.f1(iVar, new k(9, b.f135638j), i14);
            qk0.b bVar = new qk0.b(i15, b.f135639k);
            ck2.d dVar = ck2.d.INSTANCE;
            ck2.i.b(dVar, "collectionSupplier is null");
            vVar = new v(f1Var, bVar, dVar);
        } else {
            gk2.f1 f1Var2 = new gk2.f1(iVar, new k(10, new c(this, 0)), i14);
            qk0.b bVar2 = new qk0.b(15, b.f135640l);
            ck2.d dVar2 = ck2.d.INSTANCE;
            ck2.i.b(dVar2, "collectionSupplier is null");
            vVar = new v(f1Var2, bVar2, dVar2);
        }
        xj2.c k13 = vVar.k(new op0.a(1, new c(this, 1)), new op0.a(2, b.f135641m), new b0(this, i15), x0.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(k13, "subscribe(...)");
        addDisposable(k13);
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
