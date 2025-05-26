package wy0;

import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import dv0.n;
import h32.f1;
import h32.u0;
import i32.y0;
import j40.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.s0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.j2;
import nt.k2;
import pk.a0;
import se0.f;
import uk1.e;
import wk1.i;
import wk1.q;
import wt1.c0;
import wt1.d0;
import wt1.p;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class d extends q implements ry0.a {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f131226a;

    /* renamed from: b, reason: collision with root package name */
    public final oc.c f131227b;

    /* renamed from: c, reason: collision with root package name */
    public final sy0.b f131228c;

    /* renamed from: d, reason: collision with root package name */
    public final j2 f131229d;

    /* renamed from: e, reason: collision with root package name */
    public final my0.a f131230e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f131231f;

    /* renamed from: g, reason: collision with root package name */
    public final v f131232g;

    /* renamed from: h, reason: collision with root package name */
    public final v f131233h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b60.b activeUserManager, e presenterPinalyticsFactory, uj2.q networkStateStream, oc.c apolloClient, sy0.b nuxInterestStateRepository, j2 experiments) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(nuxInterestStateRepository, "nuxInterestStateRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f131226a = activeUserManager;
        this.f131227b = apolloClient;
        this.f131228c = nuxInterestStateRepository;
        this.f131229d = experiments;
        my0.a aVar = new my0.a();
        aVar.f88490a = "";
        aVar.f88491b = "";
        aVar.f88493d = y0.ANDROID_MAIN_USER_ED;
        this.f131230e = aVar;
        this.f131231f = new ArrayList();
        this.f131232g = m.b(new b(this, 0));
        this.f131233h = m.b(new b(this, 1));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b((sy0.d) this.f131233h.getValue());
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (isBound() && (state instanceof p)) {
            if (((Boolean) this.f131232g.getValue()).booleanValue()) {
                ry0.b bVar = (ry0.b) getView();
                ln1.e loadingState = ln1.e.LOADED;
                xy0.e eVar = (xy0.e) bVar;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(loadingState, "loadingState");
                GestaltSpinner gestaltSpinner = eVar.D0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("spinner");
                    throw null;
                }
                s0.w(gestaltSpinner, new k2(loadingState, 2));
            } else {
                ry0.b bVar2 = (ry0.b) getView();
                f loadingState2 = f.LOADED;
                xy0.e eVar2 = (xy0.e) bVar2;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(loadingState2, "loadingState");
                LoadingView loadingView = eVar2.C0;
                if (loadingView == null) {
                    Intrinsics.r("loadingView");
                    throw null;
                }
                loadingView.g2(loadingState2);
            }
            List list = ((sy0.a) this.f131228c.f115642a.getValue()).f115641a;
            List list2 = list;
            if (!list2.isEmpty()) {
                this.f131231f.addAll(list2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    x3((uy0.b) it.next());
                }
            }
            w3();
        }
    }

    public final int t3() {
        int i13;
        Iterator<T> it = getDataSources().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            List d2 = ((wk1.e) it.next()).d();
            if ((d2 instanceof Collection) && d2.isEmpty()) {
                i13 = 0;
            } else {
                i13 = 0;
                for (Object obj : d2) {
                    if ((obj instanceof uy0.b) && ((uy0.b) obj).f123267j && (i13 = i13 + 1) < 0) {
                        f0.o();
                        throw null;
                    }
                }
            }
            i14 += i13;
        }
        return i14;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(ry0.b view) {
        y0 y0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        xy0.e eVar = (xy0.e) view;
        iy0.a aVar = eVar.H0;
        if (aVar == null || (y0Var = aVar.getPlacement()) == null) {
            y0Var = y0.ANDROID_MAIN_USER_ED;
        }
        my0.a aVar2 = this.f131230e;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(y0Var, "<set-?>");
        aVar2.f88493d = y0Var;
        aVar2.x1(this.f131226a);
        String text = aVar2.f88490a;
        Intrinsics.checkNotNullParameter(text, "text");
        GestaltText gestaltText = eVar.G0;
        if (gestaltText == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        a0.p(gestaltText, text);
        String text2 = aVar2.f88491b;
        Intrinsics.checkNotNullParameter(text2, "text");
        GestaltText gestaltText2 = eVar.F0;
        if (gestaltText2 == null) {
            Intrinsics.r("subtitleView");
            throw null;
        }
        a0.p(gestaltText2, text2);
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.I0 = this;
    }

    public final void v3() {
        String[] strArr;
        nx.d0 pinalytics = getPinalytics();
        pinalytics.X(u0.NEXT_BUTTON);
        nx.d0.v(pinalytics, f1.NUX_STEP_END, null, false, 12);
        ArrayList arrayList = new ArrayList();
        for (wk1.e eVar : getDataSources()) {
            if (eVar instanceof sy0.d) {
                List F0 = CollectionsKt.F0(((sy0.d) eVar).f135191h);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : F0) {
                    if (((uy0.b) obj).f123267j) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((uy0.b) next).f123269l == uy0.a.INTEREST) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((uy0.b) it2.next()).f123270m);
        }
        com.bumptech.glide.d.u0(this.f131227b.a(new g(arrayList4))).r(tk2.e.f118017c).o(new hx0.a(22, c.f131223j), new hx0.a(23, c.f131224k));
        if (arrayList3.isEmpty()) {
            strArr = null;
        } else {
            ArrayList arrayList5 = new ArrayList(g0.q(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((uy0.b) it3.next()).f123270m);
            }
            strArr = (String[]) arrayList5.toArray(new String[0]);
        }
        iy0.a aVar = ((xy0.e) ((ry0.b) getView())).H0;
        if (aVar != null) {
            iy0.a.c(aVar, null, strArr, null, 5);
        }
    }

    public final void w3() {
        ry0.b bVar = (ry0.b) getView();
        boolean z13 = t3() >= this.f131230e.f88492c;
        GestaltButton gestaltButton = ((xy0.e) bVar).E0;
        if (gestaltButton != null) {
            gestaltButton.d(new n(z13, 12));
        } else {
            Intrinsics.r("nextButton");
            throw null;
        }
    }

    public final void x3(uy0.b bVar) {
        for (wk1.e eVar : getDataSources()) {
            Iterator it = eVar.d().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                Object next = it.next();
                uy0.b bVar2 = next instanceof uy0.b ? (uy0.b) next : null;
                if (Intrinsics.d(bVar2 != null ? bVar2.f123270m : null, bVar.f123270m)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0 && (eVar instanceof sy0.d)) {
                ((sy0.d) eVar).u1(i13, bVar);
            }
        }
    }
}
