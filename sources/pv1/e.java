package pv1;

import android.content.Context;
import androidx.recyclerview.widget.v2;
import c71.b0;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.analytics.kibana.KibanaMetrics;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.px0;
import com.pinterest.api.model.wy0;
import com.pinterest.oneBarLibrary.container.presenter.ModuleAutoClickEvent$Payload;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.PinterestRecyclerView;
import de1.r0;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk2.a1;
import kg.p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import lh0.k2;
import m60.w;
import nx.d0;
import pe.i;
import ql2.s;
import vy.m;
import xv1.h;
import xv1.k;
import xv1.n;
import xv1.q;
import yk1.r;
import yk1.v;

/* loaded from: classes4.dex */
public final class e extends vq0.b implements ov1.b {

    /* renamed from: c, reason: collision with root package name */
    public final m f101473c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f101474d;

    /* renamed from: e, reason: collision with root package name */
    public final v f101475e;

    /* renamed from: f, reason: collision with root package name */
    public final ov1.e f101476f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101477g;

    /* renamed from: h, reason: collision with root package name */
    public List f101478h;

    /* renamed from: i, reason: collision with root package name */
    public String f101479i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f101480j;

    /* renamed from: k, reason: collision with root package name */
    public ov1.d f101481k;

    /* renamed from: l, reason: collision with root package name */
    public List f101482l;

    /* renamed from: m, reason: collision with root package name */
    public List f101483m;

    /* renamed from: n, reason: collision with root package name */
    public final h f101484n;

    /* renamed from: o, reason: collision with root package name */
    public final n f101485o;

    /* renamed from: p, reason: collision with root package name */
    public final k f101486p;

    /* renamed from: q, reason: collision with root package name */
    public final xv1.e f101487q;

    /* renamed from: r, reason: collision with root package name */
    public final q f101488r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, uk1.d presenterPinalytics, uj2.q networkStateStream, z61.b bVar, a1 a1Var, w eventManager, int i13, k2 oneBarLibraryExperiments, m analyticsApi, b60.b activeUserManager, v viewResources, lb0.q prefsManagerPersisted, ov1.e oneBarContainerSelectionMode, r0 unifiedProductFilterHostScreenType, boolean z13, boolean z14, Integer num, Integer num2, int i14) {
        super(presenterPinalytics, networkStateStream);
        z61.b bVar2 = (i14 & 8) != 0 ? null : bVar;
        a1 a1Var2 = (i14 & 16) != 0 ? null : a1Var;
        boolean z15 = (i14 & 16384) != 0 ? true : z13;
        a1 a1Var3 = a1Var2;
        boolean z16 = (32768 & i14) != 0 ? false : z14;
        Integer num3 = (i14 & 65536) != 0 ? null : num;
        Integer num4 = (i14 & 131072) != 0 ? null : num2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        Intrinsics.checkNotNullParameter(unifiedProductFilterHostScreenType, "unifiedProductFilterHostScreenType");
        this.f101473c = analyticsApi;
        this.f101474d = activeUserManager;
        this.f101475e = viewResources;
        this.f101476f = oneBarContainerSelectionMode;
        this.f101477g = z16;
        this.f101478h = q0.f80391a;
        this.f101480j = d.f101472i;
        c cVar = new c(this, z15);
        h hVar = new h(null, cVar, bVar2, presenterPinalytics, eventManager, i13, false, oneBarLibraryExperiments);
        this.f101484n = hVar;
        n nVar = new n(cVar, presenterPinalytics, eventManager, oneBarContainerSelectionMode);
        this.f101485o = nVar;
        k kVar = new k(context, presenterPinalytics, eventManager, prefsManagerPersisted, new b(this, 0), new b(this, 1));
        this.f101486p = kVar;
        xv1.e eVar = new xv1.e(a1Var3, presenterPinalytics, eventManager, unifiedProductFilterHostScreenType);
        this.f101487q = eVar;
        q qVar = new q(cVar, bVar2, presenterPinalytics, eventManager, i13, num3, num4);
        this.f101488r = qVar;
        this.f126436a.j(0, hVar);
        this.f126436a.j(1, nVar);
        this.f126436a.j(2, eVar);
        this.f126436a.j(3, kVar);
        this.f126436a.j(4, qVar);
    }

    public static final g00 D3(e eVar, String str) {
        Object obj;
        Iterator it = super.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            g00 g00Var = obj instanceof g00 ? (g00) obj : null;
            if (Intrinsics.d(g00Var != null ? g00Var.getUid() : null, str)) {
                break;
            }
        }
        if (obj instanceof g00) {
            return (g00) obj;
        }
        return null;
    }

    public final void F3(String moduleId) {
        ov1.c cVar;
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        int I3 = I3(moduleId);
        if (I3 < 0 || I3 >= super.d().size() || (cVar = (ov1.c) getViewIfBound()) == null) {
            return;
        }
        OneBarContainer oneBarContainer = (OneBarContainer) cVar;
        xk2.v vVar = oneBarContainer.f49983g;
        ((v2) vVar.getValue()).f19651a = I3;
        oneBarContainer.getPinterestRecyclerView().f52531a.f19242n.X0((v2) vVar.getValue());
    }

    public final void G3(t32.f fVar) {
        String p13;
        List m13;
        g00 H3 = H3(fVar);
        if (H3 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(H3, "<this>");
        k00 q13 = H3.q();
        o00 o00Var = null;
        px0 r13 = q13 != null ? q13.r() : null;
        if (fVar == t32.f.PRODUCT_PRICE) {
            if (r13 != null && (m13 = r13.m()) != null) {
                p13 = ph.a.Z(m13, this.f101475e);
            }
            p13 = null;
        } else {
            o00 v13 = H3.v();
            if (v13 != null) {
                p13 = v13.p();
            }
            p13 = null;
        }
        d00 z13 = H3.z();
        Intrinsics.checkNotNullExpressionValue(z13, "toBuilder(...)");
        Intrinsics.checkNotNullParameter(H3, "<this>");
        k00 q14 = H3.q();
        px0 r14 = q14 != null ? q14.r() : null;
        ph.a.G0(z13, r14 != null ? r14.m() : null);
        o00 v14 = H3.v();
        if (v14 != null) {
            l00 B = v14.B();
            B.g(Boolean.FALSE);
            B.f(null);
            B.c(p13);
            o00Var = B.a();
        }
        z13.c(o00Var);
        g00 a13 = z13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        R3(a13, false);
    }

    public final g00 H3(t32.f fVar) {
        Object obj;
        px0 r13;
        List d2 = super.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : d2) {
            if (obj2 instanceof g00) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            t32.d dVar = t32.f.Companion;
            k00 q13 = ((g00) obj).q();
            if (q13 != null && (r13 = q13.r()) != null) {
                int intValue = r13.o().intValue();
                dVar.getClass();
                if (t32.d.a(intValue) == fVar) {
                    break;
                }
            }
        }
        return (g00) obj;
    }

    public final int I3(String str) {
        List d2 = super.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof g00) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(((g00) it.next()).getUid(), str)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public final ArrayList J3() {
        List d2 = super.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof g00) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (i.Q0((g00) next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final void K3() {
        String str;
        int i13;
        Map u13;
        Object obj;
        String obj2;
        Object obj3;
        String obj4;
        b0 b0Var = (b0) this.f101480j.invoke();
        if (b0Var == null || (str = b0Var.O) == null) {
            return;
        }
        b0 b0Var2 = (b0) this.f101480j.invoke();
        String str2 = b0Var2 != null ? b0Var2.f26730b : null;
        if (str2 == null) {
            str2 = "";
        }
        int i14 = 0;
        ModuleAutoClickEvent$Payload moduleAutoClickEvent$Payload = new ModuleAutoClickEvent$Payload(str2, str, false, null);
        Iterator it = super.d().iterator();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            Object next = it.next();
            if (next instanceof g00) {
                g00 g00Var = (g00) next;
                Map u14 = g00Var.u();
                if (Intrinsics.d((u14 == null || (obj3 = u14.get("module_id")) == null || (obj4 = obj3.toString()) == null) ? null : e0.z(37, obj4), str)) {
                    q42.d dVar = q42.f.Companion;
                    Integer w13 = g00Var.w();
                    Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
                    int intValue = w13.intValue();
                    dVar.getClass();
                    if (q42.d.a(intValue) == q42.f.STRUCTURED_GUIDE) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i15++;
        }
        Iterator it2 = super.d().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof g00) {
                q42.d dVar2 = q42.f.Companion;
                Integer w14 = ((g00) next2).w();
                Intrinsics.checkNotNullExpressionValue(w14, "getModuleType(...)");
                int intValue2 = w14.intValue();
                dVar2.getClass();
                if (q42.d.a(intValue2) == q42.f.STRUCTURED_GUIDE) {
                    i13 = i14;
                    break;
                }
            }
            i14++;
        }
        int i16 = 1;
        if (i15 >= 0 && i15 < super.d().size()) {
            PinterestRecyclerView pinterestRecyclerView = ((OneBarContainer) ((ov1.c) getView())).getPinterestRecyclerView();
            pinterestRecyclerView.post(new qv1.a(pinterestRecyclerView, i15, i16));
            moduleAutoClickEvent$Payload = ModuleAutoClickEvent$Payload.copy$default(moduleAutoClickEvent$Payload, null, null, true, null, 11, null);
        } else if (i13 >= 0 && i13 < super.d().size()) {
            PinterestRecyclerView pinterestRecyclerView2 = ((OneBarContainer) ((ov1.c) getView())).getPinterestRecyclerView();
            pinterestRecyclerView2.post(new qv1.a(pinterestRecyclerView2, i13, i16));
            Object U = CollectionsKt.U(i13, super.d());
            g00 g00Var2 = U instanceof g00 ? (g00) U : null;
            moduleAutoClickEvent$Payload = ModuleAutoClickEvent$Payload.copy$default(moduleAutoClickEvent$Payload, null, null, false, (g00Var2 == null || (u13 = g00Var2.u()) == null || (obj = u13.get("module_id")) == null || (obj2 = obj.toString()) == null) ? null : e0.z(37, obj2), 7, null);
        }
        ModuleAutoClickEvent$Payload payload = moduleAutoClickEvent$Payload;
        wy0 f13 = ((b60.d) this.f101474d).f();
        String uid = f13 != null ? f13.getUid() : null;
        String userId = uid != null ? uid : "";
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(userId, "userId");
        a aVar = new a("one_bar_module_auto_click_metrics", new KibanaMetrics.Log.Metadata(userId, null, 2, null), payload, null, null, 0L, 56, null);
        ms0.b bVar = new ms0.b();
        bVar.b(aVar);
        this.f101473c.i(bVar, ox.a.f97979i);
        ov1.d dVar3 = this.f101481k;
        if (dVar3 != null) {
            dVar3.f2();
        }
    }

    public final void L3(de1.d dVar) {
        this.f101487q.f136039e = dVar;
    }

    public final void M3(ov1.d dVar) {
        this.f101481k = dVar;
    }

    public final void N3(Function0 provider) {
        Intrinsics.checkNotNullParameter(provider, "value");
        this.f101480j = provider;
        k kVar = this.f101486p;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        kVar.f136078i = provider;
        Function0 provider2 = this.f101480j;
        xv1.e eVar = this.f101487q;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(provider2, "provider");
        eVar.f136041g = provider2;
        Function0 provider3 = this.f101480j;
        h hVar = this.f101484n;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(provider3, "provider");
        hVar.f136060h = provider3;
        Function0 provider4 = this.f101480j;
        n nVar = this.f101485o;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(provider4, "provider");
        nVar.f136095f = provider4;
        Function0 provider5 = this.f101480j;
        q qVar = this.f101488r;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(provider5, "provider");
        qVar.f136111h = provider5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (r5.isEmpty() != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q3(t32.f r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pv1.e.Q3(t32.f, java.util.ArrayList):void");
    }

    public final void R3(g00 g00Var, boolean z13) {
        int i13;
        String uid = g00Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        int I3 = I3(uid);
        if (I3 < 0 || I3 >= super.d().size()) {
            return;
        }
        u1(I3, g00Var);
        if (z13) {
            if (!i.Q0(g00Var)) {
                String uid2 = g00Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                ArrayList H0 = CollectionsKt.H0(this.f101478h);
                ArrayList J3 = J3();
                ArrayList arrayList = new ArrayList(g0.q(J3, 10));
                Iterator it = J3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g00) it.next()).getUid());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    H0.remove((String) it2.next());
                }
                int indexOf = H0.indexOf(uid2);
                n3(I3, indexOf == -1 ? this.f101478h.size() - 1 : s.g(arrayList.size() + indexOf, 0, this.f101478h.size() - 1));
                return;
            }
            String uid3 = g00Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            List d2 = super.d();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : d2) {
                if (obj instanceof g00) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!Intrinsics.d(((g00) next).getUid(), uid3)) {
                    arrayList3.add(next);
                }
            }
            if (arrayList3.isEmpty()) {
                i13 = 0;
            } else {
                Iterator it4 = arrayList3.iterator();
                i13 = 0;
                while (it4.hasNext()) {
                    g00 g00Var2 = (g00) it4.next();
                    List list = f.f101489a;
                    q42.d dVar = q42.f.Companion;
                    Integer w13 = g00Var2.w();
                    Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
                    int intValue = w13.intValue();
                    dVar.getClass();
                    if (!CollectionsKt.L(list, q42.d.a(intValue))) {
                        List list2 = f.f101490b;
                        Integer w14 = g00Var2.w();
                        Intrinsics.checkNotNullExpressionValue(w14, "getModuleType(...)");
                        if (!CollectionsKt.L(list2, q42.d.a(w14.intValue()))) {
                            o00 v13 = g00Var2.v();
                            if (v13 != null && Intrinsics.d(v13.v(), Boolean.TRUE)) {
                            }
                        }
                    }
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
            }
            int g13 = s.g(i13, 0, this.f101478h.size() - 1);
            n3(I3, g13);
            ov1.c cVar = (ov1.c) getViewIfBound();
            if (cVar != null) {
                ((OneBarContainer) cVar).getPinterestRecyclerView().h(g13, false);
            }
        }
    }

    @Override // vq0.c, vq0.e, qr0.d
    public final List d() {
        return super.d();
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object item = getItem(i13);
        if (!(item instanceof g00)) {
            return item instanceof RelatedQueryItem ? 58 : -2;
        }
        Integer w13 = ((g00) item).w();
        if (w13.intValue() != q42.f.GUIDE.getValue()) {
            if (w13.intValue() != q42.f.SHOP_TO_LOOK_CATEGORY_FILTER.getValue()) {
                if (w13.intValue() == q42.f.STRUCTURED_GUIDE.getValue()) {
                    return 1;
                }
                if (w13.intValue() != q42.f.FILTER.getValue()) {
                    if (w13.intValue() != q42.f.MERCHANT_FILTER.getValue()) {
                        if (w13.intValue() != q42.f.SHOP_FILTER.getValue()) {
                            if (w13.intValue() != q42.f.STRUCTURED_CONTENT_TYPE_FILTER.getValue()) {
                                if (w13.intValue() != q42.f.COLOR_PALETTE.getValue()) {
                                    if (w13.intValue() != q42.f.SKIN_TONE.getValue()) {
                                        if (w13.intValue() != q42.f.HAIR_TYPE.getValue()) {
                                            if (w13.intValue() != q42.f.BODY_TYPE.getValue()) {
                                                return -2;
                                            }
                                        }
                                    }
                                }
                                return 3;
                            }
                        }
                    }
                }
                return 2;
            }
        }
        return this.f101477g ? 4 : 0;
    }

    @Override // vq0.g, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        ov1.c view = (ov1.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        OneBarContainer oneBarContainer = (OneBarContainer) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        if (oneBarContainer.f49981e == null) {
            oneBarContainer.f49981e = new ArrayList();
        }
        ArrayList arrayList = oneBarContainer.f49981e;
        if (arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // vq0.g
    public final void r3(sq0.b0 b0Var) {
        ov1.c view = (ov1.c) b0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        OneBarContainer oneBarContainer = (OneBarContainer) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        if (oneBarContainer.f49981e == null) {
            oneBarContainer.f49981e = new ArrayList();
        }
        ArrayList arrayList = oneBarContainer.f49981e;
        if (arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // vq0.c
    public final void x3(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.x3(value);
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (obj instanceof g00) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g00) it.next()).getUid());
        }
        this.f101478h = arrayList2;
        if (p.O(this.f101476f)) {
            Iterator it2 = J3().iterator();
            while (it2.hasNext()) {
                g00 g00Var = (g00) it2.next();
                if (this.f101479i == null) {
                    this.f101479i = g00Var.getUid();
                } else {
                    R3(i.u1(g00Var, false), false);
                }
            }
        }
    }

    @Override // ov1.b
    public final void z1() {
        d0.B(getPinalytics(), f1.SWIPE, h32.g0.ONEBAR_CONTAINER, null, null, 28);
    }

    @Override // vq0.g, yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ov1.c view = (ov1.c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        OneBarContainer oneBarContainer = (OneBarContainer) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        if (oneBarContainer.f49981e == null) {
            oneBarContainer.f49981e = new ArrayList();
        }
        ArrayList arrayList = oneBarContainer.f49981e;
        if (arrayList != null) {
            arrayList.add(this);
        }
    }
}
