package e60;

import android.content.res.Resources;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.i1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nr0.m;
import nx.d0;
import qa2.n;
import so.n6;
import uj2.q;
import x02.a2;
import x02.i2;
import yk1.v;

/* loaded from: classes5.dex */
public final class i extends u42.b {

    /* renamed from: g, reason: collision with root package name */
    public final String f57505g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57506h;

    /* renamed from: i, reason: collision with root package name */
    public final d4 f57507i;

    /* renamed from: j, reason: collision with root package name */
    public final List f57508j;

    /* renamed from: k, reason: collision with root package name */
    public final int f57509k;

    /* renamed from: l, reason: collision with root package name */
    public final String f57510l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f57511m;

    /* renamed from: n, reason: collision with root package name */
    public final String f57512n;

    /* renamed from: o, reason: collision with root package name */
    public final String f57513o;

    /* renamed from: p, reason: collision with root package name */
    public final String f57514p;

    /* renamed from: q, reason: collision with root package name */
    public final String f57515q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f57516r;

    /* renamed from: s, reason: collision with root package name */
    public final t42.b f57517s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wk1.c params, v resources, m dynamicGridViewBinderDelegateFactory, String pinClusterId, String boardName, d4 viewType, ArrayList pinTypes, int i13, String sourceRequestParams, String str, i2 pinRepository, String repinId, String str2) {
        super(resources, params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pinClusterId, "pinClusterId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pinTypes, "pinTypes");
        Intrinsics.checkNotNullParameter(sourceRequestParams, "sourceRequestParams");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinId, "repinId");
        this.f57505g = pinClusterId;
        this.f57506h = boardName;
        this.f57507i = viewType;
        this.f57508j = pinTypes;
        this.f57509k = i13;
        this.f57510l = str;
        this.f57511m = pinRepository;
        this.f57512n = repinId;
        this.f57513o = str2;
        int i14 = d60.a.refine_your_board_title;
        Resources resources2 = ((yk1.a) resources).f139224a;
        this.f57514p = resources2.getString(i14);
        d42.c cVar = d42.c.QUICK_SAVES;
        d42.c cVar2 = d42.c.DOWNLOADED;
        this.f57515q = resources2.getString(pinTypes.containsAll(f0.j(cVar, cVar2)) ? d60.a.refine_your_board_subtitle_mixed : pinTypes.contains(cVar2) ? d60.a.refine_your_board_subtitle_downloaded : d60.a.refine_your_board_subtitle);
        this.f57516r = new LinkedHashSet();
        String k13 = a.a.k("/v3/users/profile/pins/cluster/", pinClusterId, "/feed/");
        String a13 = n00.b.a(n00.c.BASE_PIN_FEED);
        n nVar = params.f130131b;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        n nVar2 = params.f130131b;
        this.f57517s = new t42.b(k13, a13, nVar, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar2.f103320a, nVar2, params.f130137h), this, resources, sourceRequestParams);
    }

    public final String B3() {
        return this.f57515q;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((d) view).f57492f1 = this;
        x3();
        String subheadingText = B3();
        int i13 = 0;
        if (subheadingText != null) {
            t42.a aVar = this.f120493e;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(subheadingText, "subheadingText");
            s42.f fVar = aVar.f116420h;
            fVar.f111144b = subheadingText;
            aVar.u1(0, fVar);
        }
        String str = this.f57512n;
        int length = str.length();
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        t42.b bVar = this.f57517s;
        addDisposable(length > 0 ? q.h(this.f57511m.L(str), bVar.f49129s, new ep.g(5, f.f57499i)).H(tk2.e.f118017c).A(wj2.c.a()).F(new dv.a(15, new g(this, i13)), new dv.a(16, h.f57502j), cVar, a2Var) : bVar.f49129s.F(new dv.a(17, new g(this, 1)), new dv.a(18, h.f57503k), cVar, a2Var));
    }

    public final void F3() {
        if (isBound()) {
            LinkedHashSet linkedHashSet = this.f57516r;
            String str = this.f57512n;
            boolean contains = linkedHashSet.contains(str);
            uk1.c cVar = (j) getView();
            NavigationImpl z33 = z3((ScreenLocation) l.f51051b.getValue());
            if (contains) {
                z33.m0("com.pinterest.EXTRA_DESELECTED_PIN_IDS_LIST", CollectionsKt.Z(new ArrayList(i1.g(linkedHashSet, str)), ",", null, null, 0, null, null, 62));
            } else {
                z33.m0("repin_id", str);
            }
            z33.m0("com.pinterest.EXTRA_SOURCE", this.f57513o);
            Set set = this.f120492d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!Intrinsics.d(((f30) obj).getUid(), str)) {
                    arrayList.add(obj);
                }
            }
            z33.Y1("all_cluster_pins_deselected", CollectionsKt.J0(arrayList).isEmpty());
            ((nl1.d) cVar).M1(z33);
        }
    }

    @Override // u42.b
    public final String u3() {
        return this.f57514p;
    }

    @Override // u42.b
    public final t42.b v3() {
        return this.f57517s;
    }

    @Override // u42.b
    public final boolean w3() {
        return false;
    }

    @Override // u42.b, s42.k
    public final void z0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!this.f57517s.d().contains(model)) {
            super.z0(model);
            return;
        }
        f1 f1Var = H0(model) ? f1.AUTO_REFINE_BOARD_PIN_DESELECTED : f1.AUTO_REFINE_BOARD_PIN_SELECTED;
        boolean H0 = H0(model);
        LinkedHashSet linkedHashSet = this.f57516r;
        if (H0) {
            String uid = model.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            linkedHashSet.add(uid);
        } else {
            linkedHashSet.remove(model.getUid());
        }
        super.z0(model);
        LinkedHashMap h10 = z0.h(new Pair("pin_id", model.getUid()));
        String str = this.f57510l;
        if (str != null) {
        }
        d0.B(getPinalytics(), f1Var, null, null, new HashMap(h10), 22);
        j jVar = (j) getViewIfBound();
        if (jVar != null) {
            ((d) jVar).o9(!this.f120492d.isEmpty());
        }
    }

    public final NavigationImpl z3(ScreenLocation screenLocation) {
        NavigationImpl w13 = Navigation.w1(screenLocation);
        w13.m0("com.pinterest.EXTRA_DESELECTED_PIN_IDS_LIST", CollectionsKt.Z(new ArrayList(this.f57516r), ",", null, null, 0, null, null, 62));
        w13.m0("com.pinterest.EXTRA_CLUSTER_ID", this.f57505g);
        w13.Y1("is_from_auto_organize", true);
        w13.m0("com.pinterest.EXTRA_BOARD_NAME", this.f57506h);
        w13.m0("com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", this.f57507i.name());
        List list = this.f57508j;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((d42.c) it.next()).getValue()));
        }
        w13.f49942d.putIntegerArrayList("cluster_pin_types", new ArrayList<>(arrayList));
        w13.m0("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", this.f57510l);
        w13.m0("com.pinterest.EXTRA_SOURCE", this.f57513o);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        return w13;
    }
}
