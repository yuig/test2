package com.pinterest.framework.screens;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bi1.a0;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import p1.p1;
import so.r6;

/* loaded from: classes2.dex */
public final class s implements t, zk1.a {

    /* renamed from: n, reason: collision with root package name */
    public static final ScreenManager$Companion f49224n = new ScreenManager$Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final LinkedHashMap f49225o = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f49226a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49227b;

    /* renamed from: c, reason: collision with root package name */
    public final l f49228c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49229d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49230e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49231f;

    /* renamed from: g, reason: collision with root package name */
    public int f49232g;

    /* renamed from: h, reason: collision with root package name */
    public int f49233h;

    /* renamed from: i, reason: collision with root package name */
    public r70.a f49234i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f49235j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f49236k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f49237l;

    /* renamed from: m, reason: collision with root package name */
    public final ml1.u f49238m;

    public s(ViewGroup container, ml1.d screenInfo, v screenNavListener, ml1.p transitionCache, il1.b screenFactory, int i13, boolean z13, r6 devLaunchPointFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(screenNavListener, "screenNavListener");
        Intrinsics.checkNotNullParameter(transitionCache, "transitionCache");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(devLaunchPointFactory, "devLaunchPointFactory");
        this.f49226a = container;
        this.f49227b = screenNavListener;
        this.f49228c = screenFactory;
        this.f49229d = i13;
        this.f49230e = z13;
        this.f49231f = true;
        devLaunchPointFactory.getClass();
        Intrinsics.checkNotNullParameter(this, "screenManager");
        this.f49235j = new ArrayList();
        this.f49236k = new ArrayList();
        this.f49237l = new ArrayList();
        this.f49238m = new ml1.u(screenFactory, screenInfo, transitionCache, true);
    }

    public final ScreenDescription A(int i13) {
        if (i13 < 0) {
            return null;
        }
        if (i13 == G() - 1) {
            return x();
        }
        if (i13 >= G() - this.f49229d) {
            f((ScreenDescription) i().get(i13));
        }
        ScreenDescription screenDescription = (ScreenDescription) i().remove(i13);
        ((il1.b) this.f49228c).a(screenDescription);
        f49224n.removeViewModelStore(screenDescription);
        H();
        return screenDescription;
    }

    public final void B(ScreenDescription start, Function1 shouldStopAt) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(shouldStopAt, "shouldStopAt");
        boolean d2 = Intrinsics.d(start, v());
        ScreenManager$Companion screenManager$Companion = f49224n;
        l lVar = this.f49228c;
        int i13 = -1;
        if (d2) {
            int indexOf = i().indexOf(start) - 1;
            List i14 = i();
            ListIterator listIterator = i14.listIterator(i14.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                } else if (((Boolean) shouldStopAt.invoke((ScreenDescription) listIterator.previous())).booleanValue()) {
                    i13 = listIterator.nextIndex();
                    break;
                }
            }
            int max = Math.max(i13 + 1, 1);
            if (max <= indexOf) {
                while (true) {
                    ScreenDescription screenDescription = (ScreenDescription) i().remove(G() - 2);
                    if (q(screenDescription)) {
                        f(screenDescription);
                    }
                    m h10 = ((il1.b) lVar).h(screenDescription);
                    if (h10 != null) {
                        ((jl1.a) h10).M6();
                    }
                    ((il1.b) lVar).b(screenDescription);
                    screenManager$Companion.removeViewModelStore(screenDescription);
                    if (max == indexOf) {
                        break;
                    } else {
                        max++;
                    }
                }
            }
            x();
            return;
        }
        int indexOf2 = i().indexOf(start);
        List i15 = i();
        ListIterator listIterator2 = i15.listIterator(i15.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (((Boolean) shouldStopAt.invoke((ScreenDescription) listIterator2.previous())).booleanValue()) {
                i13 = listIterator2.nextIndex();
                break;
            }
        }
        int max2 = Math.max(i13 + 1, 1);
        if (max2 <= indexOf2) {
            while (true) {
                ScreenDescription screenDescription2 = (ScreenDescription) i().remove(G() - 2);
                if (q(screenDescription2)) {
                    f(screenDescription2);
                }
                m h13 = ((il1.b) lVar).h(screenDescription2);
                if (h13 != null) {
                    ((jl1.a) h13).M6();
                }
                ((il1.b) lVar).b(screenDescription2);
                screenManager$Companion.removeViewModelStore(screenDescription2);
                if (max2 == indexOf2) {
                    break;
                } else {
                    max2++;
                }
            }
        }
        H();
    }

    public final void C(Context context, Bundle bundle) {
        LinkedHashMap linkedHashMap;
        r70.a aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        l lVar = this.f49228c;
        int i13 = 0;
        if (bundle != null) {
            if (this.f49233h > 0) {
                Iterator it = this.f49237l.iterator();
                while (it.hasNext()) {
                    ((List) it.next()).clear();
                }
            } else {
                this.f49235j.clear();
            }
            if (this.f49233h > 0 && this.f49232g == 0) {
                int i14 = bundle.getInt("screenManagerCurrentTab", 0);
                this.f49232g = i14;
                if (i14 < 0 || i14 >= this.f49233h) {
                    this.f49232g = 0;
                }
                int i15 = this.f49232g;
                if (i15 > 0 && (aVar = this.f49234i) != null) {
                    aVar.e(i15, null);
                }
            }
            ArrayList<Parcelable> parcelableArrayList = bundle.getParcelableArrayList("screenManager");
            f0 f0Var = vb0.j.f125466a;
            if (parcelableArrayList == null) {
                Object[] args = new Object[0];
                f0Var.getClass();
                Intrinsics.checkNotNullParameter("ScreenManager restored state is null", "errorMessage");
                Intrinsics.checkNotNullParameter(args, "args");
                if (parcelableArrayList != null) {
                    f0Var.s0(j1.W("ScreenManager restored state is null", args), tb0.p.UNSPECIFIED);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArrayList) {
                ScreenDescription screenDescription = parcelable instanceof ScreenDescription ? (ScreenDescription) parcelable : null;
                if (screenDescription != null) {
                    arrayList.add(screenDescription);
                }
            }
            f0Var.S(arrayList.size() == parcelableArrayList.size(), "ScreenManager restored state has null screens", new Object[0]);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                linkedHashMap = f49225o;
                if (!hasNext) {
                    break;
                }
                p pVar = (p) linkedHashMap.get((ScreenDescription) it2.next());
                if (pVar != null) {
                    linkedHashSet.add(Integer.valueOf(pVar.f49219a));
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (linkedHashSet.contains(Integer.valueOf(((p) entry.getValue()).f49219a))) {
                    linkedHashMap.put(entry.getKey(), p.a((p) entry.getValue(), context.hashCode()));
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((il1.b) lVar).c((ScreenDescription) it3.next());
            }
            i().addAll(arrayList);
        }
        if (G() > 0) {
            List F0 = CollectionsKt.F0(i());
            for (Object obj : F0) {
                int i16 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ScreenDescription screenDescription2 = (ScreenDescription) obj;
                if (i13 >= G() - this.f49229d) {
                    ViewGroup viewGroup = this.f49226a;
                    View m13 = m(screenDescription2, viewGroup);
                    if (i13 == F0.size() - 1) {
                        ViewParent parent = m13.getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(m13);
                        }
                        viewGroup.addView(m13, -1);
                        r70.a aVar2 = this.f49234i;
                        if (aVar2 != null) {
                            aVar2.m(screenDescription2.getF49211g());
                        }
                        m g13 = ((il1.b) lVar).g(screenDescription2);
                        if (g13 != null) {
                            d7.b.d(g13);
                        }
                    }
                }
                i13 = i16;
            }
            t();
        }
    }

    public final void D(Bundle bundle) {
        int i13;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(G());
        for (ScreenDescription screenDescription : i()) {
            if (screenDescription.getF49212h()) {
                il1.b bVar = (il1.b) this.f49228c;
                if (bVar.f(screenDescription)) {
                    m g13 = bVar.g(screenDescription);
                    Bundle O6 = g13 instanceof h ? ((jl1.a) ((h) g13)).O6() : null;
                    if (O6 != null && !O6.isEmpty()) {
                        if (this.f49230e) {
                            String name = screenDescription.getScreenClass().getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            zh0.c.a(O6, name, null, 100.0f);
                        }
                        screenDescription.c2(O6);
                    }
                }
                arrayList.add(screenDescription);
            }
        }
        bundle.putParcelableArrayList("screenManager", arrayList);
        if (this.f49233h <= 0 || (i13 = this.f49232g) <= 0) {
            return;
        }
        bundle.putInt("screenManagerCurrentTab", i13);
    }

    public final void E(ScreenDescription screenDescription, boolean z13) {
        Bundle f49207c;
        ScreenDescription screenDescription2 = (screenDescription == null || (f49207c = screenDescription.getF49207c()) == null) ? null : (ScreenDescription) f49207c.getParcelable("SCREEN_BUNDLE_EXTRA_KEY");
        if (screenDescription2 != null) {
            zk1.a.a(this, screenDescription2, z13, 22);
        }
    }

    public final com.google.firebase.messaging.q F(ScreenDescription screenDescription) {
        r70.a aVar = this.f49234i;
        if (aVar != null) {
            aVar.m(screenDescription.getF49211g());
        }
        l lVar = this.f49228c;
        ViewGroup viewGroup = this.f49226a;
        View i13 = ((il1.b) lVar).i(screenDescription, viewGroup);
        i13.clearAnimation();
        i13.setVisibility(0);
        if (i13.getParent() == null) {
            viewGroup.addView(i13, 0);
        }
        m g13 = ((il1.b) lVar).g(screenDescription);
        if (g13 != null) {
            d7.b.d(g13);
        }
        return new com.google.firebase.messaging.q(ml1.r.PopEnter, screenDescription, (Function1) new a0(this, 27), (Function2) new gv0.b(this, 27));
    }

    public final int G() {
        return i().size();
    }

    public final void H() {
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(i())) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ScreenDescription screenDescription = (ScreenDescription) obj;
            if (i13 >= G() - this.f49229d) {
                m(screenDescription, this.f49226a);
            } else {
                f(screenDescription);
            }
            i13 = i14;
        }
    }

    public final void b() {
        m g13;
        ScreenDescription v13 = v();
        if (v13 == null || (g13 = ((il1.b) this.f49228c).g(v13)) == null) {
            return;
        }
        d7.b.d(g13);
    }

    public final void c(ScreenDescription screenDescription, boolean z13, boolean z14, boolean z15, boolean z16) {
        boolean z17;
        m g13;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        if (z13) {
            this.f49227b.J(screenDescription.L1());
        }
        if (G() > 0) {
            g();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z14) {
            e();
        }
        i().add(screenDescription);
        boolean z18 = G() == 1;
        r70.a aVar = this.f49234i;
        if (aVar != null) {
            aVar.m(screenDescription.getF49211g());
        }
        ViewGroup viewGroup = this.f49226a;
        View m13 = m(screenDescription, viewGroup);
        ViewParent parent = m13.getParent();
        Unit unit = null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(m13);
        }
        viewGroup.addView(m13, -1);
        if (z13 && (g13 = ((il1.b) this.f49228c).g(screenDescription)) != null) {
            d7.b.d(g13);
        }
        com.google.firebase.messaging.q enterChoreography = new com.google.firebase.messaging.q(ml1.r.Enter, screenDescription, (Function1) new hk1.t(this, 4), (Function2) new p1(this, 12));
        com.google.firebase.messaging.q y13 = !z18 ? z14 ? y((ScreenDescription) i().remove(G() - 2), !z17) : r((ScreenDescription) i().get(G() - 2), !z17, z16) : null;
        boolean z19 = z15 && !z18;
        ml1.u uVar = this.f49238m;
        uVar.getClass();
        ViewGroup transitionContainer = this.f49226a;
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(enterChoreography, "enterChoreography");
        if (y13 == null) {
            uVar.c(transitionContainer, enterChoreography, z19);
        } else {
            ml1.m a13 = uVar.f87548c.a(((ScreenDescription) enterChoreography.f33804b).getF49206b());
            if (!((a13 instanceof ml1.h) | z19) || !uVar.f87549d) {
                ml1.u.b(enterChoreography, y13, false);
            } else {
                View j13 = ((il1.b) uVar.f87546a).j((ScreenDescription) enterChoreography.f33804b);
                if (j13 != null) {
                    new ml1.t(uVar, transitionContainer, a13, enterChoreography, y13, 1).invoke(j13);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    ml1.u.b(enterChoreography, y13, false);
                }
            }
        }
        H();
    }

    public final void d(ArrayList screenDescriptions) {
        Intrinsics.checkNotNullParameter(screenDescriptions, "screenDescriptions");
        if (screenDescriptions.isEmpty()) {
            return;
        }
        if (G() > 0) {
            g();
        }
        i().addAll(screenDescriptions);
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(i())) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            ScreenDescription screenDescription = (ScreenDescription) obj;
            if (i13 >= G() - this.f49229d) {
                ViewGroup viewGroup = this.f49226a;
                View m13 = m(screenDescription, viewGroup);
                if (i13 == r9.size() - 1) {
                    ViewParent parent = m13.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(m13);
                    }
                    viewGroup.addView(m13, -1);
                    r70.a aVar = this.f49234i;
                    if (aVar != null) {
                        aVar.m(screenDescription.getF49211g());
                    }
                    m g13 = ((il1.b) this.f49228c).g(screenDescription);
                    if (g13 != null) {
                        d7.b.d(g13);
                    }
                }
            } else if (q(screenDescription)) {
                f(screenDescription);
            }
            i13 = i14;
        }
    }

    public final void e() {
        i().clear();
    }

    public final void f(ScreenDescription screenDescription) {
        if (q(screenDescription)) {
            l lVar = this.f49228c;
            il1.b bVar = (il1.b) lVar;
            m g13 = bVar.g(screenDescription);
            screenDescription.c2(((g13 instanceof h) && screenDescription.getF49212h()) ? ((jl1.a) ((h) g13)).O6() : null);
            ViewGroup viewGroup = this.f49226a;
            viewGroup.removeView(bVar.i(screenDescription, viewGroup));
            ((il1.b) lVar).a(screenDescription);
        }
    }

    public final void g() {
        m g13;
        ScreenDescription v13 = v();
        if (v13 == null || (g13 = ((il1.b) this.f49228c).g(v13)) == null) {
            return;
        }
        d7.b.y(g13);
    }

    public final void h(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScreenManager$Companion screenManager$Companion = f49224n;
        if (!z13) {
            screenManager$Companion.removeAllViewModelStoresForContext(context);
        }
        for (List list : CollectionsKt.l0(e0.b(this.f49235j), this.f49237l)) {
            int size = list.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ScreenDescription screenDescription = (ScreenDescription) list.remove(size);
                    ((il1.b) this.f49228c).a(screenDescription);
                    if (!z13) {
                        screenManager$Companion.removeViewModelStore(screenDescription);
                    }
                }
            }
        }
    }

    public final List i() {
        int i13;
        if (this.f49233h > 0 && (i13 = this.f49232g) >= 0) {
            ArrayList arrayList = this.f49237l;
            if (i13 < arrayList.size()) {
                return (List) arrayList.get(this.f49232g);
            }
        }
        return this.f49235j;
    }

    public final m j() {
        return l(k());
    }

    public final ScreenDescription k() {
        ScreenDescription v13 = v();
        if (v13 != null) {
            return v13;
        }
        ScreenModel screenModel = ScreenModel.f49204i;
        return ScreenModel.f49204i;
    }

    public final m l(ScreenDescription screenDescription) {
        return ((il1.b) this.f49228c).g(screenDescription);
    }

    public final View m(ScreenDescription screenDescription, ViewGroup viewGroup) {
        return ((il1.b) this.f49228c).i(screenDescription, viewGroup);
    }

    public final ScreenDescription n(ScreenDescription screenDescription) {
        Object obj;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        Iterator it = i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (s((ScreenDescription) obj, screenDescription)) {
                break;
            }
        }
        return (ScreenDescription) obj;
    }

    public final void o(int i13, int i14, Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ScreenDescription v13 = v();
        m g13 = v13 != null ? ((il1.b) this.f49228c).g(v13) : null;
        if (g13 instanceof a) {
            ((a) g13).onActivityResult(i13, i14, data);
        }
    }

    public final boolean p() {
        Animator animator = this.f49238m.f87550e;
        if (animator != null && animator.isRunning()) {
            return true;
        }
        this.f49227b.g();
        ScreenDescription v13 = v();
        m g13 = v13 != null ? ((il1.b) this.f49228c).g(v13) : null;
        if ((g13 instanceof b) && ((b) g13).getF103154e0()) {
            return true;
        }
        if (this.f49236k.size() <= 1 && G() <= 1) {
            return false;
        }
        x();
        return true;
    }

    public final boolean q(ScreenDescription screenDescription) {
        return ((il1.b) this.f49228c).f(screenDescription);
    }

    public final com.google.firebase.messaging.q r(ScreenDescription screenDescription, boolean z13, boolean z14) {
        View i13;
        m l13;
        if (z13 && (l13 = l(screenDescription)) != null) {
            d7.b.y(l13);
        }
        ViewGroup viewGroup = this.f49226a;
        View m13 = m(screenDescription, viewGroup);
        ScreenDescription v13 = v();
        if (v13 != null && G() > 2 && !v13.getF49207c().getBoolean("SHOULD_KEEP_LAST_SCREEN_VISIBLE_KEY")) {
            for (ScreenDescription screenDescription2 : i().subList(0, G() - 1)) {
                if (q(screenDescription2) && (i13 = ((il1.b) this.f49228c).i(screenDescription2, viewGroup)) != null) {
                    i13.setVisibility(8);
                }
            }
        }
        return new com.google.firebase.messaging.q(ml1.r.Exit, screenDescription, (Function1) null, (Function2) new fc0.l(this, m13, z14));
    }

    public final boolean s(ScreenDescription screenDescription, ScreenDescription screenDescription2) {
        m h10 = ((il1.b) this.f49228c).h(screenDescription);
        y yVar = h10 instanceof y ? (y) h10 : null;
        if (yVar == null) {
            return false;
        }
        for (ScreenDescription screenDescription3 : yVar.u6()) {
            if (Intrinsics.d(screenDescription3, screenDescription2) || s(screenDescription3, screenDescription2)) {
                return true;
            }
        }
        return false;
    }

    public final void t() {
        View j13;
        int G = G();
        if (G <= 1) {
            return;
        }
        int i13 = G - 1;
        for (int i14 = i13; i14 > 0; i14--) {
            if (!((ScreenDescription) i().get(i14)).getF49207c().getBoolean("SHOULD_KEEP_LAST_SCREEN_VISIBLE_KEY")) {
                return;
            }
            ScreenDescription screenDescription = (ScreenDescription) i().get(i14 - 1);
            il1.b bVar = (il1.b) this.f49228c;
            m h10 = bVar.h(screenDescription);
            if (h10 != null && (j13 = bVar.j(screenDescription)) != null) {
                if (j13.getParent() == null) {
                    this.f49226a.addView(j13, 0);
                }
                j13.setVisibility(0);
                if (i14 == i13 && (!r3.getF49207c().getBoolean("SHOULD_NOT_ACTIVATE_LAST_SCREEN_VISIBLE_KEY"))) {
                    d7.b.d(h10);
                }
            }
        }
    }

    public final void u(int i13, ScreenDescription defaultScreenDescription, boolean z13) {
        m g13;
        Intrinsics.checkNotNullParameter(defaultScreenDescription, "defaultScreenDescription");
        int i14 = this.f49232g;
        l lVar = this.f49228c;
        if (i14 == i13) {
            if (G() <= 1) {
                ScreenDescription v13 = v();
                Object g14 = v13 != null ? ((il1.b) lVar).g(v13) : null;
                if (z13 && (g14 instanceof k)) {
                    ((k) g14).P4(defaultScreenDescription.getF49207c());
                }
                E(defaultScreenDescription, false);
                return;
            }
            if (G() <= 1) {
                return;
            }
            if (G() == 2) {
                x();
                return;
            }
            ScreenDescription v14 = v();
            ScreenDescription screenDescription = (ScreenDescription) CollectionsKt.U(0, i());
            if (v14 == null || screenDescription == null || Intrinsics.d(v14, screenDescription)) {
                return;
            }
            B(v14, new a0(screenDescription, 26));
            E(v(), true);
            return;
        }
        ArrayList arrayList = this.f49236k;
        if (arrayList.contains(Integer.valueOf(i13))) {
            arrayList.remove(Integer.valueOf(i13));
        }
        arrayList.add(Integer.valueOf(i13));
        this.f49227b.h(defaultScreenDescription.L1());
        int G = G() - 1;
        ViewGroup viewGroup = this.f49226a;
        ml1.u uVar = this.f49238m;
        if (G >= 0) {
            for (int i15 = 0; i15 < G; i15++) {
                ScreenDescription screenDescription2 = (ScreenDescription) CollectionsKt.U(i15, i());
                if (screenDescription2 != null) {
                    f(screenDescription2);
                }
            }
            uVar.c(viewGroup, r((ScreenDescription) i().get(G() - 1), true, false), false);
        }
        this.f49232g = i13;
        if (v() != null) {
            ScreenDescription v15 = v();
            if (v15 != null && (g13 = ((il1.b) lVar).g(v15)) != null && z13 && (g13 instanceof k)) {
                ScreenDescription v16 = v();
                if (!Intrinsics.d(v16 != null ? v16.getF49207c() : null, defaultScreenDescription.getF49207c())) {
                    ((k) g13).P4(defaultScreenDescription.getF49207c());
                }
            }
            ScreenDescription v17 = v();
            Intrinsics.f(v17);
            uVar.c(viewGroup, F(v17), false);
            ScreenDescription v18 = v();
            Intrinsics.f(v18);
            E(v18, false);
        } else {
            zk1.a.a(this, defaultScreenDescription, false, 22);
            E(defaultScreenDescription, false);
        }
        H();
        t();
    }

    public final ScreenDescription v() {
        return (ScreenDescription) CollectionsKt.U(G() - 1, i());
    }

    public final ScreenDescription w(int i13) {
        return (ScreenDescription) CollectionsKt.U((G() - 1) - i13, i());
    }

    public final ScreenDescription x() {
        Unit unit = null;
        if (G() <= 0) {
            return null;
        }
        ScreenDescription screenDescription = (ScreenDescription) i().remove(G() - 1);
        if (l(screenDescription) instanceof j) {
            m g13 = ((il1.b) this.f49228c).g(screenDescription);
            Intrinsics.g(g13, "null cannot be cast to non-null type com.pinterest.framework.screens.OnScreenResults");
            j jVar = (j) g13;
            for (ScreenDescription screenDescription2 : i()) {
                if (l(screenDescription2) != null) {
                    screenDescription2.getF49210f().putAll(jVar.k2());
                }
            }
        }
        boolean z13 = G() == 0;
        com.google.firebase.messaging.q exitChoreography = y(screenDescription, true);
        if (z13) {
            ArrayList arrayList = this.f49236k;
            if (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                int intValue = ((Number) arrayList.get(arrayList.size() - 1)).intValue();
                this.f49232g = intValue;
                r70.a aVar = this.f49234i;
                if (aVar != null) {
                    aVar.e(intValue, u.SWITCH_TAB_ON_SCREEN_MANAGER_POP);
                }
            }
        }
        ScreenDescription v13 = v();
        com.google.firebase.messaging.q F = v13 != null ? F(v13) : null;
        boolean z14 = this.f49231f && !z13;
        ml1.u uVar = this.f49238m;
        uVar.getClass();
        ViewGroup transitionContainer = this.f49226a;
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(exitChoreography, "exitChoreography");
        if (F == null) {
            uVar.c(transitionContainer, exitChoreography, z14);
        } else {
            ml1.m a13 = uVar.f87548c.a(((ScreenDescription) exitChoreography.f33804b).getF49206b());
            if ((!z14 && !(a13 instanceof ml1.h)) || !uVar.f87549d) {
                ml1.u.b(F, exitChoreography, false);
            } else {
                View j13 = ((il1.b) uVar.f87546a).j((ScreenDescription) F.f33804b);
                if (j13 != null) {
                    new ml1.t(uVar, transitionContainer, a13, F, exitChoreography, 0).invoke(j13);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    ml1.u.b(F, exitChoreography, false);
                }
            }
        }
        H();
        t();
        return screenDescription;
    }

    public final com.google.firebase.messaging.q y(ScreenDescription screenDescription, boolean z13) {
        m l13;
        if (z13 && (l13 = l(screenDescription)) != null) {
            d7.b.y(l13);
        }
        return new com.google.firebase.messaging.q(ml1.r.PopExit, screenDescription, (Function1) null, (Function2) new androidx.compose.foundation.lazy.layout.v(29, this, screenDescription));
    }

    public final void z(ScreenDescription s13) {
        Intrinsics.checkNotNullParameter(s13, "screenDescription");
        if (s13 != null) {
            Intrinsics.checkNotNullParameter(s13, "screenModel");
            Iterator it = i().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(s13, "s");
                if (Intrinsics.d(s13, (ScreenDescription) next)) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            A(i13);
        }
    }
}
