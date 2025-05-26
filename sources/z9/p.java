package z9;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.t1;
import androidx.navigation.NavBackStackEntryState;
import com.pinterest.activity.NavBaseActivity;
import do2.a2;
import do2.f2;
import do2.g2;
import do2.t2;
import do2.u2;
import do2.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.j1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;
import t3.d4;

/* loaded from: classes3.dex */
public abstract class p {
    public int A;
    public final ArrayList B;
    public final xk2.v C;
    public final f2 D;
    public final z1 E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f141254a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f141255b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f141256c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f141257d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f141258e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f141259f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlin.collections.v f141260g;

    /* renamed from: h, reason: collision with root package name */
    public final t2 f141261h;

    /* renamed from: i, reason: collision with root package name */
    public final t2 f141262i;

    /* renamed from: j, reason: collision with root package name */
    public final a2 f141263j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f141264k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f141265l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f141266m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f141267n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.z f141268o;

    /* renamed from: p, reason: collision with root package name */
    public r f141269p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f141270q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.lifecycle.r f141271r;

    /* renamed from: s, reason: collision with root package name */
    public final d4 f141272s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.activity.j0 f141273t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f141274u;

    /* renamed from: v, reason: collision with root package name */
    public final s0 f141275v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f141276w;

    /* renamed from: x, reason: collision with root package name */
    public Function1 f141277x;

    /* renamed from: y, reason: collision with root package name */
    public Function1 f141278y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f141279z;

    public p(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f141254a = context;
        Iterator it = yn2.x.e(context, b.f141147k).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f141255b = (Activity) obj;
        this.f141260g = new kotlin.collections.v();
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        this.f141261h = u2.a(q0Var);
        t2 a13 = u2.a(q0Var);
        this.f141262i = a13;
        this.f141263j = new a2(a13);
        this.f141264k = new LinkedHashMap();
        this.f141265l = new LinkedHashMap();
        this.f141266m = new LinkedHashMap();
        this.f141267n = new LinkedHashMap();
        this.f141270q = new CopyOnWriteArrayList();
        this.f141271r = androidx.lifecycle.r.INITIALIZED;
        this.f141272s = new d4(this, 1);
        this.f141273t = new androidx.activity.j0(this);
        this.f141274u = true;
        s0 s0Var = new s0();
        this.f141275v = s0Var;
        this.f141276w = new LinkedHashMap();
        this.f141279z = new LinkedHashMap();
        s0Var.a(new d0(s0Var));
        s0Var.a(new c(this.f141254a));
        this.B = new ArrayList();
        this.C = xk2.m.b(new j1.q0(this, 27));
        f2 b13 = g2.b(1, 0, co2.a.DROP_OLDEST, 2);
        this.D = b13;
        this.E = new z1(b13);
    }

    public static z e(z zVar, int i13) {
        b0 b0Var;
        if (zVar.f141329h == i13) {
            return zVar;
        }
        if (zVar instanceof b0) {
            b0Var = (b0) zVar;
        } else {
            b0Var = zVar.f141323b;
            Intrinsics.f(b0Var);
        }
        return b0Var.s(i13, true);
    }

    public static void o(p pVar, String route, g0 g0Var, int i13) {
        if ((i13 & 2) != 0) {
            g0Var = null;
        }
        Intrinsics.checkNotNullParameter(route, "route");
        int i14 = z.f141321j;
        Uri uri = Uri.parse(g4.u.a0(route));
        Intrinsics.e(uri, "Uri.parse(this)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        androidx.appcompat.app.d request = new androidx.appcompat.app.d(uri, null, null, 20);
        Intrinsics.checkNotNullParameter(request, "request");
        b0 b0Var = pVar.f141256c;
        if (b0Var == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + pVar + '.').toString());
        }
        y f13 = b0Var.f(request);
        if (f13 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + pVar.f141256c);
        }
        Bundle bundle = f13.f141316b;
        z zVar = f13.f141315a;
        Bundle c13 = zVar.c(bundle);
        if (c13 == null) {
            c13 = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType((Uri) request.f15966b, (String) request.f15968d);
        intent.setAction((String) request.f15967c);
        c13.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        pVar.n(zVar, c13, g0Var);
    }

    public static /* synthetic */ void u(p pVar, k kVar) {
        pVar.t(kVar, false, new kotlin.collections.v());
    }

    public final void A(k child) {
        Intrinsics.checkNotNullParameter(child, "child");
        k kVar = (k) this.f141264k.remove(child);
        if (kVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f141265l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(kVar);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            l lVar = (l) this.f141276w.get(this.f141275v.b(kVar.f141211b.f141322a));
            if (lVar != null) {
                lVar.b(kVar);
            }
            linkedHashMap.remove(kVar);
        }
    }

    public final void B() {
        AtomicInteger atomicInteger;
        a2 a2Var;
        Set set;
        ArrayList H0 = CollectionsKt.H0(this.f141260g);
        if (H0.isEmpty()) {
            return;
        }
        z zVar = ((k) CollectionsKt.b0(H0)).f141211b;
        ArrayList arrayList = new ArrayList();
        if (zVar instanceof e) {
            Iterator it = CollectionsKt.q0(H0).iterator();
            while (it.hasNext()) {
                z zVar2 = ((k) it.next()).f141211b;
                arrayList.add(zVar2);
                if (!(zVar2 instanceof e) && !(zVar2 instanceof b0)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (k kVar : CollectionsKt.q0(H0)) {
            androidx.lifecycle.r rVar = kVar.f141220k;
            z zVar3 = kVar.f141211b;
            if (zVar != null && zVar3.f141329h == zVar.f141329h) {
                androidx.lifecycle.r rVar2 = androidx.lifecycle.r.RESUMED;
                if (rVar != rVar2) {
                    l lVar = (l) this.f141276w.get(this.f141275v.b(zVar3.f141322a));
                    if (Intrinsics.d((lVar == null || (a2Var = lVar.f141228f) == null || (set = (Set) a2Var.f55726a.getValue()) == null) ? null : Boolean.valueOf(set.contains(kVar)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f141265l.get(kVar)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(kVar, androidx.lifecycle.r.STARTED);
                    } else {
                        hashMap.put(kVar, rVar2);
                    }
                }
                z zVar4 = (z) CollectionsKt.firstOrNull(arrayList);
                if (zVar4 != null && zVar4.f141329h == zVar3.f141329h) {
                    kotlin.collections.k0.z(arrayList);
                }
                zVar = zVar.f141323b;
            } else if ((!arrayList.isEmpty()) && zVar3.f141329h == ((z) CollectionsKt.S(arrayList)).f141329h) {
                z zVar5 = (z) kotlin.collections.k0.z(arrayList);
                if (rVar == androidx.lifecycle.r.RESUMED) {
                    kVar.b(androidx.lifecycle.r.STARTED);
                } else {
                    androidx.lifecycle.r rVar3 = androidx.lifecycle.r.STARTED;
                    if (rVar != rVar3) {
                        hashMap.put(kVar, rVar3);
                    }
                }
                b0 b0Var = zVar5.f141323b;
                if (b0Var != null && !arrayList.contains(b0Var)) {
                    arrayList.add(b0Var);
                }
            } else {
                kVar.b(androidx.lifecycle.r.CREATED);
            }
        }
        Iterator it2 = H0.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            androidx.lifecycle.r rVar4 = (androidx.lifecycle.r) hashMap.get(kVar2);
            if (rVar4 != null) {
                kVar2.b(rVar4);
            } else {
                kVar2.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (h() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            r2 = this;
            boolean r0 = r2.f141274u
            if (r0 == 0) goto Lc
            int r0 = r2.h()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            androidx.activity.j0 r0 = r2.f141273t
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.C():void");
    }

    public final void a(z zVar, Bundle bundle, k kVar, List list) {
        Object obj;
        Object obj2;
        z zVar2 = kVar.f141211b;
        boolean z13 = zVar2 instanceof e;
        boolean z14 = true;
        kotlin.collections.v vVar = this.f141260g;
        if (!z13) {
            while (!vVar.isEmpty() && (((k) vVar.last()).f141211b instanceof e) && r(((k) vVar.last()).f141211b.f141329h, true, false)) {
            }
        }
        kotlin.collections.v vVar2 = new kotlin.collections.v();
        boolean z15 = zVar instanceof b0;
        Context context = this.f141254a;
        Object obj3 = null;
        if (z15) {
            z zVar3 = zVar2;
            do {
                Intrinsics.f(zVar3);
                zVar3 = zVar3.f141323b;
                if (zVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (Intrinsics.d(((k) obj2).f141211b, zVar3)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) obj2;
                    if (kVar2 == null) {
                        kVar2 = g4.u.Y(context, zVar3, bundle, j(), this.f141269p);
                    }
                    vVar2.addFirst(kVar2);
                    if ((!vVar.isEmpty()) && ((k) vVar.last()).f141211b == zVar3) {
                        u(this, (k) vVar.last());
                    }
                }
                if (zVar3 == null) {
                    break;
                }
            } while (zVar3 != zVar);
        }
        z zVar4 = vVar2.isEmpty() ? zVar2 : ((k) vVar2.first()).f141211b;
        while (zVar4 != null && d(zVar4.f141329h) != zVar4) {
            zVar4 = zVar4.f141323b;
            if (zVar4 != null) {
                Bundle bundle2 = (bundle == null || bundle.isEmpty() != z14) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (Intrinsics.d(((k) obj).f141211b, zVar4)) {
                            break;
                        }
                    }
                }
                k kVar3 = (k) obj;
                if (kVar3 == null) {
                    kVar3 = g4.u.Y(context, zVar4, zVar4.c(bundle2), j(), this.f141269p);
                }
                vVar2.addFirst(kVar3);
            }
            z14 = true;
        }
        if (!vVar2.isEmpty()) {
            zVar2 = ((k) vVar2.first()).f141211b;
        }
        while (!vVar.isEmpty() && (((k) vVar.last()).f141211b instanceof b0)) {
            z zVar5 = ((k) vVar.last()).f141211b;
            Intrinsics.g(zVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((b0) zVar5).s(zVar2.f141329h, false) != null) {
                break;
            } else {
                u(this, (k) vVar.last());
            }
        }
        k kVar4 = (k) (vVar.isEmpty() ? null : vVar.f80401b[vVar.f80400a]);
        if (kVar4 == null) {
            kVar4 = (k) (vVar2.isEmpty() ? null : vVar2.f80401b[vVar2.f80400a]);
        }
        if (!Intrinsics.d(kVar4 != null ? kVar4.f141211b : null, this.f141256c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                z zVar6 = ((k) previous).f141211b;
                b0 b0Var = this.f141256c;
                Intrinsics.f(b0Var);
                if (Intrinsics.d(zVar6, b0Var)) {
                    obj3 = previous;
                    break;
                }
            }
            k kVar5 = (k) obj3;
            if (kVar5 == null) {
                b0 b0Var2 = this.f141256c;
                Intrinsics.f(b0Var2);
                b0 b0Var3 = this.f141256c;
                Intrinsics.f(b0Var3);
                kVar5 = g4.u.Y(context, b0Var2, b0Var3.c(bundle), j(), this.f141269p);
            }
            vVar2.addFirst(kVar5);
        }
        Iterator it = vVar2.iterator();
        while (it.hasNext()) {
            k kVar6 = (k) it.next();
            Object obj4 = this.f141276w.get(this.f141275v.b(kVar6.f141211b.f141322a));
            if (obj4 == null) {
                throw new IllegalStateException(a.a.p(new StringBuilder("NavigatorBackStack for "), zVar.f141322a, " should already be created").toString());
            }
            ((l) obj4).a(kVar6);
        }
        vVar.addAll(vVar2);
        vVar.addLast(kVar);
        Iterator it2 = CollectionsKt.m0(kVar, vVar2).iterator();
        while (it2.hasNext()) {
            k kVar7 = (k) it2.next();
            b0 b0Var4 = kVar7.f141211b.f141323b;
            if (b0Var4 != null) {
                l(kVar7, f(b0Var4.f141329h));
            }
        }
    }

    public final boolean b() {
        kotlin.collections.v vVar;
        while (true) {
            vVar = this.f141260g;
            if (vVar.isEmpty() || !(((k) vVar.last()).f141211b instanceof b0)) {
                break;
            }
            u(this, (k) vVar.last());
        }
        k kVar = (k) vVar.i();
        ArrayList arrayList = this.B;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        this.A++;
        B();
        int i13 = this.A - 1;
        this.A = i13;
        if (i13 == 0) {
            ArrayList H0 = CollectionsKt.H0(arrayList);
            arrayList.clear();
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                k kVar2 = (k) it.next();
                Iterator it2 = this.f141270q.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    z zVar = kVar2.f141211b;
                    kVar2.a();
                    ((NavBaseActivity) mVar).t(this, zVar);
                }
                this.D.b(kVar2);
            }
            this.f141261h.i(CollectionsKt.H0(vVar));
            this.f141262i.i(v());
        }
        return kVar != null;
    }

    public final boolean c(ArrayList arrayList, z zVar, boolean z13, boolean z14) {
        String str;
        String str2;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.collections.v vVar = new kotlin.collections.v();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            r0 r0Var = (r0) it.next();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            k kVar = (k) this.f141260g.last();
            this.f141278y = new n(f0Var2, f0Var, this, z14, vVar, 0);
            r0Var.i(kVar, z14);
            str = null;
            this.f141278y = null;
            if (!f0Var2.f80424a) {
                break;
            }
        }
        if (z14) {
            LinkedHashMap linkedHashMap = this.f141266m;
            if (!z13) {
                Iterator it2 = yn2.c0.s(yn2.x.e(zVar, b.f141149m), new o(this, 0)).iterator();
                while (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((z) it2.next()).f141329h);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) (vVar.isEmpty() ? str : vVar.f80401b[vVar.f80400a]);
                    linkedHashMap.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.f19146a : str);
                }
            }
            int i13 = 1;
            if (!vVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) vVar.first();
                Iterator it3 = yn2.c0.s(yn2.x.e(d(navBackStackEntryState2.f19147b), b.f141150n), new o(this, i13)).iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    str2 = navBackStackEntryState2.f19146a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((z) it3.next()).f141329h), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.f141267n.put(str2, vVar);
                }
            }
        }
        C();
        return f0Var.f80424a;
    }

    public final z d(int i13) {
        z zVar;
        b0 b0Var = this.f141256c;
        if (b0Var == null) {
            return null;
        }
        if (b0Var.f141329h == i13) {
            return b0Var;
        }
        k kVar = (k) this.f141260g.i();
        if (kVar == null || (zVar = kVar.f141211b) == null) {
            zVar = this.f141256c;
            Intrinsics.f(zVar);
        }
        return e(zVar, i13);
    }

    public final k f(int i13) {
        Object obj;
        kotlin.collections.v vVar = this.f141260g;
        ListIterator<E> listIterator = vVar.listIterator(vVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((k) obj).f141211b.f141329h == i13) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar;
        }
        StringBuilder s13 = a.a.s("No destination with ID ", i13, " is on the NavController's back stack. The current destination is ");
        s13.append(g());
        throw new IllegalArgumentException(s13.toString().toString());
    }

    public final z g() {
        k kVar = (k) this.f141260g.i();
        if (kVar != null) {
            return kVar.f141211b;
        }
        return null;
    }

    public final int h() {
        kotlin.collections.v vVar = this.f141260g;
        int i13 = 0;
        if (!(vVar instanceof Collection) || !vVar.isEmpty()) {
            Iterator<E> it = vVar.iterator();
            while (it.hasNext()) {
                if ((!(((k) it.next()).f141211b instanceof b0)) && (i13 = i13 + 1) < 0) {
                    kotlin.collections.f0.o();
                    throw null;
                }
            }
        }
        return i13;
    }

    public final b0 i() {
        b0 b0Var = this.f141256c;
        if (b0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return b0Var;
    }

    public final androidx.lifecycle.r j() {
        return this.f141268o == null ? androidx.lifecycle.r.CREATED : this.f141271r;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.k(android.content.Intent):boolean");
    }

    public final void l(k kVar, k kVar2) {
        this.f141264k.put(kVar, kVar2);
        LinkedHashMap linkedHashMap = this.f141265l;
        if (linkedHashMap.get(kVar2) == null) {
            linkedHashMap.put(kVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(kVar2);
        Intrinsics.f(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void m(int i13, Bundle bundle) {
        int i14;
        g0 g0Var;
        kotlin.collections.v vVar = this.f141260g;
        z zVar = vVar.isEmpty() ? this.f141256c : ((k) vVar.last()).f141211b;
        if (zVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        f e13 = zVar.e(i13);
        Bundle bundle2 = null;
        if (e13 != null) {
            g0Var = e13.f141179b;
            Bundle bundle3 = e13.f141180c;
            i14 = e13.f141178a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i14 = i13;
            g0Var = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i14 == 0 && g0Var != null) {
            g0Var.getClass();
            int i15 = g0Var.f141190c;
            if (i15 != -1) {
                boolean z13 = g0Var.f141191d;
                if (i15 != -1) {
                    q(i15, z13);
                    return;
                }
                return;
            }
        }
        if (i14 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        z d2 = d(i14);
        if (d2 != null) {
            n(d2, bundle2, g0Var);
            return;
        }
        int i16 = z.f141321j;
        Context context = this.f141254a;
        String k03 = g4.u.k0(context, i14);
        if (e13 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + k03 + " cannot be found from the current destination " + zVar);
        }
        StringBuilder o13 = cb.o("Navigation destination ", k03, " referenced from action ");
        o13.append(g4.u.k0(context, i13));
        o13.append(" cannot be found from the current destination ");
        o13.append(zVar);
        throw new IllegalArgumentException(o13.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0194 A[LOOP:1: B:19:0x018e->B:21:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7 A[LOOP:3: B:52:0x00b1->B:54:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138 A[LOOP:5: B:67:0x0132->B:69:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b1 A[EDGE_INSN: B:75:0x00b1->B:51:? BREAK  A[LOOP:2: B:45:0x009d->B:74:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(z9.z r27, android.os.Bundle r28, z9.g0 r29) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.n(z9.z, android.os.Bundle, z9.g0):void");
    }

    public final boolean p() {
        if (this.f141260g.isEmpty()) {
            return false;
        }
        z g13 = g();
        Intrinsics.f(g13);
        return q(g13.f141329h, true);
    }

    public final boolean q(int i13, boolean z13) {
        return r(i13, z13, false) && b();
    }

    public final boolean r(int i13, boolean z13, boolean z14) {
        z zVar;
        kotlin.collections.v vVar = this.f141260g;
        if (vVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.q0(vVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = ((k) it.next()).f141211b;
            r0 b13 = this.f141275v.b(zVar.f141322a);
            if (z13 || zVar.f141329h != i13) {
                arrayList.add(b13);
            }
            if (zVar.f141329h == i13) {
                break;
            }
        }
        if (zVar != null) {
            return c(arrayList, zVar, z13, z14);
        }
        int i14 = z.f141321j;
        Log.i("NavController", "Ignoring popBackStack to destination " + g4.u.k0(this.f141254a, i13) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[EDGE_INSN: B:15:0x00c8->B:16:0x00c8 BREAK  A[LOOP:0: B:6:0x001d->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:6:0x001d->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.s(java.lang.String, boolean, boolean):boolean");
    }

    public final void t(k kVar, boolean z13, kotlin.collections.v vVar) {
        r rVar;
        a2 a2Var;
        Set set;
        kotlin.collections.v vVar2 = this.f141260g;
        k kVar2 = (k) vVar2.last();
        if (!Intrinsics.d(kVar2, kVar)) {
            throw new IllegalStateException(("Attempted to pop " + kVar.f141211b + ", which is not the top of the back stack (" + kVar2.f141211b + ')').toString());
        }
        vVar2.removeLast();
        l lVar = (l) this.f141276w.get(this.f141275v.b(kVar2.f141211b.f141322a));
        boolean z14 = true;
        if ((lVar == null || (a2Var = lVar.f141228f) == null || (set = (Set) a2Var.f55726a.getValue()) == null || !set.contains(kVar2)) && !this.f141265l.containsKey(kVar2)) {
            z14 = false;
        }
        androidx.lifecycle.r rVar2 = kVar2.f141217h.f18588d;
        androidx.lifecycle.r rVar3 = androidx.lifecycle.r.CREATED;
        if (rVar2.isAtLeast(rVar3)) {
            if (z13) {
                kVar2.b(rVar3);
                vVar.addFirst(new NavBackStackEntryState(kVar2));
            }
            if (z14) {
                kVar2.b(rVar3);
            } else {
                kVar2.b(androidx.lifecycle.r.DESTROYED);
                A(kVar2);
            }
        }
        if (z13 || z14 || (rVar = this.f141269p) == null) {
            return;
        }
        String backStackEntryId = kVar2.f141215f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        t1 t1Var = (t1) rVar.f141281b.remove(backStackEntryId);
        if (t1Var != null) {
            t1Var.a();
        }
    }

    public final ArrayList v() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f141276w.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((l) it.next()).f141228f.f55726a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                k kVar = (k) obj;
                if (!arrayList.contains(kVar) && !kVar.f141220k.isAtLeast(androidx.lifecycle.r.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.k0.u(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f141260g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            k kVar2 = (k) next;
            if (!arrayList.contains(kVar2) && kVar2.f141220k.isAtLeast(androidx.lifecycle.r.STARTED)) {
                arrayList3.add(next);
            }
        }
        kotlin.collections.k0.u(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((k) next2).f141211b instanceof b0)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final void w(Bundle bundle) {
        Object[] objArr;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f141254a.getClassLoader());
        this.f141257d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f141258e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.f141267n;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                this.f141266m.put(Integer.valueOf(intArray[i13]), stringArrayList.get(i14));
                i13++;
                i14++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id3 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id3);
                if (parcelableArray != null) {
                    Intrinsics.checkNotNullExpressionValue(id3, "id");
                    int length2 = parcelableArray.length;
                    kotlin.collections.v vVar = new kotlin.collections.v();
                    if (length2 == 0) {
                        objArr = kotlin.collections.v.f80399e;
                    } else {
                        if (length2 <= 0) {
                            throw new IllegalArgumentException(a.a.d("Illegal Capacity: ", length2));
                        }
                        objArr = new Object[length2];
                    }
                    vVar.f80401b = objArr;
                    x0 D0 = com.bumptech.glide.c.D0(parcelableArray);
                    while (D0.hasNext()) {
                        Parcelable parcelable = (Parcelable) D0.next();
                        Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        vVar.addLast((NavBackStackEntryState) parcelable);
                    }
                    linkedHashMap.put(id3, vVar);
                }
            }
        }
        this.f141259f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final boolean x(int i13, Bundle bundle, g0 g0Var) {
        z i14;
        k kVar;
        z zVar;
        LinkedHashMap linkedHashMap = this.f141266m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i13))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i13));
        Collection values = linkedHashMap.values();
        j1 predicate = new j1(str, 2);
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.collections.k0.x(values, predicate, true);
        kotlin.collections.v vVar = (kotlin.collections.v) dl2.b.u(this.f141267n).remove(str);
        ArrayList arrayList = new ArrayList();
        k kVar2 = (k) this.f141260g.i();
        if (kVar2 == null || (i14 = kVar2.f141211b) == null) {
            i14 = i();
        }
        if (vVar != null) {
            Iterator it = vVar.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                z e13 = e(i14, navBackStackEntryState.f19147b);
                Context context = this.f141254a;
                if (e13 == null) {
                    int i15 = z.f141321j;
                    throw new IllegalStateException(("Restore State failed: destination " + g4.u.k0(context, navBackStackEntryState.f19147b) + " cannot be found from the current destination " + i14).toString());
                }
                arrayList.add(navBackStackEntryState.a(context, e13, j(), this.f141269p));
                i14 = e13;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((k) next).f141211b instanceof b0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            k kVar3 = (k) it3.next();
            List list = (List) CollectionsKt.d0(arrayList2);
            if (list != null && (kVar = (k) CollectionsKt.b0(list)) != null && (zVar = kVar.f141211b) != null) {
                str2 = zVar.f141322a;
            }
            if (Intrinsics.d(str2, kVar3.f141211b.f141322a)) {
                list.add(kVar3);
            } else {
                arrayList2.add(kotlin.collections.f0.l(kVar3));
            }
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            r0 b13 = this.f141275v.b(((k) CollectionsKt.S(list2)).f141211b.f141322a);
            this.f141277x = new e.c(f0Var, arrayList, new kotlin.jvm.internal.h0(), this, bundle, 4);
            b13.d(list2, g0Var);
            this.f141277x = null;
        }
        return f0Var.f80424a;
    }

    public final Bundle y() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : z0.n(this.f141275v.f141287a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h10 = ((r0) entry.getValue()).h();
            if (h10 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, h10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        kotlin.collections.v vVar = this.f141260g;
        if (!vVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[vVar.f80402c];
            Iterator<E> it = vVar.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                parcelableArr[i13] = new NavBackStackEntryState((k) it.next());
                i13++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.f141266m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i14 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i14] = intValue;
                arrayList2.add(str2);
                i14++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.f141267n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                kotlin.collections.v vVar2 = (kotlin.collections.v) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[vVar2.f80402c];
                Iterator it2 = vVar2.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    parcelableArr2[i15] = (NavBackStackEntryState) next;
                    i15 = i16;
                }
                bundle.putParcelableArray(a.a.j("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f141259f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f141259f);
        }
        return bundle;
    }

    public final void z(b0 graph, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Intrinsics.checkNotNullParameter(graph, "graph");
        boolean d2 = Intrinsics.d(this.f141256c, graph);
        kotlin.collections.v vVar = this.f141260g;
        int i13 = 0;
        if (d2) {
            int k13 = graph.f141160k.k();
            while (i13 < k13) {
                z zVar = (z) graph.f141160k.l(i13);
                b0 b0Var = this.f141256c;
                Intrinsics.f(b0Var);
                int i14 = b0Var.f141160k.i(i13);
                b0 b0Var2 = this.f141256c;
                Intrinsics.f(b0Var2);
                g1.p0 p0Var = b0Var2.f141160k;
                int h10 = p0Var.h(i14);
                if (h10 >= 0) {
                    Object[] objArr = p0Var.f63301c;
                    Object obj = objArr[h10];
                    objArr[h10] = zVar;
                }
                i13++;
            }
            Iterator it = vVar.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                int i15 = z.f141321j;
                List t13 = yn2.c0.t(g4.u.m0(kVar.f141211b));
                Intrinsics.checkNotNullParameter(t13, "<this>");
                d1 d1Var = new d1(t13);
                z zVar2 = this.f141256c;
                Intrinsics.f(zVar2);
                Iterator it2 = d1Var.iterator();
                while (it2.hasNext()) {
                    z zVar3 = (z) it2.next();
                    if (!Intrinsics.d(zVar3, this.f141256c) || !Intrinsics.d(zVar2, graph)) {
                        if (zVar2 instanceof b0) {
                            zVar2 = ((b0) zVar2).s(zVar3.f141329h, true);
                            Intrinsics.f(zVar2);
                        }
                    }
                }
                Intrinsics.checkNotNullParameter(zVar2, "<set-?>");
                kVar.f141211b = zVar2;
            }
            return;
        }
        b0 b0Var3 = this.f141256c;
        LinkedHashMap linkedHashMap = this.f141276w;
        if (b0Var3 != null) {
            Iterator it3 = new ArrayList(this.f141266m.keySet()).iterator();
            while (it3.hasNext()) {
                Integer id3 = (Integer) it3.next();
                Intrinsics.checkNotNullExpressionValue(id3, "id");
                int intValue = id3.intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((l) it4.next()).f141226d = true;
                }
                boolean x13 = x(intValue, null, kh2.g0.j0(b.f141148l));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((l) it5.next()).f141226d = false;
                }
                if (x13) {
                    r(intValue, true, false);
                }
            }
            r(b0Var3.f141329h, true, false);
        }
        this.f141256c = graph;
        Bundle bundle2 = this.f141257d;
        s0 s0Var = this.f141275v;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it6 = stringArrayList.iterator();
            while (it6.hasNext()) {
                String name = it6.next();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                r0 b13 = s0Var.b(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    b13.g(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f141258e;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            while (i13 < length) {
                Parcelable parcelable = parcelableArr[i13];
                Intrinsics.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                int i16 = navBackStackEntryState.f19147b;
                z d13 = d(i16);
                Context context = this.f141254a;
                if (d13 == null) {
                    int i17 = z.f141321j;
                    StringBuilder o13 = cb.o("Restoring the Navigation back stack failed: destination ", g4.u.k0(context, i16), " cannot be found from the current destination ");
                    o13.append(g());
                    throw new IllegalStateException(o13.toString());
                }
                k a13 = navBackStackEntryState.a(context, d13, j(), this.f141269p);
                r0 b14 = s0Var.b(d13.f141322a);
                Object obj2 = linkedHashMap.get(b14);
                if (obj2 == null) {
                    obj2 = new l(this, b14);
                    linkedHashMap.put(b14, obj2);
                }
                vVar.addLast(a13);
                ((l) obj2).a(a13);
                b0 b0Var4 = a13.f141211b.f141323b;
                if (b0Var4 != null) {
                    l(a13, f(b0Var4.f141329h));
                }
                i13++;
            }
            C();
            this.f141258e = null;
        }
        Collection values = z0.n(s0Var.f141287a).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((r0) obj3).f141283b) {
                arrayList.add(obj3);
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            r0 r0Var = (r0) it7.next();
            Object obj4 = linkedHashMap.get(r0Var);
            if (obj4 == null) {
                obj4 = new l(this, r0Var);
                linkedHashMap.put(r0Var, obj4);
            }
            r0Var.e((l) obj4);
        }
        if (this.f141256c == null || !vVar.isEmpty()) {
            b();
            return;
        }
        if (this.f141259f || (activity = this.f141255b) == null || !k(activity.getIntent())) {
            b0 b0Var5 = this.f141256c;
            Intrinsics.f(b0Var5);
            n(b0Var5, bundle, null);
        }
    }
}
