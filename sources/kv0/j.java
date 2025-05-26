package kv0;

import android.content.Context;
import android.net.Uri;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jk2.j1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import nx.d0;
import x02.i2;

/* loaded from: classes5.dex */
public final class j implements jv0.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80975a;

    /* renamed from: b, reason: collision with root package name */
    public final jv0.p f80976b;

    /* renamed from: c, reason: collision with root package name */
    public final jv0.i f80977c;

    /* renamed from: d, reason: collision with root package name */
    public final aq.j f80978d;

    /* renamed from: e, reason: collision with root package name */
    public final uk1.d f80979e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f80980f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f80981g;

    /* renamed from: h, reason: collision with root package name */
    public final i92.k f80982h;

    /* renamed from: i, reason: collision with root package name */
    public jv0.j f80983i;

    /* renamed from: j, reason: collision with root package name */
    public List f80984j;

    /* renamed from: k, reason: collision with root package name */
    public List f80985k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f80986l;

    /* renamed from: m, reason: collision with root package name */
    public xj2.b f80987m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f80988n;

    public j(Context context, jv0.p navigator, jv0.i viewModelProvider, aq.j editablePinWrapper, n70.o pinalytics, i2 pinRepository, m60.w eventManager, i92.k toastUtils, s1 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f80975a = context;
        this.f80976b = navigator;
        this.f80977c = viewModelProvider;
        this.f80978d = editablePinWrapper;
        this.f80979e = pinalytics;
        this.f80980f = pinRepository;
        this.f80981g = eventManager;
        this.f80982h = toastUtils;
        this.f80986l = new ArrayList();
        this.f80987m = new xj2.b();
        this.f80988n = experiments.e();
    }

    @Override // jv0.o
    public final void a(l3.c action) {
        List list;
        String str;
        List w03;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean d2 = Intrinsics.d(action, jv0.k.f77634a);
        jv0.p pVar = this.f80976b;
        if (d2) {
            mv0.y yVar = (mv0.y) pVar;
            yVar.getClass();
            NavigationImpl w13 = Navigation.w1(d2.p());
            w13.m0("com.pinterest.EXTRA_SEARCH_TYPE", "STORY_PIN_PRODUCTS");
            w13.Y1("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", true);
            yVar.M1(w13);
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77635b)) {
            ((mv0.y) pVar).U8();
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77636c)) {
            c();
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77637d)) {
            ((mv0.y) pVar).U8();
            return;
        }
        if (Intrinsics.d(action, jv0.k.f77638e)) {
            c();
            return;
        }
        boolean z13 = action instanceof jv0.n;
        boolean z14 = this.f80988n;
        if (z13) {
            List list2 = ((jv0.n) action).f77644a;
            if (!list2.isEmpty()) {
                if (z14) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (((u) obj).f81018h) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((u) it.next()).f81011a);
                    }
                    w03 = CollectionsKt.w0(arrayList2);
                } else {
                    List list3 = list2;
                    ArrayList arrayList3 = new ArrayList(g0.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((u) it2.next()).f81011a);
                    }
                    w03 = CollectionsKt.w0(arrayList3);
                }
                this.f80984j = w03;
                this.f80985k = w03 != null ? CollectionsKt.H0(w03) : null;
                if (z14) {
                    List list4 = list2;
                    ArrayList arrayList4 = new ArrayList(g0.q(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((u) it3.next()).f81011a);
                    }
                    this.f80986l = CollectionsKt.H0(CollectionsKt.w0(arrayList4));
                    return;
                }
                return;
            }
            return;
        }
        int i13 = 0;
        if (!(action instanceof jv0.m)) {
            if (action instanceof jv0.l) {
                jv0.l lVar = (jv0.l) action;
                List list5 = this.f80985k;
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                List list6 = z14 ? this.f80986l : list5;
                String str2 = lVar.f77641a;
                if (list6.contains(str2)) {
                    return;
                }
                j1 j1Var = new j1(this.f80980f.P(str2), new bv0.k(20, new au0.f(this, 18)), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                this.f80987m.a(nl.b.s(j1Var, new go0.r(list5, str2, this, 25), null, null, 6));
                return;
            }
            return;
        }
        jv0.m mVar = (jv0.m) action;
        List list7 = this.f80985k;
        if (!mVar.f77643b || (list = list7) == null || list.isEmpty()) {
            return;
        }
        Iterator it4 = list7.iterator();
        int i14 = 0;
        while (true) {
            boolean hasNext = it4.hasNext();
            str = mVar.f77642a;
            if (!hasNext) {
                i14 = -1;
                break;
            } else if (Intrinsics.d((String) it4.next(), str)) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 != -1) {
            list7.remove(i14);
            this.f80978d.b0(aq.d.PRODUCT_TAGS, CollectionsKt.Z(list7, ",", null, null, 0, null, null, 62), false);
            this.f80977c.a(str, false);
            d();
        }
        if (z14) {
            Iterator it5 = this.f80986l.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    i13 = -1;
                    break;
                } else if (Intrinsics.d((String) it5.next(), str)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 != -1) {
                this.f80986l.remove(i13);
            }
        }
    }

    @Override // jv0.o
    public final void b(jv0.j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f80987m.f135163b) {
            this.f80987m = new xj2.b();
        }
        this.f80983i = view;
        v vVar = new v(Uri.parse(this.f80978d.E()), null);
        jv0.j jVar = this.f80983i;
        if (jVar != null) {
            ((mv0.y) jVar).Z8(vVar.f81021b);
        }
        jv0.j jVar2 = this.f80983i;
        if (jVar2 != null) {
            ((mv0.y) jVar2).Y8(vVar.f81020a);
        }
        ((mv0.y) view).X8(false);
    }

    public final void c() {
        jv0.j jVar = this.f80983i;
        boolean z13 = false;
        if (jVar != null) {
            ((mv0.y) jVar).X8(false);
        }
        jv0.j jVar2 = this.f80983i;
        if (jVar2 != null) {
            ((mv0.y) jVar2).W8(false);
        }
        jv0.j jVar3 = this.f80983i;
        if (jVar3 != null) {
            GestaltIconButtonFloating gestaltIconButtonFloating = ((mv0.y) jVar3).M0;
            if (gestaltIconButtonFloating == null) {
                Intrinsics.r("addButton");
                throw null;
            }
            pp2.a.j(gestaltIconButtonFloating, new dv0.n(z13, 2));
        }
        d0 d0Var = this.f80979e.f122379a;
        u0 u0Var = u0.DONE_BUTTON;
        HashMap hashMap = new HashMap();
        aq.j jVar4 = this.f80978d;
        hashMap.put("pin_type", jVar4.y().toString());
        hashMap.put("product_pin_id", aq.j.T(jVar4, aq.d.PRODUCT_TAGS));
        Unit unit = Unit.f80348a;
        d0Var.Z(u0Var, hashMap);
        jVar4.a0(new y0.t(this, 1));
    }

    public final void d() {
        jv0.j jVar = this.f80983i;
        if (jVar != null) {
            Iterable iterable = this.f80984j;
            if (iterable == null) {
                iterable = q0.f80391a;
            }
            List w03 = CollectionsKt.w0(iterable);
            Iterable iterable2 = this.f80985k;
            if (iterable2 == null) {
                iterable2 = q0.f80391a;
            }
            ((mv0.y) jVar).X8(!Intrinsics.d(w03, CollectionsKt.w0(iterable2)));
        }
    }

    @Override // jv0.o
    public final void onUnbind() {
        this.f80983i = null;
        this.f80987m.dispose();
    }
}
